package Graphe;

public class Habitations {
    private int numero;
    private Arete rue;
    private int positionSurRue;

    //Constructeurs
    public Habitations(int numero, Arete rue, int positionSurRue) {
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
