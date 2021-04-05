package com.noelistic.g1app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import br.com.simplepass.loadingbutton.customViews.CircularProgressButton;
public class MainActivity extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    static int  checker = 0 ;




    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
       // getSupportActionBar().hide(); // to hide the top bar only for this activity



        final CircularProgressButton test1 = findViewById(R.id.g1re);

        final CircularProgressButton test2 = findViewById(R.id.g1rm);

        final CircularProgressButton test3 = findViewById(R.id. g1rh);

        final CircularProgressButton test4 = findViewById(R.id. g1se);

        final CircularProgressButton test5 = findViewById(R.id. g1sm);

        final CircularProgressButton test6 = findViewById(R.id. g1sh);

        final CircularProgressButton download1 = findViewById(R.id.button);

        final CircularProgressButton download2 = findViewById(R.id.button1);

        final CircularProgressButton download3 = findViewById(R.id.button2);



        MobileAds.initialize(this,"ca-app-pub-7447623152498928~1529239675");
        mInterstitialAd = new InterstitialAd(this);



        mInterstitialAd.setAdUnitId("ca-app-pub-7447623152498928/3828099953");
         AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);





        mInterstitialAd.setAdListener(new AdListener(){


    @Override
    public void onAdClosed() {
       mInterstitialAd.loadAd(new AdRequest.Builder().build());
    }
});


        download1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                download1.startAnimation();
                Handler h =new Handler() ;
                h.postDelayed(new Runnable() {
                    public void run() {
                        displaybook1();

                        download1.revertAnimation();
                        download1.setBackgroundResource(R.drawable.downloadbutton);
                    }

                }, 2000);
            }




        });

        download2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                download2.startAnimation();
                Handler h =new Handler() ;
                h.postDelayed(new Runnable() {
                    public void run() {
                        displaybook2();
                        download2.revertAnimation();
                        download2.setBackgroundResource(R.drawable.downloadbutton);
                    }

                }, 2000);
            }

        });


        download3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                download3.startAnimation();

                Handler h =new Handler() ;
                h.postDelayed(new Runnable() {
                    public void run() {
                        displayweb1();
                        download3.revertAnimation();
                        download3.setBackgroundResource(R.drawable.downloadbutton);
                    }

                }, 2000);
            }

        });

        test1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                test1.startAnimation();


                Handler h =new Handler() ;

                h.postDelayed(new Runnable() {
                    public void run() {

                        startQuiz();


                        // this stops the crashes
                        test1.revertAnimation();
                        test1.setBackgroundResource(R.drawable.mainbuttons);
                    }

                }, 1000);
            }


            });


        test2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                test2.startAnimation();

                Handler h =new Handler() ;

                h.postDelayed(new Runnable() {
                    public void run() {

                        startQuiz2();


                        // this stops the crashes
                        test2.revertAnimation();
                        test2.setBackgroundResource(R.drawable.mainbuttons);
                    }

                }, 1000);


            }
        });

        test3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                test3.startAnimation();



                Handler h =new Handler() ;

                h.postDelayed(new Runnable() {
                    public void run() {


                       // Toast.makeText(getApplicationContext(),"Not Available Yet",Toast.LENGTH_SHORT).show();
                        startQuiz3();;
                        // this stops the crashes
                        test3.revertAnimation();
                        test3.setBackgroundResource(R.drawable.mainbuttons);
                    }

                }, 1000);

                //startQuiz3();

            }
        });



        test4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                test4.startAnimation();

                Handler h =new Handler() ;

                h.postDelayed(new Runnable() {
                    public void run() {

                        startQuiz4();


                        // this stops the crashes
                        test4.revertAnimation();
                        test4.setBackgroundResource(R.drawable.mainbuttons);
                    }

                }, 1000);


            }
        });

        test5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                test5.startAnimation();


                Handler h =new Handler() ;

                h.postDelayed(new Runnable() {
                    public void run() {

                        startQuiz5();


                        // this stops the crashes
                        test5.revertAnimation();
                        test5.setBackgroundResource(R.drawable.mainbuttons);
                    }

                }, 1000);


            }
        });


        test6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                test6.startAnimation();

                Handler h =new Handler() ;

                h.postDelayed(new Runnable() {
                    public void run() {

                        //Toast.makeText(getApplicationContext(),"Not Available Yet",Toast.LENGTH_SHORT).show();
                        startQuiz6();


                        // this stops the crashes
                        test6.revertAnimation();
                        test6.setBackgroundResource(R.drawable.mainbuttons);
                    }

                }, 1000);


            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        
        inflater.inflate(R.menu.menu_share,menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {

//            case R.id.subitem1:
//                //Toast.makeText(this,"Item 1 selected",Toast.LENGTH_SHORT).show();
//                Intent sendIntent = new Intent();
//                sendIntent.setAction(Intent.ACTION_SEND);
//                sendIntent.putExtra(Intent.EXTRA_TEXT, "Download G1 Practice Test 2020 - Practice and learn at the same time."+" https://play.google.com/store/apps/details?id=com.noelistic.g1app");
//
//                sendIntent.setType("text/plain");
//                startActivity(sendIntent);
//
//                return true;

            case R.id.subitem2:
           // Toast.makeText(this,"Item 2 selected",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.format("%s?id=%s", "market://details", "com.noelistic.g1app")));


                //  intent.addFlags(flags);
                startActivity(intent);
            return true;

            case R.id.subitem3:
                Toast.makeText(this,"Not Available Yet",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sub1:
                try{
                    Intent sendIntent3 = new Intent();
                    sendIntent3.setAction(Intent.ACTION_SEND);
                    sendIntent3.putExtra(Intent.EXTRA_TEXT, "Download G1 Practice Test 2020 - Practice and learn at the same time." +" https://play.google.com/store/apps/details?id=com.noelistic.g1app");

                    sendIntent3.setPackage("com.whatsapp");
                    sendIntent3.setType("text/plain");
                    startActivity(sendIntent3);
                }catch (ActivityNotFoundException e) {


                    Toast.makeText(MainActivity.this, "Something went wrong, Check Whatsapp app is downloaded",
                            Toast.LENGTH_LONG).show();




                }
                return true;
            case R.id.sub2:

                try {
                    Intent sendIntent4 = new Intent();
                    sendIntent4.setAction(Intent.ACTION_SEND);
                    sendIntent4.putExtra(Intent.EXTRA_TEXT, "Download G1 Practice Test 2020 - Practice and learn at the same time." + " https://play.google.com/store/apps/details?id=com.noelistic.g1app");
                    sendIntent4.setType("text/plain");
                    sendIntent4.setPackage("com.facebook.orca");
                    startActivity(sendIntent4);
                }catch (ActivityNotFoundException e) {


                    Toast.makeText(MainActivity.this, "Something went wrong, Check if Messenger app is downloaded",
                            Toast.LENGTH_LONG).show();

                }
                return true;
            case R.id.sub3:

                try {

                    Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.setAction(Intent.ACTION_SEND);
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Download G1 Practice Test 2020 - Practice and learn at the same time." +" https://play.google.com/store/apps/details?id=com.noelistic.g1app");

                    shareIntent.setPackage("com.instagram.android");
                    startActivity(shareIntent);
                }catch (ActivityNotFoundException e) {


                    Toast.makeText(MainActivity.this, "Something went wrong, Check if Instagram app is downloaded",
                            Toast.LENGTH_LONG).show();




                }
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void startQuiz()
    {
        Intent intent = new Intent(MainActivity.this,Test1.class);

        startActivity(intent);
    }

    private void startQuiz2()
    {
        Intent intent = new Intent(MainActivity.this,Test2.class);

        startActivity(intent);
    }
    @Override
    public void onBackPressed() {

    }
    private void startQuiz3()
    {
        Intent intent = new Intent(MainActivity.this,Test3.class);

        startActivity(intent);
    }

    private void startQuiz4()
    {
        Intent intent = new Intent(MainActivity.this,Test4.class);

        startActivity(intent);
    }

    private void startQuiz5()
    {
        Intent intent = new Intent(MainActivity.this,Test5.class);

        startActivity(intent);
    }

    private void startQuiz6()
    {
        Intent intent = new Intent(MainActivity.this,Test6.class);

        startActivity(intent);
    }

public  void displaybook1()
    {
        if(mInterstitialAd.isLoaded())
        {
            mInterstitialAd.show();



            Thread myThread = new Thread(){

                @Override
                public void run()
                {
                    try {
                        sleep(3500);



                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://marcuseducate.com/wp-content/uploads/2018/01/DHSG.pdf"));
                        startActivity(intent);




                        finish();
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }


            };
            myThread.start();
        }

        else
        {
            Toast.makeText(this,"Make Sure Internet is Turned ON", Toast.LENGTH_SHORT).show();
        }
    }

    public  void displaybook2()
    {
        if(mInterstitialAd.isLoaded())
        {
            mInterstitialAd.show();



            Thread myThread = new Thread(){

                @Override
                public void run()
                {
                    try {
                        sleep(3500);



                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("http://www.singulink.com/CodeIndex/file.axd?file=/Documents/Ontario%20Handbook%20-%20Regular.pdf"));
                        startActivity(intent);




                        finish();
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }


            };
            myThread.start();
        }

        else
        {
            Toast.makeText(this,"Make Sure Internet is Turned ON", Toast.LENGTH_SHORT).show();
        }
    }



    public  void displayweb1()
    {
        if(mInterstitialAd.isLoaded())
        {
            mInterstitialAd.show();



            Thread myThread = new Thread(){

                @Override
                public void run()
                {
                    try {
                        sleep(3500);



                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.proprofs.com/flashcards/story.php?title=ontario-road-signs_2"));
                        startActivity(intent);




                        finish();
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }


            };
            myThread.start();
        }

        else
        {
            Toast.makeText(this,"Make Sure Internet is Turned ON", Toast.LENGTH_SHORT).show();
        }
    }
}