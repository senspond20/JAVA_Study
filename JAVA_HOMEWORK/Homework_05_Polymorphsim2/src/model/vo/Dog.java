package model.vo;

public class Dog extends Animal {

	private int weight;
	public Dog() {}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	//
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	//
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(super.toString() + " 몸무게는 " + weight + "kg 입니다.");
	}
}
