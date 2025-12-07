package Graphe;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Secteur extends Sommet{
    private ArrayList<Arete> rues;
    private double quantiteDechetEstimee;

    //constructeurs
    public Secteur(int id, String nom, double latitude, double longitude,ArrayList<Arete> rues,double quantiteDechetEstimee) {
        super(id, nom, latitude, longitude);
        this.nom = nom;
        this.rues = new ArrayList<>();
        this.quantiteDechetEstimee = 0;
    }
 //guetters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public ArrayList<Arete> getRues() { return rues; }
    public double getQuantiteDechetEstimee() { return quantiteDechetEstimee; }
    public void setQuantiteDechetEstimee(double q) { this.quantiteDechetEstimee = q; }

public void ajouterRues(Arete rue){
        rues.add(rue);
}

}
