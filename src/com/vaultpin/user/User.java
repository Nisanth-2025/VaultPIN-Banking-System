package com.vaultpin.user;

import com.vaultpin.account.CreateAcc;
import java.util.*;

public class User extends CreateAcc
{
    private int pin;
    private String name;
    private double balance;
    private long acc_num;
    private int attempts;
    private char choice;
    CreateAcc ca;
    Scanner sc = new Scanner(System.in);

    public User(CreateAcc ca)
    {
        this.ca = ca;
        acc_num = 0;
        name = "";
        pin = 0;
        balance = 0;
        attempts = 3;
        choice = 0;
    }
    public void verify_Login()
    {
        while(attempts>0)
        {
            System.out.print("Enter your Account Number : ");
            long acc_no = sc.nextLong();
            System.out.print("Enter the 6-digit Pin : ");
            int check_pin = sc.nextInt();
            if(ca.user_acc_no.get(check_pin) == acc_no)
            {
                pin = check_pin;
                acc_num = acc_no;
                name = ca.user_name.get(acc_num);
                balance = ca.user_balance.get(acc_num);
                System.err.println("Login Successful");
                User_Login();
                break;
            }
            else
            {
                if(attempts == 0)
                {
                    System.out.println("Account is Blocked.Please Contact the Bank");
                    break;
                }
                attempts -=1;
                System.out.println("Invalid Credentials or Account Doesn't Exist");
                System.out.println(attempts+" Attempts left");
            }  
        }
        
    }

    public void User_Login()
    {
        System.out.println("===========================================");
        System.out.println("Account Info");
        System.out.println("===========================================");
        System.out.println("Account Number : " + ca.user_acc_no.get(pin));
        System.out.println("Holder Name : " + ca.user_name.get(acc_num));
        System.out.println("Balance : " + "Hidden");
        System.out.println("Pin : " + "******");
        System.out.println("===========================================");
        System.out.println();
        Verify_Request();
    }
    public void Verify_Request()
    {
        System.out.println("===========================================");
        System.out.println("1. Deposit \n" + "2. Withdraw \n" + "3. Check Balance \n" + "4. Change PIN \n" + "5. Back");
        System.out.println("===========================================");
        System.out.print("Enter a Option to Proceed [1/2/3/4/5] : ");
        choice = sc.next().charAt(0);
        if(choice == '1' || choice == '2' || choice == '3' || choice == '4' || choice == '5')
        {
           Proceed_Request(choice); 
        }
        else
        {
            System.err.println("Error : Invalid Entry");
            Verify_Request();
        }
    }
    public void Proceed_Request(char ch)
    {
        switch(choice)
        {
            case '1':
            User_Deposit();
            break;
            case '2':
            User_Withdraw();
            break;
            case '3':
            User_Balance();
            case '5':
            
        }
    }

    public void User_Deposit()
    {
        int dep_amt = 0;
        System.out.println("Enter the Amount to Deposit : ");
        dep_amt = sc.nextInt();
        if(dep_amt >0)
        {
            ca.user_balance.put(acc_num,dep_amt+balance);
            System.out.println("===========================================");
            System.out.println("Transaction Reciept");
            System.out.println("Account Number : " + ca.user_acc_no.get(pin));
            System.out.println("Holder Name : " + ca.user_name.get(acc_num));
            System.out.println("Amount Deposited : " + dep_amt);
            System.out.println("Balance : " + ca.user_balance.get(acc_num));
            System.out.println("===========================================");
            Verify_Request();
        }
        else
        {
                System.err.println("Please Enter Funds greater than 0."); 
                User_Deposit();   
        }
        
    }

    public void User_Withdraw()
    {
        double with_amt = 0;
        System.out.println("Enter the Amount to Withdraw : ");
        with_amt = sc.nextDouble();
        if (with_amt<=ca.user_balance.get(acc_num) && with_amt!= 0)
        {
            ca.user_balance.put(acc_num,ca.user_balance.get(acc_num)-with_amt);
            System.out.println("===========================================");
            System.out.println("Transaction Reciept");
            System.out.println("Account Number : " + ca.user_acc_no.get(pin));
            System.out.println("Holder Name : " + ca.user_name.get(acc_num));
            System.out.println("Amount Withdrawn : " + with_amt);
            System.out.println("Balance : " + ca.user_balance.get(acc_num));
            System.out.println("===========================================");
            Verify_Request();
        }
        else
        {
            if (with_amt == 0) 
            {
                System.err.println("Please Enter Funds greater than 0.");
                User_Withdraw();    
            }
            else
            {
                System.err.println("Insufficient Funds");
                User_Withdraw();
            }
            
        }  
    }
    public void User_Balance()
    {
        System.out.println("===========================================");
        System.out.println("Information Reciept");
        System.out.println("Account Number : " + ca.user_acc_no.get(pin));
        System.out.println("Holder Name : " + ca.user_name.get(acc_num));
        System.out.println("Balance : " + ca.user_balance.get(acc_num));
        System.out.println("===========================================");
        Verify_Request();
    }
    public void Change_Pin()
    {

    }
}