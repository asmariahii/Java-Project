package entités;

public class Enseignant extends Personne{
	
	private String matiere;
	private int annéeExperience;

	public Enseignant(String nom, String prenom, int age,String matiere, int annéeExperience) {
		super(nom, prenom, age);
		this.matiere = matiere;
		this.annéeExperience = annéeExperience;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public int getAnnéeExperience() {
		return annéeExperience;
	}

	public void setAnnéeExperience(int annéeExperience) {
		this.annéeExperience = annéeExperience;
	}

	@Override
	public String toString() {
		return "Enseignant" + super.toString() + " , matiere=" + matiere + ", annéeExperience=" + annéeExperience;
	}
	
	
	

}
