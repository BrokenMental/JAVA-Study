package test;

public class FastSort {

	public int input[] = { 1, 5, 3, 2, 4 }; // 정렬에 사용 될 배열
	public int tempArray[] = new int[input.length];

	public FastSort() {
		StartToday.printArray(input);

		//mergeSort_Recursion1();

		mergeSort_Recursion2();

		StartToday.printArray(input);
	}

	public void mergeSort_Recursion2() {
		merge_sort2(0, input.length-1);
	}

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

	public void mergeSort_Recursion1() {
		int high = input.length;
		int low = 0;

		System.out.println("merge sort 시작");

		merge_sort1(low, high);
	}

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
