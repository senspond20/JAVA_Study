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
			am[0] = new Cat("�����", "����", "����","�Ͼ�");
			am[1] = new Cat("�����", "�丮�ÿ�", "�Ⱦ�","����");
			am[2] = new Dog("������", "�鱸", 24);
			am[3] = new Cat("������", "���", "�ƻ�","��");
			am[4] = new Dog("�Ƹ�", "�浹��", 23);	
		};

		for(int i = 0; i < am.length; i++) {
			am[i].speak();
		}
	
	}
}
