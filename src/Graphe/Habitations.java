package Graphe;

public class Habitations extends Sommet {
    private int numero;
    private Arete rue;
    private int positionSurRue;

    //Constructeurs
    public Habitations(int id, String nom, double latitude, double longitude, int numero, Arete rue, int positionSurRue) {
        super(id, nom, latitude, longitude);
        this.numero = numero;
        this.rue = rue;
        this.positionSurRue = positionSurRue;
    }

    //Guetters
    public int getNumero() {
        return numero;
    }
    public Arete getRue() {
        return rue;
    }
    public double getPositionSurRue() {
        return positionSurRue;
    }

}
