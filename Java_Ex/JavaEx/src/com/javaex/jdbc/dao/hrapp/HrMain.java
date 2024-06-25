package com.javaex.jdbc.dao.hrapp;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HrMain {

	private static Scanner sc = new Scanner(System.in);
	HrDAOImplOracle daOracl;
	
	public static void main(String [] args) {
		
		listHr();
		
		
		String select = null;
		int button = 0;
	
		try {
			while (button==0) {
				System.out.println();
				System.out.println("1.이름검색  2.급여조회  3.종료");
				select = sc.next();
				if (Integer.parseInt(select)==1) {
					searchHR();	
				}
				else if (Integer.parseInt(select)==2) {
					salarying();
				}
				else if (Integer.parseInt(select)==3) {
					System.out.println("종료합니다.");
					button = 1;
				}
				else {
					System.out.println("다시 입력해주세요.");
				}
			}
		} catch (NumberFormatException e) {
			System.err.println("제대로 된 숫자를 입력해주세요.");
			System.err.println("오류로 프로그램을 종료합니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
		
	}
	
	private static void listHr() {
		HrDAO dao = new HrDAOImplOracle();
		System.out.println("=========================== HR ===========================");
		List<HrVO> list = dao.getList();
		
		if (list.size() > 0) {
			// Iterator 순회
			Iterator<HrVO> it = list.iterator();
			
			while(it.hasNext()) {
				HrVO vo = it.next();
				System.out.printf("%-20s %-20s %-20s %-20s%n", 
							vo.getFull_name(),vo.getEmail(),vo.getHp(), vo.getHire_date());
			}
		} else {
			System.out.println("데이터가 없습니다.");
		}
		
	}
	
	private static void searchHR() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름: ");
		String search_key = sc.nextLine();
		
		HrDAO dao = new HrDAOImplOracle();
		
		List<HrVO> results = dao.search(search_key);
		
		if (results.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (HrVO vo : results) {
		System.out.printf("%-20s %-20s %-20s %-20s%n",
				vo.getFull_name(),vo.getEmail(),vo.getHp(),vo.getHire_date());
		} 
		}
	}
	
	private static void salarying() {
		Scanner sc = new Scanner(System.in);
		System.out.println("최소 급여를 입력하세요");
		int min_sal = sc.nextInt();
		System.out.println("최대 급여를 입력하세요");
		int max_sal = sc.nextInt();
		HrDAO dao = new HrDAOImplOracle();
		
		List<HrVO> results = dao.getSalary(min_sal, max_sal);
		
		if (results.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (HrVO vo : results) {
				System.out.printf("%-20s %-20d%n",vo.getFull_name(),vo.getSalary());
			}
		}
	}
	
}
