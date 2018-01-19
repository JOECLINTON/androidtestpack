package com.example.okgoogle.alart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by okGoogle on 18-01-2018.
 */

public class mybroadcastreciver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"the massage is recived",Toast.LENGTH_LONG).show();
    }
}
