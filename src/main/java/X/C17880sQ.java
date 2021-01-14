package X;

import android.content.Context;

/* renamed from: X.0sQ  reason: invalid class name and case insensitive filesystem */
public class C17880sQ {
    public static C17880sQ A04;
    public C452724a A00;
    public C452824b A01;
    public AnonymousClass1d0 A02;
    public C452924c A03;

    public C17880sQ(Context context, AnonymousClass0t5 r4) {
        Context applicationContext = context.getApplicationContext();
        this.A00 = new C452724a(applicationContext, r4);
        this.A01 = new C452824b(applicationContext, r4);
        this.A02 = new AnonymousClass1d0(applicationContext, r4);
        this.A03 = new C452924c(applicationContext, r4);
    }

    public static synchronized C17880sQ A00(Context context, AnonymousClass0t5 r3) {
        C17880sQ r0;
        synchronized (C17880sQ.class) {
            r0 = A04;
            if (r0 == null) {
                r0 = new C17880sQ(context, r3);
                A04 = r0;
            }
        }
        return r0;
    }
}
