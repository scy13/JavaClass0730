/**
	Date : 2021.07.13
	Author : chayeon
	Description : 배열을 초기화해서 삭제할 아이디꺼 빼고 다시 입력받기
	Version : 1.0
 */
package service;

import controller.MemberUI;
import vo.Member;


public class MemberDeleteService {

	public boolean deleteMember(int id) {
		
		boolean ds = true; // 삭제 성공유무
		int index = -1;
		for(int i=0; i<MemberUI.memberArray.length; i++) {
			if(MemberUI.memberArray[i].getId() == id) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			Member[] tempArr = MemberUI.memberArray;
			MemberUI.memberArray = new Member[MemberUI.memberArray.length-1];
			// 새로운 memberArray를 다시 만듦 - 내용 초기화, 		크기 △
				
			for(int i=0; i<tempArr.length; i++) {
				if(i<index) {					// index = 위의 for문 i값
					MemberUI.memberArray[i] = tempArr[i];
				} else if(i>index) {
					MemberUI.memberArray[i-1] = tempArr[i];
				}
			} // memberArray를 재정의하면서 비우고 index번째만 빼고 다시 채워넣음
		}
	return ds = true;
}}
