package com.kh.hw.member.model.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	private final int SIZE = 10;

	Member[] m = null;
	// Member[] m = new Member[SIZE];
	// 전역으로 생성자를 만들게 되면 프로그램 구동하고 메인화면 시작에서
	// 회원추가를 하지않은 상태로,
	// 회원검색(아이디,이름,이메일)을 할때나
	// 회원을 삭제할때도 에러가 발생해서 null 로 해놓고
	// null 이면 View에서 "회원이 없습니다" 이런 메시지를 출력하도록 기능을 추가했다.

	private static int count = 0;

	public MemberController() {
	}

	// 존재하는 멤버 갯수 봔환
	public int existMemberNum() {
		return count;
	}

	// 집어넣기
	public void insertMember(String id, String name, String password, String email, char gender, int age) {

		// 카운트 0일때만 Member 객체 생성
		if (count == 0) {
			m = new Member[SIZE];
			m[count] = new Member(id, name, password, email, gender, age);

		} else {
			m[count] = new Member(id, name, password, email, gender, age);
		}

		count++;
	}

	// 전체회원 삭제.
	public void delete() {
		m = null;
		count = 0;
	}

	public boolean delete(String id) {

		int index = 0;
		boolean find = false;

		for (int i = 0; i < existMemberNum() && find != true; i++) {
				
			if (m[i].getId().equals(id)) {
				index = i;
				find = true;
				count--;
			
				for (int j = index; j < SIZE - 1; j++) {
					m[j] = m[j+1];
				}
				m[SIZE-1] = null;
				return true;
			}
		
		}
		return false;
//		if(find){
//			return true;
//		}else {
//			return false;
//		}
		
	}

	// 아이디 중복 체크
	public boolean checkld(String inputId) {
		boolean ck = false;

		if (m != null) {
			for (int i = 0; i < existMemberNum(); i++) {
				if (m[i].getId().equals(inputId)) {
					ck = true;
				}
			}
		}
//		for (int i = 0; i < SIZE; i++) {
//			for (int j = 0; j < i; j++) {
//				if (m[i].getId() == m[j].getId()) {
//					ck = true;
//				}
//			}
//		}

		return ck;
	}

	// 아이디 검색 (아이디는 하나)
	public String serchId(String id) {
		String result = null;

		if (m == null) {
			return result;
		}

		for (int i = 0; i < existMemberNum(); i++) {
			// String str = m[i].getId();
			// System.out.println(m[i].getId());
			if (m[i].getId().equals(id))
			// if(m[i].getId().contentEquals(id))
			// if(m[i].inform().contains(id))
			{
				result = m[i].inform();
				break; // 일치하면 for문에서 빠져나가야지.

			} else {
				result = null;
			}
		}
		return result;
	}

	// 이름은 여러개 나올 수 있으니까.
	public Member[] serchName(String name) {

		Member[] mm = null;
		int count = 0;

		for (int i = 0; i < existMemberNum(); i++) {
			if (m[i].getName().equals(name)) {
				count++;
			}
		}
		// 이름 갯수가 없으면
		if (count == 0) {
			return mm;
		} else {
			mm = new Member[count];
		}

		count = 0;
		for (int i = 0; i < existMemberNum(); i++) {
			if (m[i].getName().equals(name)) {
				mm[count++] = m[i];
			}

		}
		return mm;
	}

	public Member[] serchEmail(String email) {

		Member[] mm = null;
		int count = 0;

		for (int i = 0; i < existMemberNum(); i++) {
			if (m[i].getEmail().equals(email)) {
				count++;
			}
		}
		// 이름 갯수가 없으면
		if (count == 0) {
			return mm;
		} else {
			mm = new Member[count];
		}

		count = 0;
		for (int i = 0; i < existMemberNum(); i++) {
			if (m[i].getEmail().equals(email)) {
				mm[count++] = m[i];
			}
		}
		return mm;
	}

	public boolean updatePassword(String id, String password) {

		boolean ck = false;
		for (int i = 0; i < existMemberNum(); i++) {
			if (m[i].getId().equals(id)) {
				m[i].setPassword(password);
				ck = true;
			}
		}

		return ck;
	}

	public boolean updateName(String id, String name) {
		boolean ck = false;
		for (int i = 0; i < existMemberNum(); i++) {
			if (m[i].getId().equals(id)) {
				m[i].setName(name);
				ck = true;
			}
		}

		return ck;
	}

	public boolean updateEmail(String id, String email) {
		boolean ck = false;
		for (int i = 0; i < existMemberNum(); i++) {
			if (m[i].getId().equals(id)) {
				m[i].setEmail(email);
				ck = true;
			}
		}

		return ck;
	}

	public Member[] printAll() {
		return m;
	}

}
