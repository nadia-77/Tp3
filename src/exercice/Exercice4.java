package exercice;

import java.util.Arrays;

public class Exercice4 {
	
	public static void affiche(double t[][]){
		for(int i=0; i< t.length; i++) {
			for (int j=0 ; j<t[i].length; j++) {
				System.out.print(t[i][j]+"  ");
			}
			System.out.println();
		}
	}
    
	public static boolean regulier(double t[][]) {
		if (t == null || t.length == 0)
	        return true;

	    
	    int tailleL1 = t[0].length;

	    
	    for (int i = 1; i < t.length; i++) {
	        if (t[i].length != tailleL1) {
	            return false; 
	        }
	    }

	    return true; 
	}
	
	public static double [] sommeLignes(double t[][]) {
		
		double resultat [] = new double[t.length];
		for(int i = 0; i<t.length; i++) {
		    double som = 0;
			for(int j= 0; j<t[i].length; j++) {
				
			    som+=t[i][j];
			}
			resultat[i]=som;
		}
		return resultat;
	}
	
	public static double[][] somme(double[][] t1, double[][] t2) {

	    if (t1 == null || t2 == null)
	        return null;

	    if (t1.length != t2.length)
	    	    
	        return null;

	    for (int i = 0; i < t1.length; i++) {

	        if (t1[i].length != t2[i].length)
	            return null;

	    }

	   
	    double[][] resulat = new double[t1.length][];

	    for (int i = 0; i < t1.length; i++) {
	    	resulat[i] = new double[t1[i].length];

	        for (int j = 0; j < t1[i].length; j++) {
	        	resulat[i][j] = t1[i][j] + t2[i][j];
	        }
	    }

	    return resulat;
	}

	public static void main(String[] args) {
		double t1[][]= {{1,7,9},{4,2,5},{8,9,6}};
        double t2[][]= {{1,8},{9,5,2},{7}};
        
        System.out.println("Les valeurs tableau :");
        affiche(t1);
        System.out.println("Les valeurs tableau :");
        affiche(t2);
        
        System.out.println("Le teste si le tableau est régulier : " + regulier(t1));
        System.out.println("Le teste si le tableau est régulier : " + regulier(t2));
        
        System.out.println("sommes des différentes lignes 1er tableau : "+Arrays.toString(sommeLignes(t1)));
        System.out.println("sommes des différentes lignes 2eme tableau : "+Arrays.toString(sommeLignes(t2)));
        
        System.out.println("le resultat de la somme des deux tableaux :" +somme(t1, t2));
	}

}
