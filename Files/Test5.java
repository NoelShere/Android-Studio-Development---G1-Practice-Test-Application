package com.noelistic.g1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.annotation.SuppressLint;



public class Test5 extends AppCompatActivity {



    private  QuestionSignM  mQuestionSignM = new QuestionSignM();



    private TextView mScoreView;
    private TextView mQuestionView;
    private Button   mButtonChoice1;
    private Button   mButtonChoice2;
    private Button   mButtonChoice3;
    private Button   mButtonChoice4;
    private ImageView mImageView;
    private Button   nextquestion;
    private String mAnswer;
    private int imagecounter = 0;
    protected static int mScore = 0;

    private  int mQestionNumber = 0;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        setContentView(R.layout.activity_test5);

        mScore = 0;

        getSupportActionBar().hide(); // to hide the top bar only for this activity
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView  = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.button1);
        mButtonChoice2 = (Button) findViewById(R.id.button2);
        mButtonChoice3 = (Button) findViewById(R.id.button3);
        mButtonChoice4 = (Button) findViewById(R.id.button4);
        mImageView = (ImageView) findViewById(R.id.imageView2);
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
                    Toast.makeText(Test5.this, "Correct", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(Test5.this, "Wrong", Toast.LENGTH_SHORT).show();

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
                    Toast.makeText(Test5.this, "Correct", Toast.LENGTH_SHORT).show();
                }
                else
                {
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
                    nextquestion.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            updateQuestion();

                        } });


                    mButtonChoice2.setBackgroundResource(R.drawable.wronganswer);
                    mButtonChoice1.setEnabled(false);
                    mButtonChoice2.setEnabled(false);
                    mButtonChoice3.setEnabled(false);
                    mButtonChoice4.setEnabled(false);
                    Toast.makeText(Test5.this, "Wrong", Toast.LENGTH_SHORT).show();

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
                    Toast.makeText(Test5.this, "Correct", Toast.LENGTH_SHORT).show();

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
                    Toast.makeText(Test5.this, "Wrong", Toast.LENGTH_SHORT).show();

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
                    Toast.makeText(Test5.this, "Correct", Toast.LENGTH_SHORT).show();
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
                    if(mButtonChoice2.getText() == mAnswer)
                    {
                        mButtonChoice2.setBackgroundResource(R.drawable.rightanswer);
                    }
                    if(mButtonChoice1.getText() == mAnswer)
                    {
                        mButtonChoice1.setBackgroundResource(R.drawable.rightanswer);
                    }
                    mButtonChoice4.setBackgroundResource(R.drawable.wronganswer);
                    mButtonChoice1.setEnabled(false);
                    mButtonChoice2.setEnabled(false);
                    mButtonChoice3.setEnabled(false);
                    mButtonChoice4.setEnabled(false);
                    Toast.makeText(Test5.this, "Wrong", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }
    private void updateQuestion(){
        mQuestionView.setText(mQuestionSignM.getQuestion(mQestionNumber));
        mButtonChoice1.setText(mQuestionSignM.getChoice1(mQestionNumber));
        mButtonChoice2.setText(mQuestionSignM.getChoice2(mQestionNumber));
        mButtonChoice3.setText(mQuestionSignM.getChoice3(mQestionNumber));
        mButtonChoice4.setText(mQuestionSignM.getChoice4(mQestionNumber));

        mButtonChoice1.setBackgroundResource(R.drawable.rounded_button);
        mButtonChoice2.setBackgroundResource(R.drawable.rounded_button);
        mButtonChoice3.setBackgroundResource(R.drawable.rounded_button);
        mButtonChoice4.setBackgroundResource(R.drawable.rounded_button);

        mButtonChoice1.setEnabled(true);
        mButtonChoice2.setEnabled(true);
        mButtonChoice3.setEnabled(true);
        mButtonChoice4.setEnabled(true);
        nextquestion.setVisibility(View.GONE);
        if(imagecounter == 0) {
            mImageView.setImageResource(R.drawable.airport);
        }
        if(imagecounter == 1) {
            mImageView.setImageResource(R.drawable.bicycleroute);
        }
        if(imagecounter == 2) {
            mImageView.setImageResource(R.drawable.bump);
        }
        if(imagecounter == 3) {
            mImageView.setImageResource(R.drawable.closedlane);
        }
        if(imagecounter == 4) {
            mImageView.setImageResource(R.drawable.deer);
        }
        if(imagecounter == 5) {
            mImageView.setImageResource(R.drawable.detour);
        }
        if(imagecounter == 6) {
            mImageView.setImageResource(R.drawable.donotblockintersection);
        }
        if(imagecounter == 7) {
            mImageView.setImageResource(R.drawable.donotcross);
        }
        if(imagecounter == 8) {
            mImageView.setImageResource(R.drawable.keepright21);
        }
        if(imagecounter == 9) {
            mImageView.setImageResource(R.drawable.noidling);
        }
        if(imagecounter == 10) {
            mImageView.setImageResource(R.drawable.nostanding);
        }
        if(imagecounter == 11) {
            mImageView.setImageResource(R.drawable.parkingatdesignatedareaandtime);
        }
        if(imagecounter == 12) {
            mImageView.setImageResource(R.drawable.pedestriancrossing);
        }
        if(imagecounter == 13) {
            mImageView.setImageResource(R.drawable.redlightcamera);
        }
        if(imagecounter == 14) {
            mImageView.setImageResource(R.drawable.roadwork);
        }
        if(imagecounter == 15) {
            mImageView.setImageResource(R.drawable.schoolcrossing);
        }
        if(imagecounter == 16) {
            mImageView.setImageResource(R.drawable.sharpturnorbend);
        }
        //mAnswer = mQuestionSignM.getCorrectAnswer(mQestionNumber);

        if(imagecounter == 17) {
            mImageView.setImageResource(R.drawable.stopsign);
        }
        //mAnswer = mQuestionSignM.getCorrectAnswer(mQestionNumber);

        if(imagecounter == 18) {
            mImageView.setImageResource(R.drawable.turnrightthenleft);
        }
      //  mAnswer = mQuestionSignM.getCorrectAnswer(mQestionNumber);

        if(imagecounter == 19) {
            mImageView.setImageResource(R.drawable.yield);
        }
        mAnswer = mQuestionSignM.getCorrectAnswer(mQestionNumber);





        imagecounter++;
        mQestionNumber++;

        if(mQestionNumber  >= 21)
        {

            Intent intent = new Intent(Test5.this,ScoreScreen.class);

            startActivity(intent);

//            Intent intent = new Intent(Test5.this,MainActivity.class);
//
//            startActivity(intent);


        }

    }

    private void updateScore(int point)
    {
        mScoreView.setText("" + mScore);
    }

}