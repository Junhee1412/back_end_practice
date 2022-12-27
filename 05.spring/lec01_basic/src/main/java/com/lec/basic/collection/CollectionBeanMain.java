package com.lec.basic.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new  GenericXmlApplicationContext("collectionContext.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		
		List<String> addrList = bean.getAddressList();
		
		for(String addr:addrList) {
			System.out.println(addr.toString());
		}
		
		Set<String> addrSet = bean.getAddressSet();
		for(String addr:addrSet) {
			System.out.println(addr.toString());
		}
		
	}
}
