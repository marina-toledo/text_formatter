package com.mmtoledotecnologiadainformacao.formatter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.mmtoledotecnologiadainformacao.formatter.service.TextAligner.Alignment.LEFT;

public class LeftAlignerTest {

    TextAligner textAligner = new TextAligner();

    @Test
    public void shouldReturnTextLeftAlignedWithWidth10() throws Exception {
        String input = "This text should be left aligned ";

        String output = TextAligner.format(input, LEFT, 10);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Test
    public void shouldReturnTextLeftAlignedWithWidth20() throws Exception {
        String input = "This text should be left aligned ";

        String output = TextAligner.format(input, LEFT, 20);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }
}
