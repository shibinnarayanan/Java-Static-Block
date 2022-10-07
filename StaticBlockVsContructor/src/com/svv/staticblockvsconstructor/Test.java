package com.svv.staticblockvsconstructor;

public class Test {
	
	 //constructor
     Test(){
    	 
    	 System.out.println("Constructor executed ...");
     }
     //static block
     static {
    	 System.out.println("Staic block executed");
     }
     
     public static void main(String[] args) {
    	 
    	 Test t1 = new Test();
    	 Test t2 = new Test();
    	 Test t3 = new Test();
    	 Test t4 = new Test();
    	 
	}

}
