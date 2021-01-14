package com.whatsapp.accountsync;

import X.AnonymousClass0E4;
import X.AnonymousClass1P9;
import android.content.Intent;
import android.os.IBinder;

public class AccountAuthenticatorService extends AnonymousClass0E4 {
    public static AnonymousClass1P9 A00;

    public IBinder onBind(Intent intent) {
        if (!"android.accounts.AccountAuthenticator".equals(intent.getAction())) {
            return null;
        }
        AnonymousClass1P9 r0 = A00;
        if (r0 == null) {
            r0 = new AnonymousClass1P9(this);
            A00 = r0;
        }
        return r0.getIBinder();
    }
}
