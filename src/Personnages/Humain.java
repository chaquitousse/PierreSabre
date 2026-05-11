package Personnages;

public class Humain {
	private String nom ; 
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain [30];
	
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
		System.out.println(" ("+getNom()+") - "+texte);
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle "+getNom()+" et j'aime boire du "+getBoissonFavorite()+".");

	}

	public void boire() {
		this.parler("MMMmmmm, un bon verre de "+getBoissonFavorite()+" ! GLOUPS !");
		
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
	
	public void faireConnaisance(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}
	
	public void repondre(Humain autreHumain) {
		this.direBonjour();
		this.memoriser(autreHumain);
		
	}
	
	protected void memoriser(Humain nouvelleConnaissance) {
		if (this.nbConnaissance == memoire.length){
			for (int i = 0; i<this.memoire.length-1;i++) {
				memoire[i]=memoire[i+1];
			}
			this.memoire[memoire.length-1]=nouvelleConnaissance;
			
		}else {
			this.nbConnaissance+=1;
			this.memoire[this.nbConnaissance-1]= nouvelleConnaissance;
		}
		
	}
	
	public void listerConnaissance() {
		if (this.nbConnaissance==0) {
			this.parler("Je n'ai jamais touché de l'herbe, je ne connais personne.");
		}else {
			String phrase =("Je connais beaucoup de monde dont : ");
		for (int i = 0; i<this.nbConnaissance;i++) {
			 phrase += (memoire[i].getNom()+" ");
		}
		this.parler(phrase + ".");
	}
	}


	



}
	
	
	


