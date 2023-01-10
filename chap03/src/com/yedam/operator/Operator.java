package com.yedam.operator;

public class Operator {
	public static void main(String[] args) {
		//++num, num++ 차이 알아보기
		int num = 0;
		System.out.println(num++);	//결과는 0이지만 실행문 실행 후 1로 증가 됨
		System.out.println(++num);	//위에서 1로 증가되었기 때문에 실행문 실행 전에 2가 됨
		
		System.out.println(num--);	//2라고 실행 후 -1 계산하여 1이 됨
		System.out.println(--num);	//위의 결과 값 1에서 -1 계산 후 실행
		
		//논리 부정 연산자
		boolean play =true;
		System.out.println(play);
		
		play = !play;	//!는 not(반대)이라고 생각
		System.out.println(play);
	
		//비교 연산자	: true, false 값만 나옴
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);	// true
		boolean result2 = (num1 != num2);	// false
		boolean result3 = (num1 <= num2);	// true
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1 = 'A';	// 65
		char char2 = 'B';	// 66
		boolean result4 = (char1 < char2); //true
		System.out.println(result4);
		
		//논리 연산자 && || ! ^
		char charCode = 'A';	// 65
		//아스키코드에서 A(65)보다 크고 Z(90)보다 작다.
		if(charCode>=65 && charCode<=90) {
			System.out.println("대문자입니다");
		}
		if(charCode>= 97 && charCode <= 122) {
			System.out.println("소문자입니다");
			//안 나오는게 저상
		}
		// '0' = 48, '9' = 57
		// < 50 + not(!) -> >= 50
		// 50초과의 부정 -> >50
		// <=50 + not(!) -> >50
		if(!(charCode<48) && !(charCode >57)) {
			//charCode >= 48 && charCode <= 57
			System.out.println("숫자입니다");
			//안 나오는게 정상
		}
		
		//복합 대입 연산자
		int result = 0;
		
		result += 10;	//result =result + 10;
		System.out.println("result += " + result);	//result ==10
		result -= 5;	//result = result -5;
		System.out.println("result -=" + result); //result == 5
		result *= 5;
		result /= 5;
		
		//삼항연산자
		int score = 80;
		char grade = score >= 80 ? 'B' : 'c';
		System.out.println(grade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
