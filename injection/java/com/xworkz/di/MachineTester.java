package com.xworkz.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.di.component.WashingMachine;

public class MachineTester {

	public static void main(String[] args) {
		

		ApplicationContext container=new ClassPathXmlApplicationContext("washing.xml");
		WashingMachine refOfWM=container.getBean(WashingMachine.class);
		refOfWM.wash();

	}

}
