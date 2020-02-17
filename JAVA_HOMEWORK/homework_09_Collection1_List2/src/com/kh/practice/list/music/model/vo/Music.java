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
		// ������ �������� ����
			return -singer.compareTo(o.singer);
	}
	
	// �׽�Ʈ
	public int compareTo(Music o, int select) {
		// TODO Auto-generated method stub
		// ������ �������� ����
		if (select == 1) {
			return -singer.compareTo(o.singer);
		}
		// ������ �������� ����
		else {
			return singer.compareTo(o.singer);
		}
	}
}
