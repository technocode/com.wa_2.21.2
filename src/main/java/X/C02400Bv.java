package X;

import android.util.Base64;

/* renamed from: X.0Bv  reason: invalid class name and case insensitive filesystem */
public class C02400Bv {
    public static volatile C02400Bv A06;
    public AnonymousClass0JK A00;
    public final C000300f A01;
    public final C02420Bx A02;
    public final C02410Bw A03;
    public final C002701k A04;
    public final AnonymousClass022 A05;

    public C02400Bv(C002701k r1, C000300f r2, C02410Bw r3, AnonymousClass022 r4, C02420Bx r5) {
        this.A04 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A02 = r5;
    }

    public static C02400Bv A00() {
        if (A06 == null) {
            synchronized (C02400Bv.class) {
                if (A06 == null) {
                    A06 = new C02400Bv(C002701k.A00(), C000300f.A00(), C02410Bw.A00(), AnonymousClass022.A00(), C02420Bx.A00());
                }
            }
        }
        return A06;
    }

    public synchronized AnonymousClass0JK A01() {
        AnonymousClass0JK r1;
        r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass0JK(this.A05);
            this.A00 = r1;
        }
        return r1;
    }

    public void A02(String str, boolean z) {
        AnonymousClass0JK A012 = A01();
        if (A012 != null) {
            byte[] decode = Base64.decode(str, 0);
            A012.A07 = decode;
            if (decode.length == 64) {
                byte[] bArr = new byte[32];
                A012.A05 = bArr;
                A012.A06 = new byte[32];
                System.arraycopy(decode, 0, bArr, 0, 32);
                System.arraycopy(A012.A07, 32, A012.A06, 0, 32);
            }
            if (z) {
                A012.A02("key", str);
                return;
            }
            return;
        }
        throw null;
    }

    public boolean A03() {
        return A01().A03 != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0269, code lost:
        if (r4 == false) goto L_0x026b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A04(X.AnonymousClass0K4 r9) {
        /*
        // Method dump skipped, instructions count: 651
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02400Bv.A04(X.0K4):byte[]");
    }
}
