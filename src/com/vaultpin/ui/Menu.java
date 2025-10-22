package com.vaultpin.ui;

import java.util.*;

public class Menu
{
    //DELCARED THE VAR CHOICE TO GET CHOICE FROM USER
    private static char choice;

    //CONSTRUCTOR
    public Menu()
    {
        choice = '0';
    }

    //GETS CHOICE FROM THE USER
    public void Choose_Menu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("1. Create Account \n"+"2. User Login \n"+"3. Exit Application");  
        System.out.println("===========================================");
        System.out.print("Enter your Preference to Proceed [1/2/3] : ");
        choice = sc.next().charAt(0);
        Check_Menu();
    }

    //VALIDATES THE CHOICE
    public void Check_Menu()
    {
        if (choice == '1'|| choice == '2' || choice == '3') 
        {
            System.out.println("Loading...");
        }
        else
        {
            choice = '0';
            System.out.println("Error : Unexpected Input");
            Choose_Menu();
        }
    }

    //FETCH THE USER'S CHOICE
    public char getchoice()
    {
        return choice;
    }
}