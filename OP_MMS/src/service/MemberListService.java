/**
	Date : 2021.07.12
	Author : chayeon
	Description : 배열 객체 선언
	Version : 1.0
 */
package service;

import controller.MemberUI;
import vo.Member;

public class MemberListService {
	public Member[] getMembertArray() {	// 배열은 타입☆★
										// Member : 필드 선언한 클래스
										// Member는 클래슨데 타입,,? 가능
		// int num =1; Member mem1;	int[] nums = {1}; Member arr = {1};
		// 배열값을 리턴하는 메소드 - 객체로써 배열값 리턴하는 새로운 배열 만들기 위해
		return MemberUI.memberArray;
	};
}
