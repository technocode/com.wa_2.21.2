package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.0ZQ  reason: invalid class name */
public class AnonymousClass0ZQ {
    public static volatile AnonymousClass0ZQ A05;
    public final AnonymousClass01I A00;
    public final AnonymousClass01A A01;
    public final C014308b A02;
    public final AnonymousClass01X A03;
    public final C002401h A04;

    public AnonymousClass0ZQ(AnonymousClass01I r1, C002401h r2, AnonymousClass01A r3, C014308b r4, AnonymousClass01X r5) {
        this.A00 = r1;
        this.A04 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public final String A00(C12140hc r8) {
        String A0E;
        C002401h r5 = this.A04;
        AnonymousClass02N r4 = r8.A0n.A00;
        Object[] objArr = new Object[1];
        AnonymousClass01A r0 = this.A01;
        if (r4 != null) {
            String A08 = this.A02.A08(r0.A0A(r4), false);
            if (A08 == null) {
                A0E = null;
            } else {
                A0E = this.A03.A0E(A08);
            }
            objArr[0] = A0E;
            return r5.A03(r4, R.string.identity_changed_name_md, objArr);
        }
        throw null;
    }
}
