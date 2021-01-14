package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.0Z0  reason: invalid class name */
public class AnonymousClass0Z0 {
    public static volatile AnonymousClass0Z0 A03;
    public final Handler A00 = new AnonymousClass39Y(this, Looper.getMainLooper());
    public final AnonymousClass00G A01;
    public final AnonymousClass0C5 A02;

    public AnonymousClass0Z0(AnonymousClass00G r3, AnonymousClass0C5 r4) {
        this.A01 = r3;
        this.A02 = r4;
    }

    public static AnonymousClass0Z0 A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0Z0.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0Z0(AnonymousClass00G.A01, AnonymousClass0C5.A00());
                }
            }
        }
        return A03;
    }
}
