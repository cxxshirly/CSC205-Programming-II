//The Clock Class with Instance Methods
//Wrriten by : <Xinxin Chen>


public class Clock {
   	// set private variables 
	private int hour, minute, second;
 
	// constructor with parameters
	public Clock(int hourIn, int minuteIn, int secondIn) {
	
		hour   = hourIn;
		minute = minuteIn;
		second = secondIn;
    	}
	
	// default constructor with no parameters
	public Clock(){
	
		hour   = 0;
		minute = 0;
		second = 0;
	}	

	// a method that reset everything to 0
    	public void reset(){

    		hour   = 0;
		minute = 0;
		second = 0;
    	} 
    
	// a overloaded method that reset everything to values specified by parameters
	public void reset(int hourIn, int minuteIn, int secondIn) {

		hour   = hourIn;
		minute = minuteIn;
		second = secondIn;
	}
	
	// a method that advance the clock
	public void advance() {
		
		second = second + 1;
		if(second == 60){
			second = 0;
			minute = minute + 1;
		}
		
		if(minute == 60){
			minute = 0;
			hour   = hour + 1;			
		}
	
		if(hour == 24){
			hour = 0;
		}
	}
	
	// a method that set everything to a form of "h:m:s"
	public String toString() {
		String hr = hour + "";
		String min = minute + "";
		String sec = second + "";
			
		if(hour < 10){
			hr = "0" + hr;
		}
		if(minute < 10){
			min = "0" + min;
		}
		if(second < 10){
			sec = "0" + sec;
		}
		
		return hr + ":" + min + ":" + sec;	

	}	 
}



