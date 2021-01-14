package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;

/* renamed from: X.07f  reason: invalid class name and case insensitive filesystem */
public final class C012507f {
    public static int A06;
    public static PendingIntent A07;
    public Messenger A00;
    public Messenger A01;
    public AnonymousClass1Et A02;
    public final Context A03;
    public final AnonymousClass05W A04 = new AnonymousClass05W();
    public final C012007a A05;

    public C012507f(Context context, C012007a r4) {
        this.A03 = context;
        this.A05 = r4;
        this.A00 = new Messenger(new HandlerC012607g(this, Looper.getMainLooper()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fa A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle A00(android.os.Bundle r13) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C012507f.A00(android.os.Bundle):android.os.Bundle");
    }

    public final void A01(String str, Bundle bundle) {
        String str2;
        AnonymousClass05W r4 = this.A04;
        synchronized (r4) {
            C24611Bq r0 = (C24611Bq) r4.remove(str);
            if (r0 == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("FirebaseInstanceId", str2);
                return;
            }
            r0.A00.A08(bundle);
        }
    }
}
