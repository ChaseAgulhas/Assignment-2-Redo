package com.maven;

import java.util.Scanner;

/**
 * Created by Chase on 2016-10-31.
 */
public class User {

    String name;
    String cardNumber;
    String pin;
    int[] accountTotals = new int[2];
    int total;


    public void showReport()
    {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1- Please press 1 to view your main account details : ");
        if(scanner.nextInt() == 1)
        {
            AccountDetails report = new AccountDetails(name, cardNumber, accountTotals, pin);
            report.displayAccountDetails();
            report.changeAccountTotals();
        }
    }

    public User(String name, String cardNumber, int[] accountTotals, String pin)
    {
        this.pin = pin;
        this.name = name;
        this.cardNumber = cardNumber;
        for(int i = 0; i < 2; i++)
            this.accountTotals[i] = accountTotals[i];
    }

    public void assignPin(String password)
    {
        this.pin = password;
    }
    public void assignName(String name)
    {
        this.name = name;
    }

    public String returnPin()
    {
        return pin;
    }

    public String returnName()
    {
        return name;
    }

    public String returnCardNumber()
    {
        return cardNumber;
    }

    public int returnAccountTotals(int index)
    {
        return accountTotals[index];
    }

    public void setTotal(int[] accountTotals)
    {
        int sumOfAccountTotals = 0;
        for(int i = 0; i < 2; i++)
            sumOfAccountTotals += this.accountTotals[i];

        total = sumOfAccountTotals;
    }

    public int returnTotal()
    {
        setTotal(accountTotals);
        return total;
    }


}
