package Personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int sefaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste... ");
		this.perdreArgent(getArgent());
		return this.getArgent();
	}
	
	public void recevoir(int Argent) {
		parler(Argent+" sous ! Je te remercie généreux donateur!");
		this.gagnerArgent(Argent);
	}
}
