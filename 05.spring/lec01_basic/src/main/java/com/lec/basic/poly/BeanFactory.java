package com.lec.basic.poly;

public class BeanFactory {
	
	public Object getBean(String beanName) {
		
		if(beanName.equals("lg")) {
			return new LGTV();
		}else if(beanName.equals("samsung")) {
			return new SamsungTV();
		}else {
			return null;
		}
	}
	
}
