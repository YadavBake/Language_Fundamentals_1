
															Language Fundamentals Part- 3 || Data Types part-2
														========================================================
-------------------
 Long Data types 
-------------------
 

	-> Sometime int may not enough to hold big values then we should go for long type.
	
		Ex. 
		
		The amount of distance travel by light in 1000 days, to hold these value int may not enough we should go for long data type.
		
		
		
			long l = 1,26000 *60*60*24*1000 miles.

	-> The number of charcters prasent in a big file may exiced int range hance a the return type of length is long but not int.
	
		long l = f.length();
		
		
	 Size = 8 byte (64 bit)
	 
	 range = -2'63 to 2-1'63 


Note: All the above data types (byte,short,int long) ment for reprasenting integeral values if we want to reprasent floating point values then we should go for floating point 
	  data types.
	  
	  
----------------------------
 Floating point Data types 
----------------------------


    ------------------------------------------------------------------------------
	|		float	 				     |							double       |
	------------------------------------------------------------------------------
	|1. If we want 1 to 5 decimal places | 2. If we want 14 to 15 decimal places |
	|   of accuresy then e should go for |    of accuresy then e should go for   |
	|   float.                           |     double.                           |
    |									 |										 |		
    |2 float follows single precision.	 |2. double follows double precision.    |
	|                                    |                                       |
	|3. Size: 4 byte.					 |3. Size: 8 byte.                       |
	|                                    |                                       |
	|4. Range: -3.4e38 to 3.4e38.		 |4. Range: - 1.7e308 to 1.7e308.        |
    ------------------------------------------------------------------------------



---------------------
 Boolean Data Type 
---------------------
 
 -> Size: NA[Virtual Machine dependent].
 
 -> Range:NA[But allowed values are true or false .

 Ex. 
 
	boolean b  = true; //valid 
	boolean b = 0; //invalid CE: incompatible types: found: int, required boolean.
	boolean b = True;//invalid CE: cannot find symbol. Symbol:variable , Location : class Test
	boolean b = "True";//invalid CE: incompatible types: found: java.lang.String, required boolean.
	
	
	
	int x = 0;
	
	   |-----------------------------------------> //CE: incompatible types: found: int, required boolean. 
	if(x) {
		
		System.out.println("Hello");
	}
	else {
		
		System.out.println("Hi");
	}
	
		   |--------------------------------> //CE: incompatible types: found: int, required boolean.
	while (1)
	{
		System.out.println("Hello");
	}
	
	
---------------------	
  char Data Type 	
---------------------

 -> Old langugaes (Like C/C++ ) are ASCII code based and the number of allowed different ASCII code charcters are <=256.
 
 -> To reprasent these 256 charcters 8 bit are enough hance a the size of char in old langugaes is 1 byte.
 
 -> But java is UNICODE based and the number of different UNICODE charcters are >256 and <=65536.
 
 -> To reprasent these many charcters 8 bits may not enough compulsory we should go for 16 bit charcters. Hance the size of char in java is 2 bytes.
 
 
	Size: 2 bytes.
	
	Range: 0 to 65535
	
----------------------------------------------	
 Summary table of Java Primitive Data types 
-----------------------------------------------

				-----------------------------------------------------------------------------------------------------------------------------------------------
				| Data types 	|		size 		|		Range 							         | Wrapper class		|			default value         |
				|---------------|-------------------|------------------------------------------------|----------------------|---------------------------------|
				|               |                   |                                                |                      |                                 |
				|1. byte        |  1 byte           | -2'7 to 2-1'7(-128 to 127)                     | Byte                 | 	0                             |
				|               |                   |                                                |                      |                                 |
				|2. short       |  2 byte           | -2'15 to 2-1'15(-32768 to 32767)               | Short                |   0                             |
				|               |                   |                                                |                      |                                 |
				|3. int         |  4 byte           | -2'31 to 2-1'31(-2147483648 to 2147483647 )    | Integer              |   0                             |
				|               |                   |                                                |                      |                                 |
				|4. long 	    |  8 byte           | -2'63 to 2-1'63                                | Long                 |   0                             |
				|               |                   |                                                |                      |                                 |
				|5. float       |  4 byte           | -3.4e38 to 3.4e38                              | Float                |   0.0                           |
				|               |                   |                                                |                      |                                 |
				|6. double      |  8 byte           |-1.7e308 to 1.7e308.                            | Double               |   0.0                           |
				|               |                   |                                                |                      |                                 |
				|7. boolean     |   NA              | NA[But allowed values are true/false.          | Boolean              |	false                         |
				|               |                   |                                                |                      |                                 |
				|8. char        |  2 byte           | 0 to 65535                                     | Charcter             | 0 [ reprasent space charcters]  |
				|				|                   |                                                |                      |                                 |
				------------------------------------------------------------------------------------------------------------------------------------------------
				
	
	NOte: 
	
		-> null is the default for object reference and we can't apply for primitives if we are trying to use for primitive then we will get compile time error.
		
			Ex.
			
				char ch = null; //CE: incompatible types found: null type required: char 


























  


















 