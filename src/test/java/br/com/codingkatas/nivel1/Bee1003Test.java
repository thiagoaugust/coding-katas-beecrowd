package br.com.codingkatas.nivel1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.*;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class Bee1003Test {

    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;

    @AfterEach
    void restaurarEntradaESaidaPadrao() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @Test
    void deveSomarDoisInteirosPositivos() throws IOException {
        String saida = executarProgramaComEntrada("""
                30
                10
                """);

        assertEquals("SOMA = 40%n".formatted(), saida);
    }

    @Test
    void deveSomarInteirosComResultadoNegativo() throws IOException {
        String saida = executarProgramaComEntrada("""
                -30
                10
                """);

        assertEquals("SOMA = -20%n".formatted(), saida);
    }

    @Test
    void deveSomarZeros() throws IOException {
        String saida = executarProgramaComEntrada("""
                0
                0
                """);

        assertEquals("SOMA = 0%n".formatted(), saida);
    }

    private String executarProgramaComEntrada(String entrada) throws IOException {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(entrada.getBytes(StandardCharsets.UTF_8)));
        System.setOut(new PrintStream(saidaCapturada, true, StandardCharsets.UTF_8));

        Bee1003.main(new String[0]);

        return saidaCapturada.toString(StandardCharsets.UTF_8);
    }
}
