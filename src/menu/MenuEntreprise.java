package menu;
import user.Entreprise;
import java.util.Scanner;

public class MenuEntreprise {
    private final Entreprise entreprise;
    private final Scanner sc = new Scanner(System.in);

    public MenuEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public void afficher() {
    while (true) {
        System.out.println("\n===== MENU ENTREPRISE =====");
        System.out.println("1. Calculer les itinéraires de ramassage");
        System.out.println("2. Planifier les jours de collectes");
        System.out.println("3. Programmer les camions");
        System.out.println("4. Quitter");
        System.out.println("Choix:");
    }
     int choix = sc.nextInt();

    switch (choix){
        case 1: calculerItineraires();
        case 2: planifierJours();
        case 3: programmerCamions();
        case 4: {return;}
        default: System.out.println("Erreur");
    }
    }
    private void calculerItineraires() {
        System.out.println("(À implémenter) TSP, postier chinois…");
    }

    private void planifierJours() {
        System.out.println("(À implémenter) Coloration du graphe…");
    }

    private void programmerCamions() {
        System.out.println("(À implémenter) Affectation camions/tournées…");
    }
}
