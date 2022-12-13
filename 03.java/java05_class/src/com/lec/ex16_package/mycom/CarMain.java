package com.lec.ex16_package.mycom;

import com.lec.ex16_package.hankook.SnowTire;
import com.lec.ex16_package.hyundai.Engine;
import com.lec.ex16_package.kumho.BigWidthTire;

/*
	패키지(package)
	
	프로그램을 개발하다 보면 작게는 수십개, 많게는 수백개의 클래스를 작성해야 한다.
	클래스를 체계적으로 관리하지 않으면 클래스간의 관계가 뒤엉키게 되어 복잡하고 난해한
	프로그램이 되어버려 결국에는 유지보수가 불가능하게 된다.
	
	Java에서는 클래스를 체계적으로 관리하기 위해서 패키지를 사용한다. PC에서 파일을
	저장해서 유사한 성격의 파일들을 그룹화해서 관리하듯이 Java에서는 패키지를 만들어
	유사한 기능을 하는 클래스들끼리 그룹화해서 저장, 관리하도록 한다.
	
	패키지의 물리적인 형태는 파일시스템의 폴더이다. 패키지는 단순히 파일시스템의 폴더
	기능만 하는 것이 아니라 "클래스이름의 일부분"이다. 즉 클래스 이름은 패키지명을 포함한
	클래스파일명 전체가 클래스 이름이다.
	
	클래스전체이름은 "패키지명.하위패키지명.클래스명"인데 상위 하위로 구분이 되어 있다면
	dot(.)로 구분한다.
	
	패키지의 선언은 Java의 명명규칙을 준수하는데 관례적으로 패키지명은 전부 소문자로 정의
	하는 것이 관례이다.
*/

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		Engine engine = new Engine();
		com.lec.ex16_package.hankook.Tire ft = new com.lec.ex16_package.hankook.Tire();
		com.lec.ex16_package.kumho.Tire bt = new com.lec.ex16_package.kumho.Tire();
		
		SnowTire sft = new SnowTire();
		BigWidthTire sbt = new BigWidthTire();
		
		car.flt = ft;
		car.frt = ft;
		car.blt = sft;
		car.brt = sbt;
		car.engine = engine;
		
		System.out.println("MyCar 한대가 생산되었습니다!");
	}

}

class Car{
	com.lec.ex16_package.hankook.Tire flt;
	com.lec.ex16_package.hankook.Tire frt;
	SnowTire blt;
	BigWidthTire brt;
	Engine engine;
}