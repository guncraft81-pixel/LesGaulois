package personnages;

public class Druide {
	private String nom;
	private int force;
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	public void frabriquerPotion(int quantite, int forcePotion) {
		
	}
	public void booster(Gaulois gaulois) {
		
	}
	public String getNom() {
		return nom;
	}
	
}
