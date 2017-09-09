//Find Duck Program	
//recongnize a bird when it waddle, swim, and quack like a duck
//Wriiten by : <Xinxin Chen>

import java.util.*;
import java.io.*;

public class FindDuck{
	public static void main(String[] args){
		String readDuck; 	// store text in lower case
		String duckling;	// store text in any case
				
		int lineNum = 1;	// store the line number
		int waddle  = 0;	// store increment of waddle if any found
		int swim   = 0		// store increment of swim if any found
		int quack  = 0;	        // store increment of quack if any found
		int smallWaddle = 0;	// store increment of lower case waddle 
		int smallSwim   = 0;    // store increment of lower case swim
		int smallQuack  = 0;    // store increment of lower case quack

		try{
			//  read text from file called infile.txt and print out 
			Scanner printOut = new Scanner(new File("infile.txt"));
			while(printOut.hasNext()){
				duckling = printOut.nextLine();
				System.out.println(duckling);
			}
			
		
			System.out.println();
			Scanner read = new Scanner(new File("infile.txt"));
			
			// read text from an external called infile.txt
			while(read.hasNext()){
				duckling = read.nextLine();
				readDuck = duckling.toLowerCase();

				// search string waddle 
				for(int i = 0; i<readDuck.length(); i++){
					if(readDuck.indexOf("waddle",i) != -1){
						i = readDuck.indexOf("waddle",i) + 6;
						waddle ++;
					}		
					else{
						break;
					}
				}
				
				// search string waddle in lower case
				for(int i = 0; i<duckling.length(); i++){
					if(duckling.indexOf("waddle",i) != -1){
						i = duckling.indexOf("waddle",i) + 6;
						smallWaddle ++;
					}		
					else{
						break;
					}
				}
				
				//search string swim
				for(int i = 0; i<readDuck.length(); i++){
					if(readDuck.indexOf("swim",i) != -1){
						i = readDuck.indexOf("swim",i) + 4;
						swim ++;
					}		
					else{
						break;
					}
				}
				
				//search string swim in lower case
				for(int i = 0; i<duckling.length(); i++){
					if(duckling.indexOf("swim",i) != -1){
						i = duckling.indexOf("swim",i) + 4;
						smallSwim ++;
					}		
					else{
						break;
					}
				}

				// search string quack
				for(int i = 0; i<readDuck.length(); i++){
					if(readDuck.indexOf("quack",i) != -1){
						i = readDuck.indexOf("quack",i) + 5;
						quack ++;
					}		
					else{
						break;
					}
				}
				
				// search string quack in lower case
				for(int i = 0; i<duckling.length(); i++){
					if(duckling.indexOf("quack",i) != -1){
						i = duckling.indexOf("quack",i) + 5;
						smallQuack ++;
					}		
					else{
						break;
					}
				}
				
	
				//System.out.println("waddle: " + waddle);
				//System.out.println("swim: " + swim);
				//System.out.println("quack: " + quack);
				//System.out.println("smallWaddl: " + smallWaddle);
				//System.out.println("smallSwim: " + smallSwim);
				//System.out.println("smallQuack: " + smallQuack);
				
				// looking for a duck
				if( waddle != 0 && swim != 0 && quack != 0){
					if( !(waddle > 1) && !(swim >1) && !(quack > 1)){
						if( smallWaddle == 1 && smallSwim == 1 && smallQuack == 1){
							System.out.println("Line " + lineNum + " is duckling");	
						}
					}
					else{
						
						System.out.println("Line " + lineNum + " is a duck");	
					}
				}
					
				else{
					System.out.println("Line " + lineNum + " is not a duck");	
				}	
				
				// reset all to 0 and start over 
				waddle = 0;
				swim   = 0;
				quack  = 0;
				smallWaddle = 0;
				smallSwim   = 0;
				smallQuack  = 0;
				lineNum ++;

			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());	
		}	
	}
}
