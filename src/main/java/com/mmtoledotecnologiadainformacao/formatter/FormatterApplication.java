package com.mmtoledotecnologiadainformacao.formatter;

import com.mmtoledotecnologiadainformacao.formatter.service.TextAligner;

import java.util.Scanner;

public class FormatterApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Application started...");

        System.out.println("Input text: ");
        String input = scanner.nextLine();

        System.out.println("Input width: ");
        int width = scanner.nextInt();

        System.out.println("Choose type of alignment (L, C or R): ");
        char alignment = scanner.next().charAt(0);

        final String formattedText;

        switch (alignment) {
            case 'L':
                formattedText = TextAligner.formatLeft(input, width);
                break;
            case 'R':
                formattedText = TextAligner.formatRight(input, width);
                break;
            case 'C':
                formattedText = TextAligner.formatCenter(input, width);
                break;
            default:
                System.out.println(alignment + " is not valid.");
                System.out.println("Finishing application...");
                return;
        }

        System.out.println(formattedText);
    }

}
