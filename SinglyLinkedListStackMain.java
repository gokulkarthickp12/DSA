class SinglyLinkedListStack{
class Node{
int data;
Node next;
}
public Node head=null;
public void push(int d){
Node newNode=new Node();
newNode.data=d;
if(head==null){
newNode.next=null;
head=newNode;
}
else{
newNode.next=head;
head=newNode;
}
}
public int pop(){
	if(head==null){
System.out.println("Stack is empty");
return -1;
}
else{
	int p=head.data;
	head=head.next;
	return p;
   
}
}
public void display(){
if(head==null){
System.out.println("Stack is empty");
}
else{
Node temp=head;
while(temp!=null){
System.out.print(temp.data+"->");
temp=temp.next;
}
System.out.println();
}
}
}
class SinglyLinkedListStackMain{
public static void main(String[] args){
SinglyLinkedListStack s1= new SinglyLinkedListStack();
System.out.println("This is a Stack Implementation using LinkedList");
System.out.println("Methods available");
System.out.println("1.push\n2.pop\n3.display");
for(int i=0;i<10;i++){
	s1.push(i);
	System.out.println("Element Pushed:"+i);
}
s1.display();
for(int i=0;i<12;i++){
	System.out.println("Element popped:"+s1.pop());
	s1.display();
}

}
}
