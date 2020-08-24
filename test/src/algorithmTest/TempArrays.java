package algorithmTest;

public class TempArrays {
	
	public TempArrays() {
		int[] temps1 = {1,2,3,4};
		int[] temps2 = {};
		int[] temps3 = new int[6];
		
		System.out.println("init temps1.length : " + temps1.length);
		System.out.println("init temps2.length : " + temps2.length);
		System.out.println("init temps3.length : " + temps3.length);
		
		for(int temp1 : temps1) {
			System.out.println("before temp1 : " + temp1);
		}
		
		temps2 = temps1;
		
		for(int temp2 : temps2) {
			System.out.println("temp2 : " + temp2);
		}
		

		for(int temp3 : temps3) {
			System.out.println("temp3 : " + temp3);
		}
		
		System.out.println("temps2 = temps1, temps1.length : " + temps1.length);
		System.out.println("temps2 = temps1, temps2.length : " + temps2.length);
		System.out.println("temps2 = temps1, temps3.length : " + temps3.length);

		temps1 = temps3;

		for(int temp1 : temps1) {
			System.out.println("after temp1 : " + temp1);
		}
		
		System.out.println("temps1 = temps3, temps1.length : " + temps1.length);
		System.out.println("temps1 = temps3, temps2.length : " + temps2.length);
		System.out.println("temps1 = temps3, temps3.length : " + temps3.length);
	}

}
