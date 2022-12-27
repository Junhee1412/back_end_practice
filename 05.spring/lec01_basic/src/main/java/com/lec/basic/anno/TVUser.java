package com.lec.basic.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lec.basic.anno.TV;

public class TVUser {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new  GenericXmlApplicationContext("annotationContext.xml");
		TV tv = (TV) factory.getBean("tv");
		
		tv.volumnUp();
		tv.volumnDown();
		
		factory.close();
	}

}
