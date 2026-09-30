package br.com.codingkatas.beecrowd.nivel1.lote2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1020">1020</a>
 * */
public class Bee1020 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println(n / 365 + " ano(s)");
        System.out.println(n % 365 / 30 + " mes(es)");
        System.out.println(n % 365 % 30 + " dia(s)");

        input.close();
    }
}
