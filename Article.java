import java.util.*;

public class Article{

    public int numeroSerie;
    public String marque;
    public String nom;
    public double prixHorsTaxe;

    public Article(){}
    public Article(int numeroSerie, String marque, String nom, double prixHorsTaxe) {
        this.numeroSerie = numeroSerie;
        this.marque = marque;
        this.nom = nom;
        this.prixHorsTaxe = prixHorsTaxe;
    }

    //public int getNumeroSerie() {return numeroSerie;}

    public String toString() {
        return "Article [numeroSerie=" + numeroSerie 
        + ", marque=" + marque 
        + ", nom=" + nom 
        + ", prixHorsTaxe="+ prixHorsTaxe + "]";
    }

    public boolean equals(Object obj) {
        return this == obj || (Objects.equals(this.getClass(),obj.getClass())
        && Objects.equals(this.numeroSerie,((Article)obj).numeroSerie));
    }
}