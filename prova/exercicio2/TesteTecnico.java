package prova.exercicio2;

import java.util.Scanner;

public class TesteTecnico {

    private static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a, b, c;

        System.out.println("Digite o valor do 1� lado do tri�ngulo: ");
        a = sc.nextInt();
        System.out.println("Digite o valor do 2� lado do tri�ngulo: ");
        b = sc.nextInt();
        System.out.println("Digite o terceiro 3� lado do tri�ngulo: ");
        c = sc.nextInt();
        System.out.println();


        if (!(a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("N�o � tri�ngulo");
        } else {
            if ((a == b) && (a == c) && (b == c)){
                System.out.println("Equil�tero");
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Is�sceles");
            } else if ((a != b) && (a != c) && (b != c)) {
                System.out.println("Escaleno");
            }
        }
    }
}