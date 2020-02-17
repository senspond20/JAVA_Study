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
		return "저의 이름은 " + name + "이고, 종류는 " + kinds +"입니다.";
	}
	
	// 추상 매소드
	public abstract void speak();
}
