package br.com.codingkatas.beecrowd.nivel1.lote1;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1005">1005</a>
 * */
public class Bee1005 {

    public static void main(String[] args) throws IOException{
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        a = (a * 3.5);
        b = (b * 7.5);
        double media = (a+b)/11;
        BigDecimal resultado = new BigDecimal(media);
        System.out.println("MEDIA = " + resultado.setScale(5, RoundingMode.HALF_UP));

        input.close();
    }
}
