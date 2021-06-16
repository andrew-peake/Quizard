package com.company;

import java.util.*;

public class Checkbox extends Question{
    protected ArrayList<String> answerBank;
    protected ArrayList<Integer> correctAnswers;
    private String questionPrompt = "Enter all correct answers. Separate each correct answer with a comma (,): ";

    public Checkbox(String questionText, ArrayList<String> answerBank, ArrayList<Integer> correctAnswers) {
        super(questionText);
        this.answerBank = answerBank;
        this.correctAnswers = correctAnswers;
    }

    public String getQuestionPrompt() {
        return questionPrompt;
    }

    @Override
    public int runQuestion() {
        System.out.println(this);

        String answerStr = input.nextLine();
        String[] answerStrs = answerStr.split(",");
        ArrayList<Integer> userChoices = new ArrayList<>();

        for (int i = 0; i < answerStrs.length; i++) {
            userChoices.add(Integer.parseInt(answerStrs[i].trim()));
        }

        Collections.sort(userChoices);
        Collections.sort(correctAnswers);

        if (userChoices.equals(correctAnswers)) {
            return pointValue;
        }

        return 0;
    }
}
