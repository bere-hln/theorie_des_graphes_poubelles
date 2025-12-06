public class Sommet {
    private int  id;
    private String nom;
    //thème 3
    private int quantite = 0;
    private int couleur = -1;
    private List<Arete> aretes;
    public Sommet(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.aretes = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    //thème 3
    public int getQuantite() {return quantite;}

    public void setQuantite(int q) {this.quantite = q;}

    public int getCouleur() {return couleur;}

    public void setCouleur(int couleur) {this.couleur = couleur;}

    @Override
    public String toString() {
        return "Sommet " + id + "," nom +;
    }
}
