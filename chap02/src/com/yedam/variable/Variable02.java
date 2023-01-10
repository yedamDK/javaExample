package com.yedam.variable;

public class Variable02 {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1 > 10) {
			int v2;
			v2 = v1 -10;
		}
		// v2가 중괄호 밖으로 나왔기 때문에 안 됨.
//		// int v3 = v1+v2+5;
	}
}
