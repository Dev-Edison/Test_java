package helloworld;

import java.util.Scanner;

public class OlaMundo {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Olá mundo!!!");
        System.out.print("\tComo vai a Terra?\n");
        System.out.println("Tudo bem!");
        System.out.println("-----------------------------");
        System.out.print("Digite alguma coisa: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Você digitou " + name);
        sc.close();

    }

}
