package Personnages;

public class Samourai extends Humain {
	String nomSeigneur;
	public Samourai(String nomSeigneur,String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.nomSeigneur = nomSeigneur;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneur " + this.getNomSeigneur() +"." );
	}
	
	public void boire(String boisson) {
		this.parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du "+boisson+".");
	}

	public String getNomSeigneur() {
		return nomSeigneur;
	}
	
	


}
