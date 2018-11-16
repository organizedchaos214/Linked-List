/**
 *  linkedListIterator.java - Practice on working with linked lists data structures
 * 	Horstmann Book: 1.11 (Array Lists and Linked Lists)
 */

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class linkedListIterator 
	{
	public static LinkedList<String> countries = new LinkedList<String> ( );	
	
	public linkedListIterator ( )
		{
		countries.add("Belgium");
		countries.add("France");
		countries.add("Germany");
		countries.add("Italy");
		}
	
	/*
	 * A list iterator is needed to return elements from within the middle of the linked list data structure.
	 * 
	 * The next ( ) method advances the iterator (cursor) to the next position of the list and returns the item
	 * that the iterator just passed.
	 * 
	 * The hasNext ( ) method tests if the iterator has already passed the last element in the linked list.
	 * 
	 * The llIterator ( ) method below prints out the elements from the list.
	 */
	public static void llIterator ( )
		{
		ListIterator<String> iterator = countries.listIterator ( );

		while (iterator.hasNext( ))
			{
			String country = iterator.next( );
			
			System.out.println(country);
			}
		}
	
	
	/*
	 * The llAddIteratorMiddle ( ) method prompts the user to add a country, then it inserts that country into the 
	 * Linked List using the Iterator.
	 */
	public static void llAddIteratorMiddle ( )
		{
		ListIterator<String> iterator = countries.listIterator ( );

		//user's input will be stored in this string:
		String input;		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter a Country to add to the LinkedList \n");
		
		input = scanner.next();
		
		iterator = countries.listIterator ( );
		
		//advance the iterator past the insert location:
		iterator.next ( );
		
		//adds the input to the linked-list:
		iterator.add(input);
		
		System.out.println("Updating LinkedList... /n");
	
		llIterator ( );
		}
	
	/*
	 * Similar to llAddIteratorMiddle ( ), this method prompts the user to add a country, then it inserts that country 
	 * into the Linked List using the Iterator. This time, the iterator ensures that the user entries are appended to 
	 * the end of the Linked List.
	 */
	public static void llAddIteratorEnd ( )
		{
		ListIterator<String> iterator = countries.listIterator ( );

		//user's input will be stored in this string:
		String input;		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter a Country to add to the LinkedList \n");
		
		input = scanner.next();
		
		iterator = countries.listIterator ( );
		
		//ensures item would be added to the end of the list:
		while (iterator.hasNext())
			{
			iterator.next();
			}
		
		iterator.add(input);
		
		System.out.println("Updating LinkedList... /n");
	
		llIterator ( );
		}
	
	/*
	 * llRemoveIterator ( ) removes the last item from the list.
	 */
	public static void llRemoveIterator ( )
		{
		ListIterator<String> iterator = countries.listIterator ( );

		iterator = countries.listIterator( );
		
		while(iterator.hasNext())
			{
			iterator.next ( );
			}
		
		iterator.remove( );
		
		System.out.println("Updating LinkedList... /n");
		
		llIterator ( );
		}
	
	/**
	 * @param args: main method
	 */
	public static void main(String[] args) 
		{
		new linkedListIterator ( );
		
		linkedListIterator.llIterator ( );
		linkedListIterator.llAddIteratorMiddle( );
		linkedListIterator.llAddIteratorEnd ( );
		linkedListIterator.llRemoveIterator( );
		}

}
