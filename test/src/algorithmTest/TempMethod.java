package algorithmTest;

public class TempMethod {

	public TempMethod() {
		String testArr1[] = {"abc", "def", "ghi"};
		String testArr2[] = new String[testArr1.length];
		String testArr3[] = new String[testArr1.length];
		String testArr4[] = {"", "", ""};
		
		System.out.println("========= [ 시작 ] =========");
		System.out.println("===== [ testArr1 출력 ] =====");
		printStr(testArr1);
		System.out.println("===== [ testArr2 출력 ] =====");
		printStr(testArr2);
		
		for(int i=0; i < testArr1.length; i++) {
			testArr2[i] = testArr1[i];
		}

		System.out.println("========= [ 반복문으로 testArr2에 testArr1 복사 ] =========");
		System.out.println("===== [ testArr1 출력 ] =====");
		printStr(testArr1);
		System.out.println("===== [ testArr2 출력 ] =====");
		printStr(testArr2);
		
		System.out.println("========= [ copyStr() 안에서 testArr1을 매개변수로 받아 값 변경 ] =========");
		System.out.println("===== [ testArr1 출력 ] =====");
		copyStr(testArr1);
		printStr(testArr1);
		System.out.println("===== [ testArr2 출력 ] =====");
		printStr(testArr2);
		
		
		
		testArr3 = testArr1;
		System.out.println("========= [ testArr3 = testArr1 ] =========");
		System.out.println("===== [ testArr1 출력 ] =====");
		printStr(testArr1);
		System.out.println("===== [ testArr3 출력 ] =====");
		printStr(testArr3);
		
		testArr3[0] = "end";
		System.out.println("========= testArr3[0]의 값만 변경 =========");
		System.out.println("===== testArr1 출력 =====");
		printStr(testArr1);
		System.out.println("===== testArr3 출력 =====");
		printStr(testArr3);
		
		
		
		testArr4[0] = testArr1[0];
		System.out.println("========= [ testArr4[0] = testArr1[0] ] =========");
		System.out.println("===== [ testArr1 출력 ] =====");
		printStr(testArr1);
		System.out.println("===== [ testArr4 출력 ] =====");
		printStr(testArr4);
		
		testArr4[0] = "really";
		System.out.println("========= [ testArr4[1]의 값만 변경 ] =========");
		System.out.println("===== [ testArr1 출력 ] =====");
		printStr(testArr1);
		System.out.println("===== [ testArr4 출력 ] =====");
		printStr(testArr4);
	}
	
	public void printStr(String pstr[]) {
		if(pstr.length > 0) {
			for(String forStr : pstr) {
				System.out.println(forStr);
			}	
		}
	}
	
	public void copyStr(String cstr[]) {
		if(cstr.length > 0) {
			cstr[0] = "zyx";
			cstr[1] = "wut";
			cstr[2] = "srq";
		}
	}
}
