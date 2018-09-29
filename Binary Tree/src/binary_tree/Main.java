package binary_tree;
import java.util.*;


public class Main {
class Nodes{
	public
		int key;
		Nodes leftChild;
		Nodes rightChild;
		
		Nodes (int data){
			key = data;
			leftChild = null;
			rightChild = null;
		}
		public void sayit() {System.out.println("hi");}
	}


	public static void main(String[] args) {
	
	    Nodes mynode = new Nodes(15);
	    
		
		System.out.println("hello world: "+ mynode.key);

	}

}
