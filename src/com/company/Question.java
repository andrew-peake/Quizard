package com.company;

import java.util.Scanner;

public abstract class Question {
    public String questionText;
    public int pointValue = 1;
    public static Scanner input = new Scanner(System.in);

    public Question(String questionText) {
        this.questionText = questionText;
    }


    public Question(String questionText, int pointValue) {
        this.questionText = questionText;
        this.pointValue = pointValue;
    }

    public int getPointValue() {
        return pointValue;
    }

    public abstract int runQuestion();

}
