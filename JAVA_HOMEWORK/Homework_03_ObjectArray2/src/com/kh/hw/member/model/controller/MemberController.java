package com.kh.hw.member.model.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	private final int SIZE = 10;

	Member[] m = null;
	// Member[] m = new Member[SIZE];
	// �������� �����ڸ� ����� �Ǹ� ���α׷� �����ϰ� ����ȭ�� ���ۿ���
	// ȸ���߰��� �������� ���·�,
	// ȸ���˻�(���̵�,�̸�,�̸���)�� �Ҷ���
	// ȸ���� �����Ҷ��� ������ �߻��ؼ� null �� �س���
	// null �̸� View���� "ȸ���� �����ϴ�" �̷� �޽����� ����ϵ��� ����� �߰��ߴ�.

	private static int count = 0;

	public MemberController() {
	}

	// �����ϴ� ��� ���� ��ȯ
	public int existMemberNum() {
		return count;
	}

	// ����ֱ�
	public void insertMember(String id, String name, String password, String email, char gender, int age) {

		// ī��Ʈ 0�϶��� Member ��ü ����
		if (count == 0) {
			m = new Member[SIZE];
			m[count] = new Member(id, name, password, email, gender, age);

		} else {
			m[count] = new Member(id, name, password, email, gender, age);
		}

		count++;
	}

	// ��üȸ�� ����.
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

	// ���̵� �ߺ� üũ
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

	// ���̵� �˻� (���̵�� �ϳ�)
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
				break; // ��ġ�ϸ� for������ ������������.

			} else {
				result = null;
			}
		}
		return result;
	}

	// �̸��� ������ ���� �� �����ϱ�.
	public Member[] serchName(String name) {

		Member[] mm = null;
		int count = 0;

		for (int i = 0; i < existMemberNum(); i++) {
			if (m[i].getName().equals(name)) {
				count++;
			}
		}
		// �̸� ������ ������
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
		// �̸� ������ ������
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
