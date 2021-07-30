/**
	Date : 2021.07.13
	Author : chayeon
	Description : 수정할 아이디 입력받아 찾아내 수정
	Version : 1.0
 */
package action;

import java.util.Scanner;

import service.MemberUpdateService;
import util.ConsoleUtil;
import vo.Member;

public class MemberUpdateAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		int id = console.findId("수정할", sc);
		
		MemberUpdateService mus = new MemberUpdateService();
		Member oldMember = mus.getOldMember(id);
		
		// 수정메소드
		Member updateMember = console.getUpdateMember(oldMember,sc);
		
		boolean us = mus.updateMember(updateMember); // bool 타입 메소드
		
		if(us) {
			console.printUpdateSuccessMessage(updateMember.getId());
		} else {
			console.printUpdateFailMessage(updateMember.getId());
		}

	}

}
