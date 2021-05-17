package Carte;

import java.util.Comparator;

public class Carte {

	private Couleur couleur;
	private Valeur valeur;
	
	// Constructeur de carte 
	public Carte(Couleur couleur, Valeur valeur) {
		this.couleur = couleur;
		this.valeur = valeur;
	}

	// Getters carte 
	public Couleur getCouleur() {
		return couleur;
	}

	public Valeur getValeur() {
		return valeur;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return valeur.getNom() + " de " + couleur.getNom();
	}
	
	/*
     * Comparator pour le tri par valeur de carte
     */
    public static Comparator<Carte> ComparatorValCarte = new Comparator<Carte>() {
     
        public int compare(Carte e1, Carte e2) {
            return (int) (e1.getValeur().getValeur1() - e2.getValeur().getValeur1());
        }
    };
	
	/*
     * Comparator pour le tri par couleur de carte
     */
    public static Comparator<Carte> ComparatorSymbol = new Comparator<Carte>() {
     
        public int compare(Carte e1, Carte e2) {
            return e1.getCouleur().compareTo(e2.getCouleur());
        }
    };
}
