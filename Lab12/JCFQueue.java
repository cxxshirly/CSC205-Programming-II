
import java.util.*;

public class JCFQueue
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		LinkedList queue1 = new LinkedList();
		LinkedList queue2 = new LinkedList();
		Object key = new Character('$');

        	queue1.addLast(new Character('b'));
        	queue1.addLast(new Character('$'));
        	queue1.addLast(new Character('E'));
        	queue1.addLast(new Character('$'));
        	queue2.addLast(new Character('b'));
        	queue2.addLast(new Character('$'));
        	queue2.addLast(new Character('E'));
        	queue2.addLast(new Character('b'));
		System.out.println("dup check = " +
                    identicalCheck(queue1, queue2));
		printQueue(queue1);
		findAndReplace(queue1, key, new Character('*'));
		System.out.println("** After findAndReplace **");
		printQueue(queue1);
	}

	private static boolean identicalCheck(LinkedList queue1,
                                              LinkedList queue2)
                throws CloneNotSupportedException
	{
	 	if( queue1.size() == queue2.size()){
			for(int i = 0; i < queue1.size(); i ++){
				if((((Comparable)queue1.get(i)).compareTo((Comparable)queue2.get(i))) != 0)
				return false;
			}
		}
		else return false;
		return true;

	}

	private static void findAndReplace(LinkedList queue1, 
		Object key, Object newVal)
	{
		if(queue1.isEmpty() == false){
			for(int i =0; i < queue1.size(); i ++){
				if(queue1.get(i).equals(key)){
					queue1.remove(i);
					queue1.add(i,newVal);
				}
			}
		}
		else System.out.println("This queue is empty !!");
	}

	private static void printQueue (LinkedList q)
		 throws CloneNotSupportedException
	{
		if(q.isEmpty() == false){
			for(int i =0; i <q.size(); i++){
				System.out.print(q.get(i) + "   ");
			}
			System.out.println();
		}
		else System.out.println("This Queue is empty!! ");

	}


}
