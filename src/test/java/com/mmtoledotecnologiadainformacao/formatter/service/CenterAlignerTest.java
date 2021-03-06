package com.mmtoledotecnologiadainformacao.formatter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.mmtoledotecnologiadainformacao.formatter.service.TextAligner.Alignment.CENTER;

public class CenterAlignerTest {
//    TODO: add more test cases
//    smaller than width
//    string bigger than width
//    empty string
//    just space
//    when words break exactly in the limits : start and end
//    different sizes of space between words

    TextAligner textAligner = new TextAligner();

    @Test
    public void shouldReturnTextCenterAlignedWithWidth10() throws Exception {
        String input = "This text should be center aligned ";

        String output = TextAligner.format(input, CENTER, 10);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Test
    public void shouldReturnTextCenterAlignedWithWidth20() throws Exception {
        String input = "This text should be center aligned ";

        String output = TextAligner.format(input, CENTER, 20);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }
}
