package br.com.codingkatas.beecrowd.nivel1.lote1;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1007">1007</a>
 * */
public class Bee1007 {

    public static void main(String[] args) throws IOException{
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int resultado = (a*b)-(c*d);
        System.out.println("DIFERENCA = " + resultado);

        input.close();
    }

}
