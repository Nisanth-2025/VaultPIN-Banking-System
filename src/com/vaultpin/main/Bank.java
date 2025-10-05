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
        Menu obj1 = new Menu();
        CreateAcc ca = new CreateAcc();
        User us = new User(ca);
        Admin ad = new Admin();
        while (ch != '4')
        {
            ch = obj1.getchoice();
            switch(ch)
            {
                case '1':
                ca.Extract_Info();
                break;
                case '2':
                us.verify_Login();
                break;
                case '3':
                ad.Admin1();
                break;
            }
            if(ch != '4')
            {
                obj1.Choose_Menu();
            }
        }
        System.out.println("Exit Successful !");
    }
}