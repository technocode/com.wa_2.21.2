package X;

import android.util.Base64;

/* renamed from: X.0Fm  reason: invalid class name and case insensitive filesystem */
public class C03260Fm {
    public static volatile C03260Fm A01;
    public final AnonymousClass00D A00;

    public C03260Fm(AnonymousClass00D r1) {
        this.A00 = r1;
    }

    public static C03260Fm A00() {
        if (A01 == null) {
            synchronized (C03260Fm.class) {
                if (A01 == null) {
                    A01 = new C03260Fm(AnonymousClass00D.A00());
                }
            }
        }
        return A01;
    }

    public void A01(byte[] bArr) {
        if (bArr.length <= 256) {
            AnonymousClass00D r2 = this.A00;
            if (r2 != null) {
                AnonymousClass008.A0m(r2, "routing_info", Base64.encodeToString(bArr, 3));
                return;
            }
            throw null;
        }
        throw new IllegalArgumentException("The routing info should be smaller than 256 bytes.");
    }
}
