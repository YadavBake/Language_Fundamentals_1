
														Language Fundamentals Part-7 || Arrays part-2
													===================================================
					
----------------------------------					
 Two Dimensionnal Array Creations 
----------------------------------

 -> In the java two Dimensionnal array not implemented by using matrix style. sun people followed Array of Arrays approach for multi-dimensional array creation.

 -> The main advantage of these approach is memory utilization will be improved.  


	-----------------------------
	| 10  | 12|	07 |  09  |  15 |		
	|-----|---|----|------|-----|	
	| 28  | 67|    |      |     |	
	|-----|---|----|------|-----|	Matrix Reprasentation
	| 80  |   |    |      |     |	
	|-----|---|----|------|-----|	
	| 40  | 50|    | 28   |     |	
	-----------------------------	
	
	
	  Array of Array's 
	---------------------------------
S->	|		|		|		|		|-------------------------
	---------------------------------						 |
	   |		 |		 |------------------		-----------------	
	   |		 |----------			   |		|	 |	  |		|
------------------	       |			--------	-----------------
|	 |	 |	 |	 |	       |			|	   |
------------------   ---------			--------
					 |	 |	 |
					 ---------
					 
					 
 Ex.1	
		

 int [][] x = new int[2][];									---------------------
 x[0] = new int[2];											|		 |			|<--------x
 x[1] = new int [3]; 										---------------------
																|			|
																|			|
														--------------	 ------------------------	
													   |	 |		 |	 |		|		|		|
													   ---------------	 ------------------------
														 x(0)					x(1)
					 
																	
  Ex.2                                                              
                                                                    
                                                                    									
		int [][][] x = new [2][][];									                                    		---------------------								
		x[0] = new int[3][];                                                                            		|		 |			|<--------x
		x[0][0] = new int[1];                                       											---------------------	
		x[0][1] = new int[2];                                                                           			|			|
		x[0][2] = new int[3];                                                                           	x(0)	|			|  x(1)
		x[1] = new int[2][2];                                                                           	--------------	 ----------------
					                                                                                       |  |	   |	 |	 |		|		|---------------
							                                                                               ---------------	 ----------------              |
					                                                    ------------------------------------|	|	 |				|				----------------	
		                                                            	|										|    |-----  ----------------       |		|		|
							                                        ---------						---------------- 	  |  |		|		|       ----------------
                                                                    |		|                       |		|		|     |  ----------------
                                                                    ---------                       ----------------      |
                                                                    													  |	
                                                                    										-------------------------
                                                                                                            |		|		|       |
                            						   	                                                    -------------------------
							
	-> Which of the following array declration are valid ?

		int[] a = new int[]; //invalid At list based size we have specified 
		int[] a = new int[3]; //valid 
		int[][] a = new int[][];//invalid At list based size we have specified  
		int[][] a = new int[3][];//valid 
		int[][] a = new int[][4]; // invalid without specifing base we can't specify next level.
		int[][] a = new int[3][4]; //valid 
		int[][][] a = new int[3][4][5]; //valid 
		int[][][] a = new int[3][4][];//valid 
		int[][][] a = new int[3][][5];//invalid without specifing second dimension we can't specified third dimension.
		int[][][] a = new int[][4][5]; //invalid without specifing first dimension we can't specified second and  third dimension.
		
		
                            
----------------------------    
 4. Array Initialization 	
----------------------------

 -> whenever we are trying to print any reference variable internally toString() method will be called and how the toString() method will be implemented just to return class name 
    @#.

 ->  Once we creates an array every element by default initialized with default values.
	

	int[] x = int[3];
	Sop(x); //[I@3e25b5					-------------------------
	Sop(x[0]);//0				X------>|		|		|       |
                                        -------------------------
                            
 -> Whenever we are trying to print any reference variable internally toString() method will be called. Which is implemented by default to return the string in the following 
	form.	
	
	- className@hashCode_in_Hexadecimalform
					 
					 
					 
					 
					 
		int[][] x = new int[2][3];					
		Sop(x); //[[I@3e25b5                        	---------------------
		Sop(x[0]);//[I@3e25bs                       	|		 |			|<--------x
		Sop(x[0][0]); //0                           	---------------------
					                                		|			|
					                                		|			|
					                                --------------	 ------------------------
					                                | 0	 |	0|	0 |	 |	0	|	0	|	0	|
					                                ---------------  ------------------------
					                                 x(0)					x(1)
					                                
					                                			
	-> Ex.3				 
					 
					 
		int[][] x = new int[2][];				 	---------------------
		Sop(x); //[[I@3e25b5       			 x------|	null |	null	|>
		Sop(x[0]);// null	     			        ---------------------
		Sop(x[0][0]); // RE: NullPointerException       			 
					               			 
					 
	Note: IF we are trying to perform any operation on null then we will get runtime exception saying NullPointerException.

	
	-> Once we creates an array every array element by default initialized with default values. If we are not setisfied with default values then we can override these values 
		with our customized values.
					 
	
	-> 
	
		int[] x = new int[6];			 
		
			x[0] = 10;							 ------------------------------------------------
			x[1] = 20;					x------->|	0	|	0	|	0	|	0	|	0	|	0	| ==> With default values 
			x[2] = 30;                           ------------------------------------------------ 
			x[3] = 40;
			x[4] = 50;							 ------------------------------------------------
			x[5] = 60;                  x------->|	10	|	20	|	30	|	40	|	50	|	60	| ==> With Customized values 
					                             ------------------------------------------------ 
					 
					 
			x[6] = 70; //invalid RE: ArrayIndexOutOfBoundsException.
			x[-6]= 80; //invalid RE: ArrayIndexOutOfBoundsException.	
			x[2.5]=90; //invalid CE: PLP found double required int.		 
					 
					 
	Note: If we are trying to access array element with out of range index (Either positive or negative int value) then we will get runtime exception saying 
		  ArrayIndexOutOfBoundsException.
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 