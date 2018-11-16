/**
 * @author Shane Anderson
 * 
 * This program will look at a given linked-list, and search 
 * for a value that the user specified. If the element is in
 * the LL it will return true, otherwise it will return false
 *
 */
import java.util.*;

public class linkedListFindValue 
	{
	static int value;
	
	//This method handles populating the LinkedList:
	public static void populateLL ( )
		{
		LinkedList <Integer> ll = new LinkedList <Integer> ( );
		
		int i;
		
		//change this to populate the list with different (or random) values:
		for (i = 0; i < 10; i++)
			{
			ll.add(i);
			}
		
		linkedListFindValue.searchLL (value, ll);
		}
	
	
	//This method handles the searching of the LinkedList:
	public static void searchLL (int value, LinkedList <Integer> ll)
		{
		if (ll.contains(value) == true)
			{
			System.out.println("Match Found in Linked List");
			}
		
		else
			{
			System.out.println("Element: '" + value + "' not found in the list");
			}
		
		System.out.println("Linked List: " + ll);
		}
	
	
	//Begin Execution:
	public static void main(String[] args) 
		{
		System.out.println("Enter Value to Search For in Linked List");
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner (System.in);
		
		value = s.nextInt( );
		
		linkedListFindValue.populateLL();
		}

}
