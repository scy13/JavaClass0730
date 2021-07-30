/**
	Date : 2021.07.13
	Author : chayeon
	Description : 입력받은 값으로 검색한 결과 출력
	Version : 1.0
 */
package action;

import java.util.Scanner;

import service.MemberSearchService;
import util.ConsoleUtil;
import vo.Member;
import vo.SearchData;

public class MemberSearchAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		ConsoleUtil console = new ConsoleUtil();
		MemberSearchService mss = new MemberSearchService();
		
		SearchData search = console.getSearchData(sc);
		
		Member member = null;
		if(search.getSearchCondition().equals("아이디")) {
			member = mss.searchMemberById(search.getSearchValue());
			console.printSearchMember(member);
		} else  if(search.getSearchCondition().equals("이름")) {
			member = mss.searchMemberByName(search.getSearchValue());
			console.printSearchMember(member);
		}
		
	}
	
}
