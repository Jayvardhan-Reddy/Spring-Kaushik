package org.jay.springDerby.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.jay.springDerby.dao.JdbcDaoRowMapperImpl.CircleMapper;
import org.jay.springDerby.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class JdbcDaoNamedParam {

	private DataSource datasource;
	private NamedParameterJdbcTemplate nameParameterJdbcTemplate;
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
		this.nameParameterJdbcTemplate = new NamedParameterJdbcTemplate(datasource);
	}
	
	public int getCircleCount(){
		String sql = "select count(*) from circle";
	//	jdbcTemplate.setDataSource(getDatasource());
	return	jdbcTemplate.queryForInt(sql);
		
	}


public void insertCircleNamedParam(Circle circle)
{
	String sql = "insert into circle (id,name) values (:id,:name)";
	SqlParameterSource namedParameters = new MapSqlParameterSource("id",circle.getId())
											.addValue("name", circle.getName());
	nameParameterJdbcTemplate.update(sql, namedParameters);
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
	
	
}
