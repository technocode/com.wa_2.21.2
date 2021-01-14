package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0v2  reason: invalid class name */
public final class AnonymousClass0v2 extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            C19470v5.A01();
        }
    }
}
