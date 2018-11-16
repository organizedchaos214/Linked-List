/**
 * @author Shane Anderson
 *
 *
 * This program finds the nth element from the beginning
 * or end of the list, depending on the direction that the
 * user specifies.
 */
import java.util.*;

public class linkedListFindNthElement 
	{
	public static LinkedList <Integer> ll = new LinkedList <Integer> ( );
		
	/*
	 * searches the LL in a forward direction:
	 */
	public static void forwardSearch (int nth, LinkedList<Integer> ll)
		{
		System.out.println(ll);
		
		int value;
		
		value = ll.get(nth);
		
		System.out.println("The element at index: " + nth + " is: " + value);
		}
	
	
	/*
	 * searches the LL in a backwards direction:
	 */
	public static void reverseSearch (int nth, LinkedList<Integer> ll)
		{
		System.out.println(ll);
		
		int value;
		
		value = ll.get (ll.size( ) - nth);
		
		System.out.println("The " + nth + "th to last element is: " + value);
		}
	
	/*
	 * Begin execution:
	 */
	public static void main(String[] args) 
		{
		int nth;
		int direction;
		int i;
		
		//fill linked-list to 20 to 40:
		for (i = 20; i < 40; i++)
			{
			ll.add(i);
			}
		
		//n:
		System.out.println("Enter N value:");
		
		@SuppressWarnings("resource")
		Scanner n = new Scanner (System.in);
		
		nth = n.nextInt ( );
		
		//direction:
		System.out.println ("Enter Direction: 1-Forward, 2-Reverse");
		
		@SuppressWarnings("resource")
		Scanner d = new Scanner (System.in);
		
		direction = d.nextInt ( );
		
		
		
		if (direction == 1)
			{
			linkedListFindNthElement.forwardSearch(nth, ll);
			}
		
		else if (direction == 2)
			{
			linkedListFindNthElement.reverseSearch(nth, ll);
			}
		
		else
			{
			System.out.println("Invalid Direction. 1 = Forward, 2 = Backwards");
			}
		}

}
