package br.com.codingkatas.beecrowd.nivel1.lote2;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1015">1015</a>
 * */
public class Bee1015 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.printf("%.4f\n",distancia);
        input.close();
    }
}
