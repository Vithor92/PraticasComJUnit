package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RuleTest {

    @Rule // comando que será executado antes do teste (Criando uma pasta antes do teste)
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void shouldCreateNewFileInTemporaryFolder () throws IOException{
        File created = tmpFolder.newFile("file.txt");

        assertTrue(created.isFile()); // verificar se a pasta foi criada
        assertEquals(tmpFolder.getRoot(), created.getParentFile());
    }
}
