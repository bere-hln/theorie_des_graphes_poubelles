package Plannification;

public class Camion {
    private int id;
    private int chargeMax;
    private int chargeActuelle;
    private boolean dispo;

    //constrcuteurs
    public Camion(int id, int chargeMax, int chargeActuelle) {
        this.id = id;
        this.chargeMax = chargeMax;
        this.chargeActuelle = chargeActuelle;
        this.dispo = true;
    }

    //guetters
    public int getId() {
        return id;
    }
    public int getChargeMax() {
        return chargeMax;
    }
    public int getChargeActuelle() {
        return chargeActuelle;
    }
    public boolean isDispo() {
    return dispo;}

    public void charger(int quantite){
        if (chargeActuelle + quantite <= chargeMax) {
            chargeActuelle += quantite;
        }
    }

    public void vider(){
        chargeActuelle = 0;
    }

    public void dispo(boolean dispo){
        this.dispo = dispo;
    }

}

