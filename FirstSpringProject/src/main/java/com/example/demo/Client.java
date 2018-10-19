package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class Client {

	public static void main(String[] args) {
 
		//Employee eRef = new Employee();
		//eRef.seteId(01);
		//eRef.seteName("Dan");
		//eRef.seteAddress("To infinity and Beyond");
		
		//System.out.println("Employee Details: " + eRef);
		
		//Resource resource = new ClassPathResource("employeBean.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeBean.xml");
		
		//Employee e1= (Employee)factory.getBean("emp1");
		//Employee e2= factory.getBean("emp2",Employee.class);
		
		Employee e1= (Employee)context.getBean("emp1");
		//Employee e2= context.getBean("emp2",Employee.class);
		
		
		
		System.out.println("Employee Details: " + e1);
	//System.out.println("Employee Details: " + e2);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context; // down casting context object
		cxt.close();//close context
		
	}

	
}
