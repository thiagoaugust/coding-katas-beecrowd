package br.com.codingkatas.beecrowd.nivel1.lote2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1018">1018</a>
 * */
public class Bee1018 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        System.out.println(valor);

        for (int nota : new int[]{100, 50, 20, 10, 5, 2, 1}) {
            System.out.println(valor / nota + " nota(s) de R$ " + nota + ",00");
            valor %= nota;
        }

        input.close();
    }
}
