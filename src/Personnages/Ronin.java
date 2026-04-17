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
	
	public void provoquer(Yakuza adversaire) {
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand! ");
		int force = this.getHonneur()*2;
		if ( force >= adversaire.getReputation()) {
			this.parler("Je t'ai eu petit yakusa !");
			adversaire.perdre();
			this.honneur+=1;
			gagnerArgent(adversaire.getArgent());
		}else {
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(this.getArgent());
			if (this.getHonneur()>0) {
				this.honneur-=1;
			}
			this.perdreArgent(this.getArgent());
		}
		
	}

}
