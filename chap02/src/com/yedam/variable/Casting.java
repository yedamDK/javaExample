package com.yedam.variable;

public class Casting {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L; //21억??를 안 넘어서 L을 안 써도 됨
		long result = value1 + value2 + value3; //long으로 연산 됨
		System.out.println(result);
		
		//실수와 정수 타입변환(연산)
		int intValue1 = 10;
		int intValue4 = intValue1/4; //2.5과 나와야 하지만 정수로 나와야 하기 때문에 2만 나옴
		System.out.println(intValue4);
		
		int intValue2 = 10;
		double intValue3 = intValue2 / 4.0;
		System.out.println(intValue3);
		
		int x = 1;
		int y = 2;
		double result2 = x/y;
		System.out.println(result2);
		
		double result3 = x/(double)y;
		System.out.println(result3);
		
		//+ 연산
		//숫자 연산
		int value = 10+2+8;
		System.out.println(value);
		
		
		//문자열 결합 연산
		String str1 = 10+2+"8";	//12+"8" 서로 더하지 않고 12도 문자열로 바뀌게 되어 서로 붙어서 128로 됨
		System.out.println("str1 : " + str1);
		
		String str2 = 10 + "2" + 8;	//10+"2"가 "102"가 됨 "102"+8 은 "1028"됨
		System.out.println("str2 : " + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3);
		
		String str4 = "10" + (2+8); //소괄호 우선순위
		System.out.println("str4 : " + str4);
		
		//String <-> 정수, 실수 타입 변환
		int valueStr = Integer.parseInt(str4);	//Integer이 int의 풀네임 parse 변환한다는 의미
		System.out.println(valueStr);
//		byte byteValue = Byte.parseByte(str4);	
		short shortValue = Short.parseShort(str4);
		long longValue = Long.parseLong(str4);
		double dValue = Double.parseDouble(str4);
//		boolean bValue = Boolean.parseBoolean(str4);
		System.out.println(dValue);
		
		//int -> String
		String str5 = String.valueOf(valueStr);
		//long -> String
		String str6= String.valueOf(longValue);
		//double -> string
		String str7 = String.valueOf(dValue);
		
		

	}
}
