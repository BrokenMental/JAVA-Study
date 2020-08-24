package algorithmTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//row, col 인덱스를 저장하는 클래스
class Location{
	int row, col;
	
	public Location(int row, int col) {
		this.row = row;
		this.col = col;
	}
}

public class BfsSearch {

	//shortBfs();
	private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private int arr[][];
    private int isVisit[][];
    private int n, m;
	
    //bfsNormal();
	private int vertex = 0;
	private int[][] graph = {
			{0, 1, 1, 1, 0, 0, 0},
			{1, 0, 0, 0, 1, 0, 0},
			{1, 0, 0, 0, 1, 1, 0},
			{1, 0, 0, 0, 0, 1, 0},
			{0, 1, 1, 0, 0, 0, 1},
			{0, 0, 1, 1, 0, 0, 1},
			{0, 0, 0, 0, 1, 1, 0}
	};
	
	public BfsSearch() {
		/* Breadth First Search - 너비 우선 탐색
		 * : 주어진 무방향 그래프를 Queue를 이용하여 시작 노드와 인접한 높은 레벨의 노드를 쭉 훑으며 탐색
		 * : 가중치(거리)가 없는 그래프에 대한 최단 경로를 찾을 경우 사용
		 * : 방문지가 많을수록 필요없는 노드를 저장해야 하기 때문에 큰 저장공간이 필요
		 * 
		 * 사용 방법
		 * 1. 그래프의 시작 정점 i에서 아직 방문하지 않은 정점을 Queue에 저장
		 * 2. 현재 방문중인 정점을 Queue에서 제거하고 1번을 반복
		 * 3. Queue가 공백이 되면 연산을 종료
		 */
		//bfsNormal();
		
		/* BFS 최단거리 탐색
		 * 
		 */
		shortBfs();
	}
	
	public void shortBfs() {
        StringTokenizer st;
        
		try {
			System.out.print("가로 세로 길이 입력 : ");
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
	        m = Integer.parseInt(st.nextToken());
	
	        arr = new int[n + 1][m + 1];
	        isVisit = new int[n + 1][m + 1];

	        // 입력 값을 배열에 초기화
	        for(int i = 1; i <= n; i++){
				System.out.print("길 생성, " + i + "번째 행 : ");
	            String input = br.readLine();
	            for(int j = 1; j <= m; j++) {
	                arr[i][j] = input.charAt(j - 1) - '0';
	            }
	        }
		        
			breadthfirstsearch();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public void breadthfirstsearch(){
        java.util.Queue<Location> queue = new LinkedList();
        // 큐에 시작점을 추가
        queue.add(new Location(1,1));
        
        // 상하좌우 칸을 표현하는데 사용할 배열
        int[] xArr = {-1, 0, 1, 0};
        int[] yArr = {0, 1, 0, -1};
        
        // 추가한 노드 방문처리
        isVisit[1][1] = 1;

        while(!queue.isEmpty()){
            // 큐에서 노드를 poll
            Location location = queue.poll();
            int row = location.row;
            int col = location.col;

            // 상하좌우 4방향 노드에 대한 작업
            for(int i = 0 ; i < 4; i++){
                int x = row + xArr[i];
                int y = col + yArr[i];

                if(checkLocation(x, y)){
                    System.out.println("현재 : [" + x + "][" + y + "]");
                    System.out.println("거리 : " + isVisit[row][col]);
                    
                    // 큐에 인접 노드 추가
                    queue.add(new Location(x, y));
                    // 추가한 노드까지의 거리 = 현재 노드까지의 거리 + 1
                    isVisit[x][y] = isVisit[row][col] + 1;
                }
            }
        }
        
        System.out.println("최종 : " + isVisit[n][m]);
    }


    public boolean checkLocation(int row, int col){
    	
        // 노드가 범위 밖인 경우
        if(row < 1 || row > n || col < 1 || col > m) {
        	return false;
        }
        
        // 이미 방문한 노드인 경우
        if(isVisit[row][col] != 0 || arr[row][col] == 0) {
        	return false;
        }
        
        return true;
    }
	
	
	public void bfsNormal() {
		Queue queue = new Queue(10);
		
		boolean[] visited = new boolean[graph.length];
		
		for(int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
		
		queue.enqueue(vertex);
		
		while(!queue.isEmpty()) {
			int v = queue.dequeue();
			
			if(visited[v] == false) {
				visited[v] = true;
				
				for(int i = 0; i < graph[v].length; i++) {
					if(graph[v][i] == 1) {
						if(visited[i] == false) {
							queue.enqueue(i);
							System.out.println(v + " > " + i);
						}
						
					}
					
				}
				
			}
		}
	}
	
	
}
