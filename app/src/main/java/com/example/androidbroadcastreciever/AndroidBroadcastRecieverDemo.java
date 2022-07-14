package com.example.androidbroadcastreciever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AndroidBroadcastRecieverDemo extends AppCompatActivity {

    Button buttonBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_broadcast_reciever);

        buttonBroadcast = (Button)findViewById(R.id.button1);
        buttonBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customBroadcast(getApplicationContext(),view);
            }
        });
    }

    public void customBroadcast(Context applicationContext, View view)
    {
     /*   Intent myIntent = new Intent();
        myIntent.setAction("learn.vern.androidBroadcastrecievers.CUSTOM_INTENT");
        sendBroadcast(myIntent);*/

        sendBroadcast(new Intent(this,MYCustomBroadcastReciver.class).setAction("CUSTOM_INTENT"));
        Log.d("sent","sent");
    }
}