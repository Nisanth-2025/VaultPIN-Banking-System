package com.vaultpin.ui;

import java.util.*;

public class Menu
{
    private static char choice;
    public Menu()
    {
        choice = '0';
        Choose_Menu();
    }
    public void Choose_Menu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("1. Create Account \n"+"2. User Login \n"+"3. Admin Login \n" + "4. Exit");  
        System.out.println("===========================================");
        System.out.print("Enter your Preference to Proceed [1/2/3/4] : ");
        choice = sc.next().charAt(0);
        Check_Menu();
    }

    public void Check_Menu()
    {
        if (choice == '1'|| choice == '2' || choice == '3' || choice == '4') 
        {
            System.out.println("Loading...");
            try
            {
                Thread.sleep(5000);
            }
            
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            choice = '0';
            try
            {
                Thread.sleep(2000);
                System.out.println("Error : Unexpected Input");
                try{
                    Thread.sleep(3000);
                }
            
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                
            }
            
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            Choose_Menu();
        }
    }
    public char getchoice()
    {
        return choice;
    }
}