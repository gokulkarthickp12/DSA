class Queue{
int[] a = new int[10];
int front,rear;
Queue(){
front=-1;
rear=-1;}

boolean isEmpty(){
return (front==-1 && rear==-1);
}
boolean isFull(){
return (front==0 && rear==10-1);
}
void enqueue(int e){
if(isFull()){
System.out.println("Queue is Full");
}
else{
if(front==-1){
front=0;}
rear++;
a[rear]=e;
System.out.println("Element inserted:"+a[rear]);
}
}
int dequeue(){
if(isEmpty()){
System.out.println("Queue is Empty");
return -1;
}
else{
if(front>rear){
front=-1;
rear=-1;
}
else{
System.out.println("Element popped:"+a[front++]);

}
return 0;
}
}
void display(){
	if(isEmpty()){
		System.out.print("Queue is Empty");
	}
	else{
		for(int i=front;i<=rear;i++){
			System.out.print(a[i]+" ");
		}
	}
}
}
class QueueMain{
public static void main(String[] args){
Queue q= new Queue();
System.out.println("This is a Stack Implementation using Array");
System.out.println("Methods available");
System.out.println("1.enqueue\n2.dequeue\n3.isEmpty\n4.peek");
if(q.isEmpty()){
	System.out.println("Queue is Empty");
}
for(int i=0;i<11;i++){
	q.enqueue(i);

}
for(int i=0;i<11;i++){
q.dequeue();
}
q.display();
}
}
