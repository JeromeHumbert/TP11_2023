import java.util.ArrayList;


public class GestionnaireTaches {
    private static ArrayList<Tache> listeTaches = new ArrayList<>();

    public static void chargerDonnees(String[][] donnees) {
        // A compléter
    }

    public static void afficherTaches(String tri) {
        // A compléter
    }


    // A compléter
    

    public static void main(String[] args) {
        chargerDonnees(FileToStr.lireCsv("taches.csv"));
        afficherTaches("Aucun tri (ordre d'insertion)");

        // A compléter
    }
}
