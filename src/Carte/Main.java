package Carte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	//Variables
	protected List<Carte> main = new ArrayList<>();
	
	//ajouter une carte a la main
	public void ajouter(Carte carte) {
		main.add(carte);
	}
	
	public void jouercarte(Carte carte) {
		main.remove(carte);
	}
	
	public int getNombreCarte() {
		return main.size();
		
	}
	public void mélanger() {
		Collections.shuffle(main);
	}
	
	public static Main ConstruireMain (Paquet paquet) {
		Main jeu = new Main();
		int i =0;
		for(Carte c: paquet.main) {
			if (i<10) {
				jeu.ajouter(c);
			}
			i++;
		}
		return jeu;	
	}
}
