//Calculate the range and mean of a group of data
//Wriiten by : <Xinxin Chen>

import java.util.*;

public class Stats
{
	private static final int MAX_SIZE = 100;
	public static void main(String[] args)
	{			
        	int[] List = new int[MAX_SIZE];		
		int numItems;
				
        	numItems = fillUp (List);

        	System.out.println("\n\10\7" + " The range of your " +
                                   numItems + " items is :  " + 
				   range (List, numItems));

   	    	System.out.println("\n\10\7" + " The mean of your " + 
                                   numItems + " items is  :  " +
				   mean (List, numItems));
	}
	
	//A method that used to read all the input values
	public static int fillUp(int[] List) {
		
		int numItems  = 0;	
		int value;
		int i = 0;
		Scanner input = new Scanner(System.in);
		//user input values by typing in number between 1 - 100
		System.out.println("Please Input Your Values (Enter a 0 to Stop) :");
		value  = input.nextInt();
		List[i] = value; 
		i = i + 1;
		while (value != 0 && value < 100 && value >0 ) {		
			value = input.nextInt();
			List [i] = value;
			i++;
		}
			for (int j = 0; j < List.length; j++){
				if(List[j] != 0){
					numItems ++; 	
				}
				else 
					break;
			}		
		
		return numItems;			
	}
	
	//A method that calculate the difference between the maximum value and the minimum value
	public static int range(int[] List,int numItems) {
		
		//calculate the minimum value of the List
		int minValue = List[0];
		for(int i = 1; i < numItems; i++){
			if(minValue > List[i]){
				minValue = List[i];
			}
		}

		//calculate the maximum value of the List
		int maxValue = List[0];
		for(int j = 1; j < numItems; j++){
			if(maxValue < List[j]){
				maxValue = List[j];
			}
		}	
		int range;
		range = maxValue - minValue;
		return range;
	}

	//A method that returns the average of the input values
	public static double mean(int[] List,int numItems) {
		double mean;
		double sum = 0;
		for(int i = 0;i < numItems; i++){
			sum = sum + List[i];
		}
		mean = sum/numItems;
		return mean;
	}


}
