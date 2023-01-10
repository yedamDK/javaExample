package com.yedam.variable;

public class Variable03 {
	//main 치고 컨트롤 스페이스 누르고 엔터(공책모양임)
	public static void main(String[] args) {
		int var1 = 0b1011; //2진수
		int var2 = 0206;   //8진수
		int var3 = 365;    //10진수
		int var4 = 0xB3;   //16진수
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
	
		/*byte bVar1 = 125;
		byte bVar2 = 200;
		byte는 -128에서 127까지만 담을 수 있는 데이터 타입. 그래서 bVar2를 200으로 담을 수 없음.
		System.out.println("bVar1 : " + bVar1);
		System.out.println("bVar2 : " + bVar2);*/
		
		byte bVar1 = 125;
		int bVar2 = 200;
		System.out.println("bVar1 : " + bVar1);
		System.out.println("bVar2 : " + bVar2);
		
		//Long은 데이터 범위를 넘어갔을 때 씀.
		long lVar1 = 200000;
		long lVar2 = 20000000000L;
		
		//Char
		char c1 =  'A';
		char c2 = 65;
		char c3 = '\u0041'; //16진수
				
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
	}
}
