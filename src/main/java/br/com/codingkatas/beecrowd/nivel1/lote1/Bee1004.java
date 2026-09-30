package br.com.codingkatas.beecrowd.nivel1.lote1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1004">1004</a>
 * */
public class Bee1004 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int soma = a * b;
        System.out.println("PROD = " + soma);
        input.close();
    }
}
