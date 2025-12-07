package Main;

import Graphe.Sommet;
import Graphe.Arete;
import Graphe.PointCollecte;
import Graphe.Secteur;
import Graphe.Habitations;
import Plannification.ContraintesHoraires;

import java.util.ArrayList;
import java.util.List;

public class GrapheCommune {
    private String nomCommune;
    private List<Sommet> sommets;
    private List<Arete> rues;
    private List<PointCollecte> pointCollectes;
    private List<Secteur> secteurs;
    private List<Habitations> habitations;
    private List<ContraintesHoraires> contraintesHoraires;
    private Sommet centreTraitement;


    //constructeur
    public GrapheCommune(String nomCommune) {
        this.nomCommune = nomCommune;
        this.sommets = new ArrayList<Sommet>();
        this.rues = new ArrayList<>();
        this.pointCollectes = new ArrayList<>();
        this.secteurs = new ArrayList<>();
        this.habitations = new ArrayList<>();
        this.contraintesHoraires = new ArrayList<>();
    }

    //guetters
    public String getNomCommune() {
        return nomCommune;
    }
    public List<Sommet> getSommets() {
        return sommets;
    }
    public List<Arete> getRues() {
        return rues; }
    public List<PointCollecte> getPointsCollecte() {
        return pointCollectes;
    }
    public List<Secteur> getSecteurs() {
        return secteurs;
    }
    public List<ContraintesHoraires> getContraintes() {
        return contraintesHoraires;
    }
    public Sommet getCentreTraitement() {
        return centreTraitement;
    }
    public void setCentreTraitement(Sommet s) {
        this.centreTraitement = s;
    }

    public void ajouterSommet(Sommet s) {
        sommets.add(s);
    }

    public void ajouterRue(Arete r) {
        rues.add(r);
    }

    public void ajouterPointCollecte(PointCollecte p) {
        pointCollectes.add(p);
    }

    public void ajouterSecteur(Secteur s) {
        secteurs.add(s);
    }

    public void ajouterContrainte(ContraintesHoraires c) {
        contraintesHoraires.add(c);
    }

    public void signalerTravaux(Arete rue, boolean enTravaux) {
        rue.setPraticable(!enTravaux);
        System.out.println("Rue " + rue + " " +
                (enTravaux ? "fermée pour travaux" : "réouverte"));
    }

    public void afficherStatistiques() {
        System.out.println("\n=== Statistiques de " + nomCommune + " ===");
        System.out.println("Nombre de sommets: " + sommets.size());
        System.out.println("Nombre de rues: " + rues.size());
        System.out.println("Nombre de points de collecte: " + pointCollectes.size());
        System.out.println("Nombre de secteurs: " + secteurs.size());
        System.out.println("Centre de traitement: " +
                (centreTraitement != null ? centreTraitement : "Non défini"));
    }

}

