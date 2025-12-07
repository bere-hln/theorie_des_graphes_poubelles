import java.util.ArrayList;
public class Sommet {
    private int  id;
    private String nom;
    private double latitude;
    private double longitude;
    //thème 3
    private int quantite = 0;
    private int couleur = -1;
    private ArrayList<Arete> aretes;

    // contructeurs
    public Sommet(int id, String nom, double latitude, double longiutde){
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
    public double getLatitude(){
        return latitude;
    }
    public double getLongitude(){
        return longitude;
    }

    //thème 3
    public int getQuantite() {return quantite;}

    public void setQuantite(int q) {this.quantite = q;}

    public int getCouleur() {return couleur;}

    public void setCouleur(int couleur) {this.couleur = couleur;}

    @Override
    public String toString() {
        return "Sommet " + id + "," + nom;
    }
}
