//A program for checking Magic Squares
//Wriiten by : <Xinxin Chen>

import java.io.*;
import java.util.*;

public class MagicSquare{
	
	private static final int SIZE = 3;
	public static void main (String[] args) {
	
		// initializes the the magic sqaure
		// read data from external file  	
		String filename;
		boolean rowSum     = false;
		boolean columnSum  = false;
		boolean leftDiag   = false;
		boolean rightDiag  = false;
		int tmpSum = 0;
		int[][] square = new int[SIZE][SIZE];

		try {	
			System.out.print("Input File : ");
			Scanner input = new Scanner(System.in);
			filename = input.nextLine();	
			input = new Scanner(new File(filename));

			for(int i = 0;i < square.length; i++){
				for(int j = 0;j < square[0].length;j++){
					square[i][j] = input.nextInt();	
				}
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	
		//print out the magic square
		for(int i = 0;i < square.length; i++){
			for(int j = 0;j < square[0].length;j++){
				System.out.print(square[i][j] + " " );
			}
			System.out.println();
		}
		
		//sum of each row
		for (int i = 0;i < square.length; i++){
			int hsum = 0;
			for (int j = 0; j < square[0].length;j++){
				hsum  += square[i][j];
				if( i == 0){
					tmpSum = hsum;
				}
			}
			// System.out.println( i + " row sum:" + hsum);
			if( hsum == tmpSum){
				rowSum = true;		
			}
			else{
				rowSum = false;
			}
		}

		
		//sum of each column 
		for (int j = 0;j < square.length; j++){
			int vsum = 0;
			for (int i = 0; i < square.length;i++){
				vsum += square[i][j];
			}
			// System.out.println(j + " column sum:" + vsum);
			if( vsum == tmpSum){
				columnSum = true;		
			}
			else{
				columnSum = false;		
			}
		}

		//diagonal top left
		int dsum1 = 0;
		for (int i = 0;i < square.length; i++){
			dsum1 += square[i][i];
		}
		
		// System.out.println("top left diagonal:" + dsum1);
		if( dsum1 == tmpSum){
			leftDiag = true;
		}
		else{
			leftDiag = false;	
		}
	
		//diagonal top right
		int dsum2 = 0;	
		for (int i = 0;i < square.length; i++){
			dsum2 += square[i][square.length-i-1];
		}
		
		// System.out.println("top right diagonal:" + dsum2);
		if( dsum2 == tmpSum){
			rightDiag = true;
		}
		else{
			rightDiag = false;	
		}
			
		if((rowSum == columnSum) && (columnSum == leftDiag) && (leftDiag == rightDiag)){
			System.out.println("Yes, It's A Magic Square!");
		}
		else 
			
			System.out.println("No, It's not A Magic Square!");
	}


} 
