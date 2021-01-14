package X;

import android.content.Context;

/* renamed from: X.0Lg  reason: invalid class name and case insensitive filesystem */
public class C04660Lg {
    public static C04660Lg A01 = new C04660Lg();
    public C04670Lh A00 = null;

    public static C04670Lh A00(Context context) {
        C04670Lh r0;
        C04660Lg r1 = A01;
        synchronized (r1) {
            r0 = r1.A00;
            if (r0 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                r0 = new C04670Lh(context);
                r1.A00 = r0;
            }
        }
        return r0;
    }
}
