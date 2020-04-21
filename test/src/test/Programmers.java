package test;

public class Programmers {

	public Programmers() {
		String s = "aadbbd";
        String combStr = "";
    	int answer = 0;
    	int i = 1;
    	
        System.out.println("시작 : " + s);

        while(true) {
        	String stStr = s;
            if(s.charAt(i) == s.charAt(i-1)){
                combStr = String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i-1));
                System.out.println("combStr : " + combStr);
                s = s.replace(combStr, "");
                i = 1;
            }
            System.out.println("i : " + i);
            combStr = "";
                

            System.out.println("s : " + s);
            System.out.println("stStr : " + stStr);
            if(s.length() == 0) {
            	answer++;
            	break;
            }else if(s.equals(stStr)) {
            	break;
            }
            if(s.length() >= 2) {
                i++;	
            }
        }
        
        System.out.println("결과 : " + s);
        System.out.println("answer 값 : " + answer);
	}
	
}
