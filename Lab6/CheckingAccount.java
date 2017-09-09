//Checking account which inherits from the Account class.
//Written by: <Xinxin Chen>

public class CheckingAccount extends Account{
	int numChecks = 0;
	double amount;			
	double Balance;
	double amountInCheck;	

	public CheckingAccount (double Balance){
		super(Balance);
		numChecks = 0;
	}

	public int getChecksWritten (){	
		return numChecks;
	
	}

	public void writeCheck (double amountInCheck){
		amount = amountInCheck;		
		withdraw(amountInCheck);	
		numChecks ++;
	}

		
}

