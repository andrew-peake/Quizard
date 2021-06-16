package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class TrueFalse extends MultipleChoice {

    public TrueFalse(String questionText, boolean answer) {
        super(questionText);

        answerBank = new ArrayList<>();
        answerBank.add("1. True");
        answerBank.add("2. False");

        if (answer) {
            correctAnswer = 1;
        } else {
            correctAnswer = 2;
        }
    }


}
