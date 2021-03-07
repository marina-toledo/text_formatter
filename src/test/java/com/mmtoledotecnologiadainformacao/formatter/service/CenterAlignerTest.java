package com.mmtoledotecnologiadainformacao.formatter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CenterAlignerTest {
    int EVEN_WIDTH = 20;
    int ODD_WIDTH = 21;

    @Test
    public void OddInputIsSmallerThanOddWidth() {
        String input = "0123456789A";

        String output = TextAligner.formatCenter(input, ODD_WIDTH);

        Assertions.assertEquals("     0123456789A     ", output);
    }

    @Test
    public void EvenInputIsSmallerThanEvenWidth() {
        String input = "0123456789";

        String output = TextAligner.formatCenter(input, EVEN_WIDTH);

        Assertions.assertEquals("     0123456789     ", output);
    }

    @Test
    public void OddInputIsSmallerThanEvenWidth() {
        String input = "0123456789A";

        String output = TextAligner.formatCenter(input, EVEN_WIDTH);

        Assertions.assertEquals("    0123456789A     ", output);
    }

    @Test
    public void EvenInputIsSmallerThanOddWidth() {
        String input = "0123456789";

        String output = TextAligner.formatCenter(input, ODD_WIDTH);

        Assertions.assertEquals("     0123456789      ", output);
    }

//    TODO: add test cases for input smaller than width with space in the middle
//    TODO: add test cases for inputIsBiggerThanWidth with odd and even variations
//    TODO: add test cases for LineBreaksExactlyBetweenWords with space at the end of line and beginning of line
//    TODO: add new test cases for creation of new line when last char is a space
//    TODO: add new test cases for input with more lines

    @Test
    public void inputIsBiggerThanWidth() {
        String input = "0123456789ABCDEFGHIJ0123456789ABCDEFGHIJ";

        String output = TextAligner.formatCenter(input, EVEN_WIDTH);

        Assertions.assertEquals("0123456789ABCDEFGHIJ\n0123456789ABCDEFGHIJ", output);
    }

    @Test
    public void inputIsAnEmptyString() {
        String input = "";

        String output = TextAligner.formatCenter(input, EVEN_WIDTH);

        Assertions.assertEquals("", output);
    }

    @Test
    public void inputIsMadeOnlyOfSpaces() {
        String input = "                                                          ";

        String output = TextAligner.formatCenter(input, EVEN_WIDTH);

        Assertions.assertEquals("", output);
    }

    @Test
    public void LineBreaksExactlyBetweenWords() {
        String input = "0123456789ABCDEFGHIJ 0123456789";

        String output = TextAligner.formatCenter(input, EVEN_WIDTH);

        Assertions.assertEquals("0123456789ABCDEFGHIJ\n     0123456789     ", output);
    }

    @Disabled
    @Test
    public void inputHasContiguousSpacesBetweenWords() {
        String input = "0123456789   0123456789";

        String output = TextAligner.formatCenter(input, EVEN_WIDTH);

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
