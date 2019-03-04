package semaine9;

import java.util.Scanner;

public class voiture {
	/// main///
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		exo1VoitureJava titine = new exo1VoitureJava("ford"); /// on rappel la class exo1VoitureJava//
		exo1VoitureJava bipbip = new exo1VoitureJava("porshe");


		// affectation sur l'objet titine
		titine.setCouleur("Bleu");


			System.out.println("Combien de voiture voulez-vous ? ");
			Scanner scan=new Scanner(System.in);
			int useEnt =scan.nextInt();
			sc.nextLine();
			 
			exo1VoitureJava [] parking=new exo1VoitureJava[useEnt];
			
			
			for (int i = 0; i < useEnt; i++) {
				parking[i] = saisieVoiture();
				
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
				return maVoiture;
			}
			
			


		System.out.println("veuillez entrer votre couleur de voiture: ");
		titine.setCouleur(sc.nextLine());


		System.out.println("Veuillez entrer le nombre de portières de votre voiture: ");
		titine.setNbdeportiere(sc.nextInt());

		sc.nextLine();

		System.out.println("Veuillez entrer la marque de votre voiture: ");
		titine.setMarque(sc.nextLine());

		System.out.println("votre nb de portieres  est: "+ titine.getNbdeportiere());
		System.out.println("la marque de votre voiture  est: "+ titine.getMarque());
		System.out.println("la couleur de vote voiture est: "+ titine.getCouleur());

		bipbip.affichage();
		
		System.out.println("veuillez entrer votre couleur de voiture: ");
		bipbip.setCouleur(sc.nextLine());


		System.out.println("Veuillez entrer le nombre de portières  de votre voiture: ");
		bipbip.setNbdeportiere(sc.nextInt());

		sc.nextLine();

		System.out.println("Veuillez entrer la marque de votre voiture: ");
		bipbip.setMarque(sc.nextLine());
		
		
		System.out.println("votre nb de portieres est: "+ bipbip.getNbdeportiere());
		System.out.println("la marque de votre voiture est: "+ bipbip.getMarque());
		System.out.println("la couleur de vote voiture est: "+ bipbip.getCouleur());
	}

	private static exo1VoitureJava saisieVoiture() {
		// TODO Auto-generated method stub
		return null;
	}
}
