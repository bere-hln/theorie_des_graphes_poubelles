package user;
import Graphe.Graphe;

import menu.MenuCollectivité;

public class Collectivité extends Utilisateur{
    private Graphe commune;
    public Collectivité(String id, String nom, String motdepasse) {
        super(id,nom,motdepasse);
        this.commune = commune;
    }
    @Override
    public void afficherMenu() {
        new MenuCollectivité(this).afficher();
    }
}
