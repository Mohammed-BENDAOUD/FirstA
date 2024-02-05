public class Habit extends Article {
    public String taille;
    public String couleur;

    public Habit(int numeroSerie, String marque, String nom, double prixHorsTaxe, String taille, String couleur) {
        super(numeroSerie, marque, nom, prixHorsTaxe);
        this.taille = taille;
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return super.toString() + " Habit [taille=" + taille 
        + ", couleur=" + couleur + "]";
    }
}
