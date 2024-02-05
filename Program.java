public class Program {
    public static void main(String[] args) {
        Habit habit1 = new Habit(123, "Marquel", "Nom1", 103.0, "M", "red");
        Habit habit2 = new Habit(165, "Marque2", "Nom2", 999.0, "XL", "bluc");

        Electromenager em1 = new Electromenager(999, "MarqueX", "NomX", 3750.0, 50.0, 30, "31/1/2024");
        Electromenager em2 = new Electromenager(873, "MarqueY", "NomY", 1200.0, 25.0, 365, "12/12/2024");
        Electromenager em3 = new Electromenager(1234, "MarqueZ", "NomZ", 1500.0, 40.0, 180, "05/06/2025");

        Magasin myPOS = new Magasin("MyPOS");
        myPOS.ajouterH(habit1);
        myPOS.ajouterH(habit2);
        myPOS.ajouterEM(em1);
        myPOS.ajouterEM(em2);
        myPOS.ajouterEM(em3);

        try {
            Article article = myPOS.rechercherArticle(123);
            System.out.println(article.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------------------------------------");
        System.out.println(myPOS.toString());

        System.out.println("---------------------------------------");
        myPOS.enregistrerStocks("myStocks.txt");
    }
}
