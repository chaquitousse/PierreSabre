package Histoire;

import Personnages.Commercant;
import Personnages.GrandMere;
import Personnages.Ronin;
import Personnages.Samourai;
import Personnages.Traitre;
import Personnages.Yakuza;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant rakan = new Commercant("rakan", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin hasagui = new Ronin("hasagui", "shochu", 60);
		rakan.faireConnaisance(hasagui);
		rakan.faireConnaisance(yaku);
		rakan.faireConnaisance(chonin);
		rakan.faireConnaisance(kumi);
		rakan.listerConnaissance();
		hasagui.listerConnaissance();
		yaku.listerConnaissance();
		
		
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		akimoto.direBonjour();
		akimoto.boire("concentré de poulpe");
		
		Traitre Mossado = new Traitre ("Miyamoto","Mossado","whisky",100);
		Mossado.faireLeGentil();
		Mossado.ranconner(kumi);
		Mossado.ranconner(chonin);
		Mossado.ranconner(rakan);
		hasagui.faireConnaisance(Mossado);
		Mossado.ranconner(kumi);
		Mossado.faireConnaisance(yaku);
		Mossado.faireLeGentil();
		Mossado.faireConnaisance(akimoto);
		
		GrandMere grandMere = new GrandMere("Grand-Mère", 10); 
		grandMere.faireConnaisance(akimoto); 
		grandMere.faireConnaisance(yaku); 
		grandMere.faireConnaisance(Mossado); 
		grandMere.faireConnaisance(kumi); 
		grandMere.faireConnaisance(rakan); 
		grandMere.faireConnaisance(chonin); 
		grandMere.ragoter(); 
	}
}
