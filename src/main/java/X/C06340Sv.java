package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Sv  reason: invalid class name and case insensitive filesystem */
public final class C06340Sv {
    public static C06340Sv A01;
    public static final PorterDuff.Mode A02 = PorterDuff.Mode.SRC_IN;
    public AnonymousClass0TZ A00;

    public static synchronized PorterDuffColorFilter A00(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter A002;
        synchronized (C06340Sv.class) {
            A002 = AnonymousClass0TZ.A00(i, mode);
        }
        return A002;
    }

    public static synchronized C06340Sv A01() {
        C06340Sv r0;
        synchronized (C06340Sv.class) {
            if (A01 == null) {
                A02();
            }
            r0 = A01;
        }
        return r0;
    }

    public static synchronized void A02() {
        synchronized (C06340Sv.class) {
            if (A01 == null) {
                C06340Sv r1 = new C06340Sv();
                A01 = r1;
                r1.A00 = AnonymousClass0TZ.A01();
                AnonymousClass0TZ r12 = A01.A00;
                C06430Tf r0 = new C06430Tf();
                synchronized (r12) {
                    r12.A01 = r0;
                }
            }
        }
    }

    public synchronized ColorStateList A03(Context context, int i) {
        return this.A00.A03(context, i);
    }

    public synchronized Drawable A04(Context context, int i) {
        return this.A00.A05(context, i);
    }
}
