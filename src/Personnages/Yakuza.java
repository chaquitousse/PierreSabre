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

	public String getClan() {
		return clan;
	}

	
	public int getReputation() {
		return reputation;
	}

	
}
