package com.example.mosalah95.mystory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class chapters_content extends AppCompatActivity {

    TextView txt;
    InputStream is;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapters_content);

        txt=findViewById(R.id.chtxt);

        String txtcontent="";

        Intent intent =getIntent();
        String tag = intent.getStringExtra("tag_key");

           if (tag.equals("1")){
               txt.setText(getString(R.string.C1));
           } else if (tag.equals("2")){
               txt.setText(getString(R.string.C2));
           } else if (tag.equals("3")){
               txt.setText(getString(R.string.C3));
           } else if (tag.equals("4")){
               txt.setText(getString(R.string.C4));
           } else if (tag.equals("5")){
               txt.setText(getString(R.string.C5));
           } else if (tag.equals("6")){
               txt.setText(getString(R.string.C6));
           } else if (tag.equals("7")){
               txt.setText(getString(R.string.C7));
           } else if (tag.equals("8")){
               txt.setText(getString(R.string.C8));
           } else if (tag.equals("9")){
               txt.setText(getString(R.string.C9));
           } else if (tag.equals("10")){
               txt.setText(getString(R.string.C10));
           } else if (tag.equals("11")){
               txt.setText(getString(R.string.C11));
           } else if (tag.equals("12")){
               txt.setText(getString(R.string.C12));
           } else if (tag.equals("13")){
               txt.setText(getString(R.string.C13));
           } else if (tag.equals("14")){
               txt.setText(getString(R.string.C14));
           } else if (tag.equals("15")){
               txt.setText(getString(R.string.C15));
           } else if (tag.equals("16")){
               txt.setText(getString(R.string.C16));
           } else if (tag.equals("17")){
               txt.setText(getString(R.string.C17));
           } else if (tag.equals("18")){
               txt.setText(getString(R.string.C18));
           } else if (tag.equals("19")){
               txt.setText(getString(R.string.C19));
           } else if (tag.equals("20")){
               txt.setText(getString(R.string.C20));
           } else if (tag.equals("21")){
               txt.setText(getString(R.string.C21));
           } else if (tag.equals("22")){
               txt.setText(getString(R.string.C22));
           } else if (tag.equals("23")){
               txt.setText(getString(R.string.C23));
           } else if (tag.equals("24")){
               txt.setText(getString(R.string.C24));
           }
    }

}
