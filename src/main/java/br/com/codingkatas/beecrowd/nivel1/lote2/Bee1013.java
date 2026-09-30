package br.com.codingkatas.beecrowd.nivel1.lote2;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1013">1013</a>
 * */
public class Bee1013 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maiorAB = (a + b + Math.abs(a-b))/2;
        if(maiorAB>c) {
            System.out.println(maiorAB + " eh o maior");
        }else {
            System.out.println(c + " eh o maior");
        }

        input.close();
    }
}
