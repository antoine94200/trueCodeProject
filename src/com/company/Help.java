package com.company;

import java.util.List;
import java.util.Scanner;

public class Help {
    public static void help() {
        System.out.println("MENU : ");
        System.out.println("Step 1 to add user."); // create and display a character
        System.out.println("Step 2 to edit user.");
        System.out.println("Step 3 to remove user. ");
        System.out.println("Step 4 to list user");
        System.out.println("step 5 to add stock.");
        System.out.println("step 6 to edit stock.");
        System.out.println("step 7 to remove stock.");
        System.out.println("step 8 to list stock.");
        System.out.println("Step 9 to end purchase. ");
        System.out.println("Step 0 for help ....");
        System.out.println("Step 10 for save");
        System.out.println("Step 11 for restore");
        System.out.println("Step 12 for  exit");
    }

    public static int getUserChoice() {

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
        } catch (Exception ex) {
            choice = -1;
        }

        if (choice < 0) {
            choice = -1;
        }
        return choice;
    }

    public static Users addUser () {

        System.out.println("Enter the name of your user : ");
        Scanner sc = new Scanner(System.in);
        String nom = sc.next();

        System.out.println("Enter the firstname of your user : ");
        Scanner scan = new Scanner(System.in);
        String prenom = scan.next();

        System.out.println("Enter the work of your user : ");
        Scanner sca = new Scanner(System.in);
        String metier = sca.next();

        System.out.println("Enter the departement of your user : ");
        Scanner scann = new Scanner(System.in);
        String depart = scann.next();
        int departement = Integer.parseInt(depart);

        System.out.println("Enter the age of your user : ");
        Scanner scanne = new Scanner(System.in);
        String ageUser = scann.next();
        int age = Integer.parseInt(ageUser);

        Users user = new Users(nom, prenom, metier, departement, age);
        System.out.println("Your user has been created with success!");
        System.out.println(user);

        return user;
    }


    public static void listUser (List<Users> listCP){

        int i;
        for (i = 0; i < listCP.size() ; i++) {
            System.out.println("Index of the character : " + i);
            System.out.println(listCP.get(i));
        }

    }


    public static void removeUser (List<Users> listU) {
        System.out.println("enter the index of your character : ");
        int ch = getUserChoice();
        System.out.println("Are you sure that you wants to delete this character? Step 1 to confirm. ");
        int uc = getUserChoice();
        if (uc == 1) {
            // remove object Character at index ch and retrieve this object from method return
            Users removeUser = listU.remove(ch);
            System.out.println("The user named " + removeUser.getFirstname()+ removeUser.getWork() + removeUser.getWork()+ " has been removed ^^");
        }
    }

    public static String addStock () {

        System.out.println("Enter the name of your stock : ");
        Scanner sc = new Scanner(System.in);
        String reference = sc.next();

        System.out.println("Enter the reference of your stock : ");
        Scanner scan = new Scanner(System.in);
        String stock = scan.next();

        System.out.println("Enter the open montant of your stock : ");
        Scanner sca = new Scanner(System.in);
        String openMontant = sca.next();
        int openM = Integer.parseInt(openMontant);


        System.out.println("Enter the departement of your user : ");
        Scanner scann = new Scanner(System.in);
        String depart = scann.next();
        int departement = Integer.parseInt(depart);


        return stock;
    }


    public static void listStock (List<Stocks> listCP){

        int i;
        for (i = 0; i < listCP.size() ; i++) {
            System.out.println("Index of the character : " + i);
            System.out.println(listCP.get(i));
        }

    }


    public static void removeStock (List<Stocks> listS) {
        System.out.println("enter the index of your Stock : ");
        int ch = getUserChoice();
        System.out.println("Are you sure that you wants to delete this character? Step 1 to confirm. ");
        int uc = getUserChoice();
        if (uc == 1) {
            // remove object Character at index ch and retrieve this object from method return
            Stocks removeStock = listS.remove(ch);
            System.out.println("The user named " + removeStock.g+ " has been removed ^^");
        }
    }


    public static void processCmd(int cmdNumber, List<Users> listCP) {

        if (cmdNumber == 0) {
            Help.help();
        }
        if (cmdNumber == 1) {
            listCP.add(Help.addUser());
        }
       // if (cmdNumber == 2) {
         //   Help.editUser(listCP);
       // }
        if (cmdNumber == 3) {
            Help.removeUser(listCP);
        }
        if (cmdNumber == 4) {
            Help.listUser(listCP);
        }
        if (cmdNumber == 5) {
            Help.addStock(listCP);
        }
       // if (cmdNumber == 6) {
         //   listCP.add(Help.editStock());
        //}
        if (cmdNumber == 7) {
            listCP.add(Help.removeStock());
        }
        if (cmdNumber == 8) {
            listCP.add(Help.listStock());
        }
        /*if (cmdNumber == 9) {
            listCP.add(Help.endPurchase());
        }
        if (cmdNumber == 10) {
            listCP.add(Help.save());
        }
        if (cmdNumber == 11) {
            listCP.add(Help.restore());
        }
        if (cmdNumber == 12) {
           listCP.add(Help.restore());*/


    }

}
