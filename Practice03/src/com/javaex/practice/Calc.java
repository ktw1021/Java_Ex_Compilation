package com.javaex.practice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int initi = 0;
		
		while(initi==0) {
		
		System.out.println("1.숫자 놀이\t2.건강 검진\t3.화씨 변환\t4.구의 부피\t5.BMI\t\n6.달러 환전\t7.마일 변환\t8.소득세 계산\t9.사칙연산\n0.종료");
		
		try {
		int select = sc.nextInt();
		
		switch (select) {
			case 1:
			numbergame(sc);
			break;
			
			case 2: 
			health(sc);
			break;
			
			case 3:
			faran(sc);
			break;
			
			case 4:
			V(sc);
			break;
			
			case 5:
			BMI(sc);
			break;
			
			case 6:
			dollar(sc);
			break;
			
			case 7:
			mile(sc);
			break;
			
			case 8:
			tax(sc);
			break;
			
			case 9:
			arith(sc);
			break;
			
			case 0:
			initi = 1;
			break;
			}
		} catch (InputMismatchException e) {
			System.out.println("올바른 숫자를 입력해주세요.");
			break;
		}
		
		
		}
		sc.close();
	}
	
	public static void numbergame(Scanner sc) {
		String yes="a";
		
		do {
		
		Random random = new Random();
		int answer = random.nextInt(100)+1;
		
		System.out.println("=============================");
		System.out.println("    "+"[숫자맞추기게임 시작]"+"    ");
		System.out.println("=============================");
		System.out.print(">>");
		int a = 0;
		
		while (a==0) {
		int num1 = sc.nextInt();
		
		if (answer < num1) {
			System.out.println("더 낮게");
			System.out.print(">>");
		}
		else if (answer > num1) {
			System.out.println("더 높게");
			System.out.print(">>");		
		}
		else if(answer == num1) {
			System.out.println("맞았습니다.");
			a = 1;
		}
	}
		System.out.print("게임을 종료하시겠습니까?(y/n) >>");
		yes = sc.next();

} while (!yes.equals("y"));
		
		System.out.println("=============================");
		System.out.println("    "+"[숫자맞추기게임 종료]"+"    ");
		System.out.println("=============================");
		
	}
	
	public static void health(Scanner sc) {
		
		System.out.println("태어난 년도를 입력해 주세요.");
		System.out.print("년도: ");
		int year = sc.nextInt();
		int age = 2024-year;
		System.out.println("올해: "+"2024");
		System.out.println("태어난해: "+year);
		System.out.println("나이: "+age);
		System.out.println("===========================");
		String GW = null;	//홀짝
		String canc = null;	//암검사 여부
		
		if (age>=20 && age<=150) {
			System.out.println("20살 이상");
			
			if (age%2==0) {
				GW = "건강검진 해";
			}
			else {
				GW = "건강검진 해 아님";
			}
			if (age>=40) {
				canc = "암검사 해";
			}
			else {
				canc = "암검사 X";
			}
		}
		else if (age>=0&&age<20) {
			System.out.println("20살 미만 건강검진 대상이 아님");
		}
		else {
			System.out.println("잘못된 정보입니다.");
		}
		System.out.println(GW!=null?GW:"");
		System.out.println(canc!=null?canc:"");
	}
	
	public static void faran(Scanner sc) {
		System.out.print("화씨: ");
		double F = sc.nextDouble();
		double C = (5.0/9.0) * (F-32);
		System.out.println("화씨 " + F + " 의 섭씨온도는 "+ C +" 입니다.");
	}
	
	public static void V(Scanner sc) {
		System.out.print("반지름: ");
		double radius = sc.nextDouble();
		double PI = 3.14;
		System.out.println("구의 부피는: " + Math.pow(radius,3.0) * (4.0/3.0) * PI );
	}
	
	public static void BMI(Scanner sc) {
		System.out.println("키와 몸무게를 입력해 주십시오.");
		System.out.print("키: ");
		double key = sc.nextDouble();
		System.out.print("몸무게: ");
		double mom = sc.nextDouble();
		double BMI = mom / Math.pow(key/100,2);
		String Stat = null;
		
		if (BMI>=18.5 && BMI <= 24.9) {
			Stat = "정상체중";
		}
		else if (BMI<18.5 && BMI>0) {
			Stat = "저체중";
		}
		else if (BMI>24.9 && BMI < 100) {
			Stat = "과제충";
		}
		else {
			Stat = "비정상적인 작동";
		}
		System.out.println(Stat + "입니다.");
		System.out.println("BMI:"+BMI);
	}
	
	public static void dollar(Scanner sc) {
		System.out.print("환전할 원화를 입력하세요: ");
		int won = sc.nextInt();
		double DOLLAR = won/1230.95;
		System.out.println("받으실 달러는 "+DOLLAR);
	}
	public static void mile(Scanner sc) {
		System.out.print("마일을 입력하세요: ");
		double MILE = sc.nextDouble();
		double kil = 1.609*MILE;
		System.out.println(MILE+"마일은 "+kil+"킬로미터 입니다.");
	}
	public static void tax(Scanner sc) {
		System.out.println("수익을 입력해 주세요.(단위: 만원)");
		System.out.print("금액: ");
		int mon = sc.nextInt();
		double tax;
		if (mon>=0 && mon<=1000) {
			tax = 0.09*mon;
			System.out.println("소득세는 " +tax+" 입니다.");
		}
		else if (mon>1000&&mon<=4000) {
			tax = 1000*0.09+0.18*(mon-1000);
			System.out.println("소득세는 " +tax+" 입니다.");
		}
		else if (mon>4000&&mon<8000) {
			tax = 1000*0.09 + 3000*0.18 + 0.27*(mon-4000);
			System.out.println("소득세는 " +tax+" 입니다.");
		}
		else if (mon>=8000) {
			tax = 1000*0.09 + 3000*0.18 + 4000*0.27+0.36*(mon-8000);
			System.out.println("소득세는 " +tax+" 입니다.");
		}
		else {
			System.out.println("잘못 입력했습니다.");
			}
	}
	public static void arith(Scanner sc) {
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
		String str = sc.next();
		char logo = str.charAt(0);
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble();
		
		if (num2==0) {
			System.out.println("계산할 수 없습니다.");
		}
		else {
		switch (logo) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
			
		default:
			System.out.println("계산할 수 없는 기호입니다.");
			break;
			}
		}
	}
}
	
	

