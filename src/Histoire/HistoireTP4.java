package Histoire;

import Personnages.Commercant;
import Personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain Squeezie = new Humain("Squeezie","Ciao Kombucha",54);
		Squeezie.direBonjour();
		Squeezie.acheter("une boisson", 12);
		Squeezie.boire();
		Squeezie.acheter("un jeu", 2);
		Squeezie.acheter("un kimono", 50);
		
		
		Commercant Marco = new Commercant("Marco",2);
		Marco.direBonjour();
		Marco.sefaireExtorquer();
		Marco.recevoir(15);
		Marco.boire();
	}
}
