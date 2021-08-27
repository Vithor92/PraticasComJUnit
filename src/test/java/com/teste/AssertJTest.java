package com.teste;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertJTest {

    @Test
    public void checkEquality(){
        Person pessoa = new Person("Vithor", "Marcos");
        Person pessoaClone = pessoa;
        assertThat(pessoa).isEqualTo(pessoaClone);
    }
}
