package X;

import android.os.SystemClock;

/* renamed from: X.2U4  reason: invalid class name */
public class AnonymousClass2U4 {
    public final byte A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass009 A03;
    public final C000300f A04;
    public final AnonymousClass0CW A05;
    public final AnonymousClass0CX A06;
    public final C02450Cb A07;
    public final AnonymousClass0CK A08;
    public final AnonymousClass1W5 A09;
    public final AnonymousClass2U1 A0A = new AnonymousClass2U1();
    public final AnonymousClass2U5 A0B = new AnonymousClass2U5();
    public final AnonymousClass09H A0C;
    public final AnonymousClass3ZL A0D;
    public final String A0E;
    public final boolean A0F;

    public AnonymousClass2U4(C002701k r4, AnonymousClass009 r5, AnonymousClass0CK r6, C000300f r7, AnonymousClass09H r8, C02450Cb r9, AnonymousClass0CW r10, AnonymousClass0CX r11, AnonymousClass1W5 r12, String str, AnonymousClass3ZL r14, byte b, int i, int i2) {
        this.A03 = r5;
        this.A08 = r6;
        this.A04 = r7;
        this.A0C = r8;
        this.A07 = r9;
        this.A05 = r10;
        this.A06 = r11;
        this.A09 = r12;
        this.A0E = str;
        this.A0D = r14;
        this.A00 = b;
        this.A01 = i;
        this.A02 = i2;
        r10.A06();
        boolean A0D2 = r7.A0D(AbstractC000400g.A1f);
        int A032 = r4.A03(136);
        if (A032 != -1) {
            A0D2 = true;
            if (A032 != 1) {
                A0D2 = false;
            }
        }
        this.A0F = A0D2;
    }

    public AnonymousClass2U3 A00() {
        AnonymousClass2U5 r4 = this.A0B;
        if (r4 != null) {
            SystemClock.elapsedRealtime();
            AnonymousClass2U3 r3 = (AnonymousClass2U3) this.A09.A00(new C57282k3(this));
            if (r3 == null || r3.A03 == null) {
                StringBuilder A0S = AnonymousClass008.A0S("resumecheck/failed; no routes; hash=");
                A0S.append(this.A0E);
                String obj = A0S.toString();
                r3 = new AnonymousClass2U3();
                r3.A03 = AnonymousClass1WF.FAILURE;
                r3.A05 = obj;
            }
            AnonymousClass1WF r0 = r3.A03;
            if (r0 == null) {
                throw null;
            } else if (r4 != null) {
                SystemClock.elapsedRealtime();
                int ordinal = r0.ordinal();
                int i = 1;
                if (ordinal != 0) {
                    i = 3;
                    if (ordinal != 1) {
                        i = 2;
                    }
                }
                r4.A01 = Integer.valueOf(i);
                AnonymousClass2U1 r02 = this.A0A;
                r4.A00 = new AnonymousClass2U2(r02.A00, r02.A02, r02.A03, r02.A01);
                return r3;
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }
}
