package com.noelistic.g1app;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import android.annotation.SuppressLint;

public class ScoreScreen extends AppCompatActivity {

    private Test1 mtest1 = new Test1();
    private Test2 mtest2 = new Test2();
    private Test3 mtest3 = new Test3();
    private Test4 mtest4 = new Test4();
    private Test5 mtest5 = new Test5();
    private Test6 mtest6 = new Test6();

    private int mScoreT1 = 0;
    private int mScoreT2 = 0;
    private int mScoreT3 = 0;
    private int mScoreT4 = 0;
    private int mScoreT5 = 0;
    private int mScoreT6 = 0;

    private InterstitialAd mInterstitialAd;

    @Override
    public void onBackPressed() {

        // this stops the crashes

    }


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_screen);

        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide(); // to hide the top bar only for this activity


        // ad code

        mInterstitialAd = new InterstitialAd(ScoreScreen.this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7447623152498928/3466344122");


        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
        mInterstitialAd.setAdListener(new AdListener(){


            // so when ever the ad loads onces this activity is opened this function is called
            @Override
            public void onAdLoaded()
            {
                Handler a = new Handler();
                a.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(ScoreScreen.this,MainActivity.class);

                        startActivity(intent);
                    }
                }, 2000);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        displayInterstitial();
                    }
                }, 2000);



            }


        });

        mScoreT1 = mtest1.mScore;
        mScoreT2 = mtest2.mScore;
        mScoreT3 = mtest3.mScore;
        mScoreT4 = mtest4.mScore;
        mScoreT5 = mtest5.mScore;
        mScoreT6 = mtest6.mScore;

        //final int finalScore = 0;

        final TextView ChangingScore = (TextView) findViewById(R.id.scorechange);

        final TextView Info = (TextView) findViewById(R.id.Info);

        //final int finalScore = ((mScoreT1 + mScoreT2) + (mScoreT3 + mScoreT4) + (mScoreT5 + mScoreT6));

        if(mScoreT1 > 0) {
            if (mScoreT1 > 7) {
                ChangingScore.setText("" + mScoreT1 + "/10");
                ChangingScore.setTextColor(getResources().getColor(R.color.passedColor));
                Info.setText("Congratulation you passed the test!");
                //you passes
            }
            if (mScoreT1 < 7) {
                ChangingScore.setText("" + mScoreT1 + "/" + "10");
                ChangingScore.setTextColor(getResources().getColor(R.color.FailedColor));
                Info.setText("Sorry you failed the test. Practice harder!!");
                //you failed
            }
            if (mScoreT1 == 7) {
                // you just passed

                ChangingScore.setText("" + mScoreT1 + "/" + "10");
                ChangingScore.setTextColor(getResources().getColor(R.color.passedColor));
                Info.setText("Congratulation you just passed the test!, dont stop now! Practice harder!");
            }
        }

        if(mScoreT2 > 0) {
            if (mScoreT2 > 14) {
                ChangingScore.setText("" + mScoreT2 + "/20");
                ChangingScore.setTextColor(getResources().getColor(R.color.passedColor));
                Info.setText("Congratulation you passed the test!");
                //you passes
            }
            if (mScoreT2 < 14) {
                ChangingScore.setText("" + mScoreT2 + "/" + "20");
                ChangingScore.setTextColor(getResources().getColor(R.color.FailedColor));
                Info.setText("Sorry you failed the test. Practice harder!!");
                //you failed
            }
            if (mScoreT2 == 14) {
                // you just passed

                ChangingScore.setText("" + mScoreT2 + "/" + "20");
                ChangingScore.setTextColor(getResources().getColor(R.color.passedColor));
                Info.setText("Congratulation you just passed the test!, dont stop now! Practice harder!");
            }
        }

        if(mScoreT3 > 0) {
            if (mScoreT3 > 14) {
                ChangingScore.setText("" + mScoreT3 + "/" + "20");
                ChangingScore.setTextColor(getResources().getColor(R.color.passedColor));
                Info.setText("Congratulation you passed the test!");
                //you passes
            }
            if (mScoreT3 < 14) {
                ChangingScore.setText("" + mScoreT3 + "/" + "20");
                ChangingScore.setTextColor(getResources().getColor(R.color.FailedColor));
                Info.setText("Sorry you failed the test. Practice harder!!");
                //you failed
            }
            if (mScoreT3 == 14) {
                // you just passed

                ChangingScore.setText("" + mScoreT3 + "/" + "20");
                ChangingScore.setTextColor(getResources().getColor(R.color.passedColor));
                Info.setText("Congratulation you just passed the test!, dont stop now! Practice harder!");
            }
        }

        if(mScoreT4 > 0) {
            if (mScoreT4 > 7) {
                ChangingScore.setText("" + mScoreT4 + "/10");
                ChangingScore.setTextColor(getResources().getColor(R.color.passedColor));
                Info.setText("Congratulation you passed the test!");
                //you passes
            }
            if (mScoreT4 < 7) {
                ChangingScore.setText("" + mScoreT4 + "/" + "10");
                ChangingScore.setTextColor(getResources().getColor(R.color.FailedColor));
                Info.setText("Sorry you failed the test. Practice harder!!");
                //you failed
            }
            if (mScoreT4 == 7) {
                // you just passed

                ChangingScore.setText("" + mScoreT4 + "/" + "10");
                ChangingScore.setTextColor(getResources().getColor(R.color.passedColor));
                Info.setText("Congratulation you just passed the test!, dont stop now! Practice harder!");
            }
        }

        if(mScoreT5 > 0) {
            if (mScoreT5 > 14) {
                ChangingScore.setText("" + mScoreT5 + "/20");
                ChangingScore.setTextColor(getResources().getColor(R.color.passedColor));
                Info.setText("Congratulation you passed the test!");
                //you passes
            }
            if (mScoreT5 < 14) {
                ChangingScore.setText("" + mScoreT5 + "/" + "20");
                ChangingScore.setTextColor(getResources().getColor(R.color.FailedColor));
                Info.setText("Sorry you failed the test. Practice harder!!");
                //you failed
            }
            if (mScoreT5 == 14) {
                // you just passed

                ChangingScore.setText("" + mScoreT5 + "/" + "20");
                ChangingScore.setTextColor(getResources().getColor(R.color.passedColor));
                Info.setText("Congratulation you just passed the test!, dont stop now! Practice harder!");
            }
        }

        if(mScoreT6 > 0) {
            if (mScoreT6 > 14) {
                ChangingScore.setText("" + mScoreT6 + "20");
                ChangingScore.setTextColor(getResources().getColor(R.color.passedColor));
                Info.setText("Congratulation you passed the test!");
                //you passes
            }
            if (mScoreT6 < 14) {
                ChangingScore.setText("" + mScoreT6 + "/" + "20");
                ChangingScore.setTextColor(getResources().getColor(R.color.FailedColor));
                Info.setText("Sorry you failed the test. Practice harder!!");
                //you failed
            }
            if (mScoreT6 == 14) {
                // you just passed

                ChangingScore.setText("" + mScoreT6 + "/" + "20");
                ChangingScore.setTextColor(getResources().getColor(R.color.passedColor));
                Info.setText("Congratulation you just passed the test!, dont stop now! Practice harder!");
            }


        }


    }



    // show ad function
   public void displayInterstitial()
   {
       if(mInterstitialAd.isLoaded())
       {
           mInterstitialAd.show();
       }
   }
}
