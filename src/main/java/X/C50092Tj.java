package X;

import java.security.SecureRandom;

/* renamed from: X.2Tj  reason: invalid class name and case insensitive filesystem */
public class C50092Tj {
    public final AnonymousClass00S A00;
    public final AnonymousClass0BV A01;
    public final C02480Ce A02;

    public C50092Tj(AnonymousClass00S r1, C02480Ce r2, AnonymousClass0BV r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public final boolean A00(AnonymousClass1WC r7, C49882So r8) {
        if (!r7.A02.A0A) {
            return false;
        }
        int A002 = r7.A00();
        if (A002 == 3 || A002 == 1) {
            return true;
        }
        boolean z = false;
        if (this.A00.A05() - r8.A00 < ((long) new SecureRandom().nextInt(86400000)) + 172800000) {
            z = true;
        }
        return z;
    }
}
