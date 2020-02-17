package com.kh.example.map.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

import com.kh.example.map.model.vo.Snack;

public class MapController {
	
	public void doMap() {
		 Map<String, Snack> map = new HashMap<String, Snack>();
		 
		 // put (K key, V value) : 키와 값 추가, 성공 시 value 반환
		 map.put("새우깡", new Snack("짠맛",1500));
		 map.put("다이제", new Snack("단맛",2500));
		 map.put("포토이토칩", new Snack("짠맛",1500));
		 map.put("고소미", new Snack("고소한맛",1000));
		 System.out.println(map);
		 
		 map.put("새우깡", new Snack("매운맛",1500));
		 
		// Map<Integer, Snack> map2 = new HashMap<Integer,Snack>();
		 System.out.println(map);
		 
		// 있는지 없는지 확인하는 메소드, Key/Value
		 // containsKey(Object Key) : Key 가 있으면 true 없으면 false
		 // containsValue (Object key) : value 가 있으면 true 없으면 fasle
		 
		 System.out.println(map.containsKey("새우깡"));
		 System.out.println(map.containsValue(new Snack("짠맛",1500)));
		 
		 // get(Object key) : 키 값의 반환
		 System.out.println(map.get("새우깡"));
		 System.out.println(map.get("홈런볼"));
		 
		 // 1. values() : 모든 values()를 colletion 에 담아 반환
		 System.out.println(map.values());
		 
		 // 2. keySet() : 모든 Key를 Set에 담아 반환
//		 System.out.println(map.keySet());
		 Set<String> set1 = map.keySet();
		 System.out.println(set1);
		 
		Iterator<String> it = set1.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("키 : " + key + ", 값 : " + map.get(key));
		}
		// 3. entrySet() : 모든 entry객체(key와 value의 쌍) 을 Set에 담아 반환
		
		Set<Entry<String, Snack>> set2 = map.entrySet();
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println("키 : " + entry.getKey() + ", 값 : " + entry.getValue());
		}
		System.out.println(set2);
	
		Map<String, Snack> map2 = new TreeMap<String, Snack>();
		// TreeMap 정렬기준 Key인데. Key의 형태인 String이 compable 이 구현되어 있기에
		// 정렬기준을 정하지 않아도 정렬이 된다. 
		
		map2.putAll(map);
		System.out.println(map2);
	}
	
//	키와 값을 String 타입으로 제한한 Map컬렉션
//	주로 Properties 는 프로퍼티 파일을 읽어 들일 떄 주로 사용
	public void doProperties() {
		Properties prop = new Properties();
	//	prop.put(Object key, Object value) -> 사용안함
    //  Hashtable 에서 상속받아서 
		
	
		prop.setProperty("채소", "오이");
		prop.setProperty("과일", "사과");
		prop.setProperty("간식", "첼리");
		
		prop.setProperty("채소", "피망");
		System.out.println(prop);
		
		System.out.println(prop.getProperty("채소"));
		System.out.println(prop.getProperty("견과"));
		
		System.out.println(prop.getProperty("채소", "땅콩"));
		System.out.println(prop.getProperty("견과", "땅콩")); // 없으면 뒤에 있는것으로 반환
		
		
	}
	public void doProperties2() {
		
	}
	public void fileOpen() {
	//	try(FileInputStream fis = new FileInputStream("test.properties");) {
		try(FileInputStream fis = new FileInputStream("test.xml");) {	
			Properties prop = new Properties();

		
			// load (InputStream is) : is 에 있는 Properties 읽어옴
			// 바이트 스트림으로 저장된 파일의 내용을 읽어와서 Properties 객체에 저장
			
			// load (Reader reader) :
			// 			문자스트림으로 저장된 파일의 내용을 읽어와서 Properties 객체에 저장
			// prop.load(fis);
			
			// loadFromXML (InputStream is)
			// : 바이트 스트림으로 저장된 xml 파일의 내용을 읽어와서 Properties 객체에 저장
			prop.loadFromXML(fis);
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void fileSave() {
	//	try(FileOutputStream fos = new FileOutputStream("test.properties");) {
		
		try(FileOutputStream fos = new FileOutputStream("test.xml");) {
			
			Properties prop = new Properties();
			prop.setProperty("title", "Properties Practiece");
			prop.setProperty("language", "kor");
//			
//			prop.store(fos, "Properties Test File");
			
			prop.storeToXML(fos, "storeTOXML TEST");
			
			// store(OutputStream os , String coments)
			// store(Writer writer, STring coments)
			// os(또는 writer) 에 prop 저장( 바이트 또는 문자열 형식으로 ),
			// coments 는 주석으로 저장
			
			// storeToXML(OutputStream os, String coments)
			// 저장된 정보를 바이트 스트림으로 xml 출력 저장
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
