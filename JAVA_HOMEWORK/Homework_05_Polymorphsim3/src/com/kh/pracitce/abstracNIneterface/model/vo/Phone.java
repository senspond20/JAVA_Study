package com.kh.pracitce.abstracNIneterface.model.vo;

import java.io.Serializable;

public interface Phone extends Cloneable, Serializable{

	// ��ȭ �Ŵ� ��� �߻� �޼ҵ�
	public abstract String makeCall();
	
	// ��ȭ �޴� �߻� �޼ҵ�
	public abstract String takeCall();
}
