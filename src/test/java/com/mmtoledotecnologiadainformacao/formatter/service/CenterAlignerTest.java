package com.mmtoledotecnologiadainformacao.formatter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.mmtoledotecnologiadainformacao.formatter.service.TextAligner.Alignment.CENTER;

public class CenterAlignerTest {
    int WIDTH = 20;

    @Test
    public void inputIsSmallerThanWidth() {
//        TODO: Odd even sizes
        String input = "0123456789";

        String output = TextAligner.format(input, CENTER, WIDTH);

        Assertions.assertEquals("     0123456789     ", output);
    }

    @Test
    public void inputIsBiggerThanWidth() {
        String input = "012345678901234567890123456789";

        String output = TextAligner.format(input, CENTER, WIDTH);

        Assertions.assertEquals("012345678901234567890\n123456789", output);
    }

    @Test
    public void inputIsAnEmptyString() {
        String input = "";

        String output = TextAligner.format(input, CENTER, WIDTH);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }

    @Test
    public void inputIsMadeOnlyOfSpaces() {
        String input = "   ";

        String output = TextAligner.format(input, CENTER, WIDTH);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }

    @Test
    public void LineBreaksExactlyBetweenWords() {
        String input = "01234567890123456789 0123456789";

        String output = TextAligner.format(input, CENTER, WIDTH);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }

    @Test
    public void inputHasContiguousSpacesBetweenWords() {
        String input = "0123456789   0123456789";

        String output = TextAligner.format(input, CENTER, WIDTH);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }

    // some random cases above

    @Test
    public void shouldReturnTextCenterAlignedWithWidth10() {
        String input = "This text should be center aligned ";

        String output = TextAligner.format(input, CENTER, 10);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }

    @Test
    public void shouldReturnTextCenterAlignedWithWidth20() {
        String input = "This text should be center aligned ";

        String output = TextAligner.format(input, CENTER, 20);

        Assertions.assertEquals("This text \nshould be \nleft \naligned ", output);
    }
}
