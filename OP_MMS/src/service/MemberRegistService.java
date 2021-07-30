/**
	Date : 2021.07.12
	Author : chayeon
	Description : 회원 등록 가능한지 확인하고 등록 (boolean)
	Version : 1.0
 */
package service;

import controller.MemberUI;
import vo.Member;

public class MemberRegistService {
	public boolean registMember(Member newMember) throws Exception{
		boolean registSuccess = true;
		
		// 아이디 중복체크
		for(int i=0; i<MemberUI.memberArray.length; i++) {
		// "static" memberArray -> 객체없이 호출가능; 객체호출보다 메모리 절약 가능
			
			if(MemberUI.memberArray[i].getId() == newMember.getId()) {
				registSuccess = false;
				break;	
			}
		}
		// 아이디가 중복이 아닐 경우 : registSuccess = true 일 경우 if문 실행
		if(registSuccess) {
			Member[] tempArray = MemberUI.memberArray;
			MemberUI.memberArray = new Member[MemberUI.memberArray.length+1];
			// MemberArray 재정의하면서 내용은 사라지나봄...?
			
			for(int i=0; i<tempArray.length; i++) {
				MemberUI.memberArray[i] = tempArray[i];
			}
			MemberUI.memberArray[MemberUI.memberArray.length-1] = newMember;
		}
		return registSuccess;
	}
}
