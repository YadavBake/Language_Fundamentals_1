
												Language Fundamentals Part-11 || Types of Variables :part-2
										   	    ==================================================================	
														
=====================														
   Local variable 
=====================

 1. Some times to  meet temporary requirements of the programmer we can declared variables inside a method or block or constructor. Such type of variables are called local 
	variables or temporary variables or stack variables or Automatic variables.

 2. Local variables will be stored inside stack memory.
 
 
	m1() {					static {				Test () {					for(int i = 0; i<=10;i++){
		                    	                    	
	int x = 10;         	                   int  x = 10;        				int  x = 10;						System.out.println(i);
																				
	}                                    }                                              }								}
	
	
	
	
	
  3. Local variables will be created while executing the block in which we declared it. 

  4. Once a block execution is complites automatically local variable will be distroyed. Hance a the scope of local variable is the block in which we declared it.

	Ex. 
	
		class Test {
			
				public static void main(String args[]) {
					
					int i = 0;
					
					for(int j = 0; j<3 ; j++){
						
						i= i+j;
					}
					System.out.println(i+"..."+j); //CE: Cannot find symbol, Symbol: variable j , Location: class Test.
				}
		}
	
	
		class Test {
			
			public static void main(String args[])
			{
				
				try {
					int j = Integer.parseInt("ten");
				}
				catch(NumberFormatException e ) {
					
					j = 10; ////CE: Cannot find symbol, Symbol: variable j , Location: class Test.
				}
				System.out.println(j); ////CE: Cannot find symbol, Symbol: variable j , Location: class Test.
			}
		}
	
  5. For local variables JVM won't provide defualt values compulsory we shoould performe initialization explicitly. Before using that variable that is if we are not using then
	 it is not required to performe initialization

   Ex. 
  
  
							class Test {										class Test {
																					
								public static void main(String args[]) {        	public static void main(String args[]) {
																						
									int x ;                                     		int x ;
									System.out.println("Hello");                		System.out.println(x);
								}                                               	}
							} //valid o/p: hello                                } //invalid CE: variable might not have been
													     // initialized.
							
							
	
  
	Ex.

	class Test {									      class Test {														
		                                                                        	
		public static void main(String args[]) {                                	public static void main(String args[]) {
			                                                                    		
			int x ;                                                             		int x ;
			if(args.length > 0){                                                		if(args.length > 0){						java Test  A B 
																					 o/p : 10
				x = 10;                                                         			x = 10;
			}                                                                   		} else 								java Test
			System.out.println(x);                                              		{								 o/p; 20
		}                                                                       			x =20;
    } //invalid CE: variable  x might not have been                             		}
      // initialized.                                                           		System.out.println(x);
                                                                                	}
	                                                                            } 
    Note: 

		1. It is not recomanded to performe initialization for local variables inside logical blocks because there is no guarantee for the execution of these block always at
		   runtime.
		   
		2. It is highly recomanded to performe initialization for local variables at the time of declaration at list with default values.

  6. The only applicable modifire for local variables is final. By mistake if we are trying to apply any other modifire then we will get compile time error.

	Ex. 
		
	class Test {																class Test {
		                                                                        	
		int x = 10; // public private default protected                         	public static void main(String ags[]){
		                                                                        		
		static int y = 20; // public private default protected                  		public int x = 10; |
		                                                                        		private int x = 10;|
		public static void main(String args[]){                                 		protected x = 10;  | 
			                                                                    		static x = 10;     | ==> //illegal start of expression
			int z = 30; // final                                                		transient x = 10;  |
		}                                                                       		volatile x = 10;   |
	}                                                                           		
                                                                                		final int x = 10; // valid 
                                                                                	}
                                                                                }
	
  NOte: 

	- If we are not declaring with any modifire then by default it is default but these rule is applicable only for instnace and static variables but not for local variables.
	
	Ex. 
 
	class Test {
		
		int x = 10;
		static int y = 20;
		
		public static void main(String args[]) {
			
			int z = 30;
		}
	}
	
	
 Summary conclusions 

	1. For instnace and static variables JVM will  provide default values and we are not required to performe initialization explicitly. But for local variables JVM won't provide 
	   default values compulsory we should performe initialization explicitly before using that variable.
	   
	   
	2. Instance and static variables can be accessed by mutliple thread simultaneously and hance a these are not thread safe. But in the case of local variables for every thread 
	   separet copy will be created and hance a local variable are thread safe.
	
	
	
		Type of variable 					It Thread safe  ?
		
		Instance variable						No 
		
		static variable							No
		
		local variable							Yes 
	
	
	3.  Every variable in java should be either instance or static or local.
	
	4.  Every variable in java should be either primitive or reference. Hance various possible combinations of variable in java are :
	
	
		instance - primitive , instance - reference.
		
		static - primitive , static - reference.
		
		local -primitive , local -reference.

		Ex. 
	
		class Test {
																						 
			int x = 10; // instance and primitive 
			static String s = "durga"; // static and reference 
																						
			public static void main( String args[]) {
				
				int [] y = new int[3]; // local and reference
			}
		}
	
	5. Uninitialized Arrays
	-----------------------
	
	 - 
	 
	 
	 
		class Test {									I  instance level
			                                                                        ---------------------
			int [] x ;                                                                  
			                                                                            	1. int [] x ; 
			public static void main(String args[]){                                     	
				                                                                      	Sysmte.out.println(obj.x); //null
				Test t = new Test();                                                  	Sysmte.out.println(obj.x[0]); //RE: NullPointerException
				                                                                        		
				System.out.println(t.x); // null                                        
				System.out.println(t.x[0]); // RE: NullPointerException               2. int [] x = new int[3];
			}                                                                           
		}                                                                               		System.out.println(obj.x); [I3e@24
		                                                                                		System.out.println(obj.x[0]);// 0
		                                                                                		
	 
    II static level							 			III Local level 
------------------------                                               			      ------------------
                                                                        
	1. static int [] x ;                                                			1.  int [] x ; 
	                                                                    	
	                                                                    	
		System.out.println(x); //null                                   		System.out.println(x); //CE: variable x might not have been initialized
		System.out.println(x[0]); // RE: NullPointerException           		System.out.println(x[0]); // CE: variable x might not have been initialized
		                                                                    	
	                                                                         
	                                                                    	
	2. static int [] x = new int[3];                                    			2. int [] x = new int[3];
	                                                                    	
		System.out.println(x);// [I3e@24                                    			System.out.println(x);// [I@3es35
	    System.out.println(x[0]); // 0                                          			System.out.println(x[0]); // 0 
	                                                                    		
	                                                                    			Note: Once we creates an array every array element by default initialized with default values
	                                                                    		  	     Erespective of whether it is instance or static or local array.


















    
    








  
	
	
	
	
	
	
