package X;

import android.text.TextUtils;

/* renamed from: X.3Ia  reason: invalid class name and case insensitive filesystem */
public class C69693Ia extends AnonymousClass0SD {
    public C02270Bi A00 = new C02270Bi();
    public C02270Bi A01 = new C02270Bi();
    public C08580bN A02 = new C08580bN();
    public String A03;
    public boolean A04;
    public final C000300f A05;
    public final AnonymousClass01X A06;
    public final C61352t2 A07;
    public final C63832x5 A08;

    public C69693Ia(C000300f r2, C63832x5 r3, AnonymousClass01X r4, C61352t2 r5) {
        this.A05 = r2;
        this.A08 = r3;
        this.A06 = r4;
        this.A07 = r5;
    }

    public static void A00(C69693Ia r14) {
        if (!r14.A05.A0D(AbstractC000400g.A20) || TextUtils.isEmpty(r14.A02().A06)) {
            r14.A01.A07(Boolean.FALSE);
            r14.A03();
            return;
        }
        C61352t2 r1 = r14.A07;
        AnonymousClass3EM r7 = new AnonymousClass3EM(r1.A02.A00, r1.A01, r1.A06, new C61082sT(), r1.A00, r1.A05);
        String str = r14.A02().A01;
        AnonymousClass3IV r8 = new AnonymousClass3IV(r14);
        ((C61432tA) r7).A01.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "upi-verify-qr-code", null, (byte) 0), new AnonymousClass0OS("signed-qr-code", str, null, (byte) 0)}, null, null), new C74693bL(r7.A00, r7.A01, r7.A02, r7.A03, ((C61432tA) r7).A00, r8), 0);
    }

    public C61992u4 A02() {
        Object A012 = this.A00.A01();
        if (A012 != null) {
            return (C61992u4) A012;
        }
        throw null;
    }

    public final void A03() {
        if (!this.A05.A0D(AbstractC000400g.A22) || !A02().A0A || TextUtils.isEmpty(A02().A05)) {
            A04();
        } else {
            this.A02.A07(new C63872x9(3));
        }
    }

    public final void A04() {
        C63872x9 r2 = new C63872x9(5);
        r2.A03 = !TextUtils.isEmpty(A02().A03);
        r2.A04 = "PAY_INTENT".equals(this.A03);
        this.A02.A07(r2);
    }

    public void A05(int i) {
        if (i == 1) {
            A03();
        } else if (i == 2) {
            A04();
        } else if (i != 3) {
            if (i == 4) {
                this.A04 = true;
                this.A02.A07(new C63872x9(6));
            }
        } else if (!this.A04) {
            this.A02.A07(new C63872x9(0));
        } else {
            this.A04 = false;
        }
    }
}
