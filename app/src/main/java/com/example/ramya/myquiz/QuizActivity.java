package com.example.ramya.myquiz;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;
    private RadioGroup topic;
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    private int t=0;
    private int score=0;
    private int final_score[]={0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonChoice4 = (Button) findViewById(R.id.choice4);
        topic = (RadioGroup) findViewById(R.id.Topic);
        topic.setOnCheckedChangeListener(new OnCheckedChangeListener(){
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if(checkedId == R.id.topic1) {
                    t=1;
                    mQuestionNumber=0;
                    //Toast.makeText(getApplicationContext(), String.valueOf(t) ,Toast.LENGTH_SHORT).show();
                    updateQuestion(t);

                } else if(checkedId == R.id.topic2) {

                    t=2;
                    mQuestionNumber=0;
                    //Toast.makeText(getApplicationContext(), String.valueOf(t), Toast.LENGTH_SHORT).show();
                    updateQuestion(t);

                } else {

                    t=3;
                    mQuestionNumber=0;
                    //Toast.makeText(getApplicationContext(), String.valueOf(t), Toast.LENGTH_SHORT).show();
                    updateQuestion(t);

                }
            }

        });


                //Start of Button Listener for Button1
                mButtonChoice1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //My logic for Button goes in here

                        if (mButtonChoice1.getText() == mAnswer) {
                            mScore = mScore + 2;
                            updateScore(mScore,t);
                            updateQuestion(t);
                            //This line of code is optiona
                            Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                        } else {

                            mScore = mScore - 1;
                            if(mScore < 0)
                                mScore =0;
                            updateScore(mScore,t);
                            Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                            updateQuestion(t);
                        }
                    }
                });

                //End of Button Listener for Button1

                //Start of Button Listener for Button2
                mButtonChoice2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //My logic for Button goes in here

                        if (mButtonChoice2.getText() == mAnswer) {
                            mScore = mScore + 2;
                            updateScore(mScore,t);
                            updateQuestion(t);
                            //This line of code is optiona
                            Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                        } else {
                            mScore = mScore - 1;
                            if(mScore < 0)
                                mScore =0;
                            updateScore(mScore,t);
                            Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                            updateQuestion(t);
                        }
                    }
                });

                //End of Button Listener for Button2


                //Start of Button Listener for Button3
                mButtonChoice3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //My logic for Button goes in here

                        if (mButtonChoice3.getText() == mAnswer) {
                            mScore = mScore + 2;
                            updateScore(mScore,t);
                            updateQuestion(t);
                            //This line of code is optiona
                            Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                        } else {
                            mScore = mScore - 1;
                            if(mScore < 0)
                                mScore =0;
                            updateScore(mScore,t);
                            Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                            updateQuestion(t);
                        }
                    }
                });

                //End of Button Listener for Button3

                //Start of Button Listener for Button4
                mButtonChoice4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //My logic for Button goes in here

                        if (mButtonChoice4.getText() == mAnswer) {
                            mScore = mScore + 2;
                            updateScore(mScore,t);
                            updateQuestion(t);
                            //This line of code is optiona
                            Toast.makeText(QuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                        } else {
                            mScore = mScore - 1;
                            if(mScore < 0)
                                mScore =0;
                            updateScore(mScore,t);
                            Toast.makeText(QuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                            updateQuestion(t);
                        }
                    }
                });

                //End of Button Listener for Button4

    }



    private void updateQuestion(int topic_num){

        if(topic_num ==1) {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber,topic_num));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber,topic_num));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber,topic_num));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber,topic_num));
            mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber,topic_num));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber,topic_num);
            if(mQuestionNumber == 4) {
                mQuestionNumber = 0;
                Toast.makeText(QuizActivity.this, "Done with Mathematics quiz", Toast.LENGTH_SHORT).show();

            }
            else
                mQuestionNumber++;
        }
        else if(topic_num ==2){
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber,topic_num));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber,topic_num));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber,topic_num));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber,topic_num));
            mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber,topic_num));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber,topic_num);
            if(mQuestionNumber == 4) {
                mQuestionNumber = 0;
                Toast.makeText(QuizActivity.this, "Done with General Knowledge quiz", Toast.LENGTH_SHORT).show();
            }
            else
                mQuestionNumber++;

        }
        else {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber,topic_num));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber,topic_num));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber,topic_num));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber,topic_num));
            mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber,topic_num));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber,topic_num);
            if(mQuestionNumber == 4) {
                mQuestionNumber = 0;
                Toast.makeText(QuizActivity.this, "Done with Science quiz", Toast.LENGTH_SHORT).show();
            }
            else
                mQuestionNumber++;
        }
    }


    private void updateScore(int point,int topic_num) {

        if (topic_num == 1) {
            final_score[0] += point;
            mScoreView.setText("" + final_score[0]);
        }
        else if (topic_num == 2) {
            final_score[1] += point;
            mScoreView.setText("" + final_score[1]);
        }
        else{
            final_score[2] += point;
            mScoreView.setText("" + final_score[2]);
        }
        score = final_score[0]+final_score[1]+final_score[2];
    }
}