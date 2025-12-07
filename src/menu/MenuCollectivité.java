package menu;
import user.Collectivité;
import java.util.Scanner;

public class MenuCollectivité {
    private final Collectivité collectivite;
    private final Scanner sc = new Scanner(System.in);

    public MenuCollectivité(Collectivité collectivite) {
        this.collectivite = collectivite;
    }

    public void afficher() {
        while (true){
            System.out.println("===== MENU COLLECTIVITE =====");
            System.out.println("1. Soumettre/Modifier le plan de la commune");
            System.out.println("2. Signaler des travaux sur une rue");
            System.out.println("3. Ajouter une contrainte horaire");
            System.out.println("4. Consulter les quantités de déchets collectés");
            System.out.println("5. Visualiser les statistiques de la commune");
            System.out.println("6. Gérer les secteurs géographiques");
            System.out.println("7 . Déconnexion");
            System.out.println("Choix:");
        }
        int choix = sc.nextInt();
        switch (choix) {
            case 1: soumettrePlan();
            case 2: modifierCirculation();
            case 3: definirHoraires();
            case 4: consulterDechets();
            case 5: {return;}
            default: System.out.println("Erreur");
        }
    }
    private void soumettrePlan() {
        System.out.println("(À implémenter) Import d’un graphe…");
    }

    private void modifierCirculation() {
        System.out.println("(À implémenter) Modification des routes / travaux…");
    }

    private void definirHoraires() {
        System.out.println("(À implémenter) Contraintes horaires…");
    }

    private void consulterDechets() {
        System.out.println("(À implémenter) Consultation des quantités récoltées…");
    }
}
