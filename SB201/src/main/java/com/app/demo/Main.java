package com.app.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		//activate the spring container by locating the spring configuration file..

		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");

		Demo d=  ctx.getBean("d1",Demo.class);

		d.showDetails();

	}

}
