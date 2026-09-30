package br.com.codingkatas.beecrowd.nivel1.lote2;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1016">1016</a>
 * */
public class Bee1016 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int distancia = x*2;
        System.out.println(distancia + " minutos");
        input.close();
    }
}
