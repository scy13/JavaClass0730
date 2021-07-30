/**
	Date : 2021.07.13
	Author : chayeon
	Description : 수정할 아이디 찾기 + 수정성공여부 메소드
	Version : 1.0
 */
package service;

import controller.MemberUI;
import vo.Member;

public class MemberUpdateService {
	public Member getOldMember(int id) {
		Member oldMember = null;
		
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId() == id) {
				oldMember = MemberUI.memberArray[i];
				break;
			}
		}
		return oldMember;	
	}

	public boolean updateMember(Member updateMember) {
		
		boolean us = false; // 업데이트 성공유무
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId() == updateMember.getId()) {
				MemberUI.memberArray[i] = updateMember;
				us = true;
				break;
			}
		}
		
		return us;
	}
}
