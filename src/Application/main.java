package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entités.Enseignant;
import entités.Etudiant;

public class main {

static List<Etudiant> etudiants = new ArrayList<>();
static List<Enseignant> enseignants = new ArrayList<>();

public static void main(String[] args) {

int selection = 0;
Scanner input = new Scanner(System.in);

while (selection != 3) {
System.out.println("Votre choix :");
System.out.println("-------------------------\n");
System.out.println("1 - Gestion des enseignants");
System.out.println("2 - Gestion des etudiants");
System.out.println("3 - Quitter");
selection = input.nextInt();
if (selection == 1) {
gestionEnseignant();
} else if (selection == 2) {
gestionEtudiant();
}
}
return;
}

public static void gestionEnseignant() {
int selection = 0;
Scanner input = new Scanner(System.in);
while (selection != 3) {
System.out.println("Votre choix :");
System.out.println("-------------------------\n");
System.out.println("1 - Ajouter un enseignant");
System.out.println("2 - Afficher les enseignants");
System.out.println("3 - Quitter");
selection = input.nextInt();
if(selection == 1 ) {
ajouterEnseignant();
} else if (selection ==2) {
System.out.println(enseignants);
}
}
}

public static void ajouterEnseignant() {
Scanner sc=new Scanner(System.in);
System.out.println("Nom de l'enseignant : ");
        String nom = sc.nextLine();
        System.out.println("Prenom de l'enseignant : ");
        String prenom =sc.nextLine();
        System.out.println("Age de l'enseignant : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Matière de l'enseignant : ");
        String matiere = sc.nextLine();
        System.out.println("Année d'experience de l'enseignant : ");
        int annéeExperience = Integer.parseInt(sc.nextLine());
       
        Enseignant enseignant = new Enseignant(nom, prenom, age, matiere, annéeExperience);
        enseignants.add(enseignant);
}

public static void gestionEtudiant() {
int selection = 0;
Scanner input = new Scanner(System.in);
while (selection != 3) {
System.out.println("Votre choix :");
System.out.println("-------------------------\n");
System.out.println("1 - Ajouter un etudiant");
System.out.println("2 - Afficher les etudiants");
System.out.println("3 - Quitter");
selection = input.nextInt();
if(selection == 1 ) {
ajouterEtudiant();
} else if (selection ==2) {
System.out.println(etudiants);
}
}
}

public static void ajouterEtudiant() {
Scanner sc=new Scanner(System.in);
        System.out.println("Nom de l'etudiant : ");
        String nom = sc.nextLine();
        System.out.println("Prenom de l'etudiant : ");
        String prenom =sc.nextLine();
        System.out.println("Age de l'etudiant : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Groupe de l'etudiant : ");
        String groupe =sc.nextLine();
        System.out.println("Moyenne de l'etudiant : ");
        float moyenne = Float.parseFloat(sc.nextLine());
       
        Etudiant etudiant = new Etudiant(nom, prenom, age, groupe, moyenne);
        etudiants.add(etudiant);
}



}
