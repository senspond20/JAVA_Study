package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();

	public MusicView() {

	}

	public void mainMenu() {
		int menuNum = 0;
		while (true) {
			System.out.println("****** 메인 메뉴 ******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");

			menuNum = Integer.parseInt(sc.nextLine());
			switch (menuNum) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("종료");
				return;
			}

		}

	}

//1
	private void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();

		if (mc.addList(new Music(title, singer)) == 1) {
			System.out.println("추가 성공");
		}

	}

//2
	private void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();

		if (mc.addAtZero(new Music(title, singer)) == 1) {
			System.out.println("추가 성공");
		}
	}

//3	
	private void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		List<Music> musicList = mc.PrintAll();
		if (musicList.isEmpty()) {
			System.out.println("뮤직 리스트가 없습니다.");
		} else {
			System.out.println(musicList.toString());
			// System.out.println(musicList);
		}
	}

//4
	private void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");

		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();

		Music findMusic = mc.searchMusic(title);
		if (findMusic == null) {
			System.out.println("검색 곡이 없습니다.");
		} else {
			System.out.println(findMusic);
		}

	}

//5
	private void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();

		Music findMusic = mc.removeMusic(title);
		if (findMusic == null) {
			System.out.println("검색 곡이 없습니다.");
		} else {
			System.out.println(findMusic + "을(를) 삭제했습니다.");
		}

	}

//6	
	private void setMusic() {
		System.out.println("****** 특정 곡 정보 수정 ******");
		Music setMusic = null;

		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("수정할 곡 명 :  ");
		String editTitle = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String editSinger = sc.nextLine();

		setMusic = mc.setMusic(title, new Music(editTitle, editSinger));

		if (setMusic != null) {
			System.out.printf("%s - %s가 값이 변경되었습니다.\n", setMusic.getSinger(), setMusic.getTitle());
		} else {
			System.out.println("수정 실패");
		}

		// mc.setMusic(title, music)

	}

//7
	private void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		
		if(mc.ascTitle() == 1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}
		
		// System.out.println();
		// printAll();
	}

//8
	private void descSinger() {
		System.out.println("****** 가수 명 내림차순 정렬 ******");
		if(mc.descSinger() == 1) {
			System.out.println("정렬 성공");
		}else {
			System.out.println("정렬 실패");
		}

		// printAll();
	}

}
