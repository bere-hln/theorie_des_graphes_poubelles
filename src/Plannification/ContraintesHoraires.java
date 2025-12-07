package Plannification;
import Graphe.Arete;
import java.time.LocalTime;

public class ContraintesHoraires {
    private Arete rue;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private String raison;

    //constructeurs
    public ContraintesHoraires(Arete rue, LocalTime heureDebut, LocalTime heureFin, String raison) {
        this.rue = rue;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.raison = raison;
    }

    //guetters
    public Arete getRue() {
        return rue;
    }
    public LocalTime getHeureDebut() {
        return heureDebut;
    }
    public LocalTime getHeureFin() {
        return heureFin;
    }
    public String getRaison() {
        return raison;
    }


    //methode pour accéder aux propriété de notre rue
    public boolean ruePraticable(){
        return rue.isPraticable();
    }
}

