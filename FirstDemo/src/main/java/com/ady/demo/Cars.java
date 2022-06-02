package com.ady.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
class Maruti implements DemoCar
{
	public void specs() 
	{
		System.out.println("Maruti : Fuel Tank Capacity: 28.0");
	}
}

@Component
class I20 implements DemoCar
{
	public void specs() 
	{
		System.out.println("i20 : Fuel Tank Capacity: 37.0");
	}
}

@SpringBootApplication
public class Cars {


	public static void main(String[] args) 
	{
		
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(Cars.class);
		Maruti obj = acac.getBean("maruti", Maruti.class);
		obj.specs();
		I20 obj1 = acac.getBean("i20", I20.class);
		obj1.specs();
		acac.close();
	}

}
