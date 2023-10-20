
															Language Fundamentals Part-15|| Command Line Arguments
														============================================================
------------------------
 Command Line Arguments 
------------------------

 -> The Arguments which are passing from command prompt are called command line arguments.
 
 -> With these command line arguments JVM will create an array and by passing that array as agruments JVM will call main() method.

	public static void main(String args[]) {
		
		
	}												String args[] = {'A', 'B', 'C'}; // Created by JVM internally 
	
	java Test A 	B 		C 
			  |		|		|
			  |		|		|
		args [0]   [1]	   [2]	 // Like these we can access the array 
		
	args.length == 3 	