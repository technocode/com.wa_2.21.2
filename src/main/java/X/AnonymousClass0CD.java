package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: X.0CD  reason: invalid class name */
public class AnonymousClass0CD {
    public static volatile AnonymousClass0CD A04;
    public final Handler A00 = new AnonymousClass0CE(this, Looper.getMainLooper());
    public final AnonymousClass09K A01;
    public final AnonymousClass09H A02;
    public final HashMap A03 = new HashMap();

    public AnonymousClass0CD(AnonymousClass09H r3, AnonymousClass09K r4) {
        this.A02 = r3;
        this.A01 = r4;
    }

    public static AnonymousClass0CD A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0CD.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0CD(AnonymousClass09H.A01(), AnonymousClass09K.A07);
                }
            }
        }
        return A04;
    }

    public final AnonymousClass02N A01(AnonymousClass02N r3) {
        HashMap hashMap = this.A03;
        AnonymousClass02N r0 = (AnonymousClass02N) hashMap.get(r3);
        if (r0 != null) {
            return r0;
        }
        hashMap.put(r3, r3);
        return r3;
    }
}
