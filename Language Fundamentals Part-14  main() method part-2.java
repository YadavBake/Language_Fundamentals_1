
														Language Fundamentals Part-14 || main() method part-2
													============================================================


---------------------------------------------------------
 1.7v version Inhancement with respect to main() method 
----------------------------------------------------------

 -> Until 1.6v version if the class doesn't containe method() method then we will get runtime exception saying NoSuchMethodError:main.
 
 -> But 1.7v version on words intiated of NoSuchMethodError we will get More elaborated Error information.
 
			Ex. 
		
													class Test {
		
		
													}
	
						1.6v version 										1.7v version 
						
					javac Test.java//valid 								javac Test.java //valid 
					java Test //invalid 								java Test 
					RE: NoSuchMethodError:.main							Error: main method not found in class Test. please  define  main method as   
																		public static void main(String args[])	
	
	
->  From 1.7v version onwords main() method is mandatory to start program execution. Hance a even though class containes static block it won't be executed if the class doesn't 
	containe main() method.

			Ex. 
													class Test {				
			                                        	
			                                        	static {
			                                        		
			                                        		System.out.println("Static block");
			                                        	}
                                                    }
													
						1.6v version 										1.7v versions 
						
						javac Test.java  								javac Test.java 
						java Test										java Test 
						o/p: Static block 								Error: main method not found in class Test. please  define  main method as
						RE:NoSuchMethodError:main                        public static void main(String args[])	
						
						
->  						
	Ex.																
													class Test {
											
														static {
																	
														System.out.println("Static block");
														System.exit(0);	
														}
													}			
																	
																	
						1.6v version 										1.7v versions 
						
						javac Test.java  								javac Test.java 
						java Test										java Test 
						o/p:Static block 								Error: main method not found in class Test. please  define  main method as
						                                                 public static void main(String args[])	
->   	
	Ex. 				
						
													class Test {
															
																		
														static {				
																		
															System.out.println("Static block");			
														}
														public static void main(String args[]) {
																		
															System.out.println("Main method "):			
														}
													}
																		
																		
																		
						1.6v version 										1.7v versions 
						
						javac Test.java  								javac Test.java 
						java Test										java Test 
						o/p: Static block								O/P: Static block
						     main Method                                     main Method 
						
						
						
-> 								
			1.6v version															  1.7v version 
																	--------------------------------- If it is not availabe			
   -----------------------------------								|	check for main()			|-------->					
   |Identification of static members |                              ---------------------------------		 |
   -----------------------------------                                    		|								 |
			  |	                                                          		|-If it is  					 |	
			  |	                                                          		|  availabe			---------------------------------------------------------------------------
	----------------------------------		                              		|					| Error:main method not found in class Test. please  define  main method as|
	|Execute static and Static 		 |                                    		|					|  public static void main(String args[])								   |
	|variable assignments   		 |                                    		|					---------------------------------------------------------------------------
	----------------------------------                                   -----------------------------------		 				
			|                                                            |Identification of static members |     
			|	                                                         -----------------------------------     
	--------------------------------- if it is not availabe              		 			 |	                           
	|	check for main()			|-------->                           				     |	                           
	---------------------------------		 |                           ----------------------------------		
			|								 |                           |Execute static and Static 	 |     
			|-If availabe 					 |	                         |variable assignments   	     |     
			|					-----------------------------             ----------------------------------     
			|					| RE: NoSuchMethodError:main|            					|
			|					-----------------------------            					|	
			|															  ----------------------------------	
			|		                                                      | Execute main() Method 		   |
	----------------------------------		                              ----------------------------------
	| Execute main() Method 		 |
	----------------------------------
	
	
	
	
Q. Without writing main() method is it possible to print some statements to the console  ?

	- Yes! by using static block but these rule is applicable until 1.6v version. But from 1.7v version onwords it is impossible to print some statements to the console
	  without Writing Main() method.