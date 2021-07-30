/**
	Date : 2021.07.12
	Author : chayeon
	Description : 메인클래스
	Version : 1.0
 */
package controller;

import java.util.Scanner;
import action.Action;
import action.MemberDeleteAction;
import action.MemberListAction;
import action.MemberRegistAction;
import action.MemberSearchAction;
import action.MemberUpdateAction;
import vo.Member;

public class MemberUI {
	// 1. 필드(DB)
	public static Member[] memberArray = new Member[0];	// 크기 0인 배열
	
	// 2. 메소드
	public static void main(String[] args) {
		MemberController controller = new MemberController();
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		Action action = null; // Action은 인터페이스 인
		int menu = 0;
		
		do {
			System.out.println("==================================");
			System.out.println("1. 회원 등록       2. 회원 목록      3. 회원 수정");
			System.out.println("4. 회원 삭제       5. 회원 검색      6. 시스템종료");
			System.out.println("==================================");
			
			System.out.print("선택>> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:			// 회원등록
				action = new MemberRegistAction();
				break;
			case 2:			// 회원목록
				action = new MemberListAction();
				break;
			case 3:			// 회원수정
				action = new MemberUpdateAction();
				break;
			case 4:			// 회원삭제
				action = new MemberDeleteAction();
				break;
			case 5:			// 회원검색
				action = new MemberSearchAction();
				break;
			case 6:			// 시스템종료
				action = null;
				System.out.println("시스템을 종료합니다!");
				run = false; 
				break;
			default :
				action = null;
				System.out.println("1~6을 입력해주세요!");
				break;
			}
			if(action != null) {
				controller.processRequest(sc, action);
			}
			
		}while(run);
	}

}
