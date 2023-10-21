
															Language Fundamentals Part-15|| Command Line Arguments
														============================================================
------------------------
 Command Line Arguments 
------------------------

 -> The Arguments which are passing from command prompt are called command line arguments.
 
 -> With these command line arguments JVM will create an array and by passing that array as agruments JVM will call main() method.

	public static void main(String args[]) {
		
		
	}												String args[] = {'A', 'B', 'C'}; // Created by JVM internally 
	
	java Test A 	B 		C 
			  |		|		|
			  |		|		|
		args [0]   [1]	   [2]	 // Like these we can access the array 
		
	args.length == 3 	

	Ex. 
	
		class Test {
			
			public static void main(String args[]) {
				
				int n = Integer.parseInt(args[0]);
				System.out.println("The Square of " + n + "Is : +(n*n)) ;
			}
		}
	
 -> The main objective of command line arguments is we can customize behaviour of the main() method.


 Case 1 :

				Class Test {
					
					public static void main(String args[]) {
																						for(int i=0; i<=args.length;i++){
						for(int i = 0 ; i<=args.length;i++) {								System.out.println(args[i]);
																						}
							System.out.println(args[i]);								args[0] == A
						}																args[1] == B
					}																	args[2] == C
				}																		args[3] == ArrayIndexOutOfBoundsException
				 
				 
				 
				 
	java Test 	A  		B  		C				java Test A		B						Java Test 
                                                                                        
	A                                           A                                       RE: ArrayIndexOutOfBoundsException
	B                                           B
	C                                           RE: ArrayIndexOutOfBoundsException
	RE: ArrayIndexOutOfBoundsException
	
	
	-> If we replace in for loop '<=' with '<' then we won't get any runtime exception .
	
	

 Case 2: 

	
		class Test {
																				  ------------- 	
			public static void main(String args[]) {					args-X--> | A | B | C |
																		 |		  -------------	
				Stirng [] argh = {"X", "Y", "Z"};                        |
																		 |------->------------- 	
				args = argh; // line-1                                  argh----> | A | B | C |
				                                                        		  -------------	
				for(String s1 : args) {
					
					System.out.println(s);
				}
			}
		}
	
	java Test 	A  		B  		C		java Test 	A  		B  			 		java Test 			
	                                                                                                               
	X                                   X                                      		X                                  
	Y                                   Y                                      		Y                                  
	Z                                   Z                                     	 	Z                                  
	
	
	
	


 Case 3 :  Within main() method command line arguments are available in String form.
 
 
		class Test {
			
			public static void main(String args[]) {
				
				System.out.println(args[0]+args[1]);
			}
		} //o/p: 1020
		
	java Test 10 	20 	




 Case 4: Useally space it self is the separater between command line arguments. If our command line arguments it self containes space then we have to enclose that command line 
		 arguments within double quates.



		class Test {
        	
        	public static void main(String args[]) {
					
        		System.out.println(args[0]);
        	}
        } //o/p: Note Book 
		
		
		java Test "Note Book"