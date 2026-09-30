package br.com.codingkatas.beecrowd.nivel1.lote2;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1011">1011</a>
 * */
public class Bee1011 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double raio = input.nextDouble();
        double volume = (4/3.0) * 3.14159 * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f\n",volume);

        input.close();
    }
}
