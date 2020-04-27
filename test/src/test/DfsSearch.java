package test;

import java.util.Scanner;

public class DfsSearch {
	Scanner scan;
	
	//DfsNormal();
	private int vertex; // 정점의 개수
	private int startVertex; //시작 정점
	private int[][] vertexMap; //인접 행렬 생
	
	private int[] vertexVisit; //정점의 방문 여부를 가리키는 배열
	private int vt1, vt2;
	
	//ShortDfs();
    private int[][] map; //map을 나타내는 배열
    private int map_size; //map의 Size
    private int min;

	public DfsSearch() {
		/* Depth First Search - 깊이 우선 탐색
		 * : 트리와 그래프 같은 자료구조에서 스택을 이용
		 * : 특정 정점의 아래 레밸이 존재하지 않을때까지 깊게 이동한 뒤 상위 정점으로 이동하는 방식을 사용
		 * : 찾은 정점이 최적, 혹은 최단 경로라는 보장이 없음
		 * : 재귀적으로 단계를 구하기 때문에 필요 저장공간이 적음 
		 * 
		 * - 사용 방법
		 * 정점의 개수, 시작할 정점의 번호 입력 : 8 1
		 * 점들을 이어주는 작업(두개씩 끊어서 읽으면 됨) : 1 2 1 3 2 4 2 5 4 8 5 8 3 6 3 7 6 8 7 8 -1 -1
		 * 0 이하가 나오면 끝내기로 정해놔서 마지막 두개는 -1 입력
		 */
		//DfsNormal();
		
		/* DFS 최단거리 탐색
		 * - 사용 방법
		 * map size : 5
		 * map 그리기(좌측 상단부터 시작, 1 : 길, 0 벽)
		 * 1 1 1 1 1
		 * 0 0 0 0 1
		 * 1 1 1 1 1
		 * 1 0 1 0 0
		 * 1 1 1 1 1
		 */
		ShortDfs();
		
		scan.close();
	}
	
	public void ShortDfs() {
        scan = new Scanner(System.in);
        
        System.out.print("map 사이즈 입력 : ");
        map_size = Integer.parseInt(scan.nextLine().trim()); //map의 size를 입력받는다.
        
        map = new int[map_size+1][map_size+1]; //map의 배열의 크기를 입력받은 map_size크기로 만든다.
        min = map_size * map_size;
        
        //이동할 수 있는 path를 입력받기 위해 for문을 사용.
        for(int i = 0; i < map_size; i++) {
            for(int j = 0; j < map_size; j++) {
                System.out.print("map["+i+"]["+j+"] 입력(가능 1, 불가능 0) : ");
                map[i][j] = scan.nextInt();
            }
        }
        
        depthfirstSearch(0,0,1);
        
        printMap(map);
        System.out.println("최단 거리 : " + min);

	}
	
	public void depthfirstSearch(int x, int y, int length) {
        
        if(x == map_size -1 && y == map_size -1){
            if (min > length) min = length;
            return; 
        }
    
        map[y][x] = 0;
            
        //왼쪽으로 이동할 경우
        if(x > 0 && map[y][x-1] == 1) {
            depthfirstSearch(x-1, y, length+1);
        }
            
        //오른쪽으로 이동할 경우
        if(x < map_size && map[y][x+1] == 1) {
            depthfirstSearch(x+1, y, length+1);
        }
        //아래로 이동할 경우
        if(y < map_size && map[y+1][x] == 1) {
            depthfirstSearch(x, y+1, length+1);
        }
        //위로 이동할 경우
        if(y > 0 && map[y-1][x] == 1) {
            depthfirstSearch(x, y-1, length+1);
        }
        
        map[y][x] = 1;
	}
	
	
	public void DfsNormal() {
		scan = new Scanner(System.in);
		System.out.print("정점의 개수, 시작할 정점 번호 입력 : ");
		vertex = scan.nextInt(); // 정점의 개수 입력
		
		startVertex = Integer.parseInt(scan.nextLine().trim()); // 시작할 정점입력
		
		vertexMap = new int[vertex + 1][vertex + 1]; // +1을 시킨 이후는 정점의 시작을 0이아닌 1로시작하기 위해서이다.!
		vertexVisit = new int[vertex + 1]; // +1을 시킨 이후는 정점의 시작을 0이아닌 1로시작하기 위해서이다.!

		while (true) {
			System.out.print("연결 번호 입력 : ");
			vt1 = scan.nextInt();
			vt2 = scan.nextInt();

			if (vt1 < 0 && vt2 < 0) // 두 개의 점이 0보다 작을 경우 break;
				break;

			vertexMap[vt1][vt2] = vertexMap[vt2][vt1] = 1;

			// 정점 vt1과 vt2가 연결되었음을 표기
			// 인접행렬의 내용을 이해하면 위에 코드를 이해할 수 있습니다.

			// 예를 들어 1정점 2정점이 연결되었으면 [1][2] 와 [2][1] 배열의 자리가 1이된다.

		}

		dfs(startVertex); // dfs를 시작합니다.
		
		printMap(vertexMap);
	}

	public void dfs(int start) {
		vertexVisit[start] = 1;
		for (int i = 1; i <= vertex; i++) {
			if (vertexMap[start][i] == 1 && vertexVisit[i] == 0) {
				System.out.println(start + "->" + i + "로 이동합니다");
				dfs(i);
			}
		}
	}
	
	public void printMap(int tempMap[][]) {
		System.out.println("Map[][] 구조");
		for(int i = 0; i < tempMap.length; i++) {
			for(int j = 0; j < tempMap[i].length; j++) {
				System.out.print(tempMap[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------");
	}
}
