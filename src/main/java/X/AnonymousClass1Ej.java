package X;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.1Ej  reason: invalid class name */
public final class AnonymousClass1Ej {
    public static AnonymousClass1Ej A05;
    public Boolean A00 = null;
    public Boolean A01 = null;
    public final AnonymousClass05W A02 = new AnonymousClass05W();
    public final Queue A03 = new ArrayDeque();
    public final Queue A04 = new ArrayDeque();

    public static synchronized AnonymousClass1Ej A00() {
        AnonymousClass1Ej r0;
        synchronized (AnonymousClass1Ej.class) {
            r0 = A05;
            if (r0 == null) {
                r0 = new AnonymousClass1Ej();
                A05 = r0;
            }
        }
        return r0;
    }

    public final boolean A01(Context context) {
        Boolean bool = this.A00;
        if (bool == null) {
            boolean z = false;
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            this.A00 = bool;
        }
        if (!bool.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.A00.booleanValue();
    }
}
