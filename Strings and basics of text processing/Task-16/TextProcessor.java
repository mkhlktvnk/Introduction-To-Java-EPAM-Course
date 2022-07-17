package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public class TextProcessor {
    private final String text;

    public TextProcessor(String text) {
        this.text = text;
    }

    public String sortParagraphsBySentencesCount() {
        List<String> paragraphs = new ArrayList<>(splitParagraphs(text));
        paragraphs.sort(Comparator.comparingInt(paragraph -> splitSentences(paragraph).size()));
        return mergeParagraphs(paragraphs);
    }

    public String sortWordsInSentencesByLength() {
        List<String> paragraphs = new ArrayList<>(splitParagraphs(text));
        List<String> sortedParagraphs = new ArrayList<>();
        paragraphs.forEach((paragraph) -> {
            List<String> sentences = new ArrayList<>(splitSentences(paragraph));
            List<String> sortedSentences = new ArrayList<>();
            sentences.forEach((sentence) -> {
               List<String> words = new ArrayList<>(splitWords(sentence));
               words.sort(Comparator.comparingInt(String::length));
               sortedSentences.add(mergeWords(words));
            });
            sortedParagraphs.add(mergeSentences(sortedSentences));
        });
        return mergeParagraphs(sortedParagraphs);
    }

    public String sortLexemes(char symbol) {
        List<String> paragraphs = new ArrayList<>(splitParagraphs(text));
        List<String> sortedParagraphs = new ArrayList<>();
        paragraphs.forEach((paragraph) -> {
            List<String> sentences = new ArrayList<>(splitSentences(paragraph));
            List<String> sortedSentences = new ArrayList<>();
            sentences.forEach((sentence) -> {
                List<String> words = new ArrayList<>(splitWords(sentence));
                List<String> sortedLexemes = new ArrayList<>(getSortedLexemes(words, symbol));
                sortedSentences.add(mergeWords(sortedLexemes));
            });
            sortedParagraphs.add(mergeSentences(sortedSentences));
        });
        return mergeParagraphs(sortedParagraphs);
    }

    @Override
    public String toString() {
        return text;
    }

    private int countOccurrences(String string, char symbol) {
        return (int) string.chars().filter(c -> c == symbol).count();
    }

    private List<String> getSortedLexemes(List<String> words, char symbol) {
        List<String> sortedLexemes = new ArrayList<>(words);
        for (int i = words.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                String a = sortedLexemes.get(j);
                String b = sortedLexemes.get(j + 1);
                int countA = countOccurrences(a, symbol);
                int countB = countOccurrences(b, symbol);
                if ((countA < countB) || (countA == countB && a.compareTo(b) > 0)) {
                    Collections.swap(sortedLexemes, j, j + 1);
                }
            }
        }
        return sortedLexemes;
    }

    private List<String> splitParagraphs(String text) {
        return List.of(text.split("\n"));
    }

    private List<String> splitSentences(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return List.of(pattern.split(text));
    }

    private List<String> splitWords(String text) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return List.of(pattern.split(text));
    }

    private String mergeWords(List<String> words) {
        StringBuilder stringBuilder = new StringBuilder();
        words.forEach((word) -> {
            stringBuilder.append(word);
            stringBuilder.append(" ");
        });
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append(".");
        return stringBuilder.toString();
    }

    private String mergeSentences(List<String> sentences) {
        StringBuilder stringBuilder = new StringBuilder();
        sentences.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }

    private String mergeParagraphs(List<String> paragraphs) {
        StringBuilder stringBuilder = new StringBuilder();
        paragraphs.forEach((paragraph) -> {
            stringBuilder.append(paragraph);
            stringBuilder.append("\n");
        });
        return stringBuilder.toString();
    }
}
