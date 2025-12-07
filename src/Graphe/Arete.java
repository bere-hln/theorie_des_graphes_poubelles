package Graphe;

public class Arete {
    private int id;
    private Sommet sommetDepart;
    private Sommet sommetArrivee;
    private int distance;
    private boolean oriente;
    private boolean praticable; //contraintes travaux theme 3

    public Arete(int id, Sommet sommetDepart, Sommet sommetArrivee, int distance, boolean oriente, boolean praticable){
        this.id = id;
        this.sommetDepart = sommetDepart;
        this.sommetArrivee = sommetArrivee;
        this.distance = distance;
        this.oriente = oriente;
        this.praticable = praticable;
    }

    public int getId() {
        return id;
    }

    public Sommet getSommetDepart(){
        return sommetDepart;
    }

    public Sommet getSommetArrivee() {
        return sommetArrivee;
    }

    public int getDistance() {
        return distance;
    }

    public boolean estOriente() {
        return oriente;
    }

    public boolean estPraticable()
    { return praticable;}

    @Override
    public String toString() {
        return "Arete " + id + " : " + sommetDepart.getNom() + " -> " + sommetArrivee.getNom()
                + " (" + distance + "m, orientée =" + oriente + ")";
    }
}
