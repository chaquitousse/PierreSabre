package Personnages;
import java.util.Random;

public class Traitre extends Samourai {
	private int niveauTraitrise;
	
	
	
	public Traitre(String nomSeigneur, String nom, String boissonFavorite, int argent) {
		super(nomSeigneur, nom, boissonFavorite, argent);
		this.niveauTraitrise=0;
		
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mais je suis un traître et mon niveau de traîtrise est : "+ this.getNiveauTraitrise()+". Chut !");
	}
	

	public int getNiveauTraitrise() {
		return niveauTraitrise;
	}
	
	public void ranconner(Commercant commercant) {
		if (this.niveauTraitrise<3) {
			int argentRanconner = (commercant.getArgent()*2) /10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi "+argentRanconner+" sous ou gare à toi !");
			commercant.parler("Tout de suite grand" + this.getNom() + ".");
			this.niveauTraitrise ++;
		}else {
			this.parler("Mince, je ne peux plus ranconner personne sinon un samourai risque de me démasquer !");
		}
	}
	
	
	public void faireLeGentil () {
		if (this.nbConnaissance < 1) {
			this.parler("Je ne peux faire ami avec personne car je ne connais personne ! BOUHOUHOUUU." );
		}else {
			Random rnd = new Random();
			int indiceConnaissance = rnd.nextInt(this.nbConnaissance);
			Humain Ami = memoire[indiceConnaissance];
			this.parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "+Ami.getNom()+".");
			int don = this.getArgent()/20;
			this.parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant "+don+" sous.");
			Ami.gagnerArgent(don);
			this.perdreArgent(don);
			Ami.parler("Merci "+this.getNom()+" Vous êtes quelqu'un de bien !");
			
			if (this.niveauTraitrise>1) {
				this.niveauTraitrise-=1;
			}
		}
	}
	
	
}
