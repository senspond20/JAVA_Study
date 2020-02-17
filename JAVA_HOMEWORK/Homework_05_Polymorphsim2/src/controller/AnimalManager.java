package controller;

import model.vo.Animal;
import model.vo.Cat;
import model.vo.Dog;

//<implementation>
public class AnimalManager {
	
	public static void main(String[] args) {

		//	int random = (int)( Math.random() * 5);
		
		Animal[] am = new Animal[5];
		{
			am[0] = new Cat("고양이", "블루냥", "서울","하양");
			am[1] = new Cat("양양이", "페리시온", "안양","빨강");
			am[2] = new Dog("진돌이", "백구", 24);
			am[3] = new Cat("말량이", "루라", "아산","블랙");
			am[4] = new Dog("아리", "흑돌이", 23);	
		};

		for(int i = 0; i < am.length; i++) {
			am[i].speak();
		}
	
	}
}
