package org.jay.springDerby.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.jay.springDerby.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl {

	
	private DataSource datasource;
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		
	}

	public DataSource getDatasource() {
		return datasource;
	}
	@Autowired
	public void setDatasource(DataSource datasource) {
		//this.datasource = datasource;
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

public int getCircleCount(){
		String sql = "select count(*) from circle";
	//	jdbcTemplate.setDataSource(getDatasource());
	return	jdbcTemplate.queryForInt(sql);
	}
public String getCircleName(int circleId)
{
	String sql = "select name from circle where Id = ?";
	return jdbcTemplate.queryForObject(sql,new Object[] {circleId},String.class);
}

//Using row mapper to map corresponding column attributes of data base accordingly

public Circle getCircledetails(int circleId)
{
	String sql = "select * from circle where Id = ?";
return	jdbcTemplate.queryForObject(sql, new Object[] {circleId}, new CircleMapper());
}

public List<Circle> getCircleList()
{
	String sql = "select * from circle";
	return jdbcTemplate.query(sql,new CircleMapper());
}

//Implementing inner class for Row Mapper start
public static final class CircleMapper implements RowMapper<Circle>
{
	@Override
	public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Circle circle = new Circle();
		circle.setId(resultSet.getInt("ID"));
		circle.setName(resultSet.getString("NAME"));
		return circle;
	}
	
}
//Implementing inner class for Row Mapper end


//typical flow without using spring jdbc template start here we need to create conn ,execute n close it
	public Circle getCircle(int circleId) 
	{
		Connection conn = null;
		try 
		{
		
		/*String driver = "org.apache.derby.jdbc.ClientDriver";
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection("jdbc:derby://localhost:1527/db");*/
		
		conn = datasource.getConnection();
		PreparedStatement ps = conn.prepareStatement("Select * from circle where id = ?");
		ps.setInt(1, circleId);
		
		Circle circle = null;
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
		{
			circle = new Circle(circleId, rs.getString("name"));
		}
		rs.close();
		ps.close();
		
		return circle;
		
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		finally {
			try {
				conn.close();
			} 
			catch(SQLException e)
			{	
			}
		}
	}
		//typical flow without using spring jdbc template end
		
	
		
}
