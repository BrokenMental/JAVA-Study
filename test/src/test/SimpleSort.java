package test;

public class SimpleSort {

	public int input[] = {1, 5, 3, 2, 4}; //정렬에 사용 될 배열
	public int ilen = input.length; //정렬 시 필요한 배열의 길이
	public int temp = 0; //정렬 시 필요한 빈 값

	public SimpleSort() {
		System.out.println("===초기화 상태===");
		StartToday.printArray(input, temp);

		//삽입정렬
		InsertionSort();
		
		//버블정렬
		//BubbleSort();

		//선택정렬
		//SelctionSort();
	}
	
	/* :: 삽입정렬
	 * 1. 현재 확인하는 원소 좌측은 정렬이 된 상태, 우측은 정렬이 되지 않은 상태로 가정
	 * 2. 현재 확인하는 원소와 좌측의 정렬된 원소들을 확인
	 * 2-1. 정렬된 원소를 확인할 때 좌측(작은 수)부터 확인할 때 보다 우측(큰 수)의 원소를 확인하면서 변경하면 시간을 줄일 수 있음
	 * 3. 정렬된 원소 안에 포함되는 값이면 빈 공간에 복사
	 * 4. 해당하는 위치부터 우측으로 이동
	 * 5. 빈 공간에 복사한 원소를 해당 위치에 정렬
	 * 6. 정렬이 완료되면 우측에 존재하는 다음 원소를 확인하여 위를 반복
	 */
	public void InsertionSort(){
		System.out.println("===삽입 정렬 시작===");
		for(int i = 1; i < ilen; i++) {
			temp = input[i];
			int j = i;

			System.out.println("\n- " + i + "단계 ");
			while(j > 0 && input[j-1] > temp) {
				input[j] = input[j-1];
				
				System.out.println("\n위치 : " + j + "\n옮기는 값 : " + input[j]);
				StartToday.printArray(input, temp);
				System.out.println();
				
				j--;
			}

			input[j] = temp;

			StartToday.printArray(input, temp);
			
		}
		
		/*for(int i = 1; i < ilen; i++) {
			for(int j = i; j > 0; j--) {
				if(input[j-1] > input[j]) {
					temp = input[j-1];
					input[j-1] = input[j];
					input[j] = temp;
				}
			}
		}*/
		
		System.out.println("\n===삽입정렬 종료===");
		StartToday.printArray(input, temp);
	}
	
	/* :: 버블정렬
	 * 1. 맨 왼쪽 원소와 바로 옆 원소를 비교, 큰 수를 오른쪽으로 교환
	 * 2. 현재 확인한 우측의 원소와 그 다음의 원소를 비교
	 * 3. 위 과정을 가장 큰 수가 맨 오른쪽으로 갈 때까지 반복
	 * 4. 가장 큰 수가 맨 오른쪽에 위치하면 맨 오른쪽 원소를 제외하고 1번부터 반복
	 */
	public void BubbleSort() {
		System.out.println("===버블 정렬 시작===");
		for(int i = ilen-1; i > 0; i--) {
			for(int j=0; j < i; j++) {
				if(input[j] > input[j + 1]) {
					temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}

			System.out.println("- " + i + "단계 ");
			StartToday.printArray(input, temp);
		}

		System.out.println("\n===버블정렬 종료===");
		StartToday.printArray(input, temp);
	}
	
	
	/* :: 선택정렬
	 * 1. 각 루프마다 최대 원소(또는 최소 원소)를 찾음
	 * 2. 최대 원소(또는 최소 원소)와 맨 오른쪽(또는 맨 왼쪽) 원소를 교환
	 * 3. 맨 오른쪽(또는 맨 왼쪽) 원소 제외
	 * 4. 반복
	 */
	public void SelctionSort() {
		System.out.println("===선택 정렬 시작===");
		
		//맨 왼쪽부터 찾기
		SelectionSortLeft();
		
		//맨 오른쪽부터 찾기
		//SelectionSortRight();
		
		System.out.println("\n===선택 정렬 종료===");
		StartToday.printArray(input, temp);
	}

	//선택정렬, 맨 오른쪽부터 찾기
	public void SelectionSortLeft() {
		System.out.println("===선택정렬, 맨 오른쪽부터 찾기===");
		int max;
		
		for(int i = ilen-1; i > 0; i--) {
			max = i;
			
			for(int j = i-1; j >= 0; j--) {
				if(input[j] > input[max]) {
					max = j;
				}
			}
			
			temp = input[i];
			input[i] = input[max];
			input[max] = temp;

			System.out.println("- " + (-(i - ilen)) + "단계 ");
			StartToday.printArray(input, temp);
		}
	}
	
	//선택정렬, 맨 왼쪽부터 찾기
	public void SelectionSortRight() {
		System.out.println("===선택정렬, 맨 왼쪽부터 찾기===");
		int min;
		
		for(int i = 0; i < ilen - 1; i++) {
			min = i;
			
			for(int j = i+1; j < ilen; j++) {
				if(input[j] < input[min]) {
					min = j;
				}
			}
			
			temp = input[i];
			input[i] = input[min];
			input[min] = temp;

			System.out.println("- " + i + "단계 ");
			StartToday.printArray(input, temp);
		}
	}
	
}