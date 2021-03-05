package com.mmtoledotecnologiadainformacao.formatter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormatterTest {

    Formatter formatter = new Formatter();

    @Test
    public void shouldReturnTextRightAligned() throws Exception {
        String input = "This text should be left aligned ";

        String output = Formatter.format(input);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }
}
