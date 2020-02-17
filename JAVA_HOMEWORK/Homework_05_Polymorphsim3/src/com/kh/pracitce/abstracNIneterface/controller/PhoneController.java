package com.kh.pracitce.abstracNIneterface.controller;

import com.kh.pracitce.abstracNIneterface.model.vo.GalaxyNote9;
import com.kh.pracitce.abstracNIneterface.model.vo.Phone;
import com.kh.pracitce.abstracNIneterface.model.vo.V40;

public class PhoneController {

	private String[] result = new String[2];

	public String[] method() {

		Phone[] p = new Phone[2];
//		SmartPhone[] p = new SmartPhone[2];

		p[0] = new GalaxyNote9();
		p[1] = new V40();

		for (int i = 0; i < result.length; i++) {
			
			if(p[i] instanceof GalaxyNote9) {
				
				result[i] = ((GalaxyNote9)p[i]).printInformaition();
				
			}else if(p[i] instanceof V40) {
				result[i] = ((V40)p[i]).printInformaition();
			}
		}

		return result;
	}

}
