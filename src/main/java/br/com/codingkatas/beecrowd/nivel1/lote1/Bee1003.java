package br.com.codingkatas.beecrowd.nivel1.lote1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1003">1003</a>
 * */
public class Bee1003 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int soma = a + b;
        System.out.println("SOMA = " + soma);
        input.close();
    }
}
