package com.teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraTest {

    @Test
    public void testSomar(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        assertEquals (5, soma); // verificar se a soma foi igual o esperado
    }

}
