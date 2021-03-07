package com.mmtoledotecnologiadainformacao.formatter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CenterAlignerTest {
    int WIDTH = 20;

    @Disabled
    @Test
    public void OddInputIsSmallerThanOddWidth() {
        String input = "0123456789";

        String output = TextAligner.formatCenter(input, WIDTH);

        Assertions.assertEquals("     0123456789     ", output);
    }

    @Test
    public void EvenInputIsSmallerThanEvenWidth() {
        String input = "0123456789";

        String output = TextAligner.formatCenter(input, WIDTH);

        Assertions.assertEquals("     0123456789     ", output);
    }

    @Disabled
    @Test
    public void OddInputIsSmallerThanEvenWidth() {
        String input = "0123456789";

        String output = TextAligner.formatCenter(input, WIDTH);

        Assertions.assertEquals("     0123456789     ", output);
    }

    @Disabled
    @Test
    public void EvenInputIsSmallerThanOddWidth() {
        String input = "0123456789";

        String output = TextAligner.formatCenter(input, WIDTH);

        Assertions.assertEquals("     0123456789     ", output);
    }

    @Disabled
    @Test
    public void inputIsBiggerThanWidth() {
        String input = "01234567890123456789 01234567890123456789";

        String output = TextAligner.formatCenter(input, WIDTH);

        Assertions.assertEquals("01234567890123456789\n01234567890123456789", output);
    }

    @Disabled
    @Test
    public void inputIsAnEmptyString() {
        String input = "";

        String output = TextAligner.formatCenter(input, WIDTH);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }

    @Disabled
    @Test
    public void inputIsMadeOnlyOfSpaces() {
        String input = "   ";

        String output = TextAligner.formatCenter(input, WIDTH);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }

    @Disabled
    @Test
    public void LineBreaksExactlyBetweenWords() {
        String input = "01234567890123456789 0123456789";

        String output = TextAligner.formatCenter(input, WIDTH);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }

    @Disabled
    @Test
    public void inputHasContiguousSpacesBetweenWords() {
        String input = "0123456789   0123456789";

        String output = TextAligner.formatCenter(input, WIDTH);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }

    // some random cases above

    @Disabled
    @Test
    public void shouldReturnTextCenterAlignedWithWidth10() {
        String input = "This text should be center aligned ";

        String output = TextAligner.formatCenter(input, 10);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }

    @Disabled
    @Test
    public void shouldReturnTextCenterAlignedWithWidth20() {
        String input = "This text should be center aligned ";

        String output = TextAligner.formatCenter(input, 20);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }
}
