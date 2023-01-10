package com.yedam.variable;

public class Variable04 {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		//이스케이프 문자(console 출력할 때)
		//문자열(String)에서 사용
		//\t : tab만큼 벌려라
		//\n : enter
		//\r : 맨 앞줄로 이동.
		
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력\n ");
		//"를 출력하기 위해 \" 라고 씀
		System.out.println("우리는\"개발자\"입니다");
		// 백슬러쉬 \를 출력하기 위해 \\라고 씀
		System.out.println("봄\\여름\\가을\\겨울");
		
		//실수
		//float, double
		//float
		float var1= 3.14f; //f 안 넣으면 double로 인식해서 안됨
		double var2 = 3.14;
		
		float var3 = 0.123456789f;
		double var4 = 0.1234567890123456789;
		
		System.out.println("var3 : " + var3);	//7자리까지 정확히 8자리는 반올림 값
		System.out.println("var4 : " + var4);
		
		double var6 = 3e6;
		float var7 = 3e6f;
		
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		
		
		//논리 타입(Boolean)
		
		boolean stop = true;
		if(stop ) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		
		
		
		
	}
}
