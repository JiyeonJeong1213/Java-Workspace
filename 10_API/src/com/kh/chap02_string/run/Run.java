package com.kh.chap02_string.run;

import com.kh.chap02_string.controller.*;

public class Run {

	public static void main(String[] args) {

		A_StringPoolTest asp = new A_StringPoolTest();
		//asp.method1();
		//asp.method2();
		//asp.method3();
		
		B_StringMethodTest bsm = new B_StringMethodTest();
		//bsm.method();
		
		C_StringTokenizerTest cst = new C_StringTokenizerTest();
		//cst.method();
		
		D_StringBufferAndBuilder dsb = new D_StringBufferAndBuilder();
		dsb.method();
	}

}
