package X;

import java.util.Set;

/* renamed from: X.2Kq  reason: invalid class name and case insensitive filesystem */
public class C48032Kq {
    public static volatile C48032Kq A04;
    public final C12440i6 A00;
    public final AnonymousClass01I A01;
    public final C000300f A02;
    public final AnonymousClass01X A03;

    public C48032Kq(AnonymousClass01I r1, C000300f r2, AnonymousClass01X r3, C12440i6 r4) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = r4;
    }

    public static C48032Kq A00() {
        if (A04 == null) {
            synchronized (C48032Kq.class) {
                if (A04 == null) {
                    A04 = new C48032Kq(AnonymousClass01I.A00(), C000300f.A00(), AnonymousClass01X.A00(), C12440i6.A00());
                }
            }
        }
        return A04;
    }

    public Set A01(AbstractC007503q r4, String str, AnonymousClass02N r6) {
        if (str != null && !r4.A0n.A02 && this.A02.A0D(AbstractC000400g.A2V)) {
            return A02(str, r6);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00aa, code lost:
        if (X.C47852Ju.A03.contains(java.lang.Integer.valueOf(r11)) == false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A02(java.lang.String r14, X.AnonymousClass02N r15) {
        /*
        // Method dump skipped, instructions count: 377
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48032Kq.A02(java.lang.String, X.02N):java.util.Set");
    }
}
