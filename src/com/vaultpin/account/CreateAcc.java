package com.vaultpin.account;

import java.util.*;

public class CreateAcc
{
    private int pin;
    private String name;
    private double balance;
    private long acc_num;

    protected static HashMap <Integer,Long> user_acc_no = new HashMap<>();
    protected static HashMap <Long,String> user_name = new HashMap<>();
    protected static HashMap <Long,Integer> user_pin = new HashMap<>();
    protected static HashMap <Long,Double> user_balance = new HashMap<>();

    public CreateAcc() 
    {
        pin =0;
        name="";
        balance=0;
        acc_num=0;
    }
    public void Extract_Info()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        name=sc.nextLine();
        while(true)
        {
            int initial_pin=0;
            int confirm_pin = 0;
            System.out.println("Enter a 6-digit unique Pin : ");
            initial_pin = sc.nextInt();
            System.out.println("Re-Enter the pin to Confirm");
            confirm_pin = sc.nextInt();
            if(initial_pin == confirm_pin && String.valueOf(initial_pin).length() == 6 && String.valueOf(confirm_pin).length() == 6 )
            {
                pin = initial_pin;
                break;
            }
            else
            {
                System.out.println("Pin Doesn't Match or Doesn't meet the required size.Please Re-Enter");
            }
        }
        System.out.println("Enter your Initial Deposit : ");
        balance = sc.nextInt();
        System.out.println("Creating Account.Please Wait ...");
        try
        {
            Thread.sleep(3000);
        }
            
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        Create_Acc();
    }

    public void Create_Acc()
    {
        acc_num = 1000000000L + (long)(new java.security.SecureRandom().nextDouble() * 9000000000L);
        user_name.put(acc_num,name);
        user_pin.put(acc_num,pin);
        user_balance.put(acc_num,balance);
        user_acc_no.put(pin,acc_num);
        System.out.println("Accout Creation Successful.");
        Acc_Summary();
        System.out.println("Redirecting.Please Wait...");
        try
        {
            Thread.sleep(3000);
        }
            
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public void Acc_Summary()
    {
        System.out.println("===========================================");
        System.err.println("Account Number : " + user_acc_no.get(pin));
        System.err.println("Holder Name : " + user_name.get(acc_num));
        System.err.println("Pin :" + user_pin.get(acc_num));
        System.err.println("Balance:" + user_balance.get(acc_num));
        System.out.println("===========================================");
    }
    
}