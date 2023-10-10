
											Language Fundamentals Part-8 || Arrays Part-3
										    ======================================================

-------------------------------------------------------------------------
   5. Array Declaration, creation and Initialization in a Single Line.
-------------------------------------------------------------------------

 -> We can declare,create and initialize an array in a single line. (Shortcut reprasentation).
 
  -----------------------------------
  |	int [] x; // Declaration        |
  |	x = new int[3]; //creation      |
  |	                                |
  |	x[0] = 10;   |                  | ==> int[] x = {10,20,30};
  |	x[1] = 20;  |=>//initialization |     char[] ch ={'a','e','i','o',};	
  |	x[2] = 30;  |                   |     String[] s ={"A", "AA","AAA"};
  |	                                |
  -----------------------------------	
  
  
  -> We can extend or use these shortcut for multi dimensional arrays also.
  
	Ex. 1
	
	int[][] x = { {10,20}, {30,40,50}};				
													--------------------
												x------>|        |	   |	
													--------------------
													|		  |
													|		  |	
											---------------------  --------------------------------				
											|  10	  | 20	   |  |  30	  |  40	|    50	     |
											---------------------  --------------------------------	
	
Ex. 2 	
											
	int[][][]	x = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};

	Sop(x[0][1][2]); //60																						
	Sop(x[1][0][1]); //80											--------------------	
	Sop(x[2][0][0]); //ArrayIndexOutOfBoundsException                                       	x------>|        |	   |	
	Sop(x[1][2][0]); //ArrayIndexOutOfBoundsException                                       		--------------------
	Sop(x[1][1][1]); //100                                                                  	        |		  |
	Sop(x[2][1][0]); //ArrayIndexOutOfBoundsException                                       		|		  |	
                                                                                            ---------------------       ----------------------
                                                                                            |       |	 	|       |    	  |  	    |
                                                                                            ---------------------	---------------------
											       |       ----|           |           |
											       |       |               |           |
										 |-------------|       |	       |           |
									-------------------   ---------------------  ------------- -------------------  											
									|  10	| 20 |  30 |   | 40| 50	 |  60 |     |  70 | 80 |  |  90| 100 | 110  |									
									-------------------   ---------------------  ------------- -------------------										
 
 
 -> If we want to use these shortcut compulsory we should perform all acticities in a single line. If we are trying divide into mutiple line then we will get compile time error.																													
	
	Ex.
	
	int x = 10; = int x ;		int [] x = { 10,20,30}; = int[] x;
				x= 10;								  x = {10,20,30}; // invalid CE: Illegal Start of expression.	
				//valid 																			
																							
																							
																							
------------------------																							
 6. length vs length()																							
------------------------
   
   -------- 
    length
   --------
   
 -> length is final variable applicable for arrays.
 
 -> length variable reprasente the size of the array.
 
	Ex. 
	
	int [] x new int [6];
	Sopln(x.length()); //CE: Cannot find symbol. Symbol: Method length(), Location: class int[] type.
	Sopln(x.length); //6

------------	
  length() 
------------

	-> length() method is a final method applicable for String objects.

	-> length() method returns number of charcters prasent in the string.
	
	Ex.
	
	 String s = "durga";
	 Sopln(s.length);//CE: Cannot find symbol. Symbol: variable length, Location: class java.lang.String.
	 Sopln(s.length());//5

						
																							
Note: 

    length variable applicable for arrays but not for string objects whereas length() method applicable for String objects but not for arrays.																									


   Stirng [] s = { "A", "AA","AAA"};

	1. Sop(s.length); // 3
	2. Sop(s.length()); //invalid CE:Cannot find symbol. Symbol: Method length(), Location: class String[] . 
	3. Sop(s[0].length); //invalid CE: Cannot find symbol. Symbol: variable length, Location: class java.lang.String.																					
	4. Sop(s[0].length()); //1																						
								

-> In Multi dimensional array length variable reprasente only base size but not total size.
	
	Ex. 
									  ----------------------------------------------------------
   int [][] x = new int [6][3];					x------->|  10	  |  20     |  30    | 40   |    50    |  60	  |==> //base size is 6 
   sop(x.length);                                                         ----------------------------------------------------------
				 			     |------------|	   |	      |		|	 |-----     |-------------------
					|--------------------|    |-----------------       |--|		|             |                         |
				-------------------   -------------------   -------------------  ------------------- ------------------- ------------------- 					   
				|  10	| 20 |  30 |  |  10 | 20 |  30 |    |  10| 20 |  30 | |  10	| 20 |  30 | |  10| 20 |  30 | |  10	| 20 |  30 |
				------------------- 	------------------- -------------------  ------------------- ------------------- ------------------- 												
																							
																							
  -> There is no direct way to  find  total length of multi dimensional but indirectlly we can find as follows.

	x[0].length + x[1].length +x[2].length +x[3].length +....
																							
												
