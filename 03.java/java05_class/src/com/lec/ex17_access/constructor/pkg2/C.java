package com.lec.ex17_access.constructor.pkg2;

import com.lec.ex17_access.constructor.pkg1.A;

public class C {
	A a1 = new A(false);      //public    import하면 가능
	//A a2 = new A(1.0);      //protected 다른 패키지 불가능
	//A a3 = new A(1);        //default   다른 패키지 불가능
	//A a4 = new A("A";)	  //private   다른 패키지 불가능
}
