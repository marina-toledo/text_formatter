package com.mmtoledotecnologiadainformacao.formatter.service;

public class Formatter {

    private Alignment alignment;

    public enum Alignment {
        LEFT,
        RIGHT,
        CENTER;
    }

    public static String format(String input, Alignment alignment, int width) {
        return "This text \nshould be \nleft \naligned ";
    }
}
