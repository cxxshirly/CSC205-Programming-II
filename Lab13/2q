public class MyTree{
	public static void main(String[] args){
		BinarySearchTree t = new BinarySearchTree();
		t.insert(new KeyedItem("M"));
		t.insert(new KeyedItem("J"));
		t.insert(new KeyedItem("W"));
		t.insert(new KeyedItem("D"));
		t.insert(new KeyedItem("L"));
		t.insert(new KeyedItem("S"));
		t.insert(new KeyedItem("Z"));
		t.insert(new KeyedItem("F"));
		t.insert(new KeyedItem("T"));
		
		BinarySearchTree myCopy = new BinarySearchTree();
		myCopy.insert(new KeyedItem("M"));
		myCopy.insert(new KeyedItem("J"));
		myCopy.insert(new KeyedItem("W"));
		myCopy.insert(new KeyedItem("D"));
		myCopy.insert(new KeyedItem("L"));
		myCopy.insert(new KeyedItem("S"));
		myCopy.insert(new KeyedItem("Z"));
		myCopy.insert(new KeyedItem("F"));
		myCopy.insert(new KeyedItem("T"));

	//	delete the root
	//	t.delete("M");

		System.out.println("the inorder of t is: ");
		t.inorder();	
		System.out.println();
		System.out.println("the preorder of t is: ");
		t.preorder();
		System.out.println();
		System.out.println("the postorder of t is: ");
		t.postorder();
		System.out.println();
		System.out.print("the number of nodes in t is: ");
		System.out.println(t.countNodes());
		if(t.duplicateCheck(myCopy))
			System.out.println("They're Duplicates");
		else
			System.out.println("They're Not Duplicates");
	}
}
