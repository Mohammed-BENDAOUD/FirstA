import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Magasin {
    public String nom;

    public ArrayList<Electromenager> listeElectromenagers;
    public ArrayList<Habit> listeHabits;

    public Magasin(String nom) {
        this.nom = nom;
        listeElectromenagers = new ArrayList<>();
        listeHabits = new ArrayList<>();
    }

    public void ajouterEM(Electromenager em) {
        listeElectromenagers.add(em);
    }

    public void ajouterH(Habit h) {
        listeHabits.add(h);
    }

    public Article rechercherArticle(int numSerie) {
        for (Habit h : listeHabits) {
            if (h.numeroSerie == numSerie) {
                return h;
            }
        }
        for (Electromenager em : listeElectromenagers) {
            if (em.numeroSerie == numSerie) {
                return em;
            }
        }
        throw new IllegalArgumentException("Aucun Article ne correspond à votre Recherche");
    }

    public void enregistrerStocks(String nomFichier) {
        try {
            FileWriter writer = new FileWriter(nomFichier);
            writer.write(toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Les Articles du Magasin: ").append(nom).append("\n");

        sb.append("Liste des Habits:\n");
        for (Habit h : listeHabits) {
            sb.append(h.toString());
        }
        System.out.println("-----------------------------------");
        sb.append("Liste des Electroménagers:\n");
        for (Electromenager em : listeElectromenagers) {
            sb.append(em.toString());
        }

        return sb.toString();
    }
}
