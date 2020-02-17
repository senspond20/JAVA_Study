package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibaryController {
	private static final int SIZE = 5;
	private Member mem = null;
	Book[] bList = new Book[SIZE];

	{
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}

	public void insertMember(Member mem) {
		this.mem = mem;
	}

	public Member myInfo() {
		return mem;
	}

	public Book[] SelectAll() {
		return bList;
	}

	public Book[] SearchBook(String keyword) {

		int count = 0;
		String str = null;
		
		// countans �޼ҵ�� ���ԵǴ� ���ڿ� ���� ȹ��
		for (int i = 0; i < bList.length; i++) {
			str = bList[i].toString();			
			if (str.contains(keyword)) {
				count++;
			}
		}

		// �˻������ ������ null��ȯ
		if (count == 0) {
			return null;
		// �˻������ ������ 	
		} else {

			// ���ο� ��ü �迭 �Ҵ�
			Book[] sBook = new Book[count];
			count = 0;

			// ���縦 ��Ų��.
			for (int i = 0; i < bList.length; i++) {
				str = bList[i].toString();	
				if (str.contains(keyword)) {
					sBook[count++] = bList[i];
				}
			}
			// ����迭 �ּҰ� ����.
			return sBook;
		}
	}

	public int rentBook(int index) {

		int result = 0;

		// �ٿ� ĳ����
		if (bList[index] instanceof AniBook) {
			if (mem.getAge() < ((AniBook) bList[index]).getAccessAge()) {
				result = 1;
			} else {
				result = -1;
			}
			//
		} else if (bList[index] instanceof CookBook) {
			if (((CookBook) bList[index]).getCoupon() == true) {
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			} else {
				result = -2;
			}
		}

		return result;
	}

}
