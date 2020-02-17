package com.kh.pracitce.abstracNIneterface.model.vo;

import java.io.Serializable;

public interface CellPhone extends Phone, Camera, Cloneable, Serializable{
		
	// 충전 방식 추상 메소드
	public abstract String charge();
	
}
