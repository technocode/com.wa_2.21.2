package com.whatsapp.location;

import X.AnonymousClass01S;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class FinalLiveLocationBroadcastReceiver extends BroadcastReceiver {
    public AnonymousClass01S A00;

    public void onReceive(Context context, Intent intent) {
        this.A00 = AnonymousClass01S.A00();
        Log.i("FinalLiveLocationBroadcastReceiver/onReceive");
        this.A00.A0G();
    }
}
