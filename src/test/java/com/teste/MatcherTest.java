package com.teste;

import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;

public class MatcherTest {

    @Test // Comparar as strings, se são as mesmas
    public void giveBean_checktoString() {
        Person pessoa = new Person("Vithor", "Marcos");
        String str = pessoa.toString();
        assertThat(pessoa, HasToString.hasToString(str));

    }

    @Test // Verificar se a lista esta vazia
    public void givenCollection_checkEmpty() {
        List<String> emptyList = new ArrayList<String>();
        assertThat(emptyList, Matchers.empty());
    }

    @Test // Verificar se os valores são maiores, menores ou iguais
    public void givenAnInterger_checkGreater() {
        assertThat(1, Matchers.greaterThan(0));
    }

    @Test // Verificar string
    public void givenString_checkNull() {
        String str = null;
        assertThat(str, Matchers.isEmptyOrNullString());
    }
}
