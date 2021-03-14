import controller.Bank;
import entity.User;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner details = new Scanner(System.in);
        System.out.println("Log on to your Online Banking by entering:  userName ,  personal ID, birthday");
        String userName = details.nextLine();
        int passcode = details.nextInt();
        Double birthday = details.nextDouble();


        System.out.println("Enter your" + userName);
        System.out.println("Enter your" + passcode);
        System.out.println("Enter your" + birthday);

        System.out.println("Please enter amount you want to withdraw: ");
        double balance = details.nextDouble();

        if (!(balance >= 0)) {
        } else {
            System.out.println(balance + "Too low to withdraw, you will be overdrawn!");
        }

        User user = new User("01457",
                10.00,
                "Dagmara Le Grange",
                "Female");

        Bank bank = new Bank();
        bank.setActiveUser(user);


        System.out.println("Welcome to bank " + user.name);
        System.out.println("Current balance: " +bank.getUserBalance());

        String response = bank.creditUser(236.54);

        System.out.println(response);

        System.out.println(bank.creditUser(855.39));
        System.out.println(bank.creditUser(3225.59));
        System.out.println(bank.creditUser(97577.90));

        System.out.println("Current balance: " +bank.getUserBalance());



        System.out.println(response);

        System.out.println(bank.debitUser(855.39));
        System.out.println(bank.debitUser(45.00));
        System.out.println("Current balance: " +bank.getUserBalance());

    }
}
