package com.whatsapp.phoneid;

import X.AnonymousClass105;
import X.C03210Ff;
import android.content.Context;
import android.content.Intent;

public class PhoneIdRequestReceiver extends AnonymousClass105 {
    public C03210Ff A00;

    @Override // X.AnonymousClass105
    public void onReceive(Context context, Intent intent) {
        this.A00 = C03210Ff.A00();
        super.onReceive(context, intent);
    }
}
