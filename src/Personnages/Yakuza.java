package Personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	
	public Yakuza(String nom, String boissonFavorite, int argent,String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom()+ ", si tu tiens à la vie donne moi ta bourse !");
		int argentVictime=victime.getArgent();
		this.gagnerArgent( argentVictime);
		victime.sefaireExtorquer();
		this.reputation+=1;
		parler("J’ai piqué les " +  argentVictime +" sous de " + victime.getNom() +", ce qui me fait "+ this.getArgent()+" sous dans ma poche. HI ! HIHIHI !");
		
	}
	
	public void perdre() {
		this.parler( "J’ai perdu mon duel et mes "+this.getArgent()+" sous, snif . J'ai déshonoré le clan de "+ this.getClan()+".");
		if(reputation>0) {
			reputation-=1;
		}
		this.perdreArgent(getArgent());
	}
	
	public void gagner(int gain) {
		this.parler( "Ce ronin pensait vraiment battre "+this.getNom()+" du clan de "+this.getClan()+" ? Je l'ai dépouillé de ses "+gain+ " sous.");
		this.reputation+=1;
		this.gagnerArgent(gain);
	}

	public String getClan() {
		return clan;
	}

	
	public int getReputation() {
		return reputation;
	}

	
}
