package Graphe;

public class PointCollecte extends Sommet{
    private int capacite;
    private int quantite;
    private Sommet position;

    //constructeurs
    public PointCollecte(int id, String nom, double latitude, double longitude, int capacite, int quantite, Sommet position) {
        super(id, nom, latitude, longitude);
        this.capacite = capacite;
        this.quantite = 0;
        this.position = position;
    }

    //guetters
    public int getQuantite() {
        return quantite;
    }
    public int getCapacite() {
        return capacite;
    }
    public Sommet getPosition() {
        return position;
    }

    public void setQuantite(int q) {
        this.quantite = q;
    }


    public int estPlein(){
        return quantite = capacite;
    }
}
