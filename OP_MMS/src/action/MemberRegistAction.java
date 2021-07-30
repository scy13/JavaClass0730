/**
	Date : 2021.07.12
	Author : chayeon
	Description : boolean 값에 등록여부 출력하기
	Version : 1.0
 */
package action;

import java.util.Scanner;

import service.MemberRegistService;
import vo.Member;
import util.ConsoleUtil;

public class MemberRegistAction implements Action{

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		Member newMember = console.getNewMember(sc);
		
		MemberRegistService mrs = new MemberRegistService();
		boolean registSuccess = mrs.registMember(newMember);
		
		if(registSuccess) {
			// 회원등록 성공메시지(메소드호출)
			console.printRegistSuccessMessage(newMember.getId());
		} else {
			// 회원등록 실패메시지(메소드호출)
			console.printRegistFailMessage(newMember.getId());
		}
		
	}

}
