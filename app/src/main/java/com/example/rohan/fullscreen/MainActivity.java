package com.example.rohan.fullscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.color.holo_red_dark;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void validate(View v)
    {
        EditText e=(EditText) findViewById(R.id.uname);
        EditText e2=(EditText) findViewById(R.id.passwd);
        String un=e.getText().toString();
        String pwd=e2.getText().toString();
        if(un.equals("part") && pwd.equals("tarp"))
        {
            Intent i=new Intent(this,FullscreenActivity.class);
            startActivity(i);
        }
        else
        {
            TextView t=(TextView) findViewById(R.id.textView);
            t.setText("Invalid Username Or Password");
        }
    }
}
