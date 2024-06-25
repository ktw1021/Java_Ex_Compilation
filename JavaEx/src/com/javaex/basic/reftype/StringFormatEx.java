package com.javaex.basic.reftype;

public class StringFormatEx {

	public static void main(String[] args) {
		String str1;
		str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		
		if (str1.equals(str2)) {
			System.out.println(true);
		}
		if (str2.equals(str3)) {
			System.out.println(true);
		}
		//	참조변수의 경우 ==은 메모리 주소의 비교
		System.out.println(str2==str3);
		System.out.printf("Hello %s of %s%n", "World", "Java");
		String i = String.format("The meaning of the %s is %d", "universe",42);
		System.out.printf(i);
		
		System.out.println("");
		//	%s(문자열), %d(십진수), %n(개행)
		
		//	__개의 __중에서 __개를 먹었다. 
		
		String fruit = "사과";
		int total = 10, eat = 3;
		
		System.out.printf("%d개의 %s 중에서 %d개를 먹었다%n",
							total,fruit,eat);
		
		//	%d의 천단위 구분 기호: %,d
		int amount = 1_234567890;
		System.out.printf("%,d%n",amount);
		
		double pi = Math.PI;
		System.out.printf("PI: %.2f%n", pi);	// 소수점 둘째 자리까지
		
		//	포맷 형식은 String 형의 .format 메서드에서 구현된다.
		String fmt = "%d개의 %s 중에서 %d개를 먹었다%n";
		System.out.printf(fmt,100,"바나나",99);
	}

}
