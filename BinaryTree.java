import java.util.Stack;
class BinaryTree{
	Node root;
public static class Node{
int data;
Node left,right;
public Node(int data){
this.data=data;
this.left=null;
this.right=null;
}
}
public Node insertArrayInBinaryTree(int[] arr,Node root,int i){
if(i<arr.length){
Node temp=new Node(arr[i]);
root=temp;
root.left=insertArrayInBinaryTree(arr,root.left,2*i+1);
root.right=insertArrayInBinaryTree(arr,root.right,2*i+2);
}
return root;
}
public void preorder(Node root){
if(root==null){
	return;
}
	
	System.out.print(root.data+"->");
	preorder(root.left);
	preorder(root.right);
}

public void inorder(Node root){
if(root==null){
	return;
}
	inorder(root.left);
	System.out.print(root.data+"->");
	inorder(root.right);
}
public void postorder(Node root){
if(root==null){
	return;
}
	postorder(root.left);
	postorder(root.right);
	System.out.print(root.data+"->");
	
}
public void preorder_iterative(Node root){
	Stack<Node> s1=new Stack<Node>();
	if(root==null){
	return;}
	s1.push(root);
	while(!s1.isEmpty()){
		root=s1.pop();
		System.out.print(root.data+"->");
		if(root.right!=null){
			s1.push(root.right);
		}
		if(root.left!=null){
			s1.push(root.left);
		}
		
	}
}
public void inorder_iterative(Node root){
	Stack<Node> s1=new Stack<Node>();
	Node node =root;
	while(true){
		if(node!=null){
			s1.push(node);
			node=node.left;
		}
		else{
			if(s1.isEmpty()){
				break;
			}
			node=s1.pop();
			System.out.print(node.data+"->");
			node=node.right;
		}
		
	}
}
public void postorder_iterative(Node root){
	Stack<Node> s1=new Stack<Node>();
	Node node =root;
	while(true){
		if(node!=null){
			s1.push(node);
			node=node.left;
		}
		else{
			if(s1.isEmpty()){
				break;
			}
			
			node=s1.pop();
			System.out.print(node.data+"->");
			node=node.right;
		}
		
	}
}
public int depthOfBinaryTree(Node root){
	if(root==null) return 0;
	int lf=depthOfBinaryTree(root.left);
	int rf=depthOfBinaryTree(root.right);
	return 1+Math.max(lf,rf);
}
public static void main(String[] args){
int[] a={1,2,3,4,5,6,7,8,9,10};
/*Scanner sc=new Scanner(System.in);
for(int i=0;i<10;i++){
a[i]=sc.nextInt();
}*/
System.out.println("This is a Simple Implementation of Binary Tree");
BinaryTree n1=new BinaryTree();
n1.root=n1.insertArrayInBinaryTree(a,n1.root,0);
System.out.println("Array inserted in BinaryTree");
System.out.println("Pre-order traversal");
n1.preorder(n1.root);
System.out.println();
System.out.println("Inorder Traversal");
n1.inorder(n1.root);
System.out.println();
System.out.println("Post-order Traversal");
n1.postorder(n1.root);
System.out.println();
System.out.println("Pre-order Iterative");
n1.preorder_iterative(n1.root);
System.out.println();
System.out.print("In-order Iterative");
n1.inorder_iterative(n1.root);
System.out.println();
System.out.println("Post-order Iterative");
n1.postorder_iterative(n1.root);
System.out.println();
System.out.print("Depth of Binary Tree:");
System.out.print(n1.depthOfBinaryTree(n1.root));
}
}
