package program;
import model.intitites.Cliente;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Cliente c1 = new Cliente("patrick","patrick@gmail.com");
        System.out.println(c1.hashCode());
        Cliente c2 = new Cliente("patrick","thais@gmail.com");
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}