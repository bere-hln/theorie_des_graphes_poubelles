package Plannification;
import Graphe.Sommet;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Tournee {
    private int id;
    private Camion camion;
    private LocalDate date;
    private LocalTime heure;
    private ArrayList<Sommet> itineraire;
    private int distanceTotale;
    private int quantiteCollectee;

    public Tournee(int id, Camion camion, LocalDate date, LocalTime heure, ArrayList<Sommet> itineraire, int  distanceTotale, int quantiteCollectee) {
        this.id = id;
        this.camion = camion;
        this.date = date;
        this.heure = heure;
        this.itineraire = itineraire;
        this.distanceTotale = distanceTotale;
        this.quantiteCollectee = quantiteCollectee;
    }

    //guetters
    public int getId() {
        return id;
    }
    public Camion getCamion() {
        return camion;
    }
    public LocalDate getDate() {
        return date;
    }
    public LocalTime getHeure() {
        return heure;
    }
    public ArrayList<Sommet> getItineraire() {
        return itineraire;
    }
    public int getDistanceTotale() {
        return distanceTotale;
    }
    public int getQuantiteCollectee() {
        return quantiteCollectee;
    }

    //methodes
    public void ajouterEtape(Sommet s,int distance){
        itineraire.add(s);
        this.distanceTotale+=distance;
    }

    @Override
    public String toString() {
        return "Tournée"+ id + " - Camion " + camion.getId() +
                " - Date: " + date + " - Distance: " + String.format("%.2f", distanceTotale) +
                "m - Collecte: " + String.format("%.2f", quantiteCollectee) + "kg";
    }

}
