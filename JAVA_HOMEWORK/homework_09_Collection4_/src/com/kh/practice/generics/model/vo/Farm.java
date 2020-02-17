package com.kh.practice.generics.model.vo;

public class Farm {
	
//	public String name;
//	public abstract String getName();
//	public abstract void setName(String name);
//	public abstract String toString();
//	public abstract int hashCode();
//	public abstract boolean equals(Farm obj);
	
	private String name;
	public Farm() {
		
	}
	public Farm(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Farm [name=" + name + "]";
	}
	
	// 정의되어야한다.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Farm other = (Farm) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
}
