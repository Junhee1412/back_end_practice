package com.lec.basic.anno;

/*
	@Autowired	: 주로 변수위에 설정하여 해당 타입의 객체를 찾아서 자동으로 주입
				  생성자, 메서드, 멤버변수위에 모두 사용할 수 있다.
				  스프링컨테이너는 멤버변수 위에 설정된 @Autowired를 확인하는 순간
				  해당 변수타입을 체크하고 해당 타입의 객체가 메모리에 존재하는지
				  확인한 후에 그 변수에 객체를 주입한다. 만약 객체가 없다면 예외
				  NoSuchBeanDefinitionException을 발생시킨다.
	@Qualifier	: 특정객체의 이름을 이용하여 의존성주입을 할 때 사용한다.
	@inject		: @Autowired와 동일한 기능을 제공
	@Resource	: @Autowired와 @Qualifier기능을 결합한 애너테이션이다.
				  @Resource을 사용하려면 Maven Dependency를 등록해 주어야 한다.
				  javax.annotation를 pom.xml에 등록해야 한다.

*/

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LGTV implements TV{

/*	
@Autowired는 변수 위나 메서드 위에 선언할 수 있다.
변수 위에 선언된 경우는 @Qualifier과 같이 사용할 수 있다.
@Resource = @Autowired+@Qualifier

@Autowired
@Qualifier("sony")
*/
	
	
	@Resource(name="apple")
	private Speaker speaker;
	private int price;
	
	public LGTV() {
		System.out.println("==> Annotation 기반 LGTV 객체 생성!!");
	}
	
	@Override
	public void powerOn() {
		
	}

	@Override
	public void powerOff() {
		
	}

	@Override
	public void volumnUp() {
		this.speaker.volumnUp();
	}

	@Override
	public void volumnDown() {
		this.speaker.volumnDown();
	}

}
