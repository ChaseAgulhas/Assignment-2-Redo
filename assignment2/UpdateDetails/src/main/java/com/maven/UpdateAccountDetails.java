package com.maven;

import java.util.Scanner;

/**
 * Created by Chase on 2016-10-31.
 */
public class UpdateAccountDetails {

    int[] accountTotals = new int[2];

    public UpdateAccountDetails()
    {

    }
    public int[] newAccountTotals()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter PureSave account total :  R");
        accountTotals[0] = scanner.nextInt();
        System.out.println("Please enter StudentAchiever account total :  R");
        accountTotals[1] = scanner.nextInt();

        System.out.println("\n\nThank you.");

        return accountTotals;
    }

    public int returnAccountTotals()
    {
        return accountTotals[0];
    }

}
