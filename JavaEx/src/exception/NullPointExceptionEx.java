package exception;

public class NullPointExceptionEx {
	
	public static void main(String[] args) {
		String str = new String("hello");
		str = null;
		
		try {
		System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("값이 비어있습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
