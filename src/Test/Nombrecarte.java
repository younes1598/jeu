package Test;

import static org.junit.Assert.*;
import org.junit.Test;

import Carte.Main;
import Carte.Paquet;

public class Nombrecarte {

	@Test
	public void testNbCarte() {
		Main main = new Main();
		Paquet paquet = new Paquet();
		paquet.remplir();
		paquet.mélanger();
		main = Main.ConstruireMain(paquet);
		
		assertEquals(10,main.getNombreCarte());
	}
}
