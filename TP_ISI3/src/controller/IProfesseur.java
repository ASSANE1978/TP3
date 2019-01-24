package controller;

import entities.Professeur;

import java.util.Map;
import java.util.TreeMap;

public interface IProfesseur {
  public Professeur creation();
  public Map<Integer,Professeur> liste();
  public void AffichProfesseur(Map<Integer,Professeur> liste);


}
