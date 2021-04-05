package com.noelistic.g1app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class flashscreen extends AppCompatActivity {

    VideoView vid;
    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashscreen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().hide();

        vid = (VideoView)findViewById(R.id.videoView);

       // playVideo();

        try {

            playVideo();
            vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mp) {
                    jump();
                }
            });
            vid.start();
        } catch (Exception ex) {
            jump();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        jump();
        return true;
    }


    private void jump() {
        if (isFinishing())
            return;
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    public void playVideo() {
        MediaController m = new MediaController(this);
        vid.setMediaController(m);

        String path = "android.resource://" + getPackageName() + "/" + R.raw.flash;

        Uri u = Uri.parse(path);

        vid.setVideoURI(u);

        vid.start();

    }
}



//        Uri video = Uri.parse("android.resource://com.noelistic.g1app/raw/flash");
//        videoView.setVideoURI(video);

    //


    // hide(); // to hide the top bar only for this activity
//        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//            public void onCompletion(MediaPlayer mp) {
//                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//                startActivity(intent);
//            }
//        });


//        videoView.start();
//        Thread myThread = new Thread(){
//
//            @Override
//            public void run()
//            {
//                try {
//                    sleep(1500);
//                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
//                    startActivity(intent);
//                    finish();
//                }
//                catch(InterruptedException e)
//                {
//                    e.printStackTrace();
//                }
//            }
//
//
//        };
//        myThread.start();
    // }

//@Override
//    public boolean onTouchEvent(MotionEvent event) {
//        jump();
//        return true;
//    }
//
//
//    private void jump() {
//        if (isFinishing())
//            return;
//        startActivity(new Intent(this, MainActivity.class));
//        finish();
//    }



