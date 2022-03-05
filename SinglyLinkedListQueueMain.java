class SinglyLinkedListQueue{
class Node{
int data;
Node next;
}
public Node front=null;
public Node rear=null;
public void enqueue(int d){
Node newNode=new Node();
newNode.data=d;
if(rear==null){
front=newNode;
rear=newNode;
front.next=null;
rear.next=null;
}
else{
rear.next=newNode;
rear=newNode;
}
}
int dequeue(){
	Node newNode = new Node();
	if(front==null){
		System.out.println("Queue is empty");
		return -1;
	}
	else{
		newNode=front;
		front=front.next;
		return newNode.data;
		
	}
	
}
public void display(){
Node newNode=front;
while(newNode!=null){
System.out.print(newNode.data+"->");
newNode=newNode.next;
}
}
}
class SinglyLinkedListQueueMain{
public static void main(String[] args){
SinglyLinkedListQueue s1=new SinglyLinkedListQueue();
System.out.println("This is a Queue Implementation using LinkedList");
System.out.println("Methods available");
System.out.println("1.enqueue\n2.dequeue\n3.display");
for(int i=0;i<20;i++){
System.out.println("Enqueued element is:"+i);
s1.enqueue(i);}
for(int i=0;i<22;i++){
	System.out.println("Dequeued element is:"+s1.dequeue());

}
s1.display();

}
}
