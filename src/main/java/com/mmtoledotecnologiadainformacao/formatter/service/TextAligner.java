package com.mmtoledotecnologiadainformacao.formatter.service;

public class TextAligner {

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
        StringBuilder output = new StringBuilder();
//        int startLine = 0;
//        int endLineLimit = width;
//
//        while (startLine < input.length()) {
//            final int indexToBreak = input.lastIndexOf(" ", endLineLimit);
//            output.append(input, startLine, indexToBreak);
//
//            for (int i = 0; i < (endLineLimit - indexToBreak); i++) {
//                output.append(" ");
//            }
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
}
