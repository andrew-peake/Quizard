package com.company;

import java.util.*;

public class MultipleChoice extends Question {

    protected ArrayList<String> answerBank;
    protected int correctAnswer;
    private String responsePrompt = "Enter the number value (1, 2, 3, etc.) for the correct answer: ";

    public MultipleChoice(String questionText, ArrayList<String> answerBank, int correctAnswer) {
        super(questionText);
        this.answerBank = answerBank;
        this.correctAnswer = correctAnswer;
    }

    public MultipleChoice(String questionText) {
        super(questionText);
    }

    public String getResponsePrompt() {
        return responsePrompt;
    }


    @Override
    public int runQuestion() {
        System.out.println(this);

        int userAnswer = input.nextInt();

        if (userAnswer == correctAnswer) {
            return pointValue;
        }
        return 0;
    }

    public String toString() {
        String questionStr = questionText + "\n";
        for (int i = 0; i < answerBank.size(); i++) {
            questionStr += (i + " - " + answerBank.get(i) + "\n");
        }

        questionStr += responsePrompt;

        return questionStr;
    }

}
