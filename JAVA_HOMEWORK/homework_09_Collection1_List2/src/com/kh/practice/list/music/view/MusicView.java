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
			System.out.println("****** ���� �޴� ******");
			System.out.println("1. ������ ��ġ�� �� �߰�");
			System.out.println("2. ù ��ġ�� �� �߰�");
			System.out.println("3. ��ü �� ��� ���");
			System.out.println("4. Ư�� �� �˻�");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. Ư�� �� ���� ����");
			System.out.println("7. ��� �������� ����");
			System.out.println("8. ������ �������� ����");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ ���� : ");

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
				System.out.println("����");
				return;
			}

		}

	}

//1
	private void addList() {
		System.out.println("****** ������ ��ġ�� �� �߰� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();

		if (mc.addList(new Music(title, singer)) == 1) {
			System.out.println("�߰� ����");
		}

	}

//2
	private void addAtZero() {
		System.out.println("****** ù ��ġ�� �� �߰� ******");
		System.out.print("�� �� : ");
		String title = sc.nextLine();
		System.out.print("���� �� : ");
		String singer = sc.nextLine();

		if (mc.addAtZero(new Music(title, singer)) == 1) {
			System.out.println("�߰� ����");
		}
	}

//3	
	private void printAll() {
		System.out.println("****** ��ü �� ��� ��� ******");
		List<Music> musicList = mc.PrintAll();
		if (musicList.isEmpty()) {
			System.out.println("���� ����Ʈ�� �����ϴ�.");
		} else {
			System.out.println(musicList.toString());
			// System.out.println(musicList);
		}
	}

//4
	private void searchMusic() {
		System.out.println("****** Ư�� �� �˻� ******");

		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();

		Music findMusic = mc.searchMusic(title);
		if (findMusic == null) {
			System.out.println("�˻� ���� �����ϴ�.");
		} else {
			System.out.println(findMusic);
		}

	}

//5
	private void removeMusic() {
		System.out.println("****** Ư�� �� ���� ******");
		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();

		Music findMusic = mc.removeMusic(title);
		if (findMusic == null) {
			System.out.println("�˻� ���� �����ϴ�.");
		} else {
			System.out.println(findMusic + "��(��) �����߽��ϴ�.");
		}

	}

//6	
	private void setMusic() {
		System.out.println("****** Ư�� �� ���� ���� ******");
		Music setMusic = null;

		System.out.print("�˻��� �� �� : ");
		String title = sc.nextLine();
		System.out.print("������ �� �� :  ");
		String editTitle = sc.nextLine();
		System.out.print("������ ���� �� : ");
		String editSinger = sc.nextLine();

		setMusic = mc.setMusic(title, new Music(editTitle, editSinger));

		if (setMusic != null) {
			System.out.printf("%s - %s�� ���� ����Ǿ����ϴ�.\n", setMusic.getSinger(), setMusic.getTitle());
		} else {
			System.out.println("���� ����");
		}

		// mc.setMusic(title, music)

	}

//7
	private void ascTitle() {
		System.out.println("****** �� �� �������� ���� ******");
		
		if(mc.ascTitle() == 1) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
		
		// System.out.println();
		// printAll();
	}

//8
	private void descSinger() {
		System.out.println("****** ���� �� �������� ���� ******");
		if(mc.descSinger() == 1) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}

		// printAll();
	}

}
