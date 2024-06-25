//package fourju;
//
//import java.util.Scanner;
//
//import furtune.GapJa;
//
//public class MainApp {
//
//	public static void main(String[] args) {
//		
//		BirthDay human1 = new BirthDay();
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("양력 기준입니다. \n생년 입력");
//		human1.setYear(sc.nextInt());
//		System.out.println("생월 입력");
//		human1.setMonth(sc.nextInt());
//		System.out.println("생일 입력");
//		human1.setDate(sc.nextInt());
//		System.out.println("생시 입력");
//		human1.setHour(sc.nextInt());
//				
//		if (human1.getMonth()==0 || human1.getDate()==0) {
//			System.err.println("제대로 된 생년월일을 입력하세요.");
//		}
//		else {
//		System.out.printf("%d년 %d월 %d일 %d시 출생%n", human1.getYear(), human1.getMonth(), human1.getDate(), human1.getHour());
//		}
//		
//		GapJa g = new GapJa(human1.getYear(),human1.getYear(),
//							
//							human1.getHour());
//		
//	sc.close();	
//		}
//	
////	public static void GapJa(BirthDay human1) {
////		
////		int chungan = human1.getYear()%10;
////		String gan = "";
////		switch (chungan) {
////		case 4:	gan="갑"; break;	case 5:	gan="을"; break;	case 6:	gan="병"; break;	case 7:	gan="정"; break;
////		case 8:	gan="무"; break;	case 9:	gan="기"; break;	case 0:	gan="경"; break;	case 1:	gan="신"; break;
////		case 2:	gan="임"; break;	case 3:	gan="계"; break;
////		}	human1.setGan(gan);
////		
////		int jiji = human1.getYear()%12;
////		String ji = "";
////		switch (jiji) {
////		case 4:	ji="자"; break;	case 5: ji="축"; break;	case 6: ji="인"; break;	case 7: ji="묘"; break;
////		case 8: ji="진"; break;	case 9: ji="사"; break;	case 10: ji="오"; break;	case 11: ji="미"; break;
////		case 0: ji="신"; break;	case 1: ji="유"; break;	case 2: ji="술"; break;	case 3: ji="해"; break;
////		}	human1.setJi(ji);
////		
////		int si = human1.getHour();
////		String siji = "";
////		if (si>=23 || si<1) {siji="자";}	else if (si>=1 && si<3) {siji="축";}	else if (si>=3 && si<5) {siji="인";}
////		else if (si>=5 && si<7) {siji="묘";}	else if (si>=7 && si<9) {siji="진";}	else if (si>=9 && si<11) {siji="사";}
////		else if (si>=11 && si<13) {siji="오";}	else if (si>=13 && si<15) {siji="미";}	else if (si>=15 && si<17) {siji="신";}
////		else if (si>=17 && si<19) {siji="유";}	else if (si>=19 && si<21) {siji="술";}	else if (si>=21 && si<23) {siji="해";}
////		human1.setSiji(siji);
////		System.out.printf("%s%s\t%s",human1.getGan(),human1.getJi(), human1.getSiji());
////	}
////		
//		
//		
//		
//	}
//
//
