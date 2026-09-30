package br.com.codingkatas.beecrowd.nivel1.lote1;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1010">1010</a>
 * */
public class Bee1010 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double resultado =0;

        for(int i = 0; i<2; i++){
            int codPeca = input.nextInt();
            int quantidade = input.nextInt();
            double preco = input.nextDouble();

            resultado = resultado + (quantidade * preco);
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultado);

        input.close();
    }
}
