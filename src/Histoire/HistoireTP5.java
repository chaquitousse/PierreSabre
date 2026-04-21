package Histoire;

import Personnages.Commercant;
import Personnages.Ronin;
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
	}
}
