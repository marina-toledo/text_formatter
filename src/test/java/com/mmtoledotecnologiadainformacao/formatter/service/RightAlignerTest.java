package com.mmtoledotecnologiadainformacao.formatter.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RightAlignerTest {

//    TODO: add test cases for input smaller than width with space in the middle
//    TODO: add test cases for inputIsBiggerThanWidth with odd and even variations
//    TODO: add test cases for LineBreaksExactlyBetweenWords with space at the end of line and beginning of line
//    TODO: add new test cases for creation of new line when last char is a space
//    TODO: add new test cases for input with more lines

    int EVEN_WIDTH = 20;
    int ODD_WIDTH = 21;

    @Test
    public void OddInputIsSmallerThanOddWidth() {
        String input = "0123456789A";

        String output = TextAligner.formatRight(input, ODD_WIDTH);

        Assertions.assertEquals("          0123456789A", output);
    }

    @Test
    public void EvenInputIsSmallerThanEvenWidth() {
        String input = "0123456789";

        String output = TextAligner.formatRight(input, EVEN_WIDTH);

        Assertions.assertEquals("          0123456789", output);
    }

    @Test
    public void OddInputIsSmallerThanEvenWidth() {
        String input = "0123456789A";

        String output = TextAligner.formatRight(input, EVEN_WIDTH);

        Assertions.assertEquals("         0123456789A", output);
    }

    @Test
    public void EvenInputIsSmallerThanOddWidth() {
        String input = "0123456789";

        String output = TextAligner.formatRight(input, ODD_WIDTH);

        Assertions.assertEquals("           0123456789", output);
    }

    @Test
    public void inputIsBiggerThanWidth() {
        String input = "0123456789ABCDEFGHIJ0123456789ABCDEFGHIJ";

        String output = TextAligner.formatRight(input, EVEN_WIDTH);

        Assertions.assertEquals("0123456789ABCDEFGHIJ\n0123456789ABCDEFGHIJ", output);
    }

    @Test
    public void inputIsAnEmptyString() {
        String input = "";

        String output = TextAligner.formatRight(input, EVEN_WIDTH);

        Assertions.assertEquals("", output);
    }

    @Test
    public void inputIsMadeOnlyOfSpaces() {
        String input = "                                                          ";

        String output = TextAligner.formatRight(input, EVEN_WIDTH);

        Assertions.assertEquals("", output);
    }

    @Test
    public void LineBreaksExactlyBetweenWords() {
        String input = "0123456789ABCDEFGHIJ 0123456789";

        String output = TextAligner.formatRight(input, EVEN_WIDTH);

        Assertions.assertEquals("0123456789ABCDEFGHIJ\n          0123456789", output);
    }

    @Test
    public void inputHasContiguousSpacesBetweenWords() {
        String input = "0123456789ABCDEFGHIJ   0123456789";

        String output = TextAligner.formatRight(input, EVEN_WIDTH);

        Assertions.assertEquals("0123456789ABCDEFGHIJ\n          0123456789", output);
    }

    // some random cases above

    @Test
    public void shouldReturnTextRightAlignedWithWidth10() {
        String input = "This text should be right aligned ";

        String output = TextAligner.formatRight(input, 10);

        Assertions.assertEquals(" This text\n should be\n     right\n   aligned", output);
    }

    @Test
    public void shouldReturnTextRightAlignedWithWidth20() {
        String input = "This text should be right aligned ";

        String output = TextAligner.formatRight(input, 20);

        Assertions.assertEquals(" This text should be\n       right aligned", output);
    }
}
