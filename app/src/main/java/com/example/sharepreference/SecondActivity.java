package com.example.sharepreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText ed1,ed2;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);
    ed1=(EditText) findViewById(R.id.e1);
        ed2=(EditText) findViewById(R.id.e2);
        sp=getSharedPreferences("SD", Context.MODE_PRIVATE);
        ed1.setText(sp.getString("un","").toString());
        ed2.setText(sp.getString("up","").toString());

    }

    public void onclose(View view) {
        SharedPreferences.Editor ed=sp.edit();
        ed.clear();
        ed.commit();
        finish();
    }
}