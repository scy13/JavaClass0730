/**
	Date : 2021.07.13
	Author : chayeon
	Description : 삭제할 아이디 입력받고 삭제여부출력하기
	Version : 1.0
 */
package action;

import java.util.Scanner;

import service.MemberDeleteService;
import util.ConsoleUtil;
import vo.Member;

public class MemberDeleteAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		int id = console.findId("삭제할", sc);
		
		MemberDeleteService mds = new MemberDeleteService();
		
		boolean ds = mds.deleteMember(id); // bool 타입 메소드
		
		if(ds) {
			console.printDeleteSuccessMessage(id);
		} else {
			console.printDeleteFailMessage(id);
		}
	}

}
