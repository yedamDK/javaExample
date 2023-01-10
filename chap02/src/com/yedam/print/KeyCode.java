package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;

public class KeyCode {
	public static void main(String[] args) throws IOException {
		//하나의 문자만 받아올 때
		int keyCode = 0;
		
		System.out.println("입력>");		
		keyCode = System.in.read();	// 처음에 throws IOException 를 입력하는 것이 아니라 빨간 줄 위에 마우스 올렸을 때 throw 어쩌고 클릭
		System.out.println("keyCode : " + keyCode);	//소문자 a값

		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);	//엔터키의 CR
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);	//엔터키의 LF
		//컨트롤 f11 눌러서 콘솔창에서 입력> 생기면 거기에 a 누르고 엔터 쳐보기 
		
		//Scanner
		Scanner scanner = new Scanner(System.in); //빨간 줄 위에 마우스 올렸을 때 세번째 import 'scanner'  (java.util) 클릭
		
		System.out.println("입력>");
		//scanner.nextLine()
		//=> enter키 이전까지 데이터를 받아 오세요
		//=> enter를 기준으로 데이터를 읽어옴
		String inputData = scanner.nextLine();	//nextLine을 이용해 문자열로 데이터를 받아와서 inputdata에 넣어준다음에 출력
//		scanner.nextInt();	//숫자만 받아오고 엔터키가 남아있어서 nextLine과 같이 있을 때 자동으로 nextLine으로 실행되어 오류발생 
		System.out.println("Scanner 활용 : " + inputData);
		
		//기본 타입, == ( 1==1, 1.2 == 1.3) 문자열은 안 됨
		//문자열 내용 비교. equals
		if(inputData.equals("yedam")) {
			System.out.println("yedam과 일치합니다.");
		}
		//위에 
	}
}
