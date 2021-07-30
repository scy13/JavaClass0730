/**
	Date : 2021.07.12
	Author : chayeon
	Description : 선언했던 객체 이용해 회원정보 출력
	Version : 1.0
 */
package action;

import java.util.Scanner;

import service.MemberListService;
import util.ConsoleUtil;
import vo.Member;

public class MemberListAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		// static 선언 안해서 객체 선언한 다음에 쓸 수 있어요
		MemberListService mls = new MemberListService();
		Member[] memberArr = mls.getMembertArray();
		
		ConsoleUtil console = new ConsoleUtil();
		console.printMemberList(memberArr);
		
	}

}
