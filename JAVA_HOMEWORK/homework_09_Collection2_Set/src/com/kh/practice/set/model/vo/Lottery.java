package com.kh.practice.set.model.vo;

public class Lottery implements Comparable<Lottery>{
	private String name;
	private String phone;
	
	public Lottery() {
		
	}
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s(%s)", name, phone);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((name == null) ? 0 : name.hashCode());
		result = PRIME * result + ((phone == null)? 0 : phone.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Lottery other = (Lottery)obj;
		
		if(this.name == null) {
			if(other.name != null) {
				return false;
			}
		}else if(!this.name.equals(other.name)){
			return false;
		}
		if(this.phone == null) {
			if(other.phone !=null) {
				return false;
			}
		}else if(!this.phone.equals(other.phone)) {
			return false;
		}
		
		return true;
	}
	@Override
	public int compareTo(Lottery o) {
		
		return name.compareTo(o.name);
	}
}
