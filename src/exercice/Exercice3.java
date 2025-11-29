package exercice;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		 int n;
	     System.out.println("Combien de valeurs : ");
	     Scanner sc = new Scanner(System.in);
	     n=sc.nextInt();
		 int tab[] = new int[n];
		 
		 for(int i = 0; i < n;i++){
		 tab[i]=i*2+1;

		}
		 for(int i=0; i<n; i++) 
		 {
			 System.out.println(tab[i]+" a pour carre "+tab[i]*tab[i]);
		 }

 	  sc.close();

	}

}
