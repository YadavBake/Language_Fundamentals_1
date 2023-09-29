					
									Language Fundamentals Part-2 || Data Types part-1
			   					     ========================================================

---------------
 3. Data type.	
--------------- 

 -> In java every variable and every expression has some type.
 
 -> Each and every data type is clearly defined.
 
 -> Every assignment should be checked by compiler for type compatability.
 
 -> Because of above resions we can conclude java language is strongly typed programming language.
 
 -> Java is not considard as pure object oriented programming language because several OOP's feture are not setisfied by java (like operator overloading and multiple inheritance 
	ect.).
	
-> More over we are depending on primitive data types which are non-objects.


												
									                                                    Primitive Data Types (8)   char ch = '-a'; boolean b = -false; // invalid 
																   |
								----------------------------------------------------------------------------------
								|										 |
					              Numeric Data types				int x =10;		   Non-Numeric data Type 
								|					int x= -10				 |
				----------------------------------					double d = -10.5		----------------------------------	
				|				|				                                	|	 			 |
		Integeral Data types 			Floating-point data type 						      char			      boolean 	
				|					|
				|-byte					-----------------------
				|-short					|		      |
				|-int				      float 		   double 	
				|-long
	
-> Except boolean and char remaining data type are considard as singed data types because we can reprasent both positive and Negative numbers.


-------------------
 1. Byte Data type 
-------------------

  -> 
						|-> Most significant Bit.
	Size : 1 byte(8 bit).			|	
						MSB
	MAX_VALUE: + 127			-------------------------------------------------------------
	MIN_VALUE: -128                 	|  X   | 1   |  1  |	1   |	1   |	1  |	1  |	1   |
	Range: -126 to 127  	  	        ---|----------------------------------------------------------
						   |	 2'6   2'5    2'4     2'3    2'2     2'1      2'0	
						   | 
						signed bit 			
						 0 ->+ve				64+32+16+8+4+2+1
						 1->-ve					= 127	
				
	- The most significant bit access sign bit.

	- 0 means positive number 1 means negative number.
	
	- Positive number will be reprasent directly in the memory where as negative numbers will be reprasent in two's compliment form.
				
		
->

	byte b = 10; //valid
	byte b = 127; //valid 
	byte b = 128; //invalid CE: possible loss of precision found : int required byte.
	byte b = 10.5;//invalid CE: possible loss of precision found: double required byte.
	byte b = true; //invalid CE: incompatible type found: boolean required byte.
	byte b = "durga";//invalid CE: incompatible type found:java.lang.String required byte.
	

-> 	Byte is the best choice if we want to handle data in term of streams either from the file or from the network (file supported form or network supported form is byte).

---------------------
 2. Short Data Type 
---------------------

	-> These is the most rearly used data type in java.
	
	Size: 2 byte (16 bits).
	Range -2'15 to 2'15-1 (-32768 to 32767).
	
	
		short s = 32767;//valid
		short s = 32768; //invalid CE: PLP found int  required short. 
		short s = 10.5; //invalid CE: PLP found : double required short.
		short s = true; // invalid CE: incompatible types found: boolean required short.

 -> short data type is best suitable for 16 bit processors like 8085 but these processors are complitly out datet and hance curssponding short data type is also out datet data 
	type 
	
	
---------------------
  3. Int Data Type 	
---------------------

 -> The most commanly used data type in java is int.
 
	size 4 btyes (32 bits).
	Range -2'31 to 2'31-1 (-2,14,748,3648 to 2,14,748,3647).


		int  x  = 2,14,748,3647;//valid.
		int  x  = 2,14,748,3648; //invalid CE: integer number to large .
		int  x  = 2,14,748,3648l;//invalid CE: PLP found:long required : int .
		int  x  = true;//invalid CE: incompatible type found: boolean required:int.

	



















		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
