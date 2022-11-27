package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {
		super();
	}
	
	public void mainMenu() {
		while(true) {
			System.out.printf("최대 등록 가능한 회원 수는 %d명입니다.\n", mc.SIZE);
			System.out.printf("현재 등록된 회원 수는 %d명 입니다.\n", mc.existMemberNum());
			
			if(mc.existMemberNum()<10) {
				System.out.println("1. 새 회원 등록");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAll(); break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		System.out.print("아이디 : ");
		sc.nextLine();
		String id = sc.nextLine();
		if(mc.existMemberNum()>0) {
			if(mc.checkId(id)==false) {
				System.out.println("중복된 아이디 입니다. 다시 입력해주세요.");
				System.out.print("아이디 : ");
				id = sc.nextLine();
			}
		}	
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("성별(F/M) : ");
		char gender = sc.nextLine().charAt(0);
		if(gender!='M'||gender!='m'||gender!='f'||gender!='F') {
			System.out.println("성별을 다시 입력하세요.");
			System.out.print("성별(F/M) : ");
			gender = sc.nextLine().charAt(0);
		}
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		mc.insertMember(id, name, password, password, gender, age);
	}
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 : searchId(); break;
		case 2 : searchName(); break;
		case 3 : searchEmail(); break;
		case 9 :
			System.out.println("메인으로 돌아갑니다."); return;
		default : 
			System.out.println("잘못 입력하셨습니다."); return;
		}
	}
	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String searchId = sc.nextLine();
		mc.searchId(searchId);
		if(searchId == "") {
			System.out.println("검색 결과가 없습니다.");
			return;
		}else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchId(searchId));
		}
	}
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String searchName = sc.nextLine();
		mc.searchName(searchName);
		if(searchName == "") {
			System.out.println("검색 결과가 없습니다.");
			return;
		}else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchName(searchName));
		}
	}
	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String searchEmail = sc.nextLine();
		mc.searchEmail(searchEmail);
		if(searchEmail == "") {
			System.out.println("검색 결과가 없습니다.");
			return;
		}else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.searchEmail(searchEmail));
		}
	}
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 : updatePassword(); break;
		case 2 : updateName(); break;
		case 3 : updateEmail(); break;
		case 9 : 
			System.out.println("메인으로 돌아갑니다."); return;
		default : 
			System.out.println("잘못 입력하셨습니다."); return;
		}
	}
	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 회원의 비밀번호 : ");
		String password = sc.nextLine();
		boolean result = mc.updatePassword(id, password);
		if(result==true) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
	}
	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 회원의 이름 : ");
		String name = sc.nextLine();
		boolean result = mc.updateName(id, name);
		if(result==true) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
	}
	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		System.out.print("수정할 회원의 이메일 : ");
		String email = sc.nextLine();
		boolean result = mc.updateEmail(id, email);
		if(result==true) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
	}
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : deleteOne(); break;
		case 2 : deleteAll(); break;
		case 9 : 
			System.out.println("메인으로 돌아갑니다.");
			return;
		default : 
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
	}
	public void deleteOne() {
		System.out.println("삭제할 회원 아이디 : ");
		String id = sc.nextLine();
		System.out.println("정말 삭제하시겠습니까?(Y/N) : ");
		char ch = sc.nextLine().charAt(0);
		if(ch == 'y' || ch == 'Y') {
			boolean result = mc.delete(id);
			if(result == true) {
				System.out.println("성공적으로 삭제하였습니다.");
				return;
			}else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
	}
	public void deleteAll() {
		System.out.println("정말 삭제하시겠습니까?(Y/N) : ");
		char ch = sc.nextLine().charAt(0);
		if(ch == 'y'|| ch == 'Y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
			return;
		}
	}
	public void printAll() {
		if(mc.existMemberNum()==0) {
			System.out.println("저장된 회원이 없습니다.");
		}else {
			System.out.println(mc.printAll());
		}
	}
	
}
