package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {

	private static String rootPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = rootPath + "thieves.txt";
	
	public static void main (String[] args) throws FileNotFoundException {
		//	입력 소스(파일)
		
		File file = new File(filename);
		
		String name;
		float height;
		float weight;
		
		
		Scanner sc = new Scanner(file);
				
				//	데이터 저장 변수
				
				while (sc.hasNextLine()) {
					name = sc.next();
					height = sc.nextFloat();
					weight = sc.nextFloat();
					
					System.out.printf("%s, 키: %.1f, 몸무게: %.1f%n",name, height, weight);
					sc.nextLine();

		
		
	}
	

}
}