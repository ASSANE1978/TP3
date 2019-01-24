package presentation;

import controller.IProfesseur;
import controller.IProfesseurempl;
import entities.Professeur;

import java.util.Map;

public class Main {
    public static void main(String[] args){
        IProfesseur ip = new IProfesseurempl();
        Map<Integer,Professeur> p = ip.liste();
        ip.AffichProfesseur(p);

    }
}
