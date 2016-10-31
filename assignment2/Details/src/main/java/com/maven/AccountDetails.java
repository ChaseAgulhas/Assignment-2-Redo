package com.maven;

import java.util.Scanner;

/**
 * Created by Chase on 2016-10-31.
 */
public class AccountDetails {


    private String name;
    private String cardNumber;
    private String pin;
    private int total = 0;
    private int[] accountTotals = new int[2];



    public AccountDetails(){}


    public AccountDetails(String name, String cardNumber, int[] accountTotals, String pin)
    {
        this.name = name;
        this.cardNumber = cardNumber;
        for(int i = 0; i < this.accountTotals.length; i++)
            this.accountTotals[i] = accountTotals[i];
        this.pin = pin;
    }

    public void changeAccountTotals()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease press 1 if you would like to change any accountTotals or 0 to exit : ");
        if(scanner.nextInt() == 1)
            updateAccountInformation();
        else
            System.exit(0);
    }

    public void updateAccountInformation()
    {
        UpdateAccountDetails ui = new UpdateAccountDetails();
        accountTotals = ui.newAccountTotals();

        System.out.println("Thank you, your account totals have been updated!");
        displayAccountDetails();
    }

    public void displayAccountDetails()
    {
        System.out.println("==============AccountDetails==================\n\n");
        System.out.println("Account PureSave total  : R" + accountTotals[0] + "\n");
        System.out.println("Account StudentAchiever total  : R" + accountTotals[1] + "\n");

        System.out.println("Total of your accounts is : R" + calcTotal());
    }

    public int calcTotal()
    {
        int sumOfAccountTotals = 0;
        for(int i =0; i < 2; i++)
            sumOfAccountTotals += accountTotals[0];

        total = sumOfAccountTotals;
        return  total;
    }

}
