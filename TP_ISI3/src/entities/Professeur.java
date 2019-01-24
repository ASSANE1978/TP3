package entities;

import java.util.ArrayList;
import java.util.List;

public class Professeur {
    private int id;
    private String nom;
    private  String prenom;
   private List<Matiere> matiere;

    public Professeur() {
    }

    public Professeur(int id, String nom, String prenom, List<Matiere> matiere) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.matiere = matiere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Matiere> getMatiere() {
        return matiere;
    }

    public void setMatiere(List<Matiere> matiere) {
        this.matiere = matiere;
    }
}
