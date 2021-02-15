package QueueLab;

import org.junit.platform.engine.support.hierarchical.Node;

public class LinkedQueue<Customer> implements QueueInterface<Customer> {

	private Node firstNode;
	private Node lastNode;
	
	public LinkedQueue() {
		
		firstNode = null;
		lastNode = null;
	}
	@Override
	public void enqueue(Customer newEntry) {
		// TODO Auto-generated method stub

		Node newNode = new Node(newEntry, null);
		
		if(isEmpty1())
			firstNode = newNode;
		else {
			lastNode.setNext(newNode);
		
		}
		
		lastNode = newNode;

	}

	@Override
	public Customer dequeue() {
		// TODO Auto-generated method stub
		Customer front = null;

		try {
			front = this.getFront();
			firstNode.setData(front);
			firstNode = firstNode.getNext();
		} catch(Exception e) {}
		
		if (firstNode == null) {
			lastNode = null;
		}
		
	
		
		return front;
	}

	@Override
	public Customer getFront() {
		// TODO Auto-generated method stub

		if (this.isEmpty1()) {
			return null;
		} else {
			return (Customer) firstNode.getData();
		}
	}


	public boolean isEmpty1() {
		return firstNode == null && lastNode == null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (firstNode == null) && (lastNode == null);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

		firstNode = null;
		lastNode = null;
	}

	private class Node{
		private Customer data;
		private Node next;
		
	private Node(Customer dataPortion) {
		this(dataPortion, null);
		}
	
	private Node(Customer dataPortion, Node nextNode) {
		data = dataPortion;
		next = nextNode;
	}

	public Customer getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setData(Customer data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	}
}
