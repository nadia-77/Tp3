package exercice;

import java.util.Scanner;

public class Exercice1 {
	
	public static double serie(int a) {
		double resultat = 0;
		 for(int i = 1; i<=a ; i++) 
		{
			 resultat+= 1.0/i;
		}
		 return resultat;
	}
	
	public static void main(String[] args) {


		System.out.println("Entrer une variable : ");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("le resultas de la série harmonique est : " +serie(n));
		
		
		sc.close();
	}
    
}
