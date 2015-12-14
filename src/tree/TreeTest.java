package tree;

class Node 
{
	Node node;
	static Node root=null;
	int data;
	Node parent,lchild,rchild;
}

public class TreeTest {
	
	int iteartor=0;
	static int count=0;

	public static Node createNode(int data)
	{
		Node node=new Node();
		node.data=data;
		node.lchild=null;
		node.rchild=null;
		if(Node.root==null)
		{
			Node.root=node;
			node.parent=null;
			System.out.println("Node "+node.data+" added successfullly as the root of the tree");
		}
		return node;
	}
	public void createTree(int data)
	{
		Node node=TreeTest.createNode(data);
		Node iterator=Node.root;
		while(iterator.lchild!=null || iterator.rchild!=null)
		{
			if(data<=iterator.data)
			{
				if(iterator.lchild!=null)
					iterator=iterator.lchild;
				else 
					break;
			}
			else{
				if(iterator.rchild!=null)
					iterator=iterator.rchild;
				else 
					break;
			}
			iteartor++;
		}
		if(iteartor!=0)
		{
			if(data<=iterator.data)
			{
				System.out.println("Node "+node.data+" added successfullly in the left of "+iterator.data);
				iterator.lchild=node;

			}
			else{
				System.out.println("Node "+node.data+" added successfullly in the right of "+iterator.data);
				iterator.rchild=node;
			}
			node.parent=iterator;
		}

		iteartor++;
	}
	
	//To find the parent of node
	public void findParent(int value)
	{
		//node=TT.searchNode(value);
	}
	
	//Print tree structure
	public void printTree(int Noofnode)
	{
		int weigh=Noofnode;
		System.out.println("Root"+Node.root);
		while(weigh>0)
		{
			
		}
	}
	
	//weigh --> find the number of node in the tree
	public void weigh(Node node){
	//	int noofnode=1;
		if(node==null)
		{
			return ;
		}
		count++;
		weigh(node.lchild);
		weigh(node.rchild);
	}
	//find node -  search node in the tree structure
	public Node searchNode(int value)
	{
		String flag=null;
		Node loc = null;
		Node iterator=Node.root;
		while(iterator!=null || iterator!=null)
		{
			System.out.println("serach node"+iterator.data);
			if(value==iterator.data)
			{
				loc=iterator;
				System.out.println("Node "+iterator.data+" found successfully in the "+flag+" of "+iterator.parent.data);
				break;

			}
			else
			{
				if(value<iterator.data)
				{
					iterator=iterator.lchild;
					flag = "left";
				}
				else{
					iterator=iterator.rchild;
					flag= "right";
				}
			}

		}
		if(loc==null)
		{
			System.out.println("Not able to find the specified node in the tree");
		}

		return loc;

	}
	
	//print post and prefix 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeTest TT=new TreeTest();
		TT.createTree(23);
		TT.createTree(6);
		TT.createTree(90);
		TT.createTree(12);
		TT.createTree(12);
		TT.createTree(13);
	//	TT.createTree(24);
		TT.createTree(89);
		//TT.createTree(13);
		Node node=TT.searchNode(13);
		System.out.println("node value"+node.data);
		TT.weigh(Node.root);
		System.out.println(" Node Count : "+count);
	}

}


