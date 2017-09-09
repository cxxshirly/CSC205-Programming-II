import java.io.*;
import java.util.*;
public class MinString
{
        private static final int SIZE = 10;
        public static void main(String[] args)
        {
                String[] list = new String[SIZE];
                int numItems;

                numItems = Initialize (list);
                System.out.println(FindMin (list, numItems));
        }

        private static int Initialize (String[] list)
        {       
	        // initialized with all strings from file.
		String filename, stateInput;
      		int i = 0, numItems = 0;
       	     	try  {
                System.out.print("Input File : ");
                Scanner stdin = new Scanner(System.in);
                filename = stdin.nextLine();
                stdin = new Scanner(new File(filename));

                while ((stdin.hasNext()) && (i < list.length))
                {
                        stateInput = stdin.nextLine();
                        System.out.println("S = " + stateInput);
                        list[i] = stateInput;
                        i++;
                }
                numItems = i;
          }
          catch (IOException e)  {
                System.out.println(e.getMessage());
          }
          return numItems;
        }

        
      	 public static String FindMin (String[] list, int numItems){
		
		//Find the minimum length of the strings in the list
		int minNum = list[0].length();
		for (int i = 1; i < numItems; i++){
			if(list[i].length() < minNum){				
				minNum = list[i].length();
			}
		}	

		//Compare the strings with the same length in alphabet order	
		String minStr = "";
		for (int j = 0; j < numItems;j++){
			if(minStr.isEmpty()){
				minStr = list[j];
			}

			if(list[j].length() == minNum){
				if(list[j].compareTo(minStr) < 0){
					minStr = list[j];
				}			
			}
		}

		return minStr;
	}
}

