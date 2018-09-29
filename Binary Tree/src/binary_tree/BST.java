package binary_tree;

class BST {
	nodes root;
	BST(){
		root = null;
	}
	void addnode(int data) {
		
		if (root == null)
		{
			root = new nodes (data);
		}
	}

}
