package test;

public class Queue {
	int[] q;
	int rear;
	int front;

	/* - Queue
	 * 기초적인 자료 구조 중 하나로, 선입 선출, 후입 후출 이 가능한 형태
	 * 중간 값은 바로 사용할 수 없으며 첫번째 혹은 마지막 요소가 없을 경우 사용 가능
	 */
	public Queue(int n) {
		q = new int[n];
		rear = -1;
		front = -1;
	}

	public boolean isEmpty() {
		if(front == rear){
			//Queue가 공백인 상태
			return true;
		}else {
			//Queue에 Data가 있는 상태
			return false;
		} 
	}

	public void enqueue(int item) {
		if(rear == q.length-1) {
			//Queue가 full인 상태 데이터 삽입 불가
			System.out.println("Queue Full");
			return;
		}else {
			rear = rear + 1; //rear를 증가
			q[rear] = item; //rear 위치에 item 삽입 
		}
	}

	public int dequeue() {
		if(isEmpty()) {
			//Queue가 공백이면 99를 반환
			System.out.print("Queue Empty");
			return 99;
		}else {
			//Queue에 데이터가 있다면 front값을 1증가후 데이터를 반환
			front = front +1; return q[front];
		}
	}
	
}
