package com.example.ademar.videoplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        videoView  = findViewById(R.id.vv_videoFull);
       //deixar fullScreen

        View fullvideo = getWindow().getDecorView();
        int uiopcao = View.SYSTEM_UI_FLAG_FULLSCREEN;
        fullvideo.setSystemUiVisibility(uiopcao);

        //manipula Actionbar
        getSupportActionBar().hide();

        videoView.setMediaController(new MediaController(this));
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+ R.raw.video1);
        //videoView.setVideoURI(Uri.parse("https://www.youtube.com/watch?v=2x-Zu915CKk"));
        videoView.start();
    }
}
