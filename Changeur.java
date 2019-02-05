//Sean Leclerc

import javax.swing.*;

public class Changeur {
	public static void main(String[] args) {
		double montant = Double.parseDouble(JOptionPane.showInputDialog(""));
		System.out.println("Montant initiale:" + montant );
		
		int nbB20 = (int) (montant/20);
		montant = montant % 20;
		
		int nbB10 = (int) (montant/10);
		montant=montant % 10;
		
		int nbB5 = (int) (montant/5);
		montant = montant % 5;
				
		int nbP200 = (int) (montant/2);
		montant = montant % 2;
		
		int nbP100 = (int) (montant/1);
		montant = montant % 1; //???
		
		int nbP25 = (int) (montant/0.25);
		montant = montant % 0.25;
		
		int nbP10 = (int) (montant/0.10);
		montant = montant % 0.10;
		
		int nbP5 = (int) (montant/0.05);
		montant = montant % 0.05;
		
		int nbP1 = (int) (montant/0.01 + 0.5);
		//System.out.println(montant/0.01);
		
		
		//Affichage
		System.out.println("Nombre de billet de   20$:" + nbB20 );
		System.out.println("Nombre de billet de   10$:" + nbB10 );
		System.out.println("Nombre de billet de    5$:" + nbB5 );
		System.out.println("Nombre de pieces de 2.00$:" + nbP200 );
		System.out.println("Nombre de pieces de 1.00$: " + nbP100 );
		System.out.println("Nombre de pieces de 0.25$:" + nbP25 );
		System.out.println("Nombre de pieces de 0.10$:" + nbP10 );
		System.out.println("Nombre de pieces de 0.05$: " + nbP5 );
		System.out.println("Nombre de pieces de 0.01$: " + nbP1 );
	}
}
