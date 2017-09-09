import java.util.*;

public class JCFStack
{
   public static void main(String[] args) throws CloneNotSupportedException
   {
        	Stack stack1 = new Stack();
		stack1.push(new Integer(27));
		stack1.push(new Integer(0));
		stack1.push(new Integer(-3));
		stack1.push(new Integer(-18));
		stack1.push(new Integer(99));
        	printStack (stack1); 
		searchKey(stack1);

  }

  private static void printStack (Stack s) throws CloneNotSupportedException
  {
        Stack tempStack = (Stack) (s.clone());
        if (! tempStack.isEmpty())
                System.out.println("*** Printing Out Stack:  ");

        while (! tempStack.isEmpty())
        {
               System.out.println(tempStack.peek());
               tempStack.pop();
	}
 }	
 	

 public static void searchKey (Stack s){
	Scanner scr = new Scanner(System.in);
	System.out.print("Key value = ");
	int key = (Integer) scr.nextInt();
	System.out.print("Key value found at position : " + s.search(key) + " \n");	
	
 }
}
