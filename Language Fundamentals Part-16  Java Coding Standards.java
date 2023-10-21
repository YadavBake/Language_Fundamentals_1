
																Language Fundamentals Part-16 || Java Coding Standards
															============================================================


-----------------------------
	java Conding Standards 															
-----------------------------

 -> Whenever we are writing java code it is highly recommanded to follow coding standards.
 
 -> Whenever we are writing any component it's name should reflect the purpose of that component(funcationality).
 
 -> The main advantage of these approach is readability and maintainbility of the code will be improved.
 
		Ex. 
 
 
						class Test {												package  com.durgasoft.scjp;
																					
							public int m1(int x, int y ) {                          public class Calculator {
																						
								return x+y;                                         	public static int add(int number_1 , int number_2){
							}                                                       		
						}                                                           		return number_1 + number_2;
																							}
																					}
																					
							Ammerpet coding standard 								Hi-tech city or industry level coding standard.
	
	

------------------------------------
	Coding standard for Classes 
------------------------------------

 -> Useally class names are nouns.
 
 -> Should starts with Upper case charcter and if it containes multiple words every inner word should starts with Upper case charcter.
 
	Ex.
	
		String 			|
		StringBuffer	|
		Accounts 		|//==> Nouns
		Dog				|
		...
 
 
------------------------------------------ 
	Coding Standards for interface 
------------------------------------------

 -> Useally interface names are adjectives.
 
 -> Should starts with upper case charcter and if it containes multiple word every inner word should starts with Upper case charcter.
 
  Ex.
  
	Runnable	 |
	Serializable |//==> Adjectives 
	Comparable   |
 
 
 ---------------------------------
	Coding standard for Methods
 ---------------------------------

 -> Useally method names are either verbs or verb-noun combination.
 
 -> Should start with lower case alphabet symbol and it it containes multiple words then every inner word should start with upper case charcter(Camel Case conventions).

	Ex. 
	

	print()	|					getName  |
	run()	|					setSalary|//==> verb-noun combination 
	sleep()	|//==> verbs|
	eat()	|
	start()	|

----------------------------------------
	Coding Standards for variables
----------------------------------------	

 -> Useally variables names are nouns.
 
 -> Should start with a lower case alphabet symbol and if it containes multiple words then every inner words should starts with upper charcter(Camel case convention).
 
	Ex.
 
	name			|
	age 			|	
	salary			|//===> nouns 
	mobileNumber	|	
 
 
 ------------------------------------
	Conding Standard for constant 
-------------------------------------
	
 -> Useally constants name are nouns.
 
 -> Should containe only upper case charcters and if it containes multiple words then these words are separated with underscore symbol.


	Ex. 
	
		MAX_VALUE		|
		MAX_PRIORITY	|
		NORM_PRIORITY	|//=> NOUNS
		MIN_PRIORITY	|
		PI				|
 
 Note:- Useally we can declare constants with public static and final modifires.
 
 -------------------------------
	JavaBean conding Standard
 -------------------------------

 -> A javaBean is a simple java class with a private properties and public getter and setter methods.
 
	Ex. 

						 |------------->//class name ends with 'Bean' is not official convention from sun.	
	public class StudentBean {
		
		private String name;
		
		
		public void setName(String name){
			
			this.name=name;
		}
		public String getName(){
			
			return name;
		}
	}
	
	
	
	Syntax for Setter Method 
------------------------------

		-> It should be public method.
		
		-> The return type should be void.
		
		-> Method name should be prifixed with set.
		
		-> It should take some argument that is it should not be no argument method.
		
		
    Syntax for getter Method
-------------------------------

		-> It should be public method.
		
		-> The return type should not be void.
		
		-> Method name should prifixed with get.
		
		-> It should not take any argument.
		
		
NOte*: For boolean properties getter method name can be prifixed with either 'get' or 'is' but recommanded to use 'is'

		Ex. 
		
		private boolean empty ;
		
			public boolean getEmpty() {
				
				return empty ;
			}
			
			public boolean isEmpty () {
				
				return empty;
			}
			
------------------------------ 
 Coding Standard for Listners 
------------------------------


 Case 1: To Register a Listners:-

	-> Method name should be prifixed with 'add'.
	
			Ex. 
	
			public void addMyActionListner(myActionListner l ) //valid 
			
			public void registerMyActionListner(myActionListner l ) //invalid 
			
			public void addMyActionListner(ActionListener l) //invalid 
			

 Case 2: To Unregister a Listner:-
	
	-> Method name should be prifixed with 'remove'.

		Ex. 
	
			public void removeMyActionListner(myActionListner l ) //valid 
			
			public void unregisterMyActionListner(myActionListner l) //invalid 
			
			public void removeMyActionListner(ActionListener l) //invalid 
			
			public void deleteMyActionListner(myActionListner l)//invalid 



































 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 



































	



































	
	
	
	
	
	
	