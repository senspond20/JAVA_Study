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
		musicList.add(new Music("작은 것들을 위한 시","방탄소년단"));
		musicList.add(new Music("Gee","소녀시대"));
		musicList.add(new Music("나는 나비","윤도현"));
		musicList.add(new Music("고등어","노라조"));
		musicList.add(new Music("Gee","휘성"));
		musicList.add(new Music("소우주","방탄소년단"));
		musicList.add(new Music("주저하는 연인들을 위해","잔나비"));
	}
	
	// 마지막 위치에 곡 추가
	public int addList(Music music) {
		musicList.add(musicList.size(), music);
		return 1;
	}
	
	// 첫 위치에 곡 추가
	public int addAtZero(Music music) {
		musicList.add(0, music);
		return 1;
	}
	// 전체 출력
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
