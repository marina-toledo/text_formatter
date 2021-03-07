package com.mmtoledotecnologiadainformacao.formatter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RightAlignerTest {

    @Disabled
    @Test
    public void shouldReturnTextRightAlignedWithWidth10() {
        String input = "This text should be right aligned ";

        String output = TextAligner.formatRight(input, 10);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }


    @Disabled
    @Test
    public void shouldReturnTextRightAlignedWithWidth20() {
        String input = "This text should be right aligned ";

        String output = TextAligner.formatRight(input, 20);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }
}
