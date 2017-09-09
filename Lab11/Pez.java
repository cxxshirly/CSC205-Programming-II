public class Pez{
	public static void main(String[] args) throws CloneNotSupportedException{
		Stack pez = new Stack();
		addPez(pez);
		removeGreen(pez);
		printStack(pez);
	}

	public static void addPez(Stack pez){
		pez.push("yellow");
		pez.push("red");
		pez.push("green");
		pez.push("green");
		pez.push("yellow");
		pez.push("yellow");
		pez.push("red");
		pez.push("green");
	}
	
	public static void removeGreen(Stack pez){
		Stack temp = new Stack();
		while(pez.isEmpty()  != true){
			if(pez.top() != "green"){
				temp.push(pez.pop());
			}
			else{
				pez.pop();	
			}
		}
		while(temp.isEmpty() != true){
			pez.push(temp.pop());
		}
	}
	
	public static void printStack(Stack pez) throws CloneNotSupportedException{
		Stack copy =(Stack) pez.clone();
		while(copy.isEmpty() != true){
			System.out.println(copy.pop());
		}
	}

}
