package com.example.androidbroadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MYCustomBroadcastReciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("reciever","recieved");
        Toast.makeText(context.getApplicationContext(), "this is my custom broadcast reciever", Toast.LENGTH_LONG);
    }
}
