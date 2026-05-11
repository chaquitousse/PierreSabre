package Personnages;
import java.util.Random;

public class GrandMere extends Humain {

	private enum TypeHumain {
		habitant, Commercant, Ronin, Samourai, Yakuza, GrandMere, Traitre
	}
	
	private static final int MEMOIRE_GRANDMERE = 5;
	
	private Random random;
	
	
	public GrandMere(String nom, int argent) {
		super(nom,"tisane", argent);
		this.random = new Random();
	}
	
	private String humainHasard() {
		TypeHumain[] types = TypeHumain.values();
		int rndind = random.nextInt(types.length);
		return types[rndind].toString();
	}
	
	@Override
	protected void memoriser (Humain humain)
	{
		if (this.nbConnaissance<MEMOIRE_GRANDMERE) {
			 super.memoriser(humain);
		}else {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}
	
	public void ragoter() {
		for (int i = 0; i<this.nbConnaissance;i++ ) {
			Humain conaissance = memoire[i];
			if (conaissance instanceof Traitre ) {
				parler("Je sais que " + conaissance.getNom()+" est un traitre !");
			}else {
				parler("Je crois que "+ conaissance.getNom()+" est un "+ humainHasard()+".");
			}
		}
		
	}

}
