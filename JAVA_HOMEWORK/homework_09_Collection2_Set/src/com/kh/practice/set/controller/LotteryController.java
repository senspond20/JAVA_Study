package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	// ��÷ ����� ���� HashSet ��ü ����(Lottery)
	HashSet<Lottery> lott = new HashSet<Lottery>();
	HashSet<Lottery> win = new HashSet<Lottery>();
	// ��÷ ����� ���� HashSet ��ü ����(win)

	{

		lott.add(new Lottery("�ڽſ�", "123"));
		lott.add(new Lottery("�Ѱ���", "123"));
		lott.add(new Lottery("������", "123"));
		lott.add(new Lottery("�̿���", "123"));
		lott.add(new Lottery("��ٸ�", "123"));
		lott.add(new Lottery("������", "123"));
		lott.add(new Lottery("�Ͽ���", "123"));
		lott.add(new Lottery("������", "123"));
//		win.add(new Lottery("�ڽſ�", "123"));
//		win.add(new Lottery("�Ѱ���", "123"));
//		win.add(new Lottery("������", "123"));
//		win.add(new Lottery("�̿���", "123"));
//		win.add(new Lottery("��ٸ�", "123"));
//		win.add(new Lottery("������", "123"));
	}

	public boolean insertObject(Lottery l) {

		boolean ck = lott.add(l);
		return ck;
	}

	public boolean deleteObject(Lottery l) {

		boolean ck = false;
//		Iterator<Lottery> it = lott.iterator();
////		
//		// �� ����(1ȸ��)
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
//		�� ���ܴ� ���� List�� ArrayList�� for ���� ���� ����ְ� ������ remove�� ȣ������ �� �߻��Ѵ�.
//

		// break �� �ذ�

		for (Lottery var : lott) {
			if (var.equals(l)) {
				// if(var.getName().equals(l.getName()) && var.getPhone().equals(l.getPhone()))
				// {
				System.out.println(l);
				ck = lott.remove(l);
				break;
				// ����
				// lott.remove(new Lottery(l.getName(),l.getPhone()));

			}
		}

		// ��÷�� ���(win)�߿� ������ ���� ����ڰ� ���� �� �� ������
		// ���� ����� boolean���� win��ü�� null�� �ƴ� ������
		// win���� �ش� ��÷ ����� ����
		// if(win != null && win.isEmpty() == false)

		// if (ck != false && win != null) {
		if (ck != false && win.isEmpty() == false) {
			win.remove(l);
		}
//
		return ck;
	}

	// ���� ������ �ߺ����� �̴°� �ʿ��ϴ�.
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
		
		// �̱� ���� ����Ʈ
		ArrayList<Lottery> list = new ArrayList<Lottery>(lott);
		
		// 1. ��÷����Ͽ���  ��÷������� ������ ����Ʈ�� �ʿ��ϴ�.
					
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
		
		// 2. �̱� Ƚ�� ���
		// (�̹� ��÷��� 4���̸� COUNT = 0;)
		// �Ѹ��� �����Ǽ� ��÷��� 3���̸� COUNT = 1;
		final int COUNT = PICK_NUM - win.size();
		
		// 3. �ߺ��� ���� �����̾Ƽ� �迭�� ����
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
		
		// 4. ��÷��Ͽ� �ֱ�
		for(int i = 0; i < COUNT; i++) {
			win.add(list.get(random[i]));
		}
		
		// 5. ��÷��� ��ȯ
		return win;
	}

	public HashSet<Lottery> winObject2() {
		// ��÷ ����� �߿��� �������� �̾� ��÷ ��Ͽ� �ִ� �޼ҵ�
		// �������� �̱� ���� Lottery�� ArrayList�� ���
		// �ε����� �̿��� win�� ��û�� ����
		// �� �� , ��÷�� ���� ������ 4���̸� �̸� ���� ��÷�� ���� 4�� �̻��̿��� ��

		// ���� ��÷�� ��Ͽ� ������ ��÷ ����ڰ� �ִٸ�
		// ������ ��÷�� ����� �����ϰ� ������ ����� �ڸ��� ���ο� ��÷�ڷ� ä��
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
			// ���� ���� �ߺ��� �ȵ����� ��÷ ����߿��� �� �ߺ��Ǵ°���
			// 4���� ��ä������ ��찡 �־ �ٽõ���.
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
		// �̸������� �������� �����ϵ�, �̸��� ������ ��ȣ�� �������� �ϴ�
		// ���ı����� ������ ���ĵ� ����� ��ȯ
		// �̋� , �̸� ������� win�� ������ �����ϱ� ������
		// ��÷ ��� Ȯ���� �� �ؾ���
		if (!win.isEmpty()) {
			return new TreeSet<Lottery>(win);
		} else {
			return null;
		}

	}

	public boolean searchWinner(Lottery l) {

		for (Lottery var : win) {

			// equls�� ����� �ΰ� �Ǹ� �̷��� �� �ȴ�.
			if (l.equals(var)) {
				// if(var.getName().equals(l.getName()) && var.getPhone().equals(l.getPhone()))
				// {
				return true;
			}
		}
		return false;
	}

}
