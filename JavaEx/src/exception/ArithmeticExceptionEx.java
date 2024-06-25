package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx {
	
	//	정수 1개 입력
	//	100을 입력받은 정수로 나눔
	//	나눗셈 결과를 화면에 출력
	
	public static void main(String[] args) {
		//	변수 선언
		double result=0;
		int num;
		
		//	스캐너 개방
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		
		try {	// 예외 발생 가능영역을 try 블록으로 감싼다. 
			num=sc.nextInt();
			result = 100/ num;
		} 	//	앞쪽에서 구체적 에러 처리
			//	가장 마지막에 Exception으로 잔여 에러 처리
		catch (InputMismatchException e) {
			System.err.println("숫자를 입력해주세요.");
			//	가장 특수한 에러를 앞에서부터 catch하도록(Exception이 모든 예외를 다 잡아주니)
			//	높은 가능성으로 예상되는 에러를 선정하는 작업이 필요할 듯. 
		}
		catch (ArithmeticException e) {
			//	100% ArithmeticException 
			//	구체적인 예외 처리 로직 수행 가능
			System.err.println("0으로는 나눌 수 없습니다.");
		}
		catch (Exception e) {	//	예외(정보) 클래스로 catch
			e.printStackTrace();	//예외 스택 출력
		} finally {
//				예외 유무 관계 없이 가장 마지막에 1회 실행
//				try 블록에서 설정된 시스템 자원 등을 해제
//				필수가 아님
			System.out.println("예외처리 종료.");
		}
		
		System.out.println(result);
		
		sc.close();
	}

}
