package com.javaex.basic.loop;

public class BreakEx {

	//	6과 14로 모두 나누어 떨어지는 숫자 찾기
	//	반복 횟수를 정확하게 알기 힘든 경우 -> while
	//	반복 횟수를 정확하게 알 수 있는 경우 -> for 
	
	
	public static void main(String[] args) {
		
		int a= 0;
		int b = 0;
		
		while (b!=1) {
			a++;
			if ((a%6==0) && (a%14==0)) {
				System.out.println(a);
				b=1;
				}	
			}
		
		
		// 	break;는 while문 전체를 탈출하는 역할
		
		int l = 0;
		while (true) {
			l++;
			if ((l%6==0) && (l%14==0)) {
				System.out.println(l);
				break;
				}	
			}
		
		int p = 0;
		do {
			p++;
		do {
			p++;
			} while (p%6!=0);
		} while(p%14!=0);
		System.out.println(p);
		
		
		for(int c = 1; ; c++) {
				if ((c%6==0) && (c%14==0)) {
					System.out.println(c);
					break;
					}	
				}
		
		int g = 1;
		int d = 1; 
		for(; g==1; ) {
			d++;
				for (; d%6==0 && d%14==0; ) {
					g =0;
					System.out.println(d);
					break;
					}
				}
			
		
	}

}
