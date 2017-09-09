
public class Dashes
{
	public static void main(String[] args)
	{
		String word = "Two-Thousand-And-Sixteen";
		System.out.println(removeDashes(word));
	}

	public static String removeDashes(String word){
		
		StringBuffer stringBuf = new StringBuffer();
		stringBuf.append(word);
		for (int i = 0; i <  stringBuf.length(); i ++) {
			if(stringBuf.charAt(i) == "-"){
				stringBuf.setCharAt(i," ");
			}

		}
		return word; 
	}










}
