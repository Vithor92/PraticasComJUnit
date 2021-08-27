package com.teste;

import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class AssertTest {

    @Test // Compara os bytes dos dois arrays
    public void testAssertArraysEquals() {
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        assertArrayEquals(esperado, atual);
    }

    @Test // Compara as duas Strings
    public void testAssertEquals() {
        assertEquals("text", "text");

    }

    @Test // Verificar o estado de algo, se é falso ou verdadeiro
    public void testAssertFalse(){
        assertFalse(false);
    }

    @Test // Verificar se o objeto esta retornando um valor não nulo
    public void testAssertNotNull (){
        assertNotNull(new Object());
    }

    @Test // verifica se os objetos não são os mesmos
    public void testAssertNotSame(){
        assertNotSame(new Object(), new Object());
    }

    @Test // para garantir a posição de um objeto em um determinado momento
    public void testAssertNull(){
        assertNull(null);
    }

    @Test // verifica se os objetos são os mesmos
    public void testAssertSame (){
        Integer aNumber = Integer.valueOf(768);
        assertSame(aNumber, aNumber);
    }
}
