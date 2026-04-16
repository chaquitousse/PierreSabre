package Histoire;

import Personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain Squeezie = new Humain("Squeezie","Ciao Kombucha",54);
		Squeezie.direBonjour();
		Squeezie.acheter("une boisson", 12);
		Squeezie.boire();
		Squeezie.acheter("un jeu", 2);
		Squeezie.acheter("un kimono", 50);
	}
}
