package com.javaex.ex10;

import java.util.Scanner;

public class BookShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Book b1 = new Book(1,"트와일라잇","스테파니메이어");
		Book b2 = new Book(2, "뉴문", "스테파니메이어");
		Book b3 = new Book(3, "이클립스", "스테파니메이어");
		Book b4 = new Book(4, "브레이킹던", "스테파니메이어");
		Book b5 = new Book(5, "아리랑", "조정래");
		Book b6 = new Book(6, "젊은그들", "김동인");
		Book b7 = new Book(7, "아프니까 청춘이다", "김난도");
		Book b8 = new Book(8, "귀천", "천상병");
		Book b9 = new Book(9, "태백산맥", "조정래");
		Book b10 = new Book(10, "풀하우스", "원수연");

		int a = 0;
		
		do {
		
		System.out.println("도서 정보 출력하기");
		b1.print();		b2.print();		b3.print();		b4.print();		b5.print();
		b6.print();		b7.print();		b8.print();		b9.print();		b10.print();
		
		System.out.println();
		System.out.println("1.대여\t2.반납\t3.종료");
		int select = sc.nextInt();
		
		if (select==1) {
		
		System.out.println("");
		System.out.print("대여하고 싶은 책의 번호를 입력하세요:");
		int num=sc.nextInt();
		
		switch (num) {
		case 1:			b1.rent();			break;		case 2:			b2.rent();			break;
		case 3:			b3.rent();			break;		case 4:			b4.rent();			break;
		case 5:			b5.rent();			break;		case 6:			b6.rent();			break;
		case 7:			b7.rent();			break;		case 8:			b8.rent();			break;
		case 9:			b9.rent();			break;		case 10:		b10.rent();			break;
		default:				System.out.println("\n존재하지 않는 책 번호입니다.\n");			break;
		}
	}
		else if (select==2) {
			System.out.println("");
			System.out.print("반납하고자 하는 책의 번호를 입력하세요:");
			int num=sc.nextInt();
			
			switch (num) {
			case 1:				b1.rturn();				break;
			case 2:				b2.rturn();				break;
			case 3:				b3.rturn();				break;
			case 4:				b4.rturn();				break;
			case 5:				b5.rturn();				break;
			case 6:				b6.rturn();				break;
			case 7:				b7.rturn();				break;
			case 8:				b8.rturn();				break;
			case 9:				b9.rturn();				break;
			case 10:			b10.rturn();			break;
			default:		System.out.println("\n존재하지 않는 책 번호입니다.\n");		break;
			}
		}
		
		else if (select==3) {
			System.out.println("프로그램을 종료합니다.");
			a=1;
		}
		
		} while (a!=1);
		
	sc.close();	
	}

}
