
											Language Fundamentals Part-10 || Types of Variables : part-1
										     ====================================================================

---------------------
  Type of variables												
---------------------

	
   Division-1 
 ===============

	-> Based on type of value reprasented by a variable all variables are divided into two types.
	
		1. Primitive variabels : Can be used to reprasent primitive values.
	
		Ex. 
			
				int x = 10;
		
		2. Reference variables: Can be used to refer objects.
		
		
		 Ex.
									    ---------
			Student s = new Student(); 		s--------->| Object  |
									   |	     |
									    ----------
													   
  Division-2 
=============

   -> Based on position of declaration and behaviour all variabels are divided into three types.

		
		1. Instance variables 2. Static variabels 3. Local variabels.
		
	 
	 1. Instance Variables:

		- If the value of a variabel is diffirent from object to object such type of variabels are called instance variabels.
		
		- For every object a separet copy of instance variabel will be created.
		
		- Instance variabel should be declare within the class directly but out side of any method or block or constructor.
		
		- Instance variabel will be created at the time of object creation and distroyed at the time of object distruction. Hance a the scop of instance variabel is exactly same 
		  as the scope of object.
		  
		- Instance variabel will be strode in the heap memory as the part of object.
		
		- We can't access instance variabels directly from static area but we can access by using object reference.
		
		- But we can access instance variabels directly from instance area.
		
		
		Ex. 
		
			class Student {					---------------     	    ---------------       	---------------
				                                s1----> |name = "Ravi"|     s2----> |name ="Durga"|   s600----> |name = "Siva"|
				String = name ;                 	|rollno = 101 |     	    |rollno = 102 |       	|rollno = 600 |
				int = rollno;                   	---------------     	    ---------------       	---------------
				int x = 10;
			public static void main(String []args) {
				
				System.out.println(x);//CE: non-static variable x cannot be referenced from a static context.
				Studet s = new Student();
				System.out.println(s.x); //10
				
			}
			
			public void m1() {
				
				System.out.println(x);//10
				
					}
			}
		
		- For instance variabels JVM will always provide default values and we are not required performe initialization explicitly.
	  
		Ex. 
		
		class Test {
			
			int x ;
			double d;
			boolean b;
			String s ;
			
		public static void main(String args[]) {
			
			Test t = new Test();
			System.out.println(t1.x); // 0 
			System.out.println(t1.d); //0.0
			System.out.println(t1.b); // false 
			System.out.println(t1.s); // null
				}
		}
			
		- Instance variabels also known as object level variabels or attributes.
		
		
====================		
  2.Static varibles															
====================														
																			
	1. If the value of variable is not different from objet to object then it is recomanded to declare variabel as instance variabel we have to declare such type of variables 
		at class level by using static modifire. 
		
	2. In the case instance variabels for every object a separet copy will be created but in the case of static variables a single copy will be created at class level and shared 
	   by every object of the class.
	   
	3. Static variabel should be diclared within the class directly but out side of any method or block or constructor.

	4. Static variables will be created at the time of class loading and distroyed at the time of class unloading. Hance a scope of static variabel is exactly same as scope of 
	   .class file .
	   
	5. Java Test 

		1. Start JVM.
		2. create and start main Thread by JVM.
		3. Locate Test.class file.
		4. Load Test.class. // Static variable creation 
		5. Execute main() method.
		6. unload Test.class. // static variable distruction
		7. Terminate main Thread.
		8. Shutdown JVM 
		
	6. Static variabels will be stored in method area.

	7. we can access static variabels either by object reference or by class name. But recomanded to use class name.
	
	8. Within the same class it is not required to use class name and we can access directly.
	
	9. We can access variabels directly from both instance and static areas.

	Ex. 
	
	class Student {															
																			
		String name ;														
		int rollno;                                                         
		String cname;                                                       
                                                                            
		static int x = 10;                                          						----------------------
                                                                    						  	|  		     |
			public static void main(String args[]){                 					| Cname= "Durga Soft"|<---------------	
				                                                    			|------------>	|                    |  	      |	
				Student s = new Student();                          			|		----------------------	   	      |
				System.out.println(s.x);                            			|			|			      |
				System.out.println(Student.x);                      			|			|   			      |	
				System.out.println(x);                              	     ---------------     	---------------       	    ---------------
				                                                    s1----> |name = "Ravi"|     s2----> |name ="Durga"|   s600----> |name = "Siva"|
			}                                                       	    |rollno = 101 |     	|rollno = 102 |       	    |rollno = 600 |
			public void m1() {                                      	    ---------------     	---------------             ---------------
				
				System.out.println(x);
	}
	
 10.  For static variabels JVM will provide default values and we are not required to performe initialization explicitly.

	Ex. 

	class Test {
		
		static int x ;
		static double d;
		static String s;
			
			public static void main(String args[]){
		
				System.out.println(x); // 0
				System.out.println(d); // 0.0
                System.out.println(s); // null
			}
	}


 11. Static variables also know as class level variables or fields.
 
 
		class Test {										---------------
													|		 |
			static int x = 10;							  ----->|	x = 10	 |<-------------------------
			int y = 20;							        |	|	888	 |			 |
											        |	 ---------------			 |	
			public static void main(String args[]){                                 |						 | 
											        |						 |	
				Test t1 = new Test();					        |					    ---------------									
				t1.x=888;                                                        |                                          |		 |
				t1.y=999;                                                        |                                          |	y = 20	 |
				                                                                 |                                          |		 |
				Test t2 = new Test();                                            |                                          ---------------
												 |  						  t2 		
				System.out.println(t2.x +"....."+t2.y);				 |  ---------------
			}                       888           20                                 |  |		 |
		}                                                                            |----> |	y = 20	 |
                                                                                                    |	999	 |
                                                                                        	    ---------------
													 t1 
																						





















	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
										
										
										
										
