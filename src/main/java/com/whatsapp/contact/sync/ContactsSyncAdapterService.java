package com.whatsapp.contact.sync;

import X.AnonymousClass009;
import X.AnonymousClass0E4;
import X.AnonymousClass0I7;
import X.C47132Gp;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;

public class ContactsSyncAdapterService extends AnonymousClass0E4 {
    public static AbstractThreadedSyncAdapter A00;
    public static final AnonymousClass009 A01 = AnonymousClass009.A00();
    public static final AnonymousClass0I7 A02 = AnonymousClass0I7.A00();
    public static final Object A03 = new Object();

    public IBinder onBind(Intent intent) {
        return A00.getSyncAdapterBinder();
    }

    public void onCreate() {
        super.onCreate();
        synchronized (A03) {
            if (A00 == null) {
                A00 = new C47132Gp(getApplicationContext());
            }
        }
    }
}
