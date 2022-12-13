package com.lec.ex01_object.ex02_hashcode;

public class KeyMain {

	public static void main(String[] args) {
		
		Object object1 = 0;
		Object object2 = 0;
		Object object3 = "0";
		Object object4 = new String("0");
		
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());
		System.out.println(object3.hashCode());
		System.out.println(object4.hashCode());
		System.out.println();
		
		System.out.println(object1 ==object2);
		System.out.println(object1 ==object3);		
		System.out.println(object3 ==object4);
		System.out.println();
		
		System.out.println(object1.equals(object2));
		System.out.println(object1.equals(object3));
		System.out.println(object3.equals(object4));
		System.out.println();
		
		System.out.println(object1.equals(object2)); // true
		System.out.println(object1.equals(object3)); // false
		System.out.println(object1.equals(object4)); // false
		System.out.println();
		
		System.out.println(object1.toString());
		System.out.println(object2.toString());
		System.out.println(object3.toString());
		System.out.println(object4.toString());
		System.out.println();
		
		System.out.println(object1 == object2); // true
		System.out.println(object1 == object3); // false
		System.out.println(object1 == object4); // false
		
		System.out.println();
		Key key1 = new Key(0);
		Key key2 = new Key(0);
		System.out.println(key1.hashCode());
		System.out.println(key2.hashCode());
		System.out.println(key1 == key2);       // false
		System.out.println(key1.equals(key2));  // false
		System.out.println(key1.toString());
		System.out.println(key2.toString());
		System.out.println();
		
		System.out.println(key1.hashCode() == key2.hashCode()); // false
	}

}
