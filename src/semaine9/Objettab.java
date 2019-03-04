package semaine9;

import java.util.Scanner;

public class Objettab {
	
	
	public static void  main (System[]args ){
		
		Scanner sc = new Scanner(System.in);
		int saisie = sc.nextInt();
		int []tab= new int[saisie];
		
		System.out.println(" prout");
		 saisie=sc.nextInt();

		
		
		 System.out.println("affichage d'un objet");
		 
		 System.out.println("n vaut "+saisie);
		 
		 for (int i = 0; i < tab.length; i++) {
			 System.out.println(tab[i]+" * ");
			 
		}
		 System.out.println(" ");
	}
}
