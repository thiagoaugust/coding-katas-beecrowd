package br.com.codingkatas.beecrowd.nivel1.lote1;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

/**
 * Link do problema: <a href="https://judge.beecrowd.com/pt/problems/view/1006">1006</a>
 * */
public class Bee1006 {

    public static void main(String[] args) throws IOException{
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double media = ((a * 2.0) + (b * 3.0) + (c * 5.0))/10.0;
        BigDecimal resultado = new BigDecimal(media);
        System.out.println("MEDIA = " + resultado.setScale(1, RoundingMode.HALF_UP));

        input.close();
    }

}
