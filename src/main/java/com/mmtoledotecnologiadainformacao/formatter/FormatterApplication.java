package com.mmtoledotecnologiadainformacao.formatter;

import com.mmtoledotecnologiadainformacao.formatter.service.TextAligner;

import java.util.Scanner;

public class FormatterApplication {

    public static void main(String[] args) {
//        TODO: catch wrong typed inputs and adjust aligment call
        Scanner scanner = new Scanner(System.in);

        System.out.println("Application started...");

        System.out.println("Input width: ");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.println("Choose type of alignment (L-C-R): ");
        String alignment = scanner.nextLine();

        System.out.println("Input text: ");
        String text = scanner.nextLine();

        final String formattedText = TextAligner.format(text, TextAligner.Alignment.LEFT, width);
        System.out.println(formattedText);
    }

}
