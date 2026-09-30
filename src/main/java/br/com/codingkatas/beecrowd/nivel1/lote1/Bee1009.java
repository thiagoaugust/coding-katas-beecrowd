package br.com.codingkatas.beecrowd.nivel1.lote1;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1009">1009</a>
 * */
public class Bee1009 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nome =  input.next();
        double salario = input.nextDouble();
        double vendas = input.nextDouble();
        BigDecimal total = new BigDecimal((0.15*vendas)+salario);

        System.out.printf("TOTAL = R$ %.2f",total);
        System.out.println();

        input.close();
    }
}
