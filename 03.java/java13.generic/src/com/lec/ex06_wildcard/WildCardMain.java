package com.lec.ex06_wildcard;

import java.util.Arrays;

/*
	와일드카드(<?>, <? extends 상위타입>, <? super 하위타입>)
	
	제네릭타입을 매개값이나 리턴타입으로 사용할 때 구체적인 타입대신에
	와일드 카드를 사용할 수 있다. 와일드 카드를 사용하는 형태는 3가지가 있다.
	
	1. <?>					: 타입의 제한이 없다.
	2. <? extends 상위타입> : 하위타입만 가능하다 즉, 상위타입은 제한
	3. <? super 하위타입>   : 상위타입만 가능하다 즉, 하위타입은 제한
*/
public class WildCardMain {

	public static void main(String[] args) {
		//1. 모든 사람이 수강등록이 가능한 코스
		Course<Person> common_course = new Course<>("공통과정", 5);
		common_course.add(new Person("일반인"));
		common_course.add(new Worker("직장인"));
		common_course.add(new Student("학생"));
		common_course.add(new HighStudent("고등학생"));
		//2. 학생만 수강등록이 가능한 코스
		Course<Student> student_course = new Course<>("학생과정", 5);
		//student_course.add(new Person("일반인"));
		//student_course.add(new Worker("직장인"));
		student_course.add(new Student("학생"));
		student_course.add(new HighStudent("고등학생"));
		//3. 직장인만 수강등록이 가능한 코스
		Course<Worker> worker_course = new Course<>("직장인과정",5);
		//worker_course.add(new Person("일반인"));
		worker_course.add(new Worker("직장인"));
		//worker_course.add(new Student("학생"));
		//worker_course.add(new HighStudent("고등학생"));
		
		//A. 수강등록 - 모든 사람
		register(common_course);
		register(student_course);
		register(worker_course);
		
		//B. 수강등록 - 학생만
		//registerStudent(common_course);
		registerStudent(student_course);
		//registerStudent(worker_course);
		
		//C. 수강등록 - 직장인
		registerWorker(common_course);
		//registerWorker(student_course);
		registerWorker(worker_course);
	}
	//수강등록메서드
	//1. 모두 등록가능한 메서드
	public static void register(Course<?> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}
	//2. 학생만 등록가능한 메서드
	public static void registerStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}
	//3. 직장인만 등록가능한 메서드
	public static void registerWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}
}
