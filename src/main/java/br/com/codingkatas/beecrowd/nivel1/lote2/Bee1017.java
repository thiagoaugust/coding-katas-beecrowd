package br.com.codingkatas.beecrowd.nivel1.lote2;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1017">1017</a>
 * */
public class Bee1017 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        double distancia = (x*y)/12.0;

        System.out.printf("%.3f\n", distancia);
        input.close();
    }
}
