package com.kh.run;
import com.kh.variable.A_Variable;
import com.kh.variable.B_Constant;
import com.kh.variable.C_Overflow;
import com.kh.variable.D_Cast;
import com.kh.variable.E_PrintMethod;
import com.kh.variable.F_KeyboardInput;

//import com.kh.variable.*;

public class Run {
	// 실행부와 기능처리부는 나눠서 코드를 짜는것이 좋다.
	public static void main(String[] args) {//메소드
		
	// A_Variable av = new A_Variable();
	// A_Variable cannot be resolved to a type
	   A_Variable av = new A_Variable();
	//	av.initVarialbe();
    //  av.declareVariable();	
		
	
	   B_Constant bc = new B_Constant();
	// bc.finalConstant();

	   C_Overflow co = new C_Overflow(); // import 단축키 : 컨트롤 + 쉬프트 + O  
	// co.overflow();
	// co.calc(); 
	   
	   D_Cast dc = new D_Cast();
//	   dc.rule1();
	   
//	   dc.rule3();
	
	   E_PrintMethod ep = new E_PrintMethod();
//	   ep.printExample();
//	   ep.printlnExample();
//	   ep.printfExample();
	   
	   F_KeyboardInput fk = new F_KeyboardInput();
	  // fk.inputScanner();
	   fk.inputScanner2();

	/* String str1 = "기차" + 123 + 45 + "출발";
	   String str2 = 123 + 45 + "기차" + "출발";
	   
	   // 숫자가 문자열뒤에 나오면 더이상 숫자가 아니다. (문자열 역할)
	   // 또 다른 자료형이 문자열 뒤에 나오면 더이상 그 자료형의 역할을 하지 못한다.
	   
	   System.out.println(str1);
	   System.out.println(str2);*/

	// av. av라는 공간에 들어가서 declarVariable()메소드를 호출
	// Ctrl + F11 실행
	}
}


