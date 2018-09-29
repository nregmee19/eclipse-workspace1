
public class binaryTree {
	

	public static void main(String[] args) {
		//binTree mytree = new binTree();
		//System.out.println();
		System.out.println("testcase 1:");
		binTree binTree2 = new binTree();
		binTree2.insertNode(3);
		binTree2.insertNode(201);
		binTree2.insertNode(60);
		binTree2.insertNode(30);
		binTree2.insertNode(45);
		binTree2.walkTree(binTree2.root);


	}

}

class Nodes{
	int key;
	Nodes rightChild;
	Nodes leftChild;
	int display() {
		return key;
		}
}

class binTree{
	Nodes root;
	
	void insertNode(int data){
		Nodes newnode = new Nodes();
		newnode.key = data;
		Nodes currentnode;
		Nodes parentnode;	
		currentnode = root;
		parentnode = root;
		if(root == null) {
			root = newnode;
		}
		else {
			while (currentnode != null) {
				if(currentnode.key > newnode.key) {
					//System.out.println("I am at if");
					parentnode = currentnode;
					currentnode = currentnode.leftChild;
				}
				else if(currentnode.key < newnode.key) {
					//System.out.println("I am at else if");
					parentnode = currentnode;
					currentnode = currentnode.rightChild;
				}
			}
			
			if (parentnode.key > newnode.key)
			{
				parentnode.leftChild = newnode;
			}
			else
			{
				parentnode.rightChild = newnode;
			}
			
			//System.out.println("Head is full");
		}
	}
	void walkTree(Nodes referenceNode) {
		if (referenceNode != null) {
			walkTree(referenceNode.leftChild);
			
			System.out.println(referenceNode.key);
			
			walkTree(referenceNode.rightChild);
		}
		
	}
}



