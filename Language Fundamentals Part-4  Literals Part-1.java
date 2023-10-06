
														Language Fundamentals Part-4 || Literals Part-1
													 ======================================================
----------
 Literals 
----------

-> Any constant value which can be assinged to the variable is called literals.

		Ex. 

		int 					x   						= 					10 ;
		 |						|												|
		 |						|												|
Data types|keywords 	Name of variable |identifier					Constant value |literals.

---------------------
 Integeral Literals
---------------------

 -> For integeral data type (byte short int long) we can specify literal value in the following ways.


	1. Decimal Literals (base-10):- Allowed digits are '0 to 9'


			int x = 10;
					|---decimal form .
	
	2. Octal form (base-8) :- allowed digits are '0 to 7' literal value should be prifixed with  0.
			
			Ex. 
	
			 int x = 010;
  
	3. Hexa_decimal form(base-16) : allowed digits are '0 to 9 , a to f ' for extra digtis (a to f) we can use both lower case and upper case charcters. These one of very 
	   few areas where java is not case sensitive.
	   
	   The literal value should be prifixed with 0x or 0X 
	
			Ex. 
						
			int x = 0X10;
			
	-> These are only possible ways to specify literal value for integeral data type.

	
	
	Q. Wich of the following declaration are valid ? 
	
		
		int x = 10;// valid.
		
		int x = 0786; // invalid CE: integer number to large.
		
		int x = 0777; // valid.
		
		int x = 0XFace; // valid.
		
		int x = 0XBeef; //valid.
		
		int x = 0XBeer;// invalid. CE: 
		
	->  Program having the  choice to specify the values either in decimal or octal or hexadecimal but JVM will always provide the value only in the decimal form.   

		class Test {
			
				public static void main (String args[]){
					
					int x = 10;
					
					int y = 010;		(10)8 = (?)10	
										0*8'0 + 1*8'1 = 8
					
					int z = 0x10;		(10)16 = (?)10
										0*16'0 + 1*16'1 = 16
										
					System.out.println(x+".."+y+"...."+z);
				}					   10	  8 	   16
		}
		
	-> By default every integeral literal is of int type but we can specify explicityl as long type by sufixed with small 'l' or capital 'L'.


	   int x  = 10;
	   
	   long l = 10L;
	   
	   int x = 10L; //invalid CE: Possible loss pricision found : long required int.
	   
	   long l = 10;
	   
	   
	
	-> There is no direct way to specify byte and short  literal explicitally but a indirectly we can specify. Whenever we are assigning integeral litteral to the byte variable 
	   and if the value within the range of byte then compiler treats it autometically as byte literal similarlly short also.
	
	
		byte b = 10;
		byte b = 127;
		byte b = 128;//invalid CE: PLP found : int required: byte.
		
		
		short s = 32767;
		short s = 32768; // invalid CE: PLP found: int required short.
	

--------------------------
 floating point literals
--------------------------

-> By default every floating point literal is of double type and hance we can't assign directly to the float variable. 

-> But we can specify floating point literal as float type by sufixed with small 'f' or capital 'F'.


	float f = 123.456; //invalid CE: PLP found : double required: float .
	float f = 123.456f;// valid 
	double d = 123.456;//valid 
	
-> We can specify explicitally floating literal as double type by sufixed with small 'd' or capital 'D" ofcourse these convetion is not required.	
	
	double d = 123.456D;//valid 
	float f = 123.456d; //invalid CE: PLP found: double required : float.


-> We can specify floating literals only in decimal form and we can't specify in octal and hexadecimal forms 


	double d 123.456; // valid 
	double d 0123.456; //valid It is decimal literal but not octal literal
	double d 0x123.456; //invalid CE: Malformed floating point literal.


conclusions

	-> We can assing  integeral literal directly to floating point variables and that integeral literal can be specified either in decimal or octal or hexadecimal form  
	
	
		double d = 0786; // invalid CE: integer number to large. 
		double d = 0xFace; //valid 
		double d = 0786.0// valid 
		double d = 0xface.0// invalid CE: Malformed floating point literal.
		double d = 10;//valid 
		double d = 0777;// ;valid 


	-> We can't assing floating literals to integeral types.

	
			double d = 10;
			int x = 10.0;//CE: PLp found: double required: int 
	
	-> We can specify floating point leteral even in exponential form (Scientific notation).
	
		double d = 1.2e3;			1.2e3
		Sop(d);						=1.2*10'3
									= 1.2*1000
									= 1200.0

	
		float f = 1.2e3;
		sop(f);//invalid CE: PLP found double required float 
		
		
		float f= 1.2e3f;
		sop(f);//valid 



--------------------- 
  Boolean Literals 
---------------------

 -> The only allowed values for boolean data type are true or false.
 
 
	boolean b = true;
	boolean b = 0; //invalid CE: incompatible types found : int required boolean 
	boolean b = True; // invalid CE: Cannot find symbol. symbol: variable True , Location Class test.
	boolean b = "true"; // invalid CE: incompatible types found : java.lang.String required: boolean.


 -> 
 
	int x = 0;
		|-----------------------------------//CE: incompatible type found : int required : boolean 
	if (x) {
		
		System.out.println("Hello");
	}
	else {
		
		System.out.println("Hi");
	}

		  |------------//CE: incompatible type found : int required : boolean 	
	while(1){
		
		System.out.println("Hello");
	}





























  















 






















	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			