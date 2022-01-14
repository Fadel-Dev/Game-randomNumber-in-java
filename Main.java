package sn.fadelArt.game;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our Game !");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrz votre Nom");
        String name = scanner.next();
        System.out.println("Hello "+ name );


        System.out.println("Veuillez faire un choix");
        System.out.println("\t 1 pour jouer");
        System.out.println("\t 2 pour quitter");
        int choix = scanner.nextInt();
        while (choix != 1) {

            System.out.println("\t 1 pour jouer");
            System.out.println("\t 2 pour quitter");
            choix = scanner.nextInt();

        }

        int reponse;
        int cible;
        int count=0;
        boolean finish =false;
        System.out.println("Veuillez choisir un nombre entre 0 et 20");
        do {
            count++;
            Random random = new Random();
            cible = random.nextInt(3);

            reponse = scanner.nextInt();
            //condition
                if (count==3){
                    System.out.println("Game Over");
                    System.out.println("The number was " + cible);
                } else {
                    if (reponse ==cible)
                        System.out.println("Bravo vous avez gagnee avec " + count + " tentative");
                    else if (reponse >cible)
                        System.out.println("Veuillez choisir un nombre plus petit");
                    else
                        System.out.println("Veuillez choisir un nombre plus grand");
                }


        } while (!finish);


    }
}
