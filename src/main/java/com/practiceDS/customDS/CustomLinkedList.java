package com.practiceDS.customDS;

public class CustomLinkedList {
	Node head,tail;
	public CustomLinkedList() {
	}
	public void insertHead(int data) {
		Node node=new Node(data);
		if(head==null) {
			tail=node;
		}else {
			head.setPrev(node);
		}
		node.setNext(head);
		head=node;
	}
	public void insertTail(int data) {
		Node node=new Node(data);
		tail.setNext(node);
		node.setPrev(tail);
		tail=node;
	}
	public void insertAt(int at,int data) {
		Node node=new Node(data);
		Node temp=head;
		for(int i=0;i<at;i++) {
			temp=temp.getNext();
		}
		node.setPrev(temp);
		node.setNext(temp.getNext());
		temp.setNext(node);
		node.getNext().setPrev(node);
	}
	public void printAllNode() {
		Node temp=head;
		if(head==null)
			System.out.println("Linkedlist is Empty");
		else {
			while(temp.getNext()!=null) {
				System.out.println(temp.getData());
				temp=temp.getNext();
			}
			if(temp.getNext()==null)
				System.out.println(temp.getData());
		}
	}
}
