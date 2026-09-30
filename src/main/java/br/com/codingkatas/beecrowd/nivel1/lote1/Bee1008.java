package br.com.codingkatas.beecrowd.nivel1.lote1;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1008">1008</a>
 * */
public class Bee1008 {


    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        double horasTrabalhadas = input.nextDouble();

        System.out.println("NUMBER = " + n1);
        System.out.printf("SALARY = U$ %.2f",n2*horasTrabalhadas);
        System.out.println();

        input.close();
    }

}
