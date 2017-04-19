package oop8_1;

public class IntStackTester {

	public static void main(String[] args) {
		
		MyIntStack mystack=new MyIntStack(4);
		
		if(mystack.isEmpty()){
			System.out.println("you can add four elements");
			
		}
		
		for(int i=0; i<4; i++){
			mystack.push(i);
		}
		
		if(mystack.isFull()){
			System.out.println("your stack is full now, you need top elements");
			
		}
		
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		
		if(mystack.isEmpty()){
			System.out.println("you can add four elements");
			
		}
	}

}
