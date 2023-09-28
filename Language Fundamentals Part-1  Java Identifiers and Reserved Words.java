																Language Fundamentals Part-1  Java Identifiers and Reserved Words
															==========================================================================


-------------------------
 Language Fundamentals 	
------------------------- 

 1. Identifiers.
 2. Reserved word.
 3. Data type.
 4. Literals.
 5. Arrays.
 6. Types of variables.
 7. var-arg method.
 8. main method.
 9. command line arguments.
10. Java conding Standard.

-----------------
 1. Identifiers 
-----------------

 -> A name in java program is called identifiers, Which can be used for identification purpose it can be method name or variable name class name or lable name .
 
 Ex. 
			1
	class Test {
							2	  3     4
		public static void main(String args[]){
				5									
			int x =10;	
			   
		}
	}
	
	
-------------------------------------
Rule's for defining java identifiers
-------------------------------------	

 -> The only allowed charcaters in java identifiers are 'a to z', 'A to Z', '0 to 9", $,_ if we are using any other charcaters we will get compile time error.
 
	Ex. 
	
		total_number // valid 
		
		total# //invalid
		

-> Identifiers can not start with digits.

	Ex. 
		
		total123 // valid

		123total //invalid
		
		
-> 	Java identifiers are case sensitive ofcourse java language it's self is treated as case-sensitive programming language.  	
		
	class Test {
		
		int number = 10;|
		int Number = 20;|==> we can differentiate with case 
		int NUMBER = 30;|
	}
		
		
->  There is no length limit for java identifiers but  it is not recomanded to take to lengthy identifiers.

		
		class Test {

				public static void main(String args[]) {
					
					int xxxxxxxxxxxxxxxxxxxyyyyyyyyyyyyyyyyyyyyyzzzzzzzzzzzzzzzzzz = 10;
					System.out.println(xxxxxxxxxxxxxxxxxxxyyyyyyyyyyyyyyyyyyyyyzzzzzzzzzzzzzzzzzz);
				}
		} // valid 
		
		
->  We can't use reserved words as identifiers.

		Ex.

			int x = 10; // valid 
			
			int if = 20; // invalid 
			    |-> reserved word  
		
 -> All pre-defined java class name and interface names we can use as identifiers.

   Ex. 
   
   
	class Test {
		
			public static void main(String args[]){
				
				int String = 888;			  |  int Runable = 999l
											  |  
				System.out.println(String);   |  System.out.println(Runnable);
			}
	}
				
	- Even though it is valid but it is not a good programming practice because it reduces readability and creates confusion.			
	
-> Which of the following are valid java identifiers ?

		
	 total_number //valid 
	 total# //invalid
	 123total //invalid
	 total123 //valid 
	 ca$h //valid
	 _$_$_$_$_//valid 
	 all@hands//invalid 
	 Java2Share //valid 
	 Integer //valid 
	 Int//valid 
	 int //invalid 


---------------------
 2. Reserved word.
----------------------


-> In java some words are reserved to represent some meaning or funcationalty such type of words are called reserved words.

->					

											Reserved word (53).	
													|
					----------------------------------------------------------------------------								
					|																		   |		
			    Keywords(50)															 Reserved Literals (3)
					|																			|
		------------------------------															|-true
		|					         |															|-false 
 Used Keywords(48)			  unused Keywords(2)												|-null
	  |-if							|
	  |-else						|-goto
	  |-switch						|
	  .								|-const
	  .
	  .	

------------------------------
 Key words for Data Typs (8)
------------------------------

 -> byte, short,int,long, float,double,boolean,char .

---------------------------------- 
  Key words for flow control (11)
----------------------------------

-> if, else,switch,case,default,while,do,for,break,continue,return.

-------------------------------
  Key words for modifiers (11)
-------------------------------  

 -> public, private,protected,static,final,abstract,synchronized,native,strictfp(1.2v), transient,volatile.

-------------------------------------- 
  Key word for exception handling(5)
--------------------------------------- 

 ->try,catch,finally,throw,throws,assert(1.4).

------------------------------
 class Related key words (6)
-------------------------------

 -> class, interface, extends,implements,package,import.
 
---------------------------------- 
  Object related key words (4)
----------------------------------

 -> new, instanceof,super,this.  
 
 --------------------------------
   Void return type keywords
---------------------------------   
 
  -> In java return type is mandatory if a method won't return anything then we have to declared that method with void return type.
  
	-> void.
 -> But in C language return type is optional and default return type is int.
 
 
---------------------- 
 Unused keywords (2)
--------------------- 

 -> goto:- uses of goto created several problems in old languages and hance a sun people baned these keywords in java.
 
 -> const:- use final insteated of const.
 
 Note: goto and const are unused keywords and if we are trying to use we will get compile time error.
 
 
---------------------- 
  Reserved Litrals 
----------------------

 -> true, false :- values for boolean data type.

 -> null:- default for object reference.
 
 
----------------------- 
  Enum Keyword (1.5v)
-----------------------

 -> enum:- we can use enum to define a group of named constants.

	Ex. 
	
		enum month{						enum Beer {
			                            	
			JAN,FEB,MARCh...            	KF,KO,LP...
			                            	
		}                               }
		

----------------
  Conclusions 	
----------------
	
 -> All 53 reserved words in java containes only lower case alphabet symbols.
 
 -> In java we jave only new keywords and there is no delete keywords because distraction of useless object is a responsibility of garbege collector(GC).
 
 -> The following are new keywords in java strictfp(1.2v), assert(1.4v),enum(1.5v).
 
 




































	
		
		
		
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	 
	
				
				
				
































 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

























