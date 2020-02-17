package com.kh.example.list.model.vo;

// Comparable - java.lang compareTo 오버라이딩 작성 . 정렬 기준 한개
// Comparator - java.util compare 오버라이딩 작성  . 여러개의 정렬 기준

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
	// 재정의 하는 방법은 여러가지인데, 이클립스에서 제공하는 방법으로
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int prime = 31;
		// 컴퓨터가 인지했을때 적당히 크면서 계산하기 좋은 소수

		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	// 해쉬값이 같으면 equals 가 같아야 한다는 규약이 있다.
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// this 내 주소를 담고 있는. 참조형 변수
		// 내 주소값과 매개변수로 들어온 주소값이 값으면 트루
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		// getClase() : 클래스에 대한 정보를 가지고 있는 메소드
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

	// 정렬에 대한 기준 제시
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		// 이름에 대해서 오름차순 정렬.
		// 이름 -> 오름차순 정렬
		// ====> String에 대해서 오름차순 정렬
		String otherName = o.getName();
			/* 기본적으로 CompareTO 의 반환값 : int
			 * 비교 주체가 비교 대상과 같으면 0을 반환
			 * 비교 주체가 비교 대상보다 크면 1을 반환
			 * 비교 주체가 비교 대상보다 작으면 -1을 반환
			 * 
			 */
		
		return name.compareTo(otherName);
	//	return -name.compareTo(otherName); //내림차순으로 정렬
	}
	//
	// 서술성 18 문제중 6문제 (3차까지 . 1 -> 2 -> 3) 40점 이상
	// 문제해결 3문제						     40점 이상
	//									두개 평균 60점이상
	
	
}
