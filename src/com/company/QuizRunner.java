package com.company;

import java.util.*;

public class QuizRunner {

    public static void main(String[] args) {
	    Quiz quiz1 = new Quiz("Fake Exam");


	    ArrayList<String> q1bank = new ArrayList<>();
	    q1bank.add("1. Atlantic Ocean");
	    q1bank.add("2. Turd Ferguson");
	    q1bank.add("3. Lake Superior");
	    Question q1 = new MultipleChoice("Which of these is a lake?", q1bank, 3);
        quiz1.addQuestion(q1);


        ArrayList<String> q2bank = new ArrayList<>();
        q2bank.add("1. Hola");
        q2bank.add("2. Hello");
        q2bank.add("3. Bonjour");
        q2bank.add("4. Greetings");
        ArrayList<Integer> q2answers = new ArrayList<>();
        q2answers.add(1);
        q2answers.add(3);
        Question q2 = new Checkbox("Select all of the words that are in English", q2bank, q2answers);
        quiz1.addQuestion(q2);

        Question q3 = new TrueFalse("This was a fun studio.", false);
        quiz1.addQuestion(q3);

        quiz1.startQuiz();
        System.out.println("Score: " + quiz1.getUserPoints() + "/" + quiz1.getTotalPoints());

    }
}
