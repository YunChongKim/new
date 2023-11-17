package Chap08;

public class MyLinkedList2 {

	private Node head = null; //linked의 시작, 노드의 참조값 
	
	private class Node {
		private String data;
		private Node prev;  //참조형변수는 초기값 null
		private Node next;
		
		public Node(String data) {
			this.data = data;
		}
	}
	
	public void add(String data) {
		Node newNode = new Node(data);
		
		if(head ==null) {
			head = newNode;
		} 
		else {
			Node temp = head;
			while(temp.next != null) { //while()의 조건일때(null이 아닐때) 아래 식 실행
				temp = temp.next;
				
			}

			temp.next = newNode;
			newNode.prev = temp;
		}
	}
	public void print() {
		if(head==null) {
			System.out.println("등록된 데이터가 없습니다.");
		}else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while (true) {
				System.out.println(next.data);
				
				if(next.next == null)
					break;
				next = next.next;
			}
			
			System.out.println("-".repeat(20));
			while(next !=null) {
				System.out.println(next.data);
				next = next.prev;
			}
		}
	}

}
