package br.com.codingkatas.beecrowd.nivel1.lote2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1019">1019</a>
 * */
public class Bee1019 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println(n / 3600 + ":" + n % 3600 / 60 + ":" + n % 60);

        input.close();
    }
}
