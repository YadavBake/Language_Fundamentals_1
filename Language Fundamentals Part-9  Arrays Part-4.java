
											Language Fundamentals Part-9 || Arrays Part-4
										     ===================================================

---------------------------------
 9. Array varialbe assignments. 
---------------------------------

 Case 1: Element pramotions are not applicable at array level for example char element can be pramoted to int type where as char[] cannot be pramoted to int[].
	
		Ex. 
		
		int[] x = {10,20,30,40};
		char [] ch = {'a','b','c','d'};
		
		
		int []  b = x; //valid

																	     char[]				int []
		int []  c = ch; // invalid CE: incompatible type found: char[] , required: int[].   		                                |			   	   |			
											                                                    	|			   	   |
													                                        [C				   [I
 -> Which of the following pramotions will be performed automatically ? 

	char--->int  //valid 
	char[]-->int[] //invalid 
	int-->double //valid 
	int[]-->double[] //invalid
	float-->int //invalid
	float[]-->int[]//invalid 
	String-->Object//valid 
	Stirng[]-->Object[]//valid 
	
	- But in the case of object type arrays child class type array can be pramoted to parent class type array.
	
		Ex. 
		
		String [] s = {"A", "B", "C"};
		 
		Object [] a = s;
		
		
  Case 2: Whenever we are assinging one array to another array internal elements won't be copy just reference variable we will be re-assinged .


		int[] a = {10.20,30,40,50,60};
		int[] b = {70,80};
		
		
		1. a = b;											------------------------------
												a------X------->| 10 | 20 | 30 | 40 | 50 |60 |
		2. b = a; 									|		------------------------------
												|				|				
												|				|
												|---------->    -----------	|
												b------X------->| 70 | 80 |	|
												   |		-----------	|
												   |-----------------------------


	Case 3: Whenever we are assinging one array to another array the dimensions must be matched for example in the one dimensional int[] array we should provide one dimensional 
		    array only. If we are trying to provide any other dimensions then we will get compile time error.
				
				Ex.
		
			int[][] a = new int[3][];
			a[0] = new int [4][3]; //CE: incompatible types found two dimensional int[][] required one dimensional int[] 
		
			a[0] = 10; // CE: incompatible type found: int require int[].
			
			a[0] = new int[2]; //valid 
			
	
	NOte: Whenever we are assinging one array to another array both dimensions and types must be matched but size are not required to match.
	
	
		Ex. 
	
		class Test {
			
				public static void main(String args[]){											
														for(int i=0; i<=3; i++);{
					for (int i = 0; i<=args.length;i++)                                    			
					{                                                                      		 System.out.println(args[i]);
						System.out.println(args[i]);                                        }
					}                                                                       
				}                                                                                       args[0]
				                                                                            		args[1]
		                                                                                    			args[2]
		                                                                                    			args[3]
		
		java Test A B C 			java Test  A B                   java Test 
		                                                                         
		A                                       A                                ArrayIndexOutOfBoundsException
		B                                       B
		C                                       ArrayIndexOutOfBoundsException
		ArrayIndexOutOfBoundsException
		
		
		
		
		
		Ex 2. 
		
		
			class Test {										        -------------
													     args--X-> | A | B | C |
				public static void main(String args[]) 						  |     ------------- 		
				{										  |
					String [] argh = {"X", "Y", "Z"};					  |	
														  |---->-------------
					args = argh ;							    argh -----> | X | Y | Z |	
															-------------	
					for (String s: args)
					{
						System.out.println(s);
					}
				}
		
		
	java Test A B C 				java Test  A B                        java Test 
		                                        X                                 
		X                                       Y                                       X
		Y                                       Z					Y	
		Z                                       					Z	
		
														----------------- ---------	
			                                                                                        | X | Y | Z | A | | X | Y |	
														----------------- ---------	
	Ex 3.													  |		    |
														  |  |---------------
													     -----------------
		int [][] a = new int [4][3];						a-------X----------->| X | Y | Z | A |		
		                                                                                |            -----------------	
		a[0] = new int[4];								|	        |   |   |    |-----------------------------
		a[1] = new int[2];								|      -------- X   X   |    |				  |
												|               |    |  |--------|			  |		
												|	------------- ------------- ------------- -------------							
												|	| X | Y | Z | | X | Y | Z | | X | Y | Z | | X | Y | Z |                 	
		a = new int [3][2];                                         			|	------------- ------------- ------------- -------------                 	
										    	        |
												|
		1. Total how many object got created  ?						|		
												|
			11.						|                       |	-------------
			                                                                |------------>  | X | Y | Z |
		2. Total how many object eligible for GC ?	                                        -------------
												     ---- |   |	   |----	
			7. 									     |        |        |
												--------- ---------  ---------
												| X | Y | | x | Y |  | X | Y |
												--------- ---------  ---------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



























  
