package Histoire;

import Personnages.Commercant;
import Personnages.Humain;
import Personnages.Yakuza;

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
		
		Yakuza Yaku = new Yakuza ("Yaku le Nwar","Sirop de menthe",30,"Fan_de_Squeezie" );;
		Yaku.direBonjour();
		Yaku.extorquer(Marco);
	}
}
