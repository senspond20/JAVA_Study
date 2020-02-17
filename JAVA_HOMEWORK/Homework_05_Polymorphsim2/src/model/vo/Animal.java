package model.vo;

public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {}
	protected Animal(String name, String kinds) {
		
		this.name = name;
		this.kinds = kinds;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���� �̸��� " + name + "�̰�, ������ " + kinds +"�Դϴ�.";
	}
	
	// �߻� �żҵ�
	public abstract void speak();
}
