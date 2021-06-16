package com.company;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();
    private String title;
    private int totalPoints = 0;
    private int userPoints = 0;

    public Quiz(String title) {
        this.title = title;
    }

    public void addQuestion(Question x) {
        questions.add(x);
        totalPoints += x.getPointValue();
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getUserPoints() {
        return userPoints;
    }

    public void startQuiz() {
        System.out.println("*****" + title + "*****");
        for (Question question : questions) {
            userPoints += question.runQuestion();
        }
    }
}
