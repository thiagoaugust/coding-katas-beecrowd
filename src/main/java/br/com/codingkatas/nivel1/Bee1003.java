package br.com.codingkatas.nivel1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Classe base para os próximos exercícios.
 * <b>Enunciado</b>
 * Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas
 * e atribua à variável SOMA. A seguir escrever o valor desta variável.
 * <p>
 * <b>Entrada</b>
 * O arquivo de entrada contém 2 valores inteiros.
 * <p>
 * <b>Saída</b>
 * Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e
 * depois da igualdade seguido pelo valor correspondente à soma de A e B. Como todos os problemas,
 * não esqueça de imprimir o fim de linha após o resultado, caso contrário,
 * você receberá "Presentation Error".
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
