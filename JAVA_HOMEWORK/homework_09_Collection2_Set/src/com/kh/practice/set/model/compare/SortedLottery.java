package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator<Lottery>{

	@Override
	public int compare(Lottery o1, Lottery o2) {
		// TODO Auto-generated method stub
		String standard = o1.getPhone();
		String object = o2.getPhone();
		if(standard.compareTo(object) > 0) {
			return 1;
		}else if(standard.compareTo(object) == 0) {
		//	return 0;
			return o1.getName().compareTo(o2.getName());
		}else {
			return -1;
		}
	}
	
}
