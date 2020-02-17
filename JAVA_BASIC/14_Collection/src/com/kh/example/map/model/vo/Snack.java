package com.kh.example.map.model.vo;

public class Snack implements Comparable<Snack> {
	// - flavor : String
	// - price : int
	private String flavor;
	private int price;
	// + �⺻ ������

	public Snack() {
	}

	// + �Ű������ִ� ������(����)
	public Snack(String flavor, int price) {
		this.flavor = flavor;
		this.price = price;
	}

	// + getter/setter
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// + toString() : String
	// �� ���� : ��[���ݿ�]
	@Override
	public String toString() {
		return String.format("%s[%s]", flavor, price);
	}

//	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + ((this.flavor == null) ? 0 : flavor.hashCode());
		result = PRIME * result + this.price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)			            return true;
		if (obj == null)			            return false;
		if (this.getClass() != obj.getClass())	return false;

		Snack other = (Snack) obj;
		if (flavor == null) {
			if (other.flavor != null)				return false;
		} else if (!flavor.equals(other.flavor))	return false;
		if (price != other.price)			        return false;
		return true;
	}

	@Override
	public int compareTo(Snack o) {
		return o.flavor.compareTo(o.flavor);
	}

	// ��

}
