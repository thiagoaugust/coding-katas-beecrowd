package br.com.codingkatas.beecrowd.nivel1.lote1;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1002">1002</a>
 * */
public class Bee1002 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double pi = 3.14159;
        BigDecimal area = new BigDecimal(pi * (raio*raio));
        System.out.printf("A=%.4f\n",area);

        input.close();
    }

}
