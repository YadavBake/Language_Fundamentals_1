
											Language Fundamentals Part-5 || Literals part-2
										      =====================================================	
														
----------------- 
 char Literals  
-----------------

 1> We can specify char literal as single charcter within single quates.
 
	Ex. 
	
	
	char ch = 'a';// valid 
	
	char ch = a;//invalid CE: cannot find symbol. Symbol: variale a , Location : class Test.
	
	char ch ="a";//invalid CE: incompatible types found: java.lang.String. required : char.
	
	char ch a ='ab'; //invalid CE1: unclosed char literal, CE2: unclosed char literal, CE3: not a statement.
	
2> We can specify char literal as integeral literal which reprasents unicode value of the charcter and that integeral can be specified either in decimal or octal or hexadecimal 
   forms. But allowed range is o to 65535.
   
   Ex.
	
	char ch = 97;
	Sopln(ch); //a 
	
	char ch = 0xface; // valid
	char ch = 0777;//valid 
	char ch = 65535;//valid 
	char ch = 65536;//invalid CE: PLP found: int , required char 
	
	
	www.unicode.org to check char literal.

 3> We can reprasents char literal in unicode reprasentation which is nothhing but '\uXXXX'
                                                                                      -----
	                                                                                    |----> 4-digit hexadecimal number 
	Ex. 
			 
	char ch ='\u0061        16|97
	sopln(ch);//a             ----
                              |6-1
													
												    
4> Every escap charcter is a valid char literal. 

	Ex. 
		char ch = '\n';
		char ch = '\t';
		char ch = '\m';//invalid CE: illegal escap charcter
													
						
											------------------------------------------ 
											|  Escap charcter 	|  Description    |
											------------------------------------------
											|1. 	\n 	    |	new line.        |
											|                   |                    |
											|2.  \t		    |	Horizontal tab.  |
											|                   |                    |
											|3.  \r 	    |	Carriage return. |
											|                   |                    |
											|4.  \b 	    |	Back space.      |
											|                   |                    |
											|5.  \f 	    |	form feed.       |
											|                   |                    |
											|6.  \'		    |	single quate.    |
											|                   |                    |
											|7.  \"		    |	double quate.    |
											|                   |                    |
											|8.  \\		    |	Blacl slash.     |
											|		    |			 |
											------------------------------------------	
									
									
 -> Which of the following are valid ?
 
 
	char ch = 65536; //invalid 
	char ch = 0xbeer;//invalid 
	char ch = \uface;//invalid 
	char ch = '\ubeef';//valid 
	char ch = '\m';//invalid
	char ch = '\iface'; //invalid 
											
									
-------------------
 String Literals
-------------------

 -> Any squence of charcters within double quates is treated as string literal.

	Ex. 
	
		Stirng s = "durga";
		
-> 1.7v version Inhancement with respect to literals.

	
	1. Binary Literals
   --------------------
   
    -> For integeral data type until 1.6v version we can specify literal value in the following ways.
	
		1. Decimal 
		2. Octal 
		3. Hexadecimal form 
		
		- But 1.7v version onwords we can specify literal value even in binary form also.
		
		- allowed digits are 0 and 1.
		
		- literal value should be prifixed with 0b or 0B.
		
		Ex. 
		
			int x = 0B1111;
			Sop(x); //15


    2 Uses of underscore symbol in numric literals.
	
	   - From 1.7v version onwords we can use underscore symbol between digits of numeric literal
	   
		Ex. 
	
	
		double d = 123456.789; //1
		
				||
		double d = 1_23_456.789;

		double d = 123_456.789;

		- The main advantage of these approach is readability of the code will be improved.
		
		- At the time of comoilation these underscore symbols will be removed automatically hance a after compilation the above lines will become 
		
			double d = 123456.789; .
		

    -> We can use more thant one underscore symbol also between the digits.
	
	
		double d = 1__23_4_5__6.7_8_9;
		double d = 1___2__3_4_5_6.7_8_9;
		
	-> We can use underscore symbol only between the digits if we are using any where else we will get compile time error.

		Ex.

		double d = _1_23_456.789;	 |
		double d = 1_2_3_456_.7_8_9; |==> //invalid  
		double d = 1_23_456_7_8_9_;  |
		
----------------------------------------------------------------------------------
|						               |                  |	
|			byte---->short---|                     |                  | 
|			 1b       2b     |                     |                  |
|					 |                     |                  |
|					 |                     |                  |
|					 |                     |                  |
|					 |--->|  |             | 		  |		
|				   |------------>|->int-->long-|->double-->float  |
|			char---|		     4b	    8b |    4b	    8b    |
|			 2b                                    |                  |
|			                                       |                  |
-----------------------------------------------------------------------------------
			Integeral 				   float-point 


Note: 8 byte long we can assing to 4 byte float variable because both are following different memory reprasentation internally.


		flaot f = 10l;
		Sop(f); //10.0
		
		
















									
									
