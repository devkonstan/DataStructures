package z_19_01_1920.recap;

import java.util.Scanner;

public class Task2Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbe calkowita: ");
        String input;

        while (true) {
            input = sc.nextLine();

            if (input.toLowerCase().equals("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                String msg = number % 2 == 0 ? "parzysta" : "nieparzysta";
                System.out.println(String.format("liczba jest %s", msg)); //%s oznacza String
            } catch (NumberFormatException nfe) {
                System.out.println("to nie liczba");
            }
        }
    }
}