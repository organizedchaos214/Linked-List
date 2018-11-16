import java.util.LinkedList;

/**
 *  linkedList.java - Creating a Linked List Data Structure
 *  
 * 	Horstmann Book: 1.11 (Array Lists and Linked Lists) + 
 * 					https://www.youtube.com/watch?v=ch1uQeu0PVY&t=62s
 */

public class linkedList
	{
	Node root;
	int size;
	 
	public linkedList() 
		{
		root = new Node ( );
		size = 0;
		}	

	//main method: test cases:
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
		{
		int a = 8;
		int b = 17;
		int c = 5;
		int d = 10;
		
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList ( );
		System.out.println(ll.size ( ));
		
		ll.add(a);
		System.out.println(ll.size ( ));
		
		ll.add(b);
		ll.add(c);
		ll.add(d);
	
		System.out.println(ll.size ( ));

		}
	
	//sets the size of the Linked List:
	public void setSize (int s)
		{
		this.size = s;
		}

	//gets the size of the Linked List:
	public int getSize ( )
		{
		return this.size;
		}
	
	//adds a node to the Linked List:
	public Node add (int data)
		{
		Node newNode = new Node (data, root);
		
		this.root = newNode;
		this.size ++;
		
		return newNode;
		}
	
	//finds an item in the Linked List:
	public Node find (int data)
		{
		Node thisNode = this.root;
		
		while (thisNode != null)
			{
			if (thisNode.getData ( ) == data)
				{
				return thisNode;
				}
			thisNode = thisNode.getNextNode( );
			}
		return null;
		}
	
	//removes an item from the Linked List:
	public boolean remove (int data)
		{	
		Node thisNode = this.root;
		Node prevNode = null;
		
		while (thisNode != null)
			{
			if (thisNode.getData ( ) == data)
				{
				prevNode.setNextNode(thisNode.getNextNode());
				this.setSize(this.getSize( ) - 1);
				return true;
					
				}
			prevNode = thisNode;
			thisNode = thisNode.getNextNode( );
			}
		
		return false;
		}
	
	
private class Node 
	{
	private Node nextNode;
	private int data;

	//0-argument constructor:
	private Node ( ) 
		{
		
		}

	//1-argument constructor:
	private Node (int val)
		{
		data = val;
		}

	//2-argument constructor:
	private Node (int val, Node next)
		{
		data = val;
		nextNode = next;
		}

	@SuppressWarnings("unused")
	private void setData (int val)
		{
		this.data = val;
		}

	private int getData ( )
		{
		return this.data;
		}

	private void setNextNode (Node n)
		{
		this.nextNode = n;
		}

	private Node getNextNode ( )
		{
		return this.nextNode;
		}
	}

}