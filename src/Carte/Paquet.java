package Carte;

public class Paquet extends Main{

	public void remplir() {
		for(Couleur couleur: Couleur.values()) {
			for(Valeur valeur: Valeur.values()) {
				Carte carte = new Carte(couleur, valeur);
				ajouter(carte);
			}
		}
	}
}
