package com.vaultpin.main;

import com.vaultpin.account.CreateAcc;
import com.vaultpin.admin.Admin;
import com.vaultpin.ui.Menu;
import com.vaultpin.user.User;

public class Bank{

    public static void main(String[] args)
    {
        char ch = ' ';
        System.out.println("Welcome to VaultPIN Banking System");
        Menu mn = new Menu();
        mn.Choose_Menu();
        CreateAcc ca = new CreateAcc();
        User us = new User(ca);
        Admin ad = new Admin();
        while (ch != '3')
        {
            ch = mn.getchoice();
            switch(ch)
            {
                case '1':
                ca.Get_User_Info();
                break;
                case '2':
                us.verify_Login();
                break;
            }
            if(ch != '3')
            {
                mn.Choose_Menu();
            }
        }
        System.out.println("Exit Successful !");
    }
}