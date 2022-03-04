class Stack{
int[] a = new int[100];
int top;
Stack(){
top=-1;
}
boolean isEmpty(){
if(top<0){
return true;}
else{
return false;
}
}
void push(int e){
	top++;
	if(top>=100){
		--top;
System.out.println("Stack overflow");
}
else if(top<100){
a[top]=e;
System.out.println("Element Pushed:"+a[top]);
}

}
int pop(){
if(top<0){
	
System.out.println("Stack Underflow");
return 0;
}
else{
	int a1=a[top--];
    return a1;
}
}
int peek(){
if(top<0){
System.out.println("Stack Underflow");
return 0;
}
else{
	int b1=a[top];
return b1;

}
}
void print(){
	if(isEmpty()){
	System.out.print("Stack is Empty");}
	else{
for(int i=top;i>=0;i--){
System.out.print(a[i]+" ");}
}
}
}
class StackMain{
public static void main(String[] args){
Stack s1=new Stack();
System.out.println("This is a Stack Implementation using Array");
System.out.println("Methods available");
System.out.println("1.push\n2.pop\n3.peek\n4.peek\n5.isEmpty");
if(s1.isEmpty()){
System.out.println("State of Stack is Empty");}
for(int i=0;i<101;i++){
	s1.push(i);
	System.out.println("Element Pushed: "+i);
}
for(int i=0;i<102;i++){
	System.out.println("Element at top:"+s1.peek());
	System.out.println("Element popped:"+s1.pop());
}

}
}
