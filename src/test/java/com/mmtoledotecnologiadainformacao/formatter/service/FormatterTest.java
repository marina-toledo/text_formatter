package com.mmtoledotecnologiadainformacao.formatter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormatterTest {

    Formatter formatter = new Formatter();

    @Test
    public void shouldReturnTextLeftAlignedWithWidth10() throws Exception {
        String input = "This text should be left aligned ";

        String output = Formatter.format(input);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Test
    public void shouldReturnTextLeftAlignedWithWidth20() throws Exception {
        String input = "This text should be left aligned ";

        String output = Formatter.format(input);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Test
    public void shouldReturnTextRightAlignedWithWidth10() throws Exception {
        String input = "This text should be right aligned ";

        String output = Formatter.format(input);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Test
    public void shouldReturnTextRightAlignedWithWidth20() throws Exception {
        String input = "This text should be right aligned ";

        String output = Formatter.format(input);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Test
    public void shouldReturnTextCenterAlignedWithWidth10() throws Exception {
        String input = "This text should be center aligned ";

        String output = Formatter.format(input);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Test
    public void shouldReturnTextCenterAlignedWithWidth20() throws Exception {
        String input = "This text should be center aligned ";

        String output = Formatter.format(input);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }
}
