package com.kh.pracitce.abstracNIneterface.model.vo;

import java.io.Serializable;

public interface Phone extends Cloneable, Serializable{

	// 전화 거는 방식 추상 메소드
	public abstract String makeCall();
	
	// 전화 받는 추상 메소드
	public abstract String takeCall();
}
