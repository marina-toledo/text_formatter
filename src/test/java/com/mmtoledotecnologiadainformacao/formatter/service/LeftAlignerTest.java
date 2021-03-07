package com.mmtoledotecnologiadainformacao.formatter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeftAlignerTest {

    @Test
    public void shouldReturnTextLeftAlignedWithWidth10() {
        String input = "This text should be left aligned ";

        String output = TextAligner.formatLeft(input, 10);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }

    @Test
    public void shouldReturnTextLeftAlignedWithWidth20() {
        String input = "This text should be left aligned ";

        String output = TextAligner.formatLeft(input, 20);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }
}
