package com.example.ramya.myquiz;

/**
 * Created by Ramya on 9/14/2017.
 */

public class QuestionLibrary {

    private String mQuestions [] = {
            "What is the value of pi?",
            "Formula for the volume of a cube with side a is",
            "Triangle inequality (sides are a, b and c) states that",
            "Area of a rectangle is defined by the formula",
            "Square root of 144"

    };


    private String mChoices [][] = {
            {"3.14", "5.99", "12.8675", "4.555"},
            {"a*a*a", "a*a", "2*a","6*a"},
            {"a+b>c", "a+b<c", "a+b+c=180","a+b+c=90"},
            {"length*breadth", "2*(length*breadth)", "3*(length*breadth)","length+breadth"},
            {"13","11","12","100"}
    };



    private String mCorrectAnswers[] = {"3.14", "a*a*a", "a+b>c", "length*breadth","12"};

    private String gkQuestions [] = {
            "What is the capital of Finland?",
            "What is the world's fastest supercomputer?",
            "Who is the prime minister of Canada?",
            "Which is the fastest land animal?",
            "Name of first astronaut who landed on moon?"

    };


    private String gkChoices [][] = {
            {"Helsinki", "Toronto", "Delhi", "Australia"},
            {"Tianhe-II", "Tianhe-I", "Big Red II","CDC 6600"},
            {"Narendra Modi", "Donald Trump", "Justin Trudeau","James Cameron"},
            {"Camel", "Puma", "Elephant","Cheetah"},
            {"Lance Armstrong","Neil Armstrong","Larry David","Harry Armstrong"}
    };



    private String gkCorrectAnswers[] = {"Helsinki", "Tianhe-II", "Justin Trudeau", "Cheetah","Neil Armstrong"};


    private String scQuestions [] = {
            "What is H2SO4?",
            "What is the study of plants called?",
            "Which galaxy are we in?",
            "A proton is?",
            "Color of copper sulphate?"

    };


    private String scChoices [][] = {
            {"Acetic acid", "Sulphuric acid", "Oxygen", "Hydrochloric acid"},
            {"Zoology", "Astronomy", "Botany","Geology"},
            {"Milky way", "Whirlpool", "Sombrero","Star burst"},
            {"Negative", "Positive", "Neutral","Non existent"},
            {"Green","Peacock blue","Red","Yellow"}
    };



    private String scCorrectAnswers[] = {"Sulphuric acid", "Botany", "Milky way", "Positive","Peacock blue"};

    public String getQuestion(int a,int t) {
        String question;

        if(t ==1)
            question = mQuestions[a];
        else if(t==2)
            question = gkQuestions[a];
        else
            question = scQuestions[a];
        return question;
    }


    public String getChoice1(int a,int t) {

        String choice0;
        if(t==1)
            choice0 = mChoices[a][0];
        else if(t==2)
            choice0 = gkChoices[a][0];
        else
            choice0 = scChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a, int t) {
        String choice1;

        //choice1 = mChoices[a][1];
        if(t==1)
            choice1 = mChoices[a][1];
        else if(t==2)
            choice1 = gkChoices[a][1];
        else
            choice1 = scChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a, int t) {
        String choice2;
        if(t==1)
            choice2 = mChoices[a][2];
        else if(t==2)
            choice2 = gkChoices[a][2];
        else
            choice2 = scChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a, int t) {
        String choice4;
        if(t==1)
            choice4 = mChoices[a][3];
        else if(t==2)
            choice4 = gkChoices[a][3];
        else
            choice4 = scChoices[a][3];
        return choice4;
    }

    public String getCorrectAnswer(int a, int t) {
        String answer;
        if(t==1)
            answer = mCorrectAnswers[a];
        else if(t==2)
            answer = gkCorrectAnswers[a];
        else
            answer = scCorrectAnswers[a];
        return answer;
    }

}
