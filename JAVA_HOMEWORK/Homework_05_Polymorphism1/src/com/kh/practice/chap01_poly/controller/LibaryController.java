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
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
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
		
		// countans 메소드로 포함되는 문자열 개수 획득
		for (int i = 0; i < bList.length; i++) {
			str = bList[i].toString();			
			if (str.contains(keyword)) {
				count++;
			}
		}

		// 검색결과가 없으면 null반환
		if (count == 0) {
			return null;
		// 검색결과가 있으면 	
		} else {

			// 새로운 객체 배열 할당
			Book[] sBook = new Book[count];
			count = 0;

			// 복사를 시킨다.
			for (int i = 0; i < bList.length; i++) {
				str = bList[i].toString();	
				if (str.contains(keyword)) {
					sBook[count++] = bList[i];
				}
			}
			// 복사배열 주소값 리턴.
			return sBook;
		}
	}

	public int rentBook(int index) {

		int result = 0;

		// 다운 캐스팅
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
