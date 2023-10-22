import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Création d'une ArrayList
        ArrayList<String> fruits = new ArrayList<String>();

        // Ajout d'éléments
        fruits.add("Pomme");
        fruits.add("Banane");
        fruits.add("Orange");
        fruits.add("tomates");
        fruits.add("Pêche");

        // Accès aux éléments
        String premierFruit = fruits.get(0);
        System.out.println("Premier fruit: " + premierFruit);

        // Modification d'un élément
        fruits.set(1, "Fraise");

        // Suppression d'un élément
        fruits.remove(2);

  
        // Faire sortir le 5 element
       String recupFruit =fruits.get(3);
         System.out.println(" 5ème fruit: " + recupFruit);


        // Parcours de la liste
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

