/**
	Date : 2021.07.12
	Author : chayeon
	Description : 예외처리문
	Version : 1.0
 */
package controller;

import java.util.Scanner;
import action.Action;

public class MemberController {
	public void processRequest(Scanner sc, Action action) {
		
		/*	
		 	예외처리 try-catch문 
			
			try {
				- 오류가 발생하지 않은 경우 실행
			} catch(예외처리종류 e) {
				- 오류가 발생한 경우 실행
			} finally {
				- 오류가 발생해도, 발생하지 안항도 무조건 실행
			}
		 */
		
		try {
			action.execute(sc);		// action에 담긴 값에 따른 execute()로 넘어감
		}catch(Exception e) {
			e.printStackTrace();	// 오류발생 경로 및 메시지 출력 메소드
		}
	}
}
