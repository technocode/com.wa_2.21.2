package X;

import android.content.Context;

/* renamed from: X.16d  reason: invalid class name and case insensitive filesystem */
public final class C235116d {
    public static C235116d A01;
    public C234916a A00;

    public C235116d(Context context) {
        C234916a A002 = C234916a.A00(context);
        this.A00 = A002;
        A002.A02();
        this.A00.A03();
    }

    public static synchronized C235116d A00(Context context) {
        C235116d r0;
        synchronized (C235116d.class) {
            Context applicationContext = context.getApplicationContext();
            r0 = A01;
            if (r0 == null) {
                r0 = new C235116d(applicationContext);
                A01 = r0;
            }
        }
        return r0;
    }

    public final synchronized void A01() {
        C234916a r2 = this.A00;
        r2.A01.lock();
        try {
            r2.A00.edit().clear().apply();
        } finally {
            r2.A01.unlock();
        }
    }
}
