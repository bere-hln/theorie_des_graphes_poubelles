
package Graphe;
import java.util.ArrayList;

public class Arete {
    private int id;
    private Sommet sommetDepart;
    private Sommet sommetArrivee;
    private int distance;
    private boolean oriente;
    private boolean praticable; //si travaux
    private int nbrVoies;


//constructeurs
    public Arete(int id, Sommet sommetDepart, Sommet sommetArrivee, int distance,boolean oriente, boolean praticable, int nbrVoies) {
            this.id = id;
            this.sommetDepart = sommetDepart;
            this.sommetArrivee = sommetArrivee;
            this.distance = distance;
            this.oriente = oriente;
            this.praticable = praticable;
            this.nbrVoies = nbrVoies;
    }

        //guetters
        public int getId () {
            return id;
        }
        public Sommet getSommetDepart () {
            return sommetDepart;
        }
        public Sommet getSommetArrivee () {
            return sommetArrivee;
        }
        public int getDistance () {
            return distance;
        }
        public boolean estOriente () {
            return oriente;
        }
        public boolean estPraticable () {
            return praticable;
        }
        public int getNbrVoies () {
            return nbrVoies;
        }

        @Override
        public String toString () {
            return "Arete " + id + " : " + sommetDepart.getNom() + " -> " + sommetArrivee.getNom()
                    + " (" + distance + "m, orientée=" + oriente + ")";

        }

    }