-------------------------------------
  7. Anonymous array.												
-------------------------------------																							
																							
	-> Some times we can declare an array without name such type of name less arrays are called Anonymous arrays.

	-> The main purpose of Anonymous array is just for instance use (one time uses).
																							
	-> We can create Anonymous array as follow "new int[]{10,20,30,40};".
	
	-> While creating Anonymous arrays we can't specify the size otherwise we will get compile time error.
	
		Ex. 
		
		new int[3]{10,20,30};//invalid 
		new int[]{10.20,30};//valid
		
	-> We can create multi dimensional Anonymous arrays also " Ex. new int [][] {{10,20},{30,40,50}}".
	
																							
		Class Test {																					
																							
			public static void main(String []args){		|																		
									|		-> Based on our requirment we can give the name for Anonymous array then it is no longer Anonymous.							
					sum(new int[] {10,20,30,40};	|																	
									|			Ex. 							
									|									
			}						|			 new int [] {10,20,30};							
			public static void sum(int[] x){	        |																		
									|       	int [] x = new int [] {10,20,30};
			int total = 0;                                  |
			                                                |
			 for (int x1:x){                                |
				 total = total+x1;                      |
			 }                                              |
			 System.out.println("The sum of :"+ total);     |
			}
		}
		
		
	-> In the above example just to call sum() method we required an array but after compliting sum() method call we are not using anymore hance for these one time requirment 
	   Anonymous array is the best choice.


 ------------------------------------
	8. Array elements assignments.
 -------------------------------------

																		
   Case 1: 	In the case of primitive arrays as array elements we can provide any type which can be eplicitly promoted to declared type. 															
																		
		Ex. 1 
		
			int[] x = new int[5];
			x[0] =10;
			x[1] ='a';							byte->short--
											             |			
			byte b = 20;                                                        	   |---->|==>int-->long-->float-->double
			 x[2]=b;                                                            char---|
			 
			 short s = 30;
			 x[3] = s;
			 x[4] = 10l; //invalid CE: PLP found: long required: int.
			 
			
		Ex. 2 In the case of float type arrays the allowed data type are (byte,short,char,int,long,float).
	



  Case 2: In the case of Object type arrays as array elements we can provide either declared type object or it's child class object. 
		
		Ex. 1 
	
		Object[] a = new Object[10];
		a[0] = new  Object(); //valid 
		a[1] = new String("durga");//valid 
		a[2] = new Integer(10);//valid 

										      Number 
	  Ex. 2										|											
								--------------------------------------------------			
		Number [] n = new Number[10];			|       |	 |    	    |	     |		|		
		n[0] = new Integer(10);//valid 		       Byte    Short   Integer 	   Long    Float      Double
		n[1] = new Double(10.5);//valid
		n[2] = new String("durga");//invalid CE: incompatible type found: java.lang.String, required: java.lang.Number.
	
	
	
	
  Case 3: For interface type arrays as array elements it implementation class object are allowed. 

			Ex. 
																																				Runnable[I]
			Runnable [] r = new Runnable[10]; 																										|	
			r[0] = new Thread(); //valid 																											|
			r[1] = new String("Durga");// invalid CE: incompatible type found: java.lang.String, required: java.lang.Runnable					  Thread 	
	
	
		------------------------------------------------------------------------------------------------
		|	Array Type 			|	  Allowed elements Types 		      |	
		-------------------------------------------------------------------------------------------------
		|                                       |                                                      |
		|1. Primitive Arrays.			|   1. we can provide any type which can be implicitly |
		|					|      promoted to declared type.                      |
		|                               	|                                                      |
		|2. Object type Arrays 			|  2. Either declared or it's child class objects are  |
		|					|     allowed.                                         |
		|					|		                                       |
		|3. Abstract type class			|  3. It childs class object are allowed.	       |
		|   arrays.                     	|                                                      |
		|                              		|       					       |
		| 4. Interface type Arrays 		|  4. It's implementation class object are allowed.    |
		|                               	|                                                      |
		------------------------------------------------------------------------------------------------

  



































 
	
	
	
	
	
	
	
	
