package X;

import android.content.SharedPreferences;

/* renamed from: X.3Ax  reason: invalid class name and case insensitive filesystem */
public class C67893Ax {
    public static volatile C67893Ax A03;
    public final AnonymousClass00Y A00;
    public final AnonymousClass022 A01;
    public final AnonymousClass0GU A02;

    public C67893Ax(AnonymousClass0GU r1, AnonymousClass00Y r2, AnonymousClass022 r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public static C67893Ax A00() {
        if (A03 == null) {
            synchronized (C67893Ax.class) {
                if (A03 == null) {
                    A03 = new C67893Ax(AnonymousClass0GU.A00(), AnonymousClass00Y.A00(), AnonymousClass022.A00());
                }
            }
        }
        return A03;
    }

    public void A01(String str) {
        SharedPreferences A012 = this.A01.A01("ntp-scheduler");
        synchronized (this) {
            A012.edit().putInt(str, A012.getInt(str, 0) + 1).apply();
        }
    }
}
