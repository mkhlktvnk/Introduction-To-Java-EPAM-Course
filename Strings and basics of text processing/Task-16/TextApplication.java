package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TextApplication {

    private static void runTextOperations(String text) throws IOException {
        MenuPrinter menuPrinter = new MenuPrinter(
                "1 - sort paragraphs by sentences count.",
                "2 - sort words in sentences by length.",
                "3 - sort lexemes in sentences.",
                "4 - show text.",
                "5 - quit."
        );
        String choice = "";
        TextProcessor textProcessor = new TextProcessor(text);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            menuPrinter.print();
            System.out.println("Enter your choice:");
            choice = bufferedReader.readLine();
            switch (choice) {
                case "1":
                    System.out.println(textProcessor.sortParagraphsBySentencesCount());
                    System.out.println("Successfully!");
                    break;
                case "2":
                    System.out.println(textProcessor.sortWordsInSentencesByLength());
                    System.out.println("Successfully!");
                    break;
                case "3":
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter symbol: ");
                    char symbol = scanner.next().charAt(0);
                    System.out.println(textProcessor.sortLexemes(symbol));
                    System.out.println("Successfully!");
                    break;
                case "4":
                    System.out.println(textProcessor.toString());
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Wrong input! Try again!");
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String text = "Britain is one of the most highly industrialised countries in the world: " +
                "for every person employed in agriculture 12 are employed in industry. " +
                "The original base of British industry was coal-mining, " +
                "iron and steel and textiles. " +
                "Today the most productive sectors include high-tech industries, " +
                "chemicals, finance and the service sectors, especially banking, insurance and tourism.\n" +
                "Birmingham developed engineering, chemicals, electronics and car manufacture. " +
                "Cambridge is famous for software engineering (making programs for computers) " +
                "and bio-chemical and bio-genetic products. " +
                "Cattle-farming is the speciality of the west of England, " +
                "Northern Ireland and Scotland. Wheat and fruit are widely " +
                "grown in the south-east of England. Near the east and north-east " +
                "coast of England and Scotland there are vast reserves of oil and gas. " +
                "The UK is a member of OPEC - the Oil Producers and Exporters Cartel.";
        runTextOperations(text);
    }
}
