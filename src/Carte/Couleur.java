package Carte;

public enum Couleur {
	coeur("Coeur"),
	trefle("Tréfle"),
	pique("Pique"),
	carreaux("Carreaux");
	
	private final String nom;
	
	private Couleur (String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}
	
	
}
