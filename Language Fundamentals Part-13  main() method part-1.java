
														Language Fundamentals Part-13 || main() method part-1
												===================================================================
												
--------------												
 Main Method 												
-------------

 -> Whether class contains main() method or not and whether main() method is declared according to requirment or not these things won't be checked by compiler. At runtime JVM 
	is responsible to check these things if a JVM unable to find main() method then we will get runtime exception saying NoSuchMethodError:Main 

	Ex. 

	class Test {
		
		
	} 
	javac Test.java compile fine 
	java Test 
	//RE: NoSuchMethodError:main
	
	
-> At runtime JVM always searches for the main() method with the following proto-type 

	-------------			---------				   ------						------				------------------
		public				 static 					void						 main       	     (String  args[]) 
	------------			--------				   -----						------ 		   		 -----------------
		|						|						 |							 |							|
	To call by JVM from  without exisiting objet 	  Main method won't return    These is the name 	command line argument 	
	any Where 			 also JVM has to call these   anything to JVM 			 which is configure 
						method 													inside JVM 
						
	- The above syntax is very strict and if we perform any change then we will get runtime exception saying NoSuchMethodError:main.



-> Even though abouve syntax is very strict the following changes are exceptable.

		1. Initiated of public static we can take  static public. That is the order of modifire is not important.
		
		2.  We can declare array in any exceptable form. 
			main (String [] args)
		    main (String args[])
			main (String  args[])
			
		3. Initiated args we can take any valid java identifire  
		
			main(String  [] durga)
			
		
		4.  We can replace String array with var-arg parameter .
		
			main(Stirng... args)
			
			
		
		5. We can declare main() method with the following modifire final, synchronized,strictfp.

		class Test {
			
				static final synchronized strictfp public void main(String... args) {
					
					System.out.println("valid main method ");
					
				}
		}
		
		
-> Which of the following main() method declarations are valid ?

		public static void main(string args); //invalid 
		public static void Main(string args[]); //invalid 
		public  void main(string args[]); //invalid 
		public static int main(string args[]); //invalid 
		final synchronized strictfp public  void main(string args[]); //invalid 
		 final synchronized strictfp public static void main(string args[]); //valid 
		public static void main(string... args);//valid 
		
		
-> In which of the above cases we will get compile time error ?

	we won't get compile time error any where but except last two case in remaining we will get runtime exception saying NoSuchMethodError:main
	
	
Case 1: Overloading of the main() method is possible but JVM will always call String[] args main() method only.The other overloaded method we have to call explicitly like a 
		normal method call.

		Ex. 
	
		class Test {
			
			public static void main(String args[]) { |
													 |
				System.out.println("String [] ");	 |
			}										 |==> Overloaded Method 	
			public static vod main(int[] args){		 |
													 |
				System.out.println("int[]");		 |	
			}
		}// o/p String []
		
		
 Case 2: Inheritance concept applicable for main method hance a while executing child class if child doesn't containe main method then parent class main() method will be 
		 executed.


		Ex.
		
		
			class P {<----------------------------------------								
															 |                              		javac p.java 
				public static void main(String []args) {     |                              	---------------------	
                                                             |                              	|					|
						System.out.println("parent main");   |                              p.class				c.class
				}                                            | //save as P.java             
			}                                                |                              java P 
			class C extends P {                              |                              
															 |			                    o/p: parent main 
			}<------------------------------------------------                              
			                                                                                java c 
			                                                                                
			                                                                                o/p: parent main 
			
			
			
Case 3: It'seems overriding concept applicable for main() method but it is not overriding and it is method hiding.

	
		class P {<---------------------------------------
														|												
			public static void main(String args[]){     |                                               		javac p.java 
				                                        |                                               	---------------------
				System.out.println("parent main");      |                                               	|					|
			}                                           |                                               p.class				c.clas
		}                                               |                                               
		class C extends P {                             |// It is method hiding but  not overriding     java P 
			                                            |                                               
			public static void main {String args[]){	|                                               o/p: parent main 
				                                        |                                               
				System.out.println("child Main");       |                                               java c 
			}                                           |                                               
		} <----------------------------------------------                                               o/p: child main 
			
			
			
Note: 

	For main() method inheritance and overloading concept are applicable but overriding concept is  not applicable initiated of overriding method hidding is applicable.
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		