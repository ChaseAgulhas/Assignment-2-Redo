package com.maven;

import java.util.Scanner;

/**
 * Created by Chase on 2016-10-31.
 */
public class Login {

    private String cardNumber = "1234567890";
    private String pin = "12345";

    String inputCardNumber;
    String inputPin;

    Scanner scanner = new Scanner(System.in);

    public boolean validateUser()
    {

        System.out.println("Please enter you card number : ");
        inputCardNumber = scanner.nextLine();
        System.out.println("Please enter your 5 digit pin : ");
        inputPin = scanner.nextLine();

        if(inputCardNumber.equals(cardNumber) && inputPin.equals(pin))
            return true;

        else
            return false;
    }

    public boolean promptUser()
    {
        boolean isValid = false;

        if(validateUser())
        {
            int[] accountTotals = {500, 600};

            User user = new User("Chase Agulhas", "7777777", accountTotals, "12345");
            System.out.println("\nWelcome " + user.returnName() +"\n");
            user.showReport();
            isValid =  true;
        }

        else
        {
            System.out.println("Invalid card number or pin.");
            System.out.println("Card number = " + returnCardNumber() +"\nPin = " + returnPin());
            isValid =  false;
        }

        return isValid;
    }

    public String returnCardNumber()
    {
        return cardNumber;
    }

    public String returnPin()
    {
        return pin;
    }

    public static void main(String[] args) {

        Login login = new Login();
        boolean isValid = false;

        while (!isValid)
            isValid = login.promptUser();
    }

}
