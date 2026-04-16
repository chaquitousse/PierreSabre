package Personnages;

public class Humain {
	private String nom ; 
	private String boissonFavorite;
	private int argent;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	
	public String getBoissonFavorite() {
		return boissonFavorite;
	}


	public int getArgent() {
		return argent;
	}


	public String getNom() {
		return nom;
	}


	public void parler(String texte) {
		System.out.println(texte);
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle "+getNom()+" et j'aime boire du "+getBoissonFavorite()+".");

	}

	public void boire() {
		this.parler("MMMmmmm, un bon verre de "+getBoissonFavorite()+" ! GLOBOPS !");
		
	}
	
	public void acheter(String bien, int prix) {
		if (prix <= this.argent) {
			this.parler("J'ai "+getArgent()+" sous en poche, je vais pouvoir m'offrir "+ bien + " à "+ prix + " sous.");
			this.perdreArgent(prix);
		} else {
			this.parler("Je n'ai plus que  "+getArgent()+" sous en poche, je ne vais même pas m'offrir "+ bien + " à "+ prix + " sous.");
		}
	}
	
	protected void gagnerArgent(int gain) {
		this.argent+=gain;
		
		
	}
	
	protected void perdreArgent(int perte) {
		this.argent-=perte;
		if (this.argent <= 0) {
			this.argent=0;
		}
	}
	
	
}
	
	
	


