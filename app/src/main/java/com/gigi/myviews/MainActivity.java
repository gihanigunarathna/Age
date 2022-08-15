package com.gigi.myviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message=findViewById(R.id.etMessage);


    }

    //writing a separate method
    public void sendMessage(View view)
    {
        String msg=message.getText().toString();
        String b="";
        //Intent- Intention
        Intent i=new Intent(this,SecondActivity.class);
        i.putExtra("key",msg);
        startActivity(i);


    }





}
