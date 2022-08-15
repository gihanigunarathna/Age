package com.gigi.myviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i=getIntent();
        String message=i.getStringExtra("key");

        //show the message in the textview
            // 1 Create the TextView program variable
                    TextView tvmsg;

            // 2 Bind program variable with the view in xml -Init

                    tvmsg=findViewById(R.id.tvMessage);

            // 3 set the text of the variable
                    tvmsg.setText(message);



    }
}