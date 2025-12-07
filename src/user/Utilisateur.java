package user;

public abstract class Utilisateur {
    protected String id;
    protected String nom;
    protected String motdepasse;

    public Utilisateur(String id, String nom, String motdepasse) {
        this.id = id;
        this.nom = nom;
        this.motdepasse = motdepasse;
    }

    public boolean verifierMotDePasse(String motdepasse, String mdp) {
        return motdepasse.equals(mdp);
    }

    public String getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }

    //méthode abstraite pour avoir des menus différents pour chaque type d'utilisateur
    public abstract void afficherMenu();
}
