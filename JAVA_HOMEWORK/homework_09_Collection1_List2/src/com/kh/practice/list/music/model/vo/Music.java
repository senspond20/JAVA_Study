package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Music> {
	private String title;
	private String singer;

	public Music() {

	}

	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return singer + " - " + title;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int compareTo(Music o) {
		// TODO Auto-generated method stub
		// 가수명 내림차순 정렬
			return -singer.compareTo(o.singer);
	}
	
	// 테스트
	public int compareTo(Music o, int select) {
		// TODO Auto-generated method stub
		// 가수명 내림차순 정렬
		if (select == 1) {
			return -singer.compareTo(o.singer);
		}
		// 가수명 오름차순 정렬
		else {
			return singer.compareTo(o.singer);
		}
	}
}
