package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {


		//Read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		
		//Get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		//Call the method from the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		//Call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		//Call our new method .. has prop values has inject 
		System.out.println("recup mail : " + theCoach.getMail());
		
		
		System.out.println("recup mail : " + theCoach.getTeam());

		
		//Close the context
		
		context.close();
	}

}
