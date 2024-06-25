package com.javaex.oop.methods;

public class MethodEx {

	public static void main(String[] args) {
		//	매개변수 X, 리턴 X
		printMessage();
		//	메서드에 들락날락만 함(메서드를 실행할 뿐).
		//	뭔가를 매개하거나, 어떤 값을 반환하지도 않음.
		
		//	매개변수 X, 리턴 O
		String message = getMessage();
		// 메서드에서 message의 내용을 String 형태로 '반환'만 함.  
		System.out.println(message);
		
		//	매개변수 O, 리턴 X
		printDevide(4,0);
		// 4, 0을 '매개'로, 메서드는 어떤 명령을 수행을 할지 지시만 함.
		
		//	매개변수 O, 리턴 O
		int num1 = 4, num2 = 5;
		double sum = getSum(num1, num2);	
		// num1, num2를 '매개'로, 메서드에서 sum 값을 특정하게 '계산하여 반환'
		System.out.println(sum);
		
		int num3 = 10;
		double sum2 = getSum2(num1, num2, num3);
		// 1. num1, num2, num3를 받았는데 어떻게 함? ->
		// 2. getSum2 메서드에서, num1, num2, num3를 '매개'로, sum2 값을 '계산해 반환'
		System.out.println(sum2);
		
		double sum3 = getSum3(num1, num2);
		System.out.println(sum3);
	}
	//	매개변수 O, 리턴 O
	private static double getSum3(double num1, double num2) {
		System.out.println("'static double(voidX)': 매개변수 있고, 리턴도 있는 메서드");
		return num1 + num2;
	}
	
	private static void printMessage() {
		//	매개변수 X
		//	리턴 X	-> void
		System.out.println("static 'void(리턴X)': 매개변수 없고, 리턴도 없는 메서드\n\n");
	}
	private static String getMessage() {
		//	반환 타입이 String이기 때문에 반드시 안에서 String 타입을 반환
		return "static 'String(void 없음)': 매개변수 없지만, 리턴은 있는 메서드\n"
				+ "(String 타입이기 때문에 반드시 안에서 String 타입을 반환\n\n";
		
	}
	//	매개변수 O, 리턴 X
	private static void printDevide(int num1, int num2) {
		//	리턴 타입이 없어도 return 할 수는 있음
		//	남은 코드를 더이상 수행하지 않고 제어를 돌려줄 때  
		System.out.println("static 'void': 매개변수 있고, 리턴이 없는 메서드\n");
		if (num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.\n\n");
			return;
		}
		System.out.printf("%d/%d = %d%n%n", num1, num2, num1/num2);
		return;
	}
	private static double getSum(double num1, double num2) {
		System.out.println("static double(void 없음): 매개변수 있고, 리턴도 있는 메서드\n");
		return num1 + num2;
	}
	
	private static double getSum2(double num3, double num4, double num5) {
		System.out.println("static double(void 없음): 매개변수 있고, 리턴도 있는 메서드\n");
		return num4 + num5 + num3;
	}
}

