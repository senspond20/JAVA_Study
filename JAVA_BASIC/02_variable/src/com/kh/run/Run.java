package com.kh.run;
import com.kh.variable.A_Variable;
import com.kh.variable.B_Constant;
import com.kh.variable.C_Overflow;
import com.kh.variable.D_Cast;
import com.kh.variable.E_PrintMethod;
import com.kh.variable.F_KeyboardInput;

//import com.kh.variable.*;

public class Run {
	// ����ο� ���ó���δ� ������ �ڵ带 ¥�°��� ����.
	public static void main(String[] args) {//�޼ҵ�
		
	// A_Variable av = new A_Variable();
	// A_Variable cannot be resolved to a type
	   A_Variable av = new A_Variable();
	//	av.initVarialbe();
    //  av.declareVariable();	
		
	
	   B_Constant bc = new B_Constant();
	// bc.finalConstant();

	   C_Overflow co = new C_Overflow(); // import ����Ű : ��Ʈ�� + ����Ʈ + O  
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

	/* String str1 = "����" + 123 + 45 + "���";
	   String str2 = 123 + 45 + "����" + "���";
	   
	   // ���ڰ� ���ڿ��ڿ� ������ ���̻� ���ڰ� �ƴϴ�. (���ڿ� ����)
	   // �� �ٸ� �ڷ����� ���ڿ� �ڿ� ������ ���̻� �� �ڷ����� ������ ���� ���Ѵ�.
	   
	   System.out.println(str1);
	   System.out.println(str2);*/

	// av. av��� ������ ���� declarVariable()�޼ҵ带 ȣ��
	// Ctrl + F11 ����
	}
}


