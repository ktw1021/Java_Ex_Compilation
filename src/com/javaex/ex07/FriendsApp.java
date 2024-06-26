package com.javaex.ex07;

import java.util.Scanner;

public class FriendsApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해주세요.");
		Friends friendsArray[] = new Friends[3];
		
		for (int i = 0; i<3; i++) {
			
			friendsArray[i]=new Friends();
			
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("핸드폰: ");
			String pn = sc.next();
			System.out.print("학교: ");
			String sch = sc.next();
			System.out.println("------------------------");
			
			friendsArray[i].setName(name);
			friendsArray[i].setPn(pn);
			friendsArray[i].setSch(sch);
			
		} 
		
		for (int j = 0; j<3; j++) {
			friendsArray[j].
			friendsInfo(friendsArray[j].getName(),
						friendsArray[j].getPn(),
						friendsArray[j].getSch());
		}
		
		
		sc.close();
	}

}
