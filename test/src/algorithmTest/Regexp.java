package algorithmTest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {
	
	//정규 표현식, Regular Expression의 약자
	public Regexp() {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		//숫자 양식 확인 : ^[0-9]*$
		//한글 양식 확인 : ^[가-힣]*$
		//특수문자 양식 확인 : [!@#$%^&*(),.?\\\":{}|<>]
		Pattern regexp = Pattern.compile("[!@#$%^&*(),.?\\\":{}|<>]");
		
		
		Matcher tm = regexp.matcher(text);
		
		System.out.println(tm.find());
	}
	
}
