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
		 
		 // put (K key, V value) : Ű�� �� �߰�, ���� �� value ��ȯ
		 map.put("�����", new Snack("§��",1500));
		 map.put("������", new Snack("�ܸ�",2500));
		 map.put("��������Ĩ", new Snack("§��",1500));
		 map.put("��ҹ�", new Snack("����Ѹ�",1000));
		 System.out.println(map);
		 
		 map.put("�����", new Snack("�ſ��",1500));
		 
		// Map<Integer, Snack> map2 = new HashMap<Integer,Snack>();
		 System.out.println(map);
		 
		// �ִ��� ������ Ȯ���ϴ� �޼ҵ�, Key/Value
		 // containsKey(Object Key) : Key �� ������ true ������ false
		 // containsValue (Object key) : value �� ������ true ������ fasle
		 
		 System.out.println(map.containsKey("�����"));
		 System.out.println(map.containsValue(new Snack("§��",1500)));
		 
		 // get(Object key) : Ű ���� ��ȯ
		 System.out.println(map.get("�����"));
		 System.out.println(map.get("Ȩ����"));
		 
		 // 1. values() : ��� values()�� colletion �� ��� ��ȯ
		 System.out.println(map.values());
		 
		 // 2. keySet() : ��� Key�� Set�� ��� ��ȯ
//		 System.out.println(map.keySet());
		 Set<String> set1 = map.keySet();
		 System.out.println(set1);
		 
		Iterator<String> it = set1.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Ű : " + key + ", �� : " + map.get(key));
		}
		// 3. entrySet() : ��� entry��ü(key�� value�� ��) �� Set�� ��� ��ȯ
		
		Set<Entry<String, Snack>> set2 = map.entrySet();
		Iterator<Entry<String, Snack>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<String, Snack> entry = it2.next();
			System.out.println("Ű : " + entry.getKey() + ", �� : " + entry.getValue());
		}
		System.out.println(set2);
	
		Map<String, Snack> map2 = new TreeMap<String, Snack>();
		// TreeMap ���ı��� Key�ε�. Key�� ������ String�� compable �� �����Ǿ� �ֱ⿡
		// ���ı����� ������ �ʾƵ� ������ �ȴ�. 
		
		map2.putAll(map);
		System.out.println(map2);
	}
	
//	Ű�� ���� String Ÿ������ ������ Map�÷���
//	�ַ� Properties �� ������Ƽ ������ �о� ���� �� �ַ� ���
	public void doProperties() {
		Properties prop = new Properties();
	//	prop.put(Object key, Object value) -> ������
    //  Hashtable ���� ��ӹ޾Ƽ� 
		
	
		prop.setProperty("ä��", "����");
		prop.setProperty("����", "���");
		prop.setProperty("����", "ÿ��");
		
		prop.setProperty("ä��", "�Ǹ�");
		System.out.println(prop);
		
		System.out.println(prop.getProperty("ä��"));
		System.out.println(prop.getProperty("�߰�"));
		
		System.out.println(prop.getProperty("ä��", "����"));
		System.out.println(prop.getProperty("�߰�", "����")); // ������ �ڿ� �ִ°����� ��ȯ
		
		
	}
	public void doProperties2() {
		
	}
	public void fileOpen() {
	//	try(FileInputStream fis = new FileInputStream("test.properties");) {
		try(FileInputStream fis = new FileInputStream("test.xml");) {	
			Properties prop = new Properties();

		
			// load (InputStream is) : is �� �ִ� Properties �о��
			// ����Ʈ ��Ʈ������ ����� ������ ������ �о�ͼ� Properties ��ü�� ����
			
			// load (Reader reader) :
			// 			���ڽ�Ʈ������ ����� ������ ������ �о�ͼ� Properties ��ü�� ����
			// prop.load(fis);
			
			// loadFromXML (InputStream is)
			// : ����Ʈ ��Ʈ������ ����� xml ������ ������ �о�ͼ� Properties ��ü�� ����
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
			// os(�Ǵ� writer) �� prop ����( ����Ʈ �Ǵ� ���ڿ� �������� ),
			// coments �� �ּ����� ����
			
			// storeToXML(OutputStream os, String coments)
			// ����� ������ ����Ʈ ��Ʈ������ xml ��� ����
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
