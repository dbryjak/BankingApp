package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1=new Account("Adam", "Adamek", "123456789", "AdAd", "112233445566", 1000000, 1234);
        Scanner sc=new Scanner(System.in);

        System.out.println("Witaj w naszym Banku");

        boolean isLoginValid = false;
        do {
            System.out.println("Wpisz login: ");
            String login = sc.next();

            if (login.equals(account1.getLogin())) {
                System.out.println("Poprawny login\n");
                isLoginValid = true;
            }
            else {
                System.out.println("Niepoprawny login");
            }

        } while (!isLoginValid);


        boolean isPinValid = false;
        int pinAttempt = 3;
        do {
            System.out.println(("Wpisz pin: "));
            int pin = sc.nextInt();

            if (pin == account1.getPin()) {
                System.out.println("Poprawny pin\n");
                isPinValid = true;
            }
            else {
                pinAttempt--;
                System.out.println("Niepoprawny pin, pozostało " + pinAttempt + " prób");
                if (pinAttempt == 0) {
                    System.out.println("Wykorzystałeś limit prób, do widzenia!");
                    System.exit(0);
                }
            }

        } while (!isPinValid);

        System.out.println("MENU - Wybierz numerycznie opcję, która Cię intereuje ");
        System.out.println("\n 1. Wpłata \n 2. Wypłata \n 3. Sprawdzenie stanu konta \n 4. Weź Kredyt \n 5. Wyjście ");
        System.out.println(" Twój wybór ");
        int nunmer1=sc.nextInt();
        int wybor=sc.nextInt();
        switch (wybor){
            case 1:
                System.out.println("Wpłata gotówki ");
                break;
            case 2:
                System.out.println("Wypłata gotówki ");
                double wyplata = sc.nextDouble();
                account1.withdraw(wyplata);

                break;
            case 3:
                System.out.println("Sprawdzenie stanu konta ");
                account1.getBalance();
                System.out.println(account1.getBalance());
                break;
            case 4:
                System.out.println("Weż kredyt ");
                break;
            case 5:
                System.out.println("Wyjście");

        }


            }



}