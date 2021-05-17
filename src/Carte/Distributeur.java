package Carte;
import java.util.Collections;

public class Distributeur {

	public static <T> void main(String[] args) {
		Paquet paquet = new Paquet();
		paquet.remplir();
		System.out.println("Jeu de "+ paquet.getNombreCarte()+ " catres");
		paquet.mélanger();
		System.out.println(paquet.main);

		Main jeu1 = Paquet.ConstruireMain(paquet);
		//System.out.println(jeu1.main);
		
		System.out.println();
		System.out.println("Nombre de carte : "+jeu1.getNombreCarte());
		Collections.sort(jeu1.main,Carte.ComparatorValCarte);
		System.out.println("-----------------------------------------Trie par valeur --------------------------------------------");

		System.out.println(jeu1.main);
		Collections.sort(jeu1.main,Carte.ComparatorSymbol);
		System.out.println();
		System.out.println("-----------------------------------------Trie par couleur --------------------------------------------");
		System.out.println(jeu1.main);
		
		
	}
	

}