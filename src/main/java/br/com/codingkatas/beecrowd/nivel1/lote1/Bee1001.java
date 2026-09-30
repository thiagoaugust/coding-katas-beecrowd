package br.com.codingkatas.beecrowd.nivel1.lote1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1001">1001</a>
 * */
public class Bee1001 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;
        System.out.println("X = " + soma);


    }

}
