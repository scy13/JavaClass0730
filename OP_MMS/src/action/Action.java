/**
	Date : 2021.07.12
	Author : chayeon
	Description : 예외처리
	Version : 1.0
 */
package action;

import java.util.Scanner;

public interface Action {
	// 각 요청을 처리하는 Action 클래스 객체들의 형태를 정의한 인터페이스
	// 모든 Action 클래스 객체는 execute()메소드를 재정의해야 한다.
	void execute(Scanner sc) throws Exception;	// 사전 방지 가능한 오류 예외처리
}
