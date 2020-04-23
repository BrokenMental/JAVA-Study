package test;

public class RecursionMethod {
	
	public RecursionMethod() {
		System.out.println("시작");
		
		recu1(1, 2);
		
		System.out.println("종료");
	}
	
	public void recu1(int num1, int num2) {
		System.out.println("\nrecu1");
		
		if(num1 + num2 > 5) {
			return;
		}
		
		int temp = num2 + num1;
		System.out.println("temp(num1 + num2) : " + temp);
		
		recu1(2, temp);
		recu1(3, temp);
		recu2(num1, num2);
		
	}
	
	public void recu2(int num1, int num2) {
		System.out.println("\nrecu2");
	}
}
