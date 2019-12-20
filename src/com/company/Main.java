package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * the main class, where the prgm is executing
     * @param args
     */
    public static void main(String[] args) {
	// write your code here
        System.out.println("Application has started");
        List<Users> listUser;
        listUser = new ArrayList<>();
        List<Stocks> listStocks;
        listStocks = new ArrayList<>();
        Help.help();

        int ch;
        do{
            ch = Help.getUserChoice();
            // if command is valid, process it
            if( ch != -1 ){
                Help.processCmd( ch, listUser, listStocks );
            }
        }
        while (ch != 15);
    }

}
