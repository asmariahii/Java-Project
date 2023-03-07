package entit�s;

public class Enseignant extends Personne{
	
	private String matiere;
	private int ann�eExperience;

	public Enseignant(String nom, String prenom, int age,String matiere, int ann�eExperience) {
		super(nom, prenom, age);
		this.matiere = matiere;
		this.ann�eExperience = ann�eExperience;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public int getAnn�eExperience() {
		return ann�eExperience;
	}

	public void setAnn�eExperience(int ann�eExperience) {
		this.ann�eExperience = ann�eExperience;
	}

	@Override
	public String toString() {
		return "Enseignant" + super.toString() + " , matiere=" + matiere + ", ann�eExperience=" + ann�eExperience;
	}
	
	
	

}
