package com.company;

import java.util.Scanner;

public class Help {
    public static void help() {
        System.out.println("MENU : ");
        System.out.println("Step 1 to create a default character."); // create and display a character
        System.out.println("Step 2 to display characters.");
        System.out.println("Step 3 to choice a character for list his details. ");
        System.out.println("Step 4 to start fight between 2 characters");
        System.out.println("step 5 to remove a character.");
        System.out.println("step 6 to create a Warrior.");
        System.out.println("step 7 to create a Wizard.");
        System.out.println("step 8 to create a Thief.");
        System.out.println("Step 9 to exit the game. ");
        System.out.println("Step 0 for help ....");

    }
    public static int getUserChoice(){

        // affichez un message
        // instancier le scanner
        // lire la ligne de l'user

        // test the value entered by the user
        // if it is correct we return the value (int)
        // if it is incorrect we return -1
        System.out.println("Entrez une commande : ");
        Scanner sc = new Scanner(System.in);

        int choice;

        try {
            choice = sc.nextInt();
        }
        catch(Exception ex){
            choice = -1;
        }

        if (choice < 0){
            choice = -1;
        }
        return choice;
    }
}
