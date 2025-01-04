package com.app.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		//activate the spring container by locating the spring configuration file..

		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//		ClassPathXmlApplicationContext downcastApplicationContext= (ClassPathXmlApplicationContext)ctx;
//		downcastApplicationContext.close();
		Demo d1=  ctx.getBean("d1",Demo.class);
		Demo d2=  ctx.getBean("d1",Demo.class);
		System.out.println(d1==d2);
		
//		d.showDetails();
	}
}