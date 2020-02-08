package com.example.mosalah95.mystory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onbtnclick(View view){
        Intent intent=new Intent(this,chapters_content.class);
        String tag = view.getTag().toString();
        intent.putExtra("tag_key",tag);
        startActivity(intent);
    }

}
