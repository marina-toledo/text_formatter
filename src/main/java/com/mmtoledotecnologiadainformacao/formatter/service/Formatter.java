package com.mmtoledotecnologiadainformacao.formatter.service;

public class Formatter {

    private Alignment alignment;

    public enum Alignment {
        LEFT,
        RIGHT,
        CENTER;
    }

    public static String format(String input, Alignment alignment, int width) {
        switch (alignment){
            case LEFT: return formatLeft(input, width);
            case RIGHT: return formatRight(input, width);
            case CENTER: return formatCenter(input, width);
        }

        return input;
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
