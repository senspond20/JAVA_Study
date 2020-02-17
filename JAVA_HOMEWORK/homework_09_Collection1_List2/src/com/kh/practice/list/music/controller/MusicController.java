package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	List<Music> musicList = new ArrayList<Music>();
	
	public MusicController() {
		
		/* Test Sample */
		musicList.add(new Music("���� �͵��� ���� ��","��ź�ҳ��"));
		musicList.add(new Music("Gee","�ҳ�ô�"));
		musicList.add(new Music("���� ����","������"));
		musicList.add(new Music("����","�����"));
		musicList.add(new Music("Gee","�ּ�"));
		musicList.add(new Music("�ҿ���","��ź�ҳ��"));
		musicList.add(new Music("�����ϴ� ���ε��� ����","�ܳ���"));
	}
	
	// ������ ��ġ�� �� �߰�
	public int addList(Music music) {
		musicList.add(musicList.size(), music);
		return 1;
	}
	
	// ù ��ġ�� �� �߰�
	public int addAtZero(Music music) {
		musicList.add(0, music);
		return 1;
	}
	// ��ü ���
	public List<Music> PrintAll() {
		return musicList;
	}
	
	public Music searchMusic(String title) {
		Music findMusic = null;
		
		for(Music m : musicList) {
			if(m.getTitle().equals(title)) {
				findMusic = m;
				break;
			}
		}
		
		return findMusic;
	}
	
	public Music removeMusic(String title) {
		Music removeMusic = null;
		
		for(Music m : musicList) {
			if(m.getTitle().equals(title)) {
				removeMusic = m;
				musicList.remove(m);
				break;
			}
		}
		
		return removeMusic;
	}
	
	public Music setMusic(String title, Music music) {
		Music setMusic = null;
		
		int index = 0;
		for(Music m : musicList) {
			if(m.getTitle().equals(title)) {
				setMusic = m;
				musicList.set(index, music);
				break;
			}
			index++;
		}
		
		return setMusic;
	}
	public int ascTitle() {
		musicList.sort(new AscTitle());
		return 1;
	}
	
	public int descSinger() {
		Collections.sort(musicList);
		return 1;
	}
}
