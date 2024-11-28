package org.example;

public class Main {
    public static void main(String[] args) {
        String input = "abcTES";
        testingTest automaton = new testingTest(input);

        String result = automaton.analyze();
        System.out.println("Результат для рядка \"" + input + "\": " + result);
    }
}