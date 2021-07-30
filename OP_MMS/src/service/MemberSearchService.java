/**
	Date : 2021.07.13
	Author : chayeon
	Description : 입력받은 값으로 검색하기 - 리턴값 member에 저장
	Version : 1.0
 */
package service;

import controller.MemberUI;
import vo.Member;

public class MemberSearchService {
	
	public Member searchMemberById(String searchValue) {
		Member member = null;
		int id = Integer.parseInt(searchValue);
		// Integer.parseInt("100"); => (int) 100 [String -> int]
		
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId() == id) {
				member = MemberUI.memberArray[i];
				break;
			}
		}
	return member;
	}
	
	public Member searchMemberByName(String searchValue) {
		Member member = null;
			
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getName().equals(searchValue) ) {
				member = MemberUI.memberArray[i];
				break;
			}
		}
	return member;
	}
}
