package entités;

public class Etudiant extends Personne {
	private String groupe;
	private float moyenne;
	
	
	public Etudiant(String nom, String prenom, int age,String groupe, float moyenne) {
		super(nom, prenom, age);
		this.groupe = groupe;
		this.moyenne = moyenne;
	}


	public String getGroupe() {
		return groupe;
	}


	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}


	public float getMoyenne() {
		return moyenne;
	}


	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}


	@Override
	public String toString() {
		return "Etudiant : " + super.toString() + " , groupe=" + groupe + ", moyenne=" + moyenne;
	}
	
	
	
	
	
}
