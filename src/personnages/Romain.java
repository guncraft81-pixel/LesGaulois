package personnages;

import objets.Equipements;

public class Romain {
	private String nom;
	private int force;
	private Equipements[] equipements = new Equipements[2];
	private int nbEquipement=0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le Romain " + nom + " : ";
	}
	public void recevoirCoup (int forceCoup) {
		assert forceCoup>0: "La force du coup reçu est positive";
		int forceBase = this.force;
		force = force - forceCoup;
		if(force < 1) {
			force = 0;
			parler("J'abandonne !");
		}
		else {
			parler("Aïe");
		}
		assert forceBase> force : "La force d'un Romain a diminué";
		assert isInvariantVerified();
	}
	
	private boolean isInvariantVerified() {
		return force>=0;
	}
	@Override
	public String toString() {
		return " Romain [" + nom + "] ";
	}
	
	public void sEquiper(Equipements equipement) {
		switch(nbEquipement) {
		case 2 :
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1 :
			if(equipements[0]==equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement + ".");
				break;
			}
			ajouterEquipement(equipement);
		    break;		
		case 0 :
			ajouterEquipement(equipement);
			break;
		default :
			break;	
		}
	}
	
	private void ajouterEquipement(Equipements equipement) {
	    equipements[nbEquipement] = equipement;
	    nbEquipement++;
	    System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println(Equipements.BOUCLIER);
		System.out.println(Equipements.CASQUE);
		minus.sEquiper(Equipements.CASQUE);
		minus.sEquiper(Equipements.CASQUE);
		minus.sEquiper(Equipements.BOUCLIER);
		minus.sEquiper(Equipements.CASQUE);
	}
	
}
