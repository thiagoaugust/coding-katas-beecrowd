package br.com.codingkatas.beecrowd.nivel1.lote2;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1014">1014</a>
 * */
public class Bee1014 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        double y = input.nextDouble();

        System.out.printf("%.3f km/l\n", x / y);



        input.close();
    }
}
