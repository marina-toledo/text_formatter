package com.mmtoledotecnologiadainformacao.formatter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.mmtoledotecnologiadainformacao.formatter.service.TextAligner.Alignment.RIGHT;

public class RightAlignerTest {

    TextAligner textAligner = new TextAligner();

    @Test
    public void shouldReturnTextRightAlignedWithWidth10() throws Exception {
        String input = "This text should be right aligned ";

        String output = TextAligner.format(input, RIGHT, 10);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Test
    public void shouldReturnTextRightAlignedWithWidth20() throws Exception {
        String input = "This text should be right aligned ";

        String output = TextAligner.format(input, RIGHT, 20);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }
}
