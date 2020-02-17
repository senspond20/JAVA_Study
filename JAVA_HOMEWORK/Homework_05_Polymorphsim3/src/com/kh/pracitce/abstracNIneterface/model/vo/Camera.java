package com.kh.pracitce.abstracNIneterface.model.vo;

import java.io.Serializable;

public interface Camera extends Cloneable, Serializable{
	
	// 촬영 방식 추상 메소드 *public abstract*
	public abstract String picture();
}
