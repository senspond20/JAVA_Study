package com.kh.example.set.model.compare;

import java.util.Comparator;

import com.kh.example.set.model.vo.Dog;

public class DogComparator implements Comparator<Dog> {
	
	@Override
	public int compare(Dog o1, Dog o2) {
		// 몸무게에 대해서 오름차순
		double standard = o1.getWeight();
		double object = o2.getWeight();
		
		if(standard > object) {
			return 1;
		}else if(standard == object) {
//			if(o1.getName().equals(o2.getName())) {
//				return 0;
//			}
//			return 2;
			
//			return 0;
			return o1.getName().compareTo(o2.getName());
		}else {
			return -1;
		}
	}
}
