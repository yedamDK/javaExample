package com.yedam.variable;

public class Variable01 {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간"+ minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
		
		//value가 선언만 되고 초기화 되지 않아서 오류 뜸
		/*int value;
		int result = value + 10;
		System.out.println(result);*/
		
		int x = 3;
		int y = 5;
		//x->y의 값으로 변경
		//y->x의 값으로 변경
		//y=x하면 x=x, y=x; 둘다 3이 됨
		//대신 담아줄 수 있는 변수
		int z=0;
		// x의 데이터를 미리 z에 담아 두고,
		// 1) x -> z (z=3)
		// 2) y -> x (x=5)
		// 3) z -> y (y=3)
		
		z = x; // 1) x -> z (z=3)
		x = y; // 2) y -> x (x=5)
		y = z; // 3) z -> y (y=3)
	}
	
}
