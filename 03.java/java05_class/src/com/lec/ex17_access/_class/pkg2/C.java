package com.lec.ex17_access._class.pkg2;

import com.lec.ex17_access._class.pkg1.A;
//import com.lec.ex17_access._class.pkg1.*;
//*은 pkg1에 있는 모든 패키지 import해라

public class C {
	A a;//명시적 선언 혹은 import하면 됨. 
	//B b;//default이기 때문에 에러걸림 public이 아니어서 import *로 줘도 안됨.
	//다른 패키지에서는 접근 불가
}
