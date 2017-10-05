package com.example.user.resepmakanantugas1;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailResepActivity extends AppCompatActivity {
    TextView ztv_detail;
    ImageView zimg_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);

        zimg_detail = (ImageView) findViewById(R.id.img_detail);
        ztv_detail = (TextView) findViewById(R.id.tv_detail);

        Intent i = getIntent();

        String titleBar = i.getStringExtra("titleBar");
        getSupportActionBar().setTitle(titleBar);

        int gambarResep = i.getIntExtra("gambarResep",0);
        zimg_detail.setImageResource(gambarResep);

        String detailResep = i.getStringExtra("detailResep");
        ztv_detail.setText(detailResep);

    }


}
