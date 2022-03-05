public class SinglyLinkedList{
public class Node{
int data;
Node next;
}
public Node head;
public void addNode(int d){
Node newNode=new Node();
newNode.data=d;
newNode.next=null;
if(head==null){
head=newNode;
}
else{
Node current=head;
while(current.next!=null){
current=current.next;
}
current.next=newNode;
}
}
public void addNodeStart(int d){
Node newNode=new Node();
newNode.data=d;
newNode.next=head;
head=newNode;
}
public void addNodeAtPosition(int index,int d){
	Node newNode=new Node();
    newNode.data=d;
	Node current=head;
	if(index==0){
		addNodeStart(d);
	}
	else{
	for(int i=0;i<index-1;i++){
		current=current.next;
	}
	newNode.next=current.next;
	current.next=newNode;}
}
public void delete(int index){
	
	if(index==0){
		head=head.next;
	}
	else{
		Node current1=null;
		Node current=head;
		for(int i=0;i<index-1;i++){
		current=current.next;
		}
	    current1=current.next;
		current.next=current1.next;
		}
	}
	
public void deleteAtLast(){
	Node temp=head;
	while(temp.next!=null){
		temp=temp.next;
	}
}
public void deleteAtBegining(){
	Node temp=head;
	if(head==null){
		System.out.print("List is empty");
	}
	else{
		head=temp.next;
	}
}
public void reverse(){
	Node current,next,prev;
	current=head;
	prev=null;
	while(current!=null){
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
		
	}
	head=prev;
}
public void display(){
Node current=head;
if(head==null){
System.out.print("List is empty");
}
else{
while(current!=null){
System.out.print(current.data+"->");
current=current.next;
}
}
}

public static void main(String[] args){
SinglyLinkedList s1=new SinglyLinkedList();
System.out.println("This is a Simple Implementation of Singly Linked List");
System.out.println("1.addNode\n2.addNodeStart\n3.addNodeAtPosition\n4.reverse\n6.delete\n7.deleteAtBegining\n8.deleteAtLast");
for(int i=0;i<10;i++){
	System.out.println("Node inserted: "+i);
	s1.addNode(i);
}
for(int i=10;i<21;i++){
	System.out.println("Node Inserted at Starting Position"+i);
	s1.addNodeStart(i);
}
System.out.println("Element is inserted at position 11");
s1.addNodeAtPosition(21,21);
System.out.print("The List is :");
s1.display();
System.out.println();s1.reverse();
System.out.print("The Reverse List is:");
s1.display();
System.out.println("A node is deleted at position 1");
s1.delete(1);
for(int i=0;i<5;i++){
	System.out.println("Node is deleted at Last");
	s1.deleteAtLast()
}
for(int i=0;i<5;i++){
	System.out.println("Node is deleted at Begining");
	s1.deleteAtBegining();
}
	System.out.print("The List is :");
s1.display();
System.out.println();s1.reverse();
System.out.print("The Reverse List is:");
s1.display();

}
}

