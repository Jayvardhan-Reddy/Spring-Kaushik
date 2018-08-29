package org.jay.springDerby;

import org.jay.springDerby.dao.JdbcDaoImpl;
import org.jay.springDerby.dao.JdbcDaoInsertImpl;
import org.jay.springDerby.dao.JdbcDaoNamedParam;
import org.jay.springDerby.dao.JdbcDaoRowMapperImpl;
import org.jay.springDerby.dao.SimpleJdbcDaoImpl;
import org.jay.springDerby.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	public static void main(String[] args) {
		
		//Normal exec JDBC
		
		/*ApplicationContext appctx = new ClassPathXmlApplicationContext("spring_jdbc.xml");
		JdbcDaoImpl jdi = appctx.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
		Circle circle = jdi.getCircle(1);
		System.out.println(circle.getName());
		System.out.println(jdi.getCircleCount()); //using QueryForInt
		System.out.println(jdi.getCircleName(1)); // using QueryForObject
		System.out.println(jdi.getCircledetails(1).getName()); //RowMapper
		System.out.println(jdi.getCircleList().size()); //List row mapper
		*/
		
		//Normal exec
		
		
		//Row Mapper Start
	/*	ApplicationContext appctxRowMapper = new ClassPathXmlApplicationContext("spring_jdbc.xml");
		JdbcDaoRowMapperImpl jdiRowMapper = appctxRowMapper.getBean("jdbcDaoRowMapperImpl",JdbcDaoRowMapperImpl.class);
		System.out.println(jdiRowMapper.getCircledetails(1).getName()); //RowMapper
		System.out.println(jdiRowMapper.getCircleList().size());*/
		//Row Mapper End
		
		//Insert operation start
		/*ApplicationContext appctxInsert = new ClassPathXmlApplicationContext("spring_jdbc.xml");
		JdbcDaoInsertImpl jdiInsert = appctxInsert.getBean("jdbcDaoInsertImpl",JdbcDaoInsertImpl.class);
		jdiInsert.insertCircle(new Circle(2,"Second circle"));
		System.out.println(jdiInsert.getCircleList().size());
		jdiInsert.createTraingleTable();*/
		//Insert operation end
		
		//Named Parameter start
		/*ApplicationContext appctxParam = new ClassPathXmlApplicationContext("spring_jdbc.xml");
		JdbcDaoNamedParam jdiParam = appctxParam.getBean("jdbcDaoNamedParam",JdbcDaoNamedParam.class);
		jdiParam.insertCircleNamedParam(new Circle(5,"Fifth Circle entry"));
		System.out.println(jdiParam.getCircleCount());*/
		//Named Parameter end
		
		//Spring Provided Dao implementation by extending spring simple jdbc template start
		ApplicationContext appctxSpringDao = new ClassPathXmlApplicationContext("spring_jdbc.xml");
		SimpleJdbcDaoImpl jdiSpringDao = appctxSpringDao.getBean("simpleJdbcDaoImpl",SimpleJdbcDaoImpl.class);
		System.out.println(jdiSpringDao.getCircleCount());
		//Spring Provided Dao implementation by extending spring simple jdbc template end
		
	}

}
