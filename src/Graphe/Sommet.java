
package Graphe;
import java.util.ArrayList;

import java.util.List;
import java.util.ArrayList;


public class Sommet {
    protected int id;
    protected String nom;
    protected double latitude;
    protected double longitude;
    //thème 3
    private int couleur = -1;
    private ArrayList<Arete> aretes;

    // contructeurs
    public Sommet(int id, String nom, double latitude, double longitude) {
        this.id = id;
        this.nom = nom;
        this.latitude = latitude;
        this.longitude = longitude;
        this.aretes = new ArrayList<>();
    }

    //guetters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    //thème 3

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Sommet " + id + " : " + nom;
    }
}
