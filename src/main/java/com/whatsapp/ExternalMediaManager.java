package com.whatsapp;

import X.AnonymousClass00C;
import X.AnonymousClass0HQ;
import X.AnonymousClass0PE;
import X.AnonymousClass0PF;
import X.C002101e;
import X.C04200Jl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ExternalMediaManager extends AnonymousClass0PE {
    public final AnonymousClass0HQ A00 = AnonymousClass0HQ.A00();
    public final AnonymousClass00C A01 = AnonymousClass00C.A00();
    public final C04200Jl A02 = C04200Jl.A00();

    public class ExternalMediaStateReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if ("android.intent.action.MEDIA_BAD_REMOVAL".equals(intent.getAction()) || "android.intent.action.MEDIA_EJECT".equals(intent.getAction()) || "android.intent.action.MEDIA_MOUNTED".equals(intent.getAction()) || "android.intent.action.MEDIA_REMOVED".equals(intent.getAction()) || "android.intent.action.MEDIA_SHARED".equals(intent.getAction()) || "android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                AnonymousClass0PF.A01(context, ExternalMediaManager.class, 5, intent.setClass(context, ExternalMediaManager.class));
            }
        }
    }

    public ExternalMediaManager() {
        C002101e.A00();
    }
}
