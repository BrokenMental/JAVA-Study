package test;

public class FastSort {

	private int input[] = { 1, 5, 3, 2, 4 }; // 정렬에 사용 될 배열
	private int tempArray[] = new int[input.length];
	
	/* 재귀함수를 이용한 빠른 정렬들
	 * - MergeSort : 병합 정렬
	 * 주어진 배열을 반으로 계속 쪼개서 더이상 나눠지지 않으면 한 쌍씩 묶어서 비교 후 정렬(처음엔 2개, 다음엔 4개, 그 다음엔 8개...)
	 * 
	 * - QuickSort : 퀵 정렬
	 * 병합 정렬과 마찬가지로 주어진 배열을 쪼개지만 기준 수를 정해서 정렬
	 * 기준 수는 자유롭게 선택 가능하며 기준 수를 대상으로 쪼개진 배열을 정렬하고, 정렬이 완료되면 다음 쌍을 묶어서 정렬
	 * 
	 */
	public FastSort() {
		StartToday.printArray(input);

		//병합 정렬
		//mergeSort_Recursion1();
		//mergeSort_Recursion2();
		
		//퀵 정렬
		//quickSort(0, input.length-1);

		StartToday.printArray(input);
	}
	
	//퀵 정렬 시작 메소드
	public void quickSort(int low, int high) {
		if(low >= high) {
			return;
		}
		
		int mid = midCalc(low, high);
		quickSort(low, mid-1);
		quickSort(mid, high);
	}
	
	//퀵 정렬 중간 구하기 & 정렬 메소드
	public int midCalc(int low, int high) {
		int pivot = input[(low + high) / 2];
		
		while(low <= high) {
			while (input[low] < pivot) {
				low++;
			}
			
			while (input[high] > pivot) {
				high--;
			}
			
			if(low <=high) {
				int temp = input[low];
				input[low] = input[high];
				input[high] = temp;
				
				low++;
				high--;
			}
		}
		
		return low;
	}
	
	//병합 정렬2 시작 메소드
	public void mergeSort_Recursion2() {
		merge_sort2(0, input.length-1);
	}
	
	//병합 정렬2 정렬 메소드
	public void merge_sort2(int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			
			merge_sort2(start, mid);
			merge_sort2(mid + 1, end);
			
			int p = start;
			int q = mid + 1;
			int idx = p;
			
			while (p <= mid || q <= end) {
				if (q > end || (p <= mid && input[p] < input[q])) {
					tempArray[idx++] = input[p++];
				} else {
					tempArray[idx++] = input[q++];
				}
			}
			
			for (int i = start; i <= end; i++) {
				input[i] = tempArray[i];
			}
		}
	}

	//병합 정렬1 시작 메소드
	public void mergeSort_Recursion1() {
		int high = input.length;
		int low = 0;

		System.out.println("merge sort 시작");

		merge_sort1(low, high);
	}
	
	//병합 정렬1 분리 메소드
	public void merge_sort1(int low, int high) {
		System.out.println("분리 시작");

		if (high - low < 2) {
			return;
		}

		int mid = (low + high) / 2;

		System.out.println("low : " + low);
		System.out.println("high : " + high);
		System.out.println("mid : " + mid);
		System.out.println();

		merge_sort1(0, mid);
		merge_sort1(mid, high);
		merge(low, mid, high);
	}

	//병합 정렬1 정렬 메소드
	public void merge(int low, int mid, int high) {
		System.out.println("병합 시작");

		int[] tempArr = new int[high - low];
		int temp = 0, templow = low, temphigh = mid;

		while (templow < mid && temphigh < high) {
			if (input[templow] < input[temphigh]) {
				tempArr[temp++] = input[templow++];
			} else {
				tempArr[temp++] = input[temphigh++];
			}
		}

		while (templow < mid) {
			tempArr[temp++] = input[templow++];
		}

		while (temphigh < high) {
			tempArr[temp++] = input[temphigh++];
		}

		for (int i = low; i < high; i++) {
			input[i] = tempArr[i - low];
		}
	}

}
