//========================
//Sean Leclerc
//========================

package lab02;

import javax.swing.*;

public class CaiseEnregistreuse {

	public static void main(String[] args) {
		// Saisie des informations
		String nomArticle = JOptionPane.showInputDialog("Nom de l'arcticle: ");
		int nbArticles = Integer.parseInt(JOptionPane.showInputDialog("Nombre d'arcticles: "));
		double prixUnitaire = Double.parseDouble(JOptionPane.showInputDialog("Prix unitaire: "));
		double taux = Double.parseDouble(JOptionPane.showInputDialog("Taux de taxation: ", 13.5));

		afficherLigne();
		// Affichage de la facture
		afficherFacture(nomArticle, nbArticles, prixUnitaire, taux);
		afficherLigne();
	}// Fin du main

	private static void afficherLigne() {
		System.out.println("=====================================");
	}// Fin de afficherLigne

	// Fin de la classe
	private static void afficherFacture(String n, int nb, double p, double t) {
		System.out.printf("Article          : %1$10s\n", n);
		System.out.printf("Quantite         : %1$10d\n", nb);
		System.out.printf(" Prix unitaire   : %1$10.2f$\n", p);
		System.out.printf(" Coup totale     : %1$10.2f$\n", nb * p);
		System.out.printf("Sous-totale      : %1$10.2f$\n", nb * p);
		Double taxes = nb * p * t / 100;
		System.out.printf("Taxes(%1$4.1f%%)     : %2$10.2f$\n", t, taxes);
		System.out.printf("Cout totale      : %1$10.2f$\n" , nb * p + taxes);
	}// Fin afficher facture

}// Fin de la classe
