package com.kh.pracitce.abstracNIneterface.model.vo;

import java.io.Serializable;

public interface CellPhone extends Phone, Camera, Cloneable, Serializable{
		
	// ���� ��� �߻� �޼ҵ�
	public abstract String charge();
	
}
