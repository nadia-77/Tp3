package exercice;

import java.util.Scanner;
  
public class Exercice2 {
	
	
	public static void Star(int ligne1) {
		   
           for (int i = 1; i <= ligne1; i++) {
        	   
        	   for (int centre = 1; centre <= ligne1 - i; centre++) {
                   System.out.print(" ");
               }

            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		
        System.out.println("Combien de valeurs : ");
		
		int ligne;
		Scanner sc = new Scanner(System.in);
		ligne = sc.nextInt();
		System.out.println("Voici l'affichage du triangle isocèle formé d’étoiles : ");
		Star(ligne);
		
		sc.close();

	}

}
