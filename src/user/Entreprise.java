package user;

public class Entreprise extends Utilisateur{
    public Entreprise(String id, String motdepasse){
        super(id,motdepasse);
    }

    @Override
    public void afficherMenu(){
        new MenuEntrprise(this).afficher();
    }

}
