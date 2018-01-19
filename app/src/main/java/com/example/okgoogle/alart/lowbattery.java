package com.example.okgoogle.alart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by okGoogle on 18-01-2018.
 */

public class lowbattery extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
            if(intent.getAction().equals(Intent.ACTION_BATTERY_CHANGED)){
                Intent intent1 = new Intent(context,MainActivity.class);
                intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Toast.makeText(context,"battary is changering",Toast.LENGTH_SHORT).show();
                context.startActivity(intent1);

            }
    }
}
