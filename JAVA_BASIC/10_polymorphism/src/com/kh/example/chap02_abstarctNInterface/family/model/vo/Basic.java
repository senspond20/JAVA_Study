package com.kh.example.chap02_abstarctNInterface.family.model.vo;

import java.io.Serializable;
							// 아무것도 없는 인터페이스 : 마커 인터페이스 (Marker Interface)
							// 이 인터페이스를 구현한 클래스는 이러한 특성이 있어요. 라고 말해주는 것.
// Cloneable    : 객체 복제가 가능합니다.
// Serializable : 직렬화가 가능합니다.

public interface Basic extends Cloneable, Serializable{
//	public abstract void eat();
//	public abstract void sleep();
	
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
	
	
}

