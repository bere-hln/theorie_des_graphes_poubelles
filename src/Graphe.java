import java.util.List;
import java.util.ArrayList;

public abstract class Graphe {
    protected List<Sommet> sommets;
    protected List<Arete> aretes;

    public Graphe() {
        this.sommets = new ArrayList<>();
        this.aretes = new ArrayList<>();
    }

    public void ajouterSommet(Sommet s){
        sommets.add(s)
    }

    public void ajouterArete(Arete a) {
        aretes.add(a);
    }

    public List<Sommet> getSommets() {
        return sommets;
    }

    public List<Arete> getAretes() {
        return aretes;
    }

    public abstract List<Sommet> getVoisins(Sommet s);

    public abstract List<Arete> getAretesSortantes(Sommet s);

    @Override
    public String toString() {
        return "Graphe : " + sommets.size() + " sommets, "
                + aretes.size() + " arêtes.";
    }

}
