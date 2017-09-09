
public class PrintCall
{
        public static void main(String[] args)
        {
                printMe(1);
        }

        public static void printMe(int n)
        {

          if ( (n != 1)  && (n != 5) )
          {
             for (int i = 1;  i <= n;  i++)
                 System.out.print(' ');
             System.out.println("This was written by call number " + n + ".");
          }
	
          //  Add an if stmt here with a recursive stmt in its body
          //  along with a for loop similar to the one above

	  if(n ==1){
		for (int j = 1; j < 5; j++){
			n++;
			printMe(n);
				if (n == 5){
					for (int y = 1; y < 5 ; y++)	
        		       		{ 
						for(int o = 1; o <= n; o++)
							System.out.print(' ');
						n--;
						System.out.println("This ALSO was written by call number " + n + ".");
					}
			}
		}
	  }
        }
}
