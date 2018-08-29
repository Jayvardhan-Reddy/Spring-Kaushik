package org.jay.springHibernate;

import org.jay.springHibernate.dao.HibernateDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcSpringHibernate {

	public static void main(String[] args) {
		System.out.println("In hibernate spring");
		ApplicationContext appctxSpgHibt = new ClassPathXmlApplicationContext("springHibernate.xml");
		HibernateDaoImpl jdiSpringHibDao = appctxSpgHibt.getBean("hibernateDaoImpl",HibernateDaoImpl.class);
		System.out.println(jdiSpringHibDao.getCircleCount());

	}

}
