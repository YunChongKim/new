package Chap08;

public class MyLinkedList {

	// 링크드리스트의 시작 노드의 참조값
	private Node head = null;
	
	//내부 클래스
	private class Node {
		//데이터를 저장하는 필드변수(저장 데이터가 String Type)
		private String data; 
		//현재 노드에 연결된 다음 노드의 참조값을 저장하는 참조변수
		private Node link; 
		
		//노드 생성자(파라미터로 String을 입력해야함.)
		public Node(String data) {
			this.data = data;
		}
	}
	// 노드를 추가하는  매소드
	public void add(String data) {
	// 새로운 노드를 생성한다.NewNode는 참조값	
		Node newNode = new Node(data); 
		if(head ==null) { //리스트의 시작점인 head가 null이면
			head = newNode; // 새로 만든 노드를 시작점으로 한다.
		} else {
			// 여기 들어온건 head에 이미 노드가 설정되어 있음.
			// 최소 1개 이상의 노드가 리스트에 존재한다는 의미
			
			//시작 노드값을 임시 변수 'next'에 설정 //head는 값이 변하지않고 고정해야하니까 임시변수 next를 사용. 
			Node next = head;
			
			while(next.link !=null) { //현재 노드 next에 연결된 노드가 있는동안 루프 null이면 빠져나가
				next = next.link;// 다음 노드를 현재 노드로 설정
			}
			
			//while루프를 빠져나와서 여기까지 오면 리스트의 끝 노드에 도착했다는 의미
			// 그래서 마지막 노드인 next의 다음 연결 노드로 newNode를 설정
			next.link = newNode;
		}
	}
	//현재까지 입력된 리스트를 콘솔 화면에 출력한다.
	public void print() {
		//데이터가 add된 적이 없다는 의미
		if(head==null) {
			System.out.println("등록된 데이터가 없습니다.");
			//출력할 데이터가 없으므로 그냥 리턴
			return;
		}

			System.out.println("등록된 데이터는 다음과 같습니다.");
//		// 시작 노드값을 임시 변수 next에 설정
		Node next = head;
		//현재 노드인 next가 null이 아닌 동안 루프 
			while(next !=null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}


