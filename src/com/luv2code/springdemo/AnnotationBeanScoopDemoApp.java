package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScoopDemoApp {

	public static void main(String[] args) {

		//Load Spring Config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retreive Bean from Spring Container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);

		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		
		//print the result
		
		System.out.println("Pointing to the same object "+result);
		
		
		System.out.println("Memory location for theCoach "+theCoach);
		
		
		System.out.println("Memory location for the alphaCoach "+theCoach);


		// close context
		
		context.close();
		
	}

}
