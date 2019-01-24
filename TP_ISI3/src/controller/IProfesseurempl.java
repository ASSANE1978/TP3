package controller;

import entities.Matiere;
import entities.Professeur;

import java.util.*;

public class IProfesseurempl implements IProfesseur {
    @Override
    public Professeur creation() {
        String rep = null;
        Professeur prof = new Professeur();
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre l'ID ");
        int id = Integer.parseInt(scan.nextLine());
        prof.setId(id);
        System.out.println("Entrer le nom ");
        String nom = scan.nextLine();
        prof.setNom(nom);
        System.out.println("Entrer le prenom ");
        String prenom = scan.nextLine();
        prof.setPrenom(prenom);
        List<Matiere> liste = new ArrayList<Matiere>();
        do {
            Matiere mat = new Matiere();
            System.out.println("Entrer l'ID de la matiere ");
            int idm = Integer.parseInt(scan.nextLine());
            mat.setId(idm);
            System.out.println("Entrer le nom de la matiere ");
            String nomM = scan.nextLine();
            mat.setNom(nomM);
            liste.add(mat);
            System.out.println("Voulez vous continuer !!!");
            rep = scan.nextLine();

        } while (rep.equalsIgnoreCase("oui"));
        prof.setMatiere(liste);
        return prof;
    }

    @Override
    public Map<Integer, Professeur> liste() {
        Scanner scan = new Scanner(System.in);
        Map<Integer, Professeur> listePr = new TreeMap<Integer, Professeur>();
        Professeur prof = new Professeur();
        String rep = null;
        int key = 0;
        do {
            prof = creation();
            key++;
            listePr.put(key, prof);
            System.out.println("Voulez vous continuer ");
            rep = scan.nextLine();
        } while (rep.equalsIgnoreCase("oui"));

        return listePr;
    }

    @Override
    public void AffichProfesseur(Map<Integer, Professeur> liste) {
        Collection<Professeur> prof = liste.values();
        for (Professeur p : prof) {
            System.out.println("IDENTIFIANT PROF: " + p.getId());
            System.out.println("NOM PROF: " + p.getNom());
            System.out.println("PRENOM PROF: " + p.getPrenom());
            //  System.out.println("MATIERES " + p.getMatiere());
            List<Matiere> m = p.getMatiere();
            System.out.println("LISTE DE LA MATIERE");
            for (Matiere mat : m) {
                System.out.println("IDENTIFIANT MATIERE: " + mat.getId());
                System.out.println("NOM MATIERE: " + mat.getNom());


            }
        }
    }
}
