package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music> {
	public AscTitle() {
		
	}
//	public int compare(Object o1, Object o2) {
//	}
	
	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		String standard = o1.getTitle();
		String object = o2.getTitle();
		
		if(standard == object) {
			return o1.getSinger().compareTo(o2.getSinger());
		}else {
			return standard.compareTo(object);
		}
//		if(standard.compareTo(object) > 0 ) {
//			return 1;	
//		}else if (standard == object) {
//		//	return 0;
//			return o1.getSinger().compareTo(o2.getSinger());
//		}else {
//			return -1;
//		}
	}
}
