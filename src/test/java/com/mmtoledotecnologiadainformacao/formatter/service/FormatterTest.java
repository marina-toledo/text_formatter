package com.mmtoledotecnologiadainformacao.formatter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.mmtoledotecnologiadainformacao.formatter.service.Formatter.Alignment.*;

public class FormatterTest {
//    TODO: add more test cases
//    smaller than width
//    string bigger than width
//    empty string
//    just space
//    when words break exactly in the limits : start and end
//    different sizes of space between words

    Formatter formatter = new Formatter();

    @Test
    public void shouldReturnTextLeftAlignedWithWidth10() throws Exception {
        String input = "This text should be left aligned ";

        String output = Formatter.format(input, LEFT, 10);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Test
    public void shouldReturnTextLeftAlignedWithWidth20() throws Exception {
        String input = "This text should be left aligned ";

        String output = Formatter.format(input, LEFT, 20);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Test
    public void shouldReturnTextRightAlignedWithWidth10() throws Exception {
        String input = "This text should be right aligned ";

        String output = Formatter.format(input, RIGHT, 10);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Test
    public void shouldReturnTextRightAlignedWithWidth20() throws Exception {
        String input = "This text should be right aligned ";

        String output = Formatter.format(input, RIGHT, 20);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Test
    public void shouldReturnTextCenterAlignedWithWidth10() throws Exception {
        String input = "This text should be center aligned ";

        String output = Formatter.format(input, CENTER, 10);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Test
    public void shouldReturnTextCenterAlignedWithWidth20() throws Exception {
        String input = "This text should be center aligned ";

        String output = Formatter.format(input, CENTER, 20);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }
}
