package exercice;
import java.util.Scanner;
public class Exercice5 {
	public static void rotate90ClockwiseInPlace(int[][] A) {
		 for(int i = 0; i < A.length; i++) {
			 for(int j = i+1; j< A.length;j++) {
				 int trans = A[i][j];
				 A[i][j] = A[j][i];
				 A[j][i] = trans;
				 
			 }			 
		 }
		 for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < A.length / 2; j++) {
	                int trans = A[i][j];
	                A[i][j] = A[i][(A.length) - 1 - j];
	                A[i][(A.length) - 1 - j] = trans;
	            }
	        }	
			
	    }
   static void rotate90CounterClockwiseInPlace(int[][] A) {

      
       for (int i = 0; i < A.length; i++) {
           for (int j = i + 1; j < A.length; j++) {
               int trans = A[i][j];
               A[i][j] = A[j][i];
               A[j][i] = trans;
           }
       }

       for (int j = 0; j < A.length; j++) {
           for (int i = 0; i < A.length / 2; i++) {
               int trans = A[i][j];
               A[i][j] = A[(A.length) - 1 - i][j];
               A[(A.length) - 1 - i][j] = trans;
           }
       }
   }


   static void rotate180InPlace(int[][] A) {
       for (int i = 0; i < A.length / 2; i++) {
           for (int j = 0; j < A.length; j++) {
               int trans = A[i][j];
               A[i][j] = A[(A.length) - 1 - i][(A.length) - 1 - j];
               A[(A.length) - 1 - i][(A.length) - 1 - j] = trans;
           }
       }
       if ((A.length) % 2 == 1) {
           int mid = (A.length) / 2;
           for (int j = 0; j < (A.length) / 2; j++) {
               int tmp = A[mid][j];
               A[mid][j] = A[mid][(A.length) - 1 - j];
               A[mid][(A.length) - 1 - j] = tmp;
           }
       }
   }

 
	public static void main(String[] args) {
		System.out.println("Entre la valeur :");
		  
		   Scanner sc = new Scanner(System.in);
		   int nbr = sc.nextInt();
		   while(nbr < 2 || nbr > 200) {
			   System.out.println("Entre une valeur entre 2 et 200 :");
			   nbr = sc.nextInt();
		   }
		   
		   System.out.println("Entre les valeur du tableau :");
		   int A[][] = new int[nbr][nbr];
		   
		   for(int i = 0; i < A.length; i++) {
			   for(int j = 0; j < A[i].length; j++) {
				   A[i][j] = sc.nextInt();
				   
			   }
		   }
		   
		   System.out.println("Affichage tableau : ");
		   for(int i = 0; i < A.length; i++) {
			   for(int j=0; j < A.length; j++) {
				   System.out.print(A[i][j]+"   ");
				   
				   
			   }
			   System.out.println(); 
			   System.out.println();
		   }
		    		   		   		   
		   
		   rotate90ClockwiseInPlace(A);
		   System.out.println("Sortie (90° horaire) ");
		   for(int i = 0; i < A.length; i++) {
			   for(int j=0; j < A.length; j++) {
				   System.out.print(A[i][j]+"   ");
				   
				   
			   }
			   System.out.println(); 
			   System.out.println();
		   }
		    		   		   

		   rotate90CounterClockwiseInPlace(A);
		   System.out.println("Sortie (90° contre horaire) ");
		   for(int i = 0; i < A.length; i++) {
			   for(int j=0; j < A.length; j++) {
				   System.out.print(A[i][j]+"   ");
				   
				   
			   }
			   System.out.println();  
			   System.out.println(); 
		   }
		   		   
		   
		    
		   rotate180InPlace(A);
		   System.out.println("Sortie (rotation 180) :");
		   for(int i = 0; i < A.length; i++) {
			   for(int j=0; j < A.length; j++) {
				   System.out.print(A[i][j]+"   ");
				   
				   
			   }
			   System.out.println(); 
			   System.out.println();
		   }
		    
		  
		  
		   
		   sc.close();  

	}

}
