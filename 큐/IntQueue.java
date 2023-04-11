package 큐;

public class IntQueue {
	// 필드
	private int[] que; // 큐용 배열
	private int capacity; // 큐의 용량
	private int ptr; // 현재 데이터 개수
	private int rear; // 맨 뒤 요소 커서
	private int front; // 맨 앞 요소 커서

	// 생성자
	public IntQueue(int maxlen) {
		que = new int[maxlen];
		capacity = maxlen;
		ptr = front = rear = 0;
	}

	// 인큐(데이터 삽입)
	public int enque(int x) {
		que[rear++] = x;
		ptr++;
		if (rear == capacity)
			rear = 0;
		return x;
	}

	// 디큐(데이터 삭제)
	public int deque() {
		int x = que[front++];
		ptr--;
		if (front == capacity)
			front = 0;
		return x;
	}

	// peek : 맨 앞 (첫번째)에 데이터 확인
	public int peek() {
		return que[front];
	}

	// clear : 큐 비우기
	public void clear() {
		ptr = front = rear = 0;
	}

	// indexOf : 특정값의 배열 상 인덱스 확인
	public int indexOf(int x) {
		for (int i = 0; i < ptr; i++) {
			int idx = (i + front) % capacity;
			if (que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}

	// size : 쌓여있는 데이터 개수
	public int size() {
		return ptr;
	}

	// isEmpty : 큐가 비어있는지 확인
	public boolean isEmpty() {
		return ptr == 0;
	}

	// isFull : 큐가 가득차있는지 확인
	public boolean isFull() {
		return ptr == capacity;
	}

	// dump : 큐안에 데이터를 front위치로부터 rear순서로 출력
	public void dump() {
		if (ptr == 0) {
			System.out.println("큐가 비어있습니다.");
		} else {
			for (int i = 0; i < ptr - 1; i++) {
				System.out.println(que[(i + front) % capacity] + " ");
			}
			System.out.println();
		}
	}

}
