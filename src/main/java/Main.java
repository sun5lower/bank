import controller.Bank;
import entity.User;

import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {

        User user = new User("01457",
                10.00,
                "Dagmara Le Grange",
                "Female");

        Bank bank = new Bank();
        bank.setActiveUser(user);


        System.out.println("Welcome to bank" + user.name);
        System.out.println("Current balance:" +bank.getUserBalance());

        String response = bank.creditUser(236.54);

        System.out.println(response);

        System.out.println(bank.creditUser(855.39));
        System.out.println(bank.creditUser(3225.59));
        System.out.println(bank.creditUser(97577.90));

        System.out.println("Current balance:" +bank.getUserBalance());



        System.out.println(response);

        System.out.println(bank.debitUser(855.39));
        System.out.println("Current balance:" +bank.getUserBalance());

    }
}
