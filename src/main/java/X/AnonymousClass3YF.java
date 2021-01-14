package X;

import android.content.Context;

/* renamed from: X.3YF  reason: invalid class name */
public abstract class AnonymousClass3YF extends AbstractC68463Dh {
    public final AbstractC61922tx A00;

    public AnonymousClass3YF(Context context, AnonymousClass02M r2, AnonymousClass04j r3, AnonymousClass0GP r4, AbstractC61922tx r5) {
        super(context, r2, r3, r4);
        this.A00 = r5;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r2) {
        A04(r2);
        AbstractC61922tx r0 = this.A00;
        if (r0 != null) {
            r0.AJZ(r2);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r2) {
        A04(r2);
        AbstractC61922tx r0 = this.A00;
        if (r0 != null) {
            r0.AJZ(r2);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r3) {
        C61072sS r1;
        AnonymousClass0M5 A0D = r3.A0D("account");
        if (A0D != null) {
            r1 = C61072sS.A00(A0D);
        } else {
            r1 = null;
        }
        A04(r1);
        AbstractC61922tx r0 = this.A00;
        if (r0 != null) {
            r0.AJZ(r1);
        }
    }

    public void A04(C61072sS r6) {
        if (this instanceof C74783bU) {
            C74783bU r4 = (C74783bU) this;
            if (r6 == null) {
                C61932ty r2 = r4.A00;
                r2.A08.A05("setFingerprintFromPin success");
                r2.A09.A04(r4.A02);
                return;
            }
            C61932ty r3 = r4.A00;
            C018809u r22 = r3.A08;
            StringBuilder sb = new StringBuilder("setFingerprintFromPin error: ");
            sb.append(r6);
            r22.A05(sb.toString());
            r3.A09.A03();
            int i = r6.code;
            if (i == 1441) {
                r3.A0A.A03(r6.nextAttemptTs);
            } else if (i == 1448) {
                r3.A07.A04(r4.A01.A00.A05, "PIN", r6);
            }
        } else if (this instanceof C74773bT) {
            C74773bT r42 = (C74773bT) this;
            if (r6 == null) {
                r42.A00.A08.A05("changePin success");
                return;
            }
            C61932ty r32 = r42.A00;
            C018809u r23 = r32.A08;
            StringBuilder sb2 = new StringBuilder("changePin error: ");
            sb2.append(r6);
            r23.A05(sb2.toString());
            int i2 = r6.code;
            if (i2 == 1441) {
                r32.A0A.A03(r6.nextAttemptTs);
            } else if (i2 == 1448) {
                r32.A07.A04(r42.A01.A00.A05, "PIN", r6);
            }
        } else if (this instanceof C74763bS) {
            C74763bS r43 = (C74763bS) this;
            if (r6 == null) {
                r43.A00.A08.A05("verifyPinToken success");
                return;
            }
            C61932ty r33 = r43.A00;
            C018809u r24 = r33.A08;
            StringBuilder sb3 = new StringBuilder("verifyPinToken error: ");
            sb3.append(r6);
            r24.A05(sb3.toString());
            int i3 = r6.code;
            if (i3 == 1441) {
                r33.A0A.A03(r6.nextAttemptTs);
            } else if (i3 == 1448) {
                r33.A07.A04(r43.A01.A00.A05, "PIN", r6);
            }
        } else if (!(this instanceof C74753bR)) {
            C74743bQ r34 = (C74743bQ) this;
            if (r6 == null) {
                C61932ty r25 = r34.A00;
                r25.A08.A05("deleteFingerprint success");
                r25.A09.A03();
                return;
            }
            C61932ty r26 = r34.A00;
            C018809u r44 = r26.A08;
            StringBuilder sb4 = new StringBuilder("deleteFingerprint error: ");
            sb4.append(r6);
            r44.A05(sb4.toString());
            int i4 = r6.code;
            if (i4 == 1441) {
                r26.A09.A04(r34.A02);
                r26.A0A.A03(r6.nextAttemptTs);
            } else if (i4 == 1440 || i4 == 445) {
                r26.A09.A04(r34.A02);
            } else if (i4 == 1448) {
                r26.A09.A04(r34.A02);
                r26.A07.A04(r34.A01.A00.A05, "PIN", r6);
            }
        } else {
            C74753bR r35 = (C74753bR) this;
            if (r6 == null) {
                C61942tz r27 = r35.A00.A0A;
                r27.A02();
                r27.A03(0);
            } else if (r6.code == 1448) {
                r35.A00.A07.A04(r35.A01.A00.A05, "PIN", r6);
            }
        }
    }
}
