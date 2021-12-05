package day08loops;

public class practice1 {
	public static void main(String args[])
	{
	int i, j, space = 1;
	int rows=5;
	space = rows - 1;
	for (j = 1; j<= rows; j++){
		for (i = 1; i<= space; i++){
			System.out.print(" ");
	}
		space--;
		for (i = 1; i <= 2 * j - 1; i++){
			System.out.print("*");
	}
		System.out.println("");
	}
//		space = 1;
//		for (j = 1; j<= n - 1; j++){
//			for (i = 1; i<= space; i++){
//		System.out.print(" ");
//	}
//		space++;
//		for (i = 1; i<= 2 * (n - j) - 1; i++){
//			System.out.print("*");
//	}
//		System.out.println("");
//	}
	}
	}
/*
*****
*****
*****
*****
*****

public static void main(String[] args) {
	int row =5 ;
	int column = 5;
	for(int i =0; i<column; i++) {
		for(int j = 0; j<row; j++){
		System.out.print("*");
		}
		System.out.println("");
	}
}
*****
 ****
  ***
   **
    *
    public static void main(String[] args) {
     int size=5;
     for (int i = 1; i <= size; i++) {

             for (int j = 1; j < i; j++) {
                 System.out.print(" ");
             }
             for (int k = i; k <= size; k++) {
                 System.out.print("*");
             }
                 System.out.println();
         }
     }
 }
    *
   **
  ***
 ****
*****
	public static void main(String[] args) {
	     int size=5;
	     for (int i =size ; i >= 1; i--) {

	             for (int j = 1; j < i; j++) {
	                 System.out.print(" ");
	             }
	             for (int k = i; k <= size; k++) {
	                 System.out.print("*");
	             }
	                 System.out.println();
	         }
	     }
*
**
***
****
*****
 public static void main(String[] args) {
	int row =5 ;
	int column = 5;
	for(int i =0; i<column; i++) {
		for(int j = 0; j<=i; j++){
		System.out.print("*");
		}
		System.out.println("");
	}
}
*****
****
***
**
*
		 public static void main(String[] args) {
				int row =5 ;
				int column = 5;
				for(int i =row; i>0; i--) {
					for(int j = 0; j<i; j++){
					System.out.print("*");
					}
					System.out.println("");
				}
			}

*****
 ***
  *

public static void main(String[] args) {
	//1, 3, 5
     //0,1,2
     int size=5;
	
     for (int i = 1; i <= size; i++) {
         if (i % 2 == 1) {
 
             for (int j = 0; j < i/2; j++) {
                 System.out.print(" ");
             }
             for (int k = i; k <= size; k++) {
                 System.out.print("*");
             }
                 System.out.println();
         }
     }
 }
  *
 ***
*****
	public static void main(String[] args) {
		//1, 3, 5
	     //0,1,2
	     int size=5;
		 int z = 0;
	     for (int i = size; i >= 0; i--) {
	         if (i % 2 == 1) {
	             z++;
	             for (int j = 0; j < i/2; j++) {
	                 System.out.print(" ");
	             }
	             for (int k = i; k <= size; k++) {
	                 System.out.print("*");
	             }
	                 System.out.println();
	         }
	     }
	 }
*******
 *****
  ***
   *
 
   *
  ***
 *****
*******
 public static void main(String[] args) {

		int n = 7;
		
		
		for (int i= n; i>= 1; i -=2){  //7,5,3,1 4rows
		    for (int j= n; j > i; j-=2){//space before asterix  
		    	System.out.print(" ");}  
		    for (int j=1; j<=i ; j++){ //number of asterix  7,5,3,1
		    	System.out.print("*");}  
		    System.out.println();
	}  
		
			System.out.println(" ");
		
	
			for (int i= 1; i<= n; i += 2){  
			for (int j= n; j> i; j -= 2){  
			
				System.out.print(" "); }  
			
			for (int j=1 ; j<= i;  j++){  
			System.out.print("*"); }  
			System.out.println(""); } 


*/