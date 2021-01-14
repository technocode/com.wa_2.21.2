package X;

import android.os.Build;
import android.os.Trace;

/* renamed from: X.1gp  reason: invalid class name and case insensitive filesystem */
public final class C33471gp {
    public C33471gp() {
    }

    public C33471gp(AnonymousClass111 r1) {
    }

    public static void A00(String str, Class cls) {
        if (C222610s.A00 && Build.VERSION.SDK_INT >= 18) {
            if (cls != null) {
                StringBuilder A0S = AnonymousClass008.A0S(str);
                A0S.append(cls.getSimpleName());
                str = A0S.toString();
            }
            Trace.beginSection(str);
        }
    }
}
