package exception;

public class ArithmeticExceptionEx2 {

	public static void main(String[] args) {
		int [] intArray = new int[] {3,6,9};
		
		try {
			System.out.println(intArray[3]);	
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("인덱스 범위와 맞지 않습니다.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
		
	}

}
