package Carte;

public enum Valeur {
	as("As",1),
	deux ("Deux",2),
	trois("Trois",3),
	quatre("Quatre",4),
	cinq("Cinq",5),
	six("Six",6),
	sept("Sept",7),
	huit("Huit",8),
	neuf("Neuf",9),
	dix("Dix",10),
	valet("Valet",11),
	dame("Dame",12),
	roi("Roi",13);

	private final String nom;
	private final int valeur;

	private Valeur (String nom , int valeur) {
		this.nom = nom ;
		this.valeur = valeur;
	}

	public String getNom() {
		return nom;
	}

	public int getValeur1() {
		return valeur;
	}
}
