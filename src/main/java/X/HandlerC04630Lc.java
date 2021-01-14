package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: X.0Lc  reason: invalid class name and case insensitive filesystem */
public final class HandlerC04630Lc extends HandlerC04640Ld {
    public final Context A00;
    public final /* synthetic */ AnonymousClass0LP A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC04630Lc(AnonymousClass0LP r2, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.A01 = r2;
        this.A00 = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        AnonymousClass0LP r6 = this.A01;
        Context context = this.A00;
        int A002 = r6.A00(context, 12451000);
        PendingIntent pendingIntent = null;
        if (r6 != null) {
            boolean z = true;
            if (!(A002 == 1 || A002 == 2 || A002 == 3 || A002 == 9)) {
                z = false;
            }
            if (z) {
                Intent A012 = r6.A01(context, A002, "n");
                if (A012 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, A012, 134217728);
                }
                r6.A05(context, A002, pendingIntent);
                return;
            }
            return;
        }
        throw null;
    }
}
