package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {

	Map<String, Member> map = new HashMap<String, Member>();

	public MemberController() {

	}

	public boolean joinMembership(String id, Member m) {

		// HashMap.put 리턴값
		// null 새로운 키로 저장됬다고 판단
		// 그 다음 키가 중복되면 Value 값 반환
		if (map.put(id, m) == null) {
			return true;
		} else {
			return false;
		}

	}

	public String logIn(String id, String password) {

		// 아이디가 있는지 확인
		if (map.containsKey(id) == true) {

			// 비밀번호 확인
			if(map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			}
			
//			Iterator<String> it = map.keySet().iterator();
//			while (it.hasNext()) {
//				String key = it.next();
//				if (map.get(key).getPassword().equals(password)) {
//					return map.get(key).getName();
//				}
//			}
			return null;
		} else {
			return null;
		}
	}

	private boolean checkIDPW(String id, String password) {
		if (map.containsKey(id) == true) {

			// 비밀번호 확인
			if(map.get(id).getPassword().equals(password)) {
				return true;
			}
			
			// 비밀번호 확인
//			Iterator<String> it = map.keySet().iterator();
//			while (it.hasNext()) {
//				String key = it.next();
//				if (map.get(key).getPassword().equals(password)) {
//					return true;
//				}
//			}
			return false;
		} else {
			return false;
		}
	}

	public boolean changePassword(String id, String oldPw, String newPw) {

		if (checkIDPW(id, oldPw) == true) {
			
			map.get(id).setPassword(newPw);
			//map.put(id, new Member(newPw, null));
			return true;
		} else {
			return false;

		}

	}

	// $
	public void changeName(String id, String pw, String newName) {
		if (map.containsKey(id)) 
			if(map.get(id).getPassword().equals(pw)) 
				map.put(id, new Member(pw,newName));	
	}

	public TreeMap<String, Member> sameName(String name) {

		TreeMap<String, Member> tm = new TreeMap<String, Member>();

		// Set<Entry<String,Member>> set = map.entrySet();
		Iterator<Entry<String, Member>> it = map.entrySet().iterator();

		while (it.hasNext()) {
			Entry<String, Member> entry = it.next();
			if (entry.getValue().getName().equals(name)) {
				tm.put(entry.getKey(), entry.getValue());
			}
		}
		return tm;
	}
}
