/**
	Date : 2021.07.13
	Author : chayeon
	Description : 값 입력받기 메소드등등. . .
	Version : 2.0
 */
package util;

import java.util.Scanner;

import controller.MemberUI;
import service.MemberDeleteService;
import vo.Member;
import vo.SearchData;

public class ConsoleUtil {
	// 회원정보를 등록하는 메소드
	public Member getNewMember(Scanner sc) {
		Member newMember = new Member();
		System.out.println("==== 새 회원 정보 등록 ====");

		System.out.print("회원아이디>> ");
		int id = sc.nextInt();

		System.out.print("회원이름>> ");
		String name = sc.next(); // 아직까진 Member와 상관없는 변수

		System.out.print("회원연락처>> ");
		String phone = sc.next();

		System.out.print("회원나이>> ");
		int age = sc.nextInt();

		System.out.print("회원주소>> ");
		String addr = sc.next();

		System.out.print("회원이메일>> ");
		String email = sc.next();

		System.out.print("회원취미>> ");
		String hobby = sc.next();

		newMember.setId(id);
		newMember.setName(name);
		newMember.setPhone(phone);
		newMember.setAge(age);
		newMember.setAddr(addr);
		newMember.setEmail(email);
		newMember.setHobby(hobby);

		System.out.println(newMember.toString());

		return newMember;
	}

	// 회원등록이 성공했을 시 메시지
	public void printRegistSuccessMessage(int id) {
		System.out.println(id + "번 회원 등록 성공!");
	}

	// 회원등록이 실패했을 시 메시지
	public void printRegistFailMessage(int id) {
		System.out.println(id + "번 회원 등록 실패!");
	}

	// 회원목록을 출력하는 메소드
	public void printMemberList(Member[] memberArr) {
		// 회원정보 존재유무 파악
		if (memberArr.length == 0) {
			System.out.println("추가된 회원정보가 없습니다.");
		} else {
			for (int i = 0; i < memberArr.length; i++) {
				System.out.println(memberArr[i]);
			}
		}
	}

	// 회원수정할 id, 삭제할 id를 찾는 메소드
	public int findId(String msgkind, Scanner sc) {
		System.out.print(msgkind + "아이디>> ");
		return sc.nextInt();
	}

	// 회원정보 수정 메소드
	public Member getUpdateMember(Member oldMember, Scanner sc) {
		Member member = new Member();
		System.out.println("==== 회원 정보 갱신 ====");

		System.out.println("회원아이디: " + oldMember.getId());

		System.out.println("수정전 이름: " + oldMember.getName());
		System.out.print("회원이름>> ");
		String name = sc.next();

		System.out.println("수정전 이름: " + oldMember.getPhone());
		System.out.print("회원연락처>> ");
		String phone = sc.next();

		System.out.println("수정전 이름: " + oldMember.getAge());
		System.out.print("회원나이>> ");
		int age = sc.nextInt();

		System.out.println("수정전 이름: " + oldMember.getAddr());
		System.out.print("회원주소>> ");
		String addr = sc.next();

		System.out.println("수정전 이름: " + oldMember.getEmail());
		System.out.print("회원이메일>> ");
		String email = sc.next();

		System.out.println("수정전 이름: " + oldMember.getHobby());
		System.out.print("회원취미>> ");
		String hobby = sc.next();

		member.setId(oldMember.getId());
		member.setName(name);
		member.setPhone(phone);
		member.setAge(age);
		member.setAddr(addr);
		member.setEmail(email);
		member.setHobby(hobby);

		System.out.println(member.toString());

		return member;
	}

	// 회원수정이 성공했을 시 메시지
	public void printUpdateSuccessMessage(int id) {
		System.out.println(id + "번 회원 수정 성공!");
	}

	// 회원수정이 실패했을 시 메시지
	public void printUpdateFailMessage(int id) {
		System.out.println(id + "번 회원 수정 실패!");
	}

	// 회원삭제 성공했을 시 메시지
	public void printDeleteSuccessMessage(int id) {
		System.out.println(id + "번 회원 삭제 성공!");
	}

	// 회원삭제 실패했을 시 메시지
	public void printDeleteFailMessage(int id) {
			System.out.println(id +"번 회원 삭제 실패!");
	}
	// 회원검색 메소드
	public SearchData getSearchData(Scanner sc) {
		System.out.println("검색 조건을 선택하세요.");
		System.out.println("아이디    or  이름");
		System.out.print("검색 조건>> ");
		String searchCondition = sc.next();
		String searchValue = null;
		
		if(searchCondition.equals("아이디")) {
			System.out.print("검색할 아이디>> ");
			searchValue = sc.next();
		} else if(searchCondition.equals("이름")) {
			System.out.print("검색할 이름>> ");
			searchValue = sc.next();
		}
		SearchData search = new SearchData();
		
		search.setSearchCondition(searchCondition);
		search.setSearchValue(searchValue);
		
		return search;
	}
	// 검색된 결과를 출력하는 메소드
	public void printSearchMember(Member member) {
		if(member == null) {
			System.out.println("검색한 결과가 없습니다.");
		} else{
			System.out.println(member.getId() + "로 검색한 결과");
			System.out.println(member);
		}
		
	}
}
