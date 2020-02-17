package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	// 추첨 대상을 담을 HashSet 객체 생성(Lottery)
	HashSet<Lottery> lott = new HashSet<Lottery>();
	HashSet<Lottery> win = new HashSet<Lottery>();
	// 당첨 대상을 담을 HashSet 객체 생성(win)

	{

		lott.add(new Lottery("박신우", "123"));
		lott.add(new Lottery("한가영", "123"));
		lott.add(new Lottery("남나눔", "123"));
		lott.add(new Lottery("미운털", "123"));
		lott.add(new Lottery("기다림", "123"));
		lott.add(new Lottery("각지연", "123"));
		lott.add(new Lottery("하영이", "123"));
		lott.add(new Lottery("오지연", "123"));
//		win.add(new Lottery("박신우", "123"));
//		win.add(new Lottery("한가영", "123"));
//		win.add(new Lottery("남나눔", "123"));
//		win.add(new Lottery("미운털", "123"));
//		win.add(new Lottery("기다림", "123"));
//		win.add(new Lottery("각지연", "123"));
	}

	public boolean insertObject(Lottery l) {

		boolean ck = lott.add(l);
		return ck;
	}

	public boolean deleteObject(Lottery l) {

		boolean ck = false;
//		Iterator<Lottery> it = lott.iterator();
////		
//		// 단 반향(1회성)
//		while(it.hasNext()) {
//			if(it.next().equals(l)) {
//		
//				lott.remove(l);
//				System.out.println(l);
//				
//			}
//		}

//		java.util.ConcurrentModificationException
//
//		이 예외는 흔히 List나 ArrayList를 for 문에 직접 집어넣고 돌리며 remove를 호출했을 때 발생한다.
//

		// break 로 해결

		for (Lottery var : lott) {
			if (var.equals(l)) {
				// if(var.getName().equals(l.getName()) && var.getPhone().equals(l.getPhone()))
				// {
				System.out.println(l);
				ck = lott.remove(l);
				break;
				// 삭제
				// lott.remove(new Lottery(l.getName(),l.getPhone()));

			}
		}

		// 당첨자 목록(win)중에 삭제된 추점 대상자가 존재 할 수 있으니
		// 삭제 결과인 boolean값과 win객체가 null이 아닐 떄에만
		// win에도 해당 추첨 대상자 삭제
		// if(win != null && win.isEmpty() == false)

		// if (ck != false && win != null) {
		if (ck != false && win.isEmpty() == false) {
			win.remove(l);
		}
//
		return ck;
	}

	// 난수 돌려서 중복없이 뽑는거 필요하다.
	private int[] randomPick(int count) {

		final int WINNUM = 4;
		int[] iPick = new int[WINNUM];
		
		for (int i = 0; i < count; i++) {
			iPick[i] = (int) (Math.random() * lott.size());
			
			for (int j = 0; j < i; j++) {
				if (iPick[i] == iPick[j]) {
					i--;
					break;
				}
			}
		}

		return iPick;
	}

	public HashSet<Lottery> winObject(){
		
		// 뽑기 돌릴 리스트
		ArrayList<Lottery> list = new ArrayList<Lottery>(lott);
		
		// 1. 추첨대상목록에서  당첨대상목록을 제외한 리스트가 필요하다.
					
		Iterator<Lottery> it = win.iterator();
		while(it.hasNext()) {
			Lottery var = it.next();
			
			if(list.contains(var)){
				list.remove(var);
			}
		}
		
		
		//System.out.println(list);
		
		// 
		final int PICK_NUM = 4;
		int[] random = new int[PICK_NUM];
		
		// 2. 뽑기 횟수 계산
		// (이미 당첨목록 4명이면 COUNT = 0;)
		// 한명이 삭제되서 당첨목록 3명이면 COUNT = 1;
		final int COUNT = PICK_NUM - win.size();
		
		// 3. 중복값 없이 난수뽑아서 배열에 저장
		random[0] = (int) (Math.random() * list.size());
		for (int i = 1; i < COUNT; i++) {
			random[i] = (int) (Math.random() * list.size());

			for (int j = 0; j < i; j++) {
				if (random[i] == random[j]) {
					i--;
					break;
				}
			}		
		}
		
		// 4. 당첨목록에 넣기
		for(int i = 0; i < COUNT; i++) {
			win.add(list.get(random[i]));
		}
		
		// 5. 당첨목록 반환
		return win;
	}

	public HashSet<Lottery> winObject2() {
		// 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
		// 랜덤으로 뽑기 위해 Lottery를 ArrayList에 담고
		// 인덱스를 이용해 win에 담청자 저장
		// 이 때 , 당첨자 수는 무조건 4명이며 이를 위해 추첨자 수는 4명 이상이여야 함

		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움
		final int WINNUM = 4;
		boolean isFirst = true;
		ArrayList<Lottery> alist = new ArrayList<Lottery>(lott);
		
		int random = 0;
		//System.out.println(alist);
		
		if (win.size() >= WINNUM) {
			return win;
		} else {
			
			int count = WINNUM - win.size();
			//System.out.println(count);
			int[] iPick = randomPick(count);
			
			for (int i = 0; i < count; i++) {
				win.add(alist.get(iPick[i]));

			}
			// 랜덤 난수 중복은 안되지만 당첨 목록중에서 또 중복되는경우로
			// 4명이 안채워지는 경우가 있어서 다시돌림.
			while(win.size() < WINNUM)
			{
				iPick = randomPick(count);
				for (int i = 0; i < count; i++) {
				win.add(alist.get(iPick[i]));
				}
			}
		
		}
		
		return win;

	}

	public TreeSet<Lottery> sortedWinObject() {
		// 이름순으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는
		// 정렬기준을 가지고 정렬된 결과를 반환
		// 이떄 , 미리 만들어진 win을 가지고 정렬하기 떄문에
		// 당첨 대상 확인을 꼭 해야함
		if (!win.isEmpty()) {
			return new TreeSet<Lottery>(win);
		} else {
			return null;
		}

	}

	public boolean searchWinner(Lottery l) {

		for (Lottery var : win) {

			// equls를 만들어 두게 되면 이렇게 비교 된다.
			if (l.equals(var)) {
				// if(var.getName().equals(l.getName()) && var.getPhone().equals(l.getPhone()))
				// {
				return true;
			}
		}
		return false;
	}

}
