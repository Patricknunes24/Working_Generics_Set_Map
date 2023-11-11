package program;

import model.services.PrintService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        try {
            System.out.println("Digite uma quantidade n :");
            int n = tec.nextInt();
            tec.nextLine();
            PrintService<Integer> printService = new PrintService<Integer>();
            for (int i = 0; i < n; i++) {
                System.out.println("DIGITE UM VALOR: ");
                Integer x = tec.nextInt();
                printService.addValue(x);
            }
            System.out.println(printService.getIntegerList());
        }
        catch (IllegalStateException e){
            e.getMessage();
        }
    }
}

