package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.kh.practice.generics.model.vo.Farm;

public class FarmController {

	HashMap<Farm, Integer> hMap = new HashMap<>();
	ArrayList<Farm> list = new ArrayList<>();

	public FarmController() {
	}

	// ���� ���� f�� hMap �ȿ� key�� �������� ���� ��
	// f�� amount�� ���� Ű�� ������ ���� �� true ��ȯ, ������ ��� false ��ȯ.
	public boolean addNewKind(Farm f, int amount) {
		if (hMap.containsKey(f)) {
			return false;
		} else {
			hMap.put(f, amount);
			return true;
		}
	}

	// ���� ���� f�� hMap �ȿ� key�� ������ �� hMap�� f ���� �� true ��ȯ
	// �������� ���� ��� false ��ȯ
	public boolean removeKind(Farm f) {
		if (hMap.containsKey(f)) {
			hMap.remove(f);
			return true;
		} else {

			return false;
		}
	}

	// ���� ���� f�� hMap �ȿ� key�� ������ �� f�� amount ���� �� true ��ȯ
	// �������� ���� ��� false ��ȯ
	public boolean changeAmount(Farm f, int amount) {
		if (hMap.containsKey(f)) {
			hMap.put(f, amount);
			return true;
		} else {
			return false;
		}
	}

	// ��깰 �����Ͱ� ���ִ� �÷��� ��ȯ
	public HashMap<Farm, Integer> printFarm() {
		return hMap;
	}

	// ���� ���� f�� hMap �ȿ� �����ϸ鼭 �� f�� ������ 0�� �̻��� ��
	// list�� f �߰�, �׸��� hMap�� f�� ���� 1 ���� �� true ��ȯ
	// �������� ������ false ��ȯ
	public boolean buyFarm(Farm f) {
		if (hMap.containsKey(f) && hMap.get(f) >= 0) {
			list.add(f);
			hMap.put(f, hMap.get(f)-1);
			return true;

		} else {
			return false;
		}

	}

	// ���� ���� f�� list�� ������ �� list�� f ����, �׸��� hMap�� f ���� 1 ����
	// �� ����� �� true ��ȯ, �ƴϸ� false ��ȯ
	public boolean removeFarm(Farm f) {

		if(list.contains(f)) {
			list.remove(f);
			hMap.put(f, hMap.get(f)+1);
			return true;
		}
		return false;
	}

	// ��깰 ���� �����Ͱ� ���ִ� �÷��� ��ȯ
	public ArrayList<Farm> printBuyFarm() {
		return list;
	}

}
