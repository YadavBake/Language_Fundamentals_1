
											Language Fundamentals Part-6 || Arrays Part-1
										      ===================================================
														
---------------
  Array's		
---------------

 1. Introduction.
 2. Array Declaration.
 3. Array creation.
 4. Array Initialization.
 5. Array Declaration, creation And Initialization in a single Line.
 6. length vs length().
 7. Anonymous array.
 8. Array elements assignments.
 9. Array varialbe assignments. 

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

 1. Introduction 
==================

 -> An array is an indexed collection of fixed number of homogeneous  data elements.
 
 -> The main advantage array is we can reprasent huge number of values by using single variable so that readability of the code will be improved.
 
 -> But the main disadvantge of arrays is fixed in size that is once we creates an array there is no chance of increasing or decreasing the size based in requirement. Hance a 
	to use arrays concept compulsory we should now the size in advanced, which may not possible always.
	
=========================	
  2. Array Declaration	
=========================


 1. One dimensional Array declaration.
----------------------------------------

   int[]	x //-> These one is recomanded becouse name is clearly seperated from type.
 
   int   []x
 
   int   x[]

-> At the time of declaration we can't specify the size otherwise we will get compile time error 

	*Ex. 
	
	int[6] 	x; // invalid CE:  

	int[] 	x ; //valid 


 2. Two Dimensional array declaration
--------------------------------------

 -> Below array declaration are valid.	

	int[][] 	x;
	int 	[][]x;
	int 	x[][];
	int[] 	[]x;
	int[]	x[];
	int		[]x[];
	
	
-> Which of the following are valid ?

		int[]	a,b; //valid a->1, b->2
		int[]	a[],b;// valid a->2, b->1
		int[]   a[],b[];//valid a->2, b->2
		int[]	[]a,b; //valid a->2, b->2 
		int[]	[]a,b[];//valid a->2 b->3.
		
		int[]   []a,[]b; // invalid CE: 
		
		- If we wan't to specify dimension before the variable that faciality is applicable only for first variable in a declaration.
		
		- If we are trying to apply for next remaining variables we will get compile time error.


-> 
			int[]	[]a, []b,c[];
					---  -------
					v	  invalid


  3. Three Dimensional Array Declaration 
------------------------------------------

	-> Below declaration of three dimensional arrays are valid.

		int[][][] 	a;
		int 		[][][]a;
		int 		a[][][];
		int[] 		[][]a;
		int[]		a[][];
		int[]		[]a[];
		int[][]		[]a;
		int[][]		a[];
		int 		[][]a[];
		int			[]a[][];


----------------------------	
	3. Array Creations  
----------------------------


	-> Evey array in java is an object only hance a we can create arrays by using 'new' operator.
	
		Ex. 
		
			int[] a = new int[3];
										       ---------------------	
										a---> |    |	  |	  |
										      ---------------------

										System.out.println(a.getclass().getName()); [I			


	-> For every array type Correspoding are available and these classes are part of java language and not available to the programmer level.
		
		Ex. 

		int[] a = new int[3];
		System.out.println(a.getclass().getName()); [I


			--------------------------------------------------------	
			|	Array Type 	    | Correspoding class Name |
			--------------------------------------------------------	
			|	                    |                          |
			|	int[]		    |		[I             |
			|	int[][]		    |		[[I            |
			|	double[]	    |		[D             |
			|	short[]		    |		[S             |
			|	byte[]		    |		[B             |
			|	boolean[]	    |		[Z             |
			--------------------------------------------------------



   Loop Holls related to Array's 
-----------------------------------	
	
	1. At the time of array creation compulsory we should specify the size otherwise we will get compile time error.


		int[] = new int[];// invalid 
		int[] = new int[6]; //valid  
		
		
	2. It is ligal to have an array with size '0' in java.


		int[] x = new int[0]; //valid 
		
		
	3. If we are trying to specify array with some negative int value then we will get Runtime Exception saying NegativeArraySizeException.


		int[] x = new[-3];//invalid RE: NegativeArraySizeException 
		
		
		
	4. To specify array size the allowed data types are byte,short, char,int. If we are trying to specify any other type then we will get compile time error.

		Ex. 
		
		int[] x = new int[10];//valid 							    ----------------------------------------------------------------------------			
		int [] x = new int['a'];//valid 97                                                  |	                    			       |	                |	
		byte b =20;                                                                         |			byte---->short---	       |	                |
		int[] x = new int[b]; //valid                                                       |			 1b	  2b     |             |                        |
		                                                                                    |					 |             |                        |
		short s = 30;                                                                       |					 |             |                        |
		int[] x = new int[s]; //valid                                                       |					 |             |		        |
		                                                                                    |					 |--->   |     |    		        |
		int[] x = new int[10l];//invalid CE: PLP found: long, required int.                 |				   |------------>|->int-|->long-->double-->float|
		                                                                                    |			char---|		4b     |   8b  	    4b	     8b |
		                                                                                    |			 2b                            |                        |
		                                                                                    |			                               |                        |
		                                                                                    -----------------------------------------------------------------------------
		                                                                                    			Integeral 				float-point 
	 	
	 	
	5. The maximum allowed array in java is '2147483647' which the maximum value of int data type.


		int[] x = new int[2147483647];//valid
		int[] x = new int[2147483648];//invalid CE: integer number to large 
		
	 - Even in the first case we may get runtime exception if suficiant heap memory not avaiable.

	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		























































		






















  

