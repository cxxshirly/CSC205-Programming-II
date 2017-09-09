import java.util.*;
import java.io.*;
public class Links
{

	public static void main(String[] args)
	{
          	Node pos1 = null;
    		Node pos2 = null;
    		pos1 = new Node(new Integer(13));
   		pos1.setNext(new Node(new Integer(15), null));
    		pos2 = new Node(new Integer(11), null);
		pos2.setNext(pos1);
		printList(pos2);
		System.out.println("the number of nodes in pos2 is: " + count(pos2));
		System.out.println("the max of pos2 is: " +findMax(pos2));
	}

	private static void printList(Node head)
	{
		if (head != null)
		{
			System.out.println(head.getItem());
			printList(head.getNext());
		}
	}

	public static int count(Node head){
		if(head  == null)
			return 0;
		else	
			return 1 + count(head.getNext());
	}

	public static Object findMax(Node head){
		Object max = head.getItem();
		while (head != null){
			if(((Comparable)head.getItem()).compareTo((Comparable)max) > 0)
				max = head.getItem();
				head = head.getNext();
		}
		return max;

	}

}

