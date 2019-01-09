package com.example.ademar.videoplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView iv_executarVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_executarVideo = findViewById(R.id.iv_executarvideo);
        iv_executarVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chamar = new Intent(getApplicationContext(),VideoActivity.class);
                startActivity(chamar);
            }
        });
    }
}
