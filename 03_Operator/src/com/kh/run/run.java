package com.kh.run;
import com.kh.operator.*;
public class run {
	public static void main(String[] arg) {
		
		A_LogicalNegation al = new A_LogicalNegation();
//		al.method1();	
		
		B_InDecrease bi = new B_InDecrease();
//		bi.metho1();
//		bi.method2();
//		bi.method3();
//		bi.method4();
		
		C_Arithmetic ci = new C_Arithmetic();
//		ci.method1();
//		ci.method2();
		
		D_Comparison dc = new D_Comparison();
//		dc.method1();
//		dc.method2();
		
		E_Logical el = new E_Logical();
//		el.method1();
//		el.method2();
		
//		F_Compound fc = new F_Compound();	
//		fc.method();		
		
		G_Triple gt = new G_Triple();
//		gt.method1();
		gt.method2();
	}
}
