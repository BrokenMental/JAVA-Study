package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResources {
	public static void main(String[] args) {
		/*
		 * FileInputStream fis = null; try{ fis = new FileInputStream("abc.txt"); //파일을
		 * 엶 }catch(FileNotFoundException e){ System.out.println(e); return; }finally{
		 * try{ fis.close(); //파일을 닫음 }catch(IOException e){ System.out.println(e);
		 * return; } System.out.println("finally"); } System.out.println("end");
		 */
		
		try(FileInputStream fis = new FileInputStream("abc.txt")){ //파일을 엶
			
		}catch(IOException e){
			System.out.println(e);
		}
		System.out.println("end");
	}
	
}