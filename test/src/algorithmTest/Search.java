package algorithmTest;

import java.util.Scanner;

public class Search {

	private int data[] = {1, 12, 43, 6, 2, 25, 99};
	private boolean flg = false;
	private int index = 0;
	private int search = 0;
	
	public Search() {

		System.out.print("찾는 숫자 입력 : ");

		Scanner sc = new Scanner(System.in);
		search = sc.nextInt();
		
		//이진 검색
		binarySearch(search);
		
		//순차 검색
		seqSearch(search);

		sc.close();
	}
	
	/* - 이진 검색(Binary Search)
	 * 정렬이 되었다는 가정하에 하는 검색
	 * 중앙의 원소를 기준으로 찾는값이 더 크면 오른쪽, 작으면 왼쪽으로 검색
	 */
	public void binarySearch(int search) {
		System.out.println("이진 검색");
		//정렬
		sorting();
		
		int low = 0, mid = 0, high = data.length-1;
		
		while(low <= high) {
			mid = (low+high)/1;
			
			//System.out.println("mid = (low+high)/2 = (" + low + "+" + high + ")/2 = " + mid + " => 들어있는 값 : " + data[mid]);
			
			if(data[mid] == search) {
				flg = true;
				index = mid;
				break;
			}
			
			if(data[mid] < search) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		
		printSearch();
		
	}
	
	/* - 순차 검색(Sequentaial Search)
	 * 말 그대로 배열의 첫번째부터 순서대로 루프르 돌려 검색
	 */
	public void seqSearch(int search) {
		System.out.println("순차 검색");
				
		for(int i = 0; i < data.length; i++) {
			if(data[i] == search) {
				flg = true;
				index = i;
				break;
			}
		}

		printSearch();
	}
	
	public void printSearch() {
		if(flg) {
			System.out.println(search + "를 " + (index+1) + "번째 위치에서 찾았습니다.");
		}else {
			System.out.println("찾지 못했습니다.");
		}
	}
	
	//선택 정렬
	public void sorting() {
		int dlen = data.length;
		
		for(int i = dlen-1; i >= 0; i--) {
			for(int j = i; j >= 0; j--) { //i--, j++ 식으로 하면 앞에 바뀐게 뒤에서 또 바뀔수 있음
				if(data[j] > data[i]) {
					int temp = data[j];
					data[j] = data[i];
					data[i] = temp;
					System.out.println(data[j] + "랑 " + data[i] + "랑 바꿈.");
				}
			}
			
			StartToday.printArray(data);
		}
	}
}
