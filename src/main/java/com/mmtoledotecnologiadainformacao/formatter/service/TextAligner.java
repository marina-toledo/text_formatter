package com.mmtoledotecnologiadainformacao.formatter.service;

public class TextAligner {

    static String SEPARATOR_REGEX = "[ ,:!.;]";

    /**
     * Don't let anyone instantiate this class.
     */
    private TextAligner() {
    }

    public static String formatLeft(String input, int width) {
        StringBuilder output = new StringBuilder();
        int startLine = 0;
        int endLineLimit = width;

        while (startLine < input.length()) {
            final int indexToBreak = input.lastIndexOf(" ", endLineLimit);
            output.append(input, startLine, indexToBreak);

            for (int i = 0; i < (endLineLimit - indexToBreak); i++) {
                output.append(" ");
            }

            startLine = indexToBreak + 1;
            endLineLimit = startLine + width;

            if (startLine < input.length()) {
                output.append("\n");
            }
        }

        return output.toString();
    }

    public static String formatRight(String input, int width) {
        StringBuilder output = new StringBuilder();
//        int startLine = 0;
//        int endLineLimit = width;
//
//        while (startLine < input.length()) {
//            final int indexToBreak = input.lastIndexOf(" ", endLineLimit);
//            String substring = input.substring(startLine, endLineLimit).trim();
//
//            for (int i = 0; i < (width - substring.length()); i++) {
//                output.append(" ");
//            }
//
//            output.append(substring);
//
//            startLine = indexToBreak + 1;
//            endLineLimit = startLine + width;
//
//            if (startLine < input.length()) {
//                output.append("\n");
//            }
//        }

        return output.toString();
    }

    public static String formatCenter(String input, int width) {
        input = input.trim().replaceAll(" +", " "); // allow only single space == remove multiple spaces

        StringBuilder output = new StringBuilder();
        int startIndex = 0;
        int endIndex = width - 1;

        while (startIndex < input.length()) {
            // find index to break
            int indexToBreak = input.lastIndexOf(" ", endIndex);

            if (indexToBreak == -1) {
                indexToBreak = Math.min(input.length() - 1, endIndex);
            }

            String substringForLine = input.substring(startIndex, indexToBreak + 1);

            //add half of the spaces at left to align
            for (int i = 0; i < (width - substringForLine.length()) / 2; i++) {
                output.append(" ");
            }

            //add words
            output.append(substringForLine);

            //add half of the spaces at right to align, add one space if needed for odd number
            for (int i = 0; i < Math.round((width - substringForLine.length()) / 2.0); i++) {
                output.append(" ");
            }

            //update variables to next loop
            startIndex = indexToBreak + 1;
            endIndex = startIndex + width - 1;

            //add next line if there will be a next line
            if (startIndex < input.length()) {
                output.append("\n");
            }
        }

        return output.toString();
    }

    //TODO: use and test in the future
    private int lastIndexOf(String word, int start, int end, String regex) {
        int indexToBreak = -1;

        for (int i = end; i > start; i--) {
            if (word.substring(i, i).matches(SEPARATOR_REGEX)) {
                indexToBreak = i;
                break;
            }
        }
        return indexToBreak;
    }
}
