package objets;

public enum Equipements {
	CASQUE("casque"),
	BOUCLIER("bouclier");
	private String nom;
	
	
	Equipements(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}

}
