package linklist;

class Node
{
	static Node root=null;
	Node next,prev;
	int data;
}

public class LinkListTest {

	
	private void createNode(int value)
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
	}
	
	public void insertNodeAtEnd(int value)
	{
		
	}
	
	public void insertNodePosition(int value,int Position)
	{
		
	}
	
	public void insertNodeAtStart(int value)
	{
		
	}
	
	
	public void deleteNode(int value)
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
