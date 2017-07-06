package oop3_4;

public class TestMyTime {

	public static void main(String[] args) {
		//Testing exception
		//MyTime myTime = new MyTime(23,33,66);
		
		//Testing hour, minutes and seconds
		MyTime myTime2=new MyTime();
		
		for(int i=0; i<=4; i++){
			
			for(int j=0; j<=59; j++){
				
				for(int k=0; k<=59; k++){
					System.out.println(myTime2.toString());
					myTime2.nextSecond();
				}
			
			}
			
		
		}
		/*
		
		for(int i=23; i>=-1; i--){
			
			for(int j=0; j<=59; j++){
				
				for(int k=0; k<=59; k++){
					System.out.println(myTime2.toString());
					myTime2.previousSecond();
				}
			}
		}
			*/	
		
		

	}

}
