package semaine9;

import java.util.Scanner;

public class exo1VoitureJava {
 /////////////Attribut///
		private String couleur;
		private String marque;
		private int nbdeportiere=3;
		
		public exo1VoitureJava(String marque) {
			System.out.println("Création d'une voiture de marque "+ marque);
			this.marque=marque;
		}
		
		
		 // Voiture//
		public String getCouleur() {
			return couleur;
		}
		//Mutateur//
		public void setCouleur(String couleur) {
			this.couleur = couleur;
		}
		//Accesseur//
		public String getMarque() {
			return marque;
		}
		//Mutateur//
		public void setMarque(String marque) {
			this.marque = marque;
		}
		//Accesseur//
		public int getNbdeportiere() {
			return nbdeportiere;
		}
		//Mutateur//
		public void setNbdeportiere(int nbdeportiere) {
			this.nbdeportiere = nbdeportiere;
		}
		public String affichage() {
			return "Voici Couleur "+getCouleur()+ "voici la marque"+ getMarque()+"voici le nb de porte"+ getNbdeportiere();
		}
		
		public static void saisieVoiture() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Indiquez une marque ");
			String userEntry =sc.nextLine();
			exo1VoitureJava mavoiture = new exo1VoitureJava(userEntry);
			System.out.println("Indiquez une couleur ");
			userEntry=sc.nextLine();
			mavoiture.setCouleur(userEntry);
			
			System.out.println("Votre voiture a 5 portes ? ");
				userEntry=sc.nextLine();
			if (userEntry.equals("oui")) {
				mavoiture.setNbdeportiere(5);
				
			}
		}
		
	}


