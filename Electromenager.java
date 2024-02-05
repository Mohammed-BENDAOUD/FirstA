class Electromenager extends Article {
    private double poids;
    private int duree;
    private String dateFinGarantie;

    public Electromenager(int numSerie, String marque, String nom, double prixHT, double poids, int duree, String dateFinGarantie) {
        super(numSerie, marque, nom, prixHT);
        this.poids = poids;
        this.duree = duree;
        this.dateFinGarantie = dateFinGarantie;
    }

    public String toString() {
        return super.toString() +
                "Poids: " + poids + "\n" +
                "Durée: " + duree + "\n" +
                "Date Fin Garantie: " + dateFinGarantie + "\n";
    }
}
