package linklist;

import java.util.concurrent.LinkedTransferQueue;

class Node
{
	static Node root=null;
	Node next,prev;
	int data;
}

public class LinkListTest {

	
	private static Node createNode(int value)
	{
		Node node =new Node();
		if(Node.root==null)
		{
			Node.root=node ;
		}
		node.data=value;
		node.prev=null;
		node.next=null;
		System.out.println("New node with value"+value+" is created");
		return node;
		
	}
	
	public void insertNodeAtEnd(int value)
	{
		Node node=LinkListTest.createNode(value);
		Node iterator=Node.root;
		while(iterator.next!=null)
		{
			iterator=iterator.next;
		}
		iterator.next=node;
		node.prev=iterator;
	}
	
	public void insertNodePosition(int value,int Position)
	{
		Node node=LinkListTest.createNode(value);
		Node iterator=Node.root;
		while(Position>0)
		{
			iterator=iterator.next;
		}
		node.next=iterator.next;
		node.prev=iterator;
		iterator.next=node;
	}
	
	public void insertNodeAtStart(int value)
	{
		Node node=LinkListTest.createNode(value);
		node.next=Node.root;
		Node.root.prev=node;
		Node.root=node;
	}
	
	
	public void deleteNode(int value)
	{
		Node searchpos=new LinkListTest().search(value);
		
		searchpos.next.prev=searchpos.prev;
		searchpos.prev.next=searchpos.next;
		
		System.out.println("Item"+value+"");
		
	}
	
	
	public Node search(int value)
	{
		int pos =0; 
		
		Node node =Node.root;
		while(node.next!=null)
		{
			node=node.next;
			if(node.data==value)
			{
				System.out.println(value+" is found at"+pos);
				break;
			}
		}
		return node;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
}

