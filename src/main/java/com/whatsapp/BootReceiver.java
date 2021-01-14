package com.whatsapp;

import X.AnonymousClass00D;
import X.AnonymousClass0BA;
import X.AnonymousClass0FE;
import X.AnonymousClass0L1;
import X.C014708f;
import X.C04560Kv;
import X.C04570Kw;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.whatsapp.util.Log;

public class BootReceiver extends BroadcastReceiver {
    public AnonymousClass00D A00;
    public AnonymousClass0FE A01;
    public AnonymousClass0L1 A02;
    public AnonymousClass0BA A03;
    public C04570Kw A04;
    public C04560Kv A05;
    public C014708f A06;

    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            this.A01 = AnonymousClass0FE.A00();
            this.A00 = AnonymousClass00D.A00();
            this.A02 = AnonymousClass0L1.A00();
            this.A06 = C014708f.A00();
            this.A03 = AnonymousClass0BA.A00();
            this.A05 = C04560Kv.A00();
            this.A04 = C04570Kw.A00();
            Log.i("boot complete");
            this.A00.A0R(0);
            if (!this.A06.A02()) {
                Log.d("Killing the app since user is not registered (or has deleted the account).");
                Process.killProcess(Process.myPid());
                return;
            }
            this.A01.A04();
            this.A02.A05(true);
            AnonymousClass0BA r3 = this.A03;
            r3.A0A.ANF(new RunnableEBaseShape3S0100000_I0_3(r3, 33));
            C04560Kv r32 = this.A05;
            r32.A0A.ANF(new RunnableEBaseShape3S0100000_I0_3(r32, 37));
            C04570Kw r33 = this.A04;
            r33.A07.ANF(new RunnableEBaseShape3S0100000_I0_3(r33, 34));
        }
    }
}
