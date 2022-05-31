package prova.exercicio2;

import java.util.Scanner;

public class TesteTecnico {

    private static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a, b, c;

        System.out.println("Digite o valor do 1° lado do triângulo: ");
        a = sc.nextInt();
        System.out.println("Digite o valor do 2° lado do triângulo: ");
        b = sc.nextInt();
        System.out.println("Digite o terceiro 3° lado do triângulo: ");
        c = sc.nextInt();
        System.out.println();


        if (!(a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("Não é triângulo");
        } else {
            if ((a == b) && (a == c) && (b == c)){
                System.out.println("Equilátero");
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Isósceles");
            } else if ((a != b) && (a != c) && (b != c)) {
                System.out.println("Escaleno");
            }
        }
    }
}