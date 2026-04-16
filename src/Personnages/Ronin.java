package Personnages;



public class Ronin extends Humain {
	private int honneur = 1;
	

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		
	}
	
	public int getHonneur() {
		return honneur;
	}

	public void donner(Commercant beneficiaire) {
		int don = this.getArgent()/10;
		this.perdreArgent(don);
		this.parler( beneficiaire.getNom()+" prend ces "+don+" sous.");
		beneficiaire.recevoir(don);
	}

}
