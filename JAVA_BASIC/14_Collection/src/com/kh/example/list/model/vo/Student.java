package com.kh.example.list.model.vo;

// Comparable - java.lang compareTo �������̵� �ۼ� . ���� ���� �Ѱ�
// Comparator - java.util compare �������̵� �ۼ�  . �������� ���� ����

public class Student implements Comparable<Student> {
	// - name : String
	private String name;
	// - score : int
	private int score;

	// + Student()
	public Student() {
	}

	// + Student(name : String, score : int)
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

//    public  int hashCode(Object a[]) {
//        if (a == null)
//            return 0;
//
//        int result = 1;
//
//        for (Object element : a)
//            result = 31 * result + (element == null ? 0 : element.hashCode());
//
//        return result;
//    }
	// ������ �ϴ� ����� ���������ε�, ��Ŭ�������� �����ϴ� �������
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int prime = 31;
		// ��ǻ�Ͱ� ���������� ������ ũ�鼭 ����ϱ� ���� �Ҽ�

		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	// �ؽ����� ������ equals �� ���ƾ� �Ѵٴ� �Ծ��� �ִ�.
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// this �� �ּҸ� ��� �ִ�. ������ ����
		// �� �ּҰ��� �Ű������� ���� �ּҰ��� ������ Ʈ��
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		// getClase() : Ŭ������ ���� ������ ������ �ִ� �޼ҵ�
		if (this.getClass() != obj.getClass()) {
			return false;
		}

		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}

		if (score != other.score) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return "name=" + name + ", score=" + score;
		return name + "(" + score + ")";
	}
	// + getter/setter
	// + toString() : String

	// ���Ŀ� ���� ���� ����
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		// �̸��� ���ؼ� �������� ����.
		// �̸� -> �������� ����
		// ====> String�� ���ؼ� �������� ����
		String otherName = o.getName();
			/* �⺻������ CompareTO �� ��ȯ�� : int
			 * �� ��ü�� �� ���� ������ 0�� ��ȯ
			 * �� ��ü�� �� ��󺸴� ũ�� 1�� ��ȯ
			 * �� ��ü�� �� ��󺸴� ������ -1�� ��ȯ
			 * 
			 */
		
		return name.compareTo(otherName);
	//	return -name.compareTo(otherName); //������������ ����
	}
	//
	// ������ 18 ������ 6���� (3������ . 1 -> 2 -> 3) 40�� �̻�
	// �����ذ� 3����						     40�� �̻�
	//									�ΰ� ��� 60���̻�
	
	
}
