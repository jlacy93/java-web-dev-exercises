package org.launchcode.java.studios.funwithquizzes;

/*
Question (abstract, parent)
=========================
String question
ArrayList answer
Int points

function
Print Question
Grade Question(ABS?)

Multiple Choice
TrueFalse
CheckBox

Quiz

Quiz runner

 */

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Question {
    private int pointValue;
    private String questionText;
    public Question(int pointValue, String questionText) {
        this.pointValue = pointValue;
        this.questionText = questionText;
    }
    public void displayQuestion () {
        System.out.println(questionText);
    }
    public void setPointValue(int x) {
        this.pointValue = x;
    }
    public int getPointValue()  {
        return this.pointValue;
    }

    public abstract void displayAnswers ();

    public abstract int getAnswers();
}