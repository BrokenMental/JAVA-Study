package test;

public class StartToday {

	public static void main(String[] args) {
		
		//배열과 메서드의 연관관계
		//TempMethod tm = new TempMethod();
		
		//배열 복사
		//TempArrays ta = new TempArrays();
		
		//프로그래머스 레밸2 문제
		//Programmers pg = new Programmers();
		
		//simple, slow 정렬 알고리즘 예제
		//SimpleSort st = new SimpleSort();
		
		//fast 정렬 알고리즘 예제
		//FastSort fs = new FastSort();
		
		//재귀메소드 테스트
		//RecursionMethod rsm = new RecursionMethod();
		
		//정규표현식 테스트
		//Regexp re = new Regexp();
		
		//검색 알고리즘 예제
		//Search sc = new Search();
		
		//DFS Search 알고리즘 예제
		//DfsSearch ds = new DfsSearch();
		
		//BFS Search 알고리즘 예제
		BfsSearch bs = new BfsSearch();
		
		//Dijkstar 알고리즘 예제
		//Dijkstra dijk = new Dijkstra();
	}

	public static void printArray(int input[], int temp) {
		System.out.println(":: temp 값 : " + temp);
		for(int ip : input){
			System.out.print(ip + " ");
		}
		System.out.println();
	}
	

	public static void printArray(int input[]) {
		for(int ip : input){
			System.out.print(ip + " ");
		}
		System.out.println();
	}
}
