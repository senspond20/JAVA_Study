package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.model.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {

	MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);

	public MemberMenu() {

	}

	public void mainMenu() {

		while (true) {

			int exNum = mc.existMemberNum();
			System.out.println("===================================");
			System.out.println("최대 등록 가능한 회원 수는 10명입니다.");
			System.out.println("현재 등록된 회원 수는 " + exNum + "명 입니다.");
			System.out.println("===================================");
			
			if (exNum != 10) {
				System.out.println("1. 새 회원 등록 ");
			} else {
				System.out.println("<- 회원수가 꽉 찼기 때문에 일부 메뉴만 오픈됩니다. ->");
			}

			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");

			System.out.print("메뉴 번호 : ");
//			int menuNum = sc.nextInt();
//			sc.nextLine();
			int menuNum = Integer.parseInt(sc.nextLine());

			if (menuNum == 1 && exNum != 10) {
				insertMember();
				continue;
			} else {
				switch (menuNum) {
				case 2:
					searchMember();
					break;
				case 3:
					updateMember();
					break;
				case 4:
					deleteMember();
					break;
				case 5:
					printAll();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
			}

		}

	}

	public void insertSample() {
		mc.insertMember("aaaaa", "박신우", "aa", "aaa@aaa.aaa", 'F', 33);
		mc.insertMember("bbbbb", "박신우", "bb", "bbb@bbb.bbb", 'M', 34);
		mc.insertMember("ccccc", "남나눔", "cc", "ccc@ccc.ccc", 'M', 28);
		mc.insertMember("ddddd", "도대담", "dd", "ddd@ddd.ddd", 'M', 35);
		mc.insertMember("eeeee", "류라라", "ee", "eee@eee.eee", 'F', 17);
		mc.insertMember("fffff", "문미미", "ff", "aaa@aaa.aaa", 'F', 20);
		mc.insertMember("ggggg", "박보배", "gg", "ggg@ggg.ggg", 'M', 26);
		mc.insertMember("hhhhh", "송성실", "hh", "hhh@hhh.hhh", 'M', 41);
		mc.insertMember("iiiii", "윤예의", "ii", "iii@iii.iii", 'F', 28);
		mc.insertMember("jjjjj", "정재주", "jj", "jjj@jjj.jjj", 'M', 23);
	}

	public void insertMember() {

		System.out.println("새 회원을 등록합니다.");
		String id = null;

		while (true) {
			System.out.print("아이디:");
			id = sc.nextLine();

			if (mc.checkld(id)) {
				System.out.println("중복된 아이디입니다. 다시 입력하세요.");
				continue;
			} else {
				break;
			}
		}

		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("비밀번호:");
		String password = sc.nextLine();
		System.out.print("이메일:");
		String email = sc.nextLine();
		System.out.print("성별(M/F):");
		char gender = sc.nextLine().charAt(0);
		System.out.print("나이:");
		int age = Integer.parseInt(sc.nextLine());
//
		mc.insertMember(id, name, password, email, gender, age);


	}

	// 회원 검색
	public void searchMember() {
		int smNum = 0;

		while (true) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호  : ");

			smNum = Integer.parseInt(sc.nextLine());
//			smNum = sc.nextInt();
//			sc.nextLine();

			switch (smNum) {
			case 1:
				searchId();
				break;
			case 2:
				searchName();
				break;
			case 3:
				searchEmail();
				break;
			case 9:
				mainMenu();
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}

		}
	}

	public void searchId() {

		System.out.print("아이디 : ");
		String id = sc.nextLine();
		String serchIdStirng = mc.serchId(id);

		if (serchIdStirng != null) {
			System.out.println(serchIdStirng);
		} else {
			System.out.println("찾으시는 검색 결과가 없습니다.");
		}

	}

	public void searchName() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		Member[] mm = mc.serchName(name);

		if (mm == null) {
			System.out.println("찾으시는 검색 결과가 없습니다.");
		} else {
			for (int i = 0; i < mm.length; i++) {
				System.out.println(mm[i].inform());
			}
		}
	}

	public void searchEmail() {
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		Member[] mm = mc.serchEmail(email);

		if (mm == null) {
			System.out.println("찾으시는 검색 결과가 없습니다.");
		} else {
			for (int i = 0; i < mm.length; i++) {
				System.out.println(mm[i].inform());
			}
		}
	}

	public void deleteMember() {

		int smNum = 0;

		while (true) {
			System.out.println("1. 특정 회원 삭제하기");
			System.out.println("2. 모든 회원 삭제하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호  : ");

			smNum = Integer.parseInt(sc.nextLine());
			switch (smNum) {
			case 1:
				System.out.print("id 입력 : ");
				String id = sc.nextLine();
				deleteOne(id);				
				return;
			case 2:
				deleteAll();
				return;
			case 9:
				mainMenu();
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return;
			}

		}

	}

	// 이거 아직 안됨
	public void deleteOne(String id) {
		boolean ck = mc.delete(id);
		if (ck == true) {
			System.out.println("해당 아이디가 삭제되었습니다.");
		} else {
			System.out.println("그런 아이디는 없습니다.");
		}
	}

	public void deleteAll() {
	
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char yn = sc.nextLine().charAt(0);
		
		if(yn == 'y' || yn == 'Y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}else {
			System.out.println("삭제를 취소하셨습니다.");
		}
	}

	public void updateMember() {

		int upNum = 0;
		while (true) {
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			upNum = sc.nextInt();
			sc.nextLine();

			if (upNum == 1) {
				updatePassword();
			} else if (upNum == 2) {
				updateName();
			} else if (upNum == 3) {
				updateEmail();
			} else if (upNum == 9) {
				System.out.println("메인으로 돌아갑니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
		}
	}

	//
	public void updatePassword() {

		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();

		System.out.print("수정할 비밀번호  : ");
		String password = sc.nextLine();

		// 검사
		if (mc.updatePassword(id, password)) {		
			System.out.println("수정이 성공적으로 되었습니다.");
			mainMenu();
			
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			mainMenu();
		}
	}

	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();

		System.out.print("수정할 이름  : ");
		String name = sc.nextLine();

		// 검사
		if (mc.updateName(id, name)) {		
			System.out.println("수정이 성공적으로 되었습니다.");
			mainMenu();
			
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			mainMenu();
		}
	}

	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();

		System.out.print("수정할 이메일  : ");
		String email = sc.nextLine();

		// 검사
		if (mc.updateEmail(id, email)) {		
			System.out.println("수정이 성공적으로 되었습니다.");
			mainMenu();
			
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			mainMenu();
		}
	}

	//
	public void printAll() {
		Member[] mlist = mc.printAll();

		if (mlist == null) {
			System.out.println("== 회원이 없습니다. ==");
		} else {
			for (int i = 0; i < mc.existMemberNum(); i++) {
				System.out.println(mlist[i].inform());
			}
		}
	}

}
