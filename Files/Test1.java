package com.noelistic.g1app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import android.annotation.SuppressLint;

public class Test1 extends AppCompatActivity {

    private  QuestionLibrary mQuestionLibrary = new QuestionLibrary();


    private TextView mScoreView;
    private TextView mQuestionView;
    private Button   mButtonChoice1;
    private Button   mButtonChoice2;
    private Button   mButtonChoice3;
    private Button   mButtonChoice4;
    private Button   nextquestion;
   // Context context;

    private String mAnswer;
    protected static int mScore = 0;
    private  int mQestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_test1);
        mScore = 0;
        getSupportActionBar().hide(); // to hide the top bar only for this activity
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);

//        Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView  = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.button1);
        mButtonChoice2 = (Button) findViewById(R.id.button2);
        mButtonChoice3 = (Button) findViewById(R.id.button3);
        mButtonChoice4 = (Button) findViewById(R.id.button4);
        nextquestion = (Button) findViewById(R.id.nextquestion);

        updateQuestion();


        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextquestion.setVisibility(View.VISIBLE);
                if(mButtonChoice1.getText()== mAnswer)
                {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    nextquestion.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            updateQuestion();

                        } });

                    mButtonChoice1.setBackgroundResource(R.drawable.rightanswer);
                    mButtonChoice1.setEnabled(false);
                    mButtonChoice2.setEnabled(false);
                    mButtonChoice3.setEnabled(false);
                    mButtonChoice4.setEnabled(false);
                    Toast.makeText(Test1.this, "Correct", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(mButtonChoice3.getText() == mAnswer)
                    {
                        mButtonChoice3.setBackgroundResource(R.drawable.rightanswer);
                    }
                    if(mButtonChoice2.getText() == mAnswer)
                    {
                        mButtonChoice2.setBackgroundResource(R.drawable.rightanswer);
                    }
                    if(mButtonChoice4.getText() == mAnswer)
                    {
                        mButtonChoice4.setBackgroundResource(R.drawable.rightanswer);
                    }

                    nextquestion.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            updateQuestion();

                        } });

                    mButtonChoice1.setBackgroundResource(R.drawable.wronganswer);
                    mButtonChoice1.setEnabled(false);
                    mButtonChoice2.setEnabled(false);
                    mButtonChoice3.setEnabled(false);
                    mButtonChoice4.setEnabled(false);

                    Toast.makeText(Test1.this, "Wrong", Toast.LENGTH_SHORT).show();

                }

            }
        });




        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextquestion.setVisibility(View.VISIBLE);
                if(mButtonChoice2.getText()== mAnswer)
                {
                    mScore = mScore + 1;
                    updateScore(mScore);

                    nextquestion.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            updateQuestion();

                        } });

                    mButtonChoice2.setBackgroundResource(R.drawable.rightanswer);
                    mButtonChoice1.setEnabled(false);
                    mButtonChoice2.setEnabled(false);
                    mButtonChoice3.setEnabled(false);
                    mButtonChoice4.setEnabled(false);
                    Toast.makeText(Test1.this, "Correct", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    nextquestion.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            updateQuestion();

                        } });

                    if(mButtonChoice3.getText() == mAnswer)
                    {
                        mButtonChoice3.setBackgroundResource(R.drawable.rightanswer);
                    }
                    if(mButtonChoice4.getText() == mAnswer)
                    {
                        mButtonChoice4.setBackgroundResource(R.drawable.rightanswer);
                    }
                    if(mButtonChoice1.getText() == mAnswer)
                    {
                        mButtonChoice1.setBackgroundResource(R.drawable.rightanswer);
                    }
                    mButtonChoice2.setBackgroundResource(R.drawable.wronganswer);
                    mButtonChoice1.setEnabled(false);
                    mButtonChoice2.setEnabled(false);
                    mButtonChoice3.setEnabled(false);
                    mButtonChoice4.setEnabled(false);
                    Toast.makeText(Test1.this, "Wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });




        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextquestion.setVisibility(View.VISIBLE);
                if(mButtonChoice3.getText()== mAnswer)
                {
                    mScore = mScore + 1;
                    updateScore(mScore);

                    nextquestion.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            updateQuestion();

                        } });

                    mButtonChoice3.setBackgroundResource(R.drawable.rightanswer);
                    mButtonChoice1.setEnabled(false);
                    mButtonChoice2.setEnabled(false);
                    mButtonChoice3.setEnabled(false);
                    mButtonChoice4.setEnabled(false);
                    Toast.makeText(Test1.this, "Correct", Toast.LENGTH_SHORT).show();
                }
                else
                {

                    if(mButtonChoice4.getText() == mAnswer)
                    {
                        mButtonChoice4.setBackgroundResource(R.drawable.rightanswer);
                    }
                    if(mButtonChoice2.getText() == mAnswer)
                    {
                        mButtonChoice2.setBackgroundResource(R.drawable.rightanswer);
                    }
                    if(mButtonChoice1.getText() == mAnswer)
                    {
                        mButtonChoice1.setBackgroundResource(R.drawable.rightanswer);
                    }
                    nextquestion.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            updateQuestion();

                        } });

                    mButtonChoice3.setBackgroundResource(R.drawable.wronganswer);
                    mButtonChoice1.setEnabled(false);
                    mButtonChoice2.setEnabled(false);
                    mButtonChoice3.setEnabled(false);
                    mButtonChoice4.setEnabled(false);
                    Toast.makeText(Test1.this, "Wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });


        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextquestion.setVisibility(View.VISIBLE);
                if(mButtonChoice4.getText()== mAnswer)
                {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    nextquestion.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            updateQuestion();

                        } });

                    mButtonChoice4.setBackgroundResource(R.drawable.rightanswer);
                    mButtonChoice1.setEnabled(false);
                    mButtonChoice2.setEnabled(false);
                    mButtonChoice3.setEnabled(false);
                    mButtonChoice4.setEnabled(false);
                    Toast.makeText(Test1.this, "Correct", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    if(mButtonChoice3.getText() == mAnswer)
                    {
                        mButtonChoice3.setBackgroundResource(R.drawable.rightanswer);
                    }
                    if(mButtonChoice2.getText() == mAnswer)
                    {
                        mButtonChoice2.setBackgroundResource(R.drawable.rightanswer);
                    }
                    if(mButtonChoice1.getText() == mAnswer)
                    {
                        mButtonChoice1.setBackgroundResource(R.drawable.rightanswer);
                    }
                    nextquestion.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            updateQuestion();

                        } });

                    mButtonChoice4.setBackgroundResource(R.drawable.wronganswer);
                    mButtonChoice1.setEnabled(false);
                    mButtonChoice2.setEnabled(false);
                    mButtonChoice3.setEnabled(false);
                    mButtonChoice4.setEnabled(false);
                    Toast.makeText(Test1.this, "Wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQestionNumber));
        mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQestionNumber));



    mButtonChoice1.setBackgroundResource(R.drawable.rounded_button);
    mButtonChoice2.setBackgroundResource(R.drawable.rounded_button);
    mButtonChoice3.setBackgroundResource(R.drawable.rounded_button);
    mButtonChoice4.setBackgroundResource(R.drawable.rounded_button);

    mButtonChoice1.setEnabled(true);
    mButtonChoice2.setEnabled(true);
    mButtonChoice3.setEnabled(true);
    mButtonChoice4.setEnabled(true);


    nextquestion.setVisibility(View.GONE);

    mAnswer = mQuestionLibrary.getCorrectAnswer(mQestionNumber);
        mQestionNumber++;

        if(mQestionNumber  >= 11)
        {

            Intent intent = new Intent(Test1.this,ScoreScreen.class);

            startActivity(intent);

        }

}

    private void updateScore(int point)
    {
        mScoreView.setText("" + mScore);
    }

}
