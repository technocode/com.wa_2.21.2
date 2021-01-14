package X;

import android.text.TextUtils;

/* renamed from: X.0ZN  reason: invalid class name */
public class AnonymousClass0ZN extends AbstractC007503q implements AbstractC02870Du, AbstractC02880Dv {
    public AnonymousClass1XT A00;

    public AnonymousClass0ZN(C007303n r2, long j) {
        super(r2, j, (byte) 45);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r6 != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0ZN(X.C007303n r15, long r16, X.C76243eE r18) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZN.<init>(X.03n, long, X.3eE):void");
    }

    public AnonymousClass0ZN(AnonymousClass0ZN r8, C007303n r9, long j) {
        super(r8, r9, j, true);
        this.A00 = r8.A00;
    }

    public String A0u() {
        AnonymousClass1XT r0 = this.A00;
        if (r0 == null) {
            return null;
        }
        return r0.A02;
    }

    public String A0v() {
        AnonymousClass1XT r0 = this.A00;
        if (r0 == null) {
            return null;
        }
        return r0.A03;
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r11) {
        C04970Mo r4 = r11.A01;
        C76243eE r0 = ((C02840Dr) r4.A00).A0K;
        if (r0 == null) {
            r0 = C76243eE.A06;
        }
        AbstractC04160Jh A0B = r0.AQb();
        AnonymousClass1XT r02 = this.A00;
        if (r02 != null) {
            if (r02.A00 == 1) {
                AnonymousClass3JU r2 = AnonymousClass3JU.SINGLE_SELECT;
                A0B.A02();
                C76243eE r1 = (C76243eE) A0B.A00;
                if (r2 != null) {
                    r1.A00 |= 8;
                    r1.A01 = r2.value;
                } else {
                    throw null;
                }
            } else {
                AnonymousClass3JU r22 = AnonymousClass3JU.UNKNOWN;
                A0B.A02();
                C76243eE r12 = (C76243eE) A0B.A00;
                if (r22 != null) {
                    r12.A00 |= 8;
                    r12.A01 = r22.value;
                } else {
                    throw null;
                }
            }
            if (!TextUtils.isEmpty(this.A00.A03)) {
                String str = this.A00.A03;
                A0B.A02();
                C76243eE r13 = (C76243eE) A0B.A00;
                if (str != null) {
                    r13.A00 |= 1;
                    r13.A05 = str;
                } else {
                    throw null;
                }
            }
            String str2 = this.A00.A02;
            A0B.A02();
            C76243eE r14 = (C76243eE) A0B.A00;
            if (str2 != null) {
                r14.A00 |= 2;
                r14.A04 = str2;
                String str3 = this.A00.A01;
                A0B.A02();
                C76243eE r15 = (C76243eE) A0B.A00;
                if (str3 != null) {
                    r15.A00 |= 4;
                    r15.A03 = str3;
                    for (AnonymousClass1XS r3 : this.A00.A04) {
                        AbstractC04160Jh A0B2 = C76233eD.A03.AQb();
                        String str4 = r3.A00;
                        if (!TextUtils.isEmpty(str4)) {
                            A0B2.A02();
                            C76233eD r16 = (C76233eD) A0B2.A00;
                            if (str4 != null) {
                                r16.A00 |= 1;
                                r16.A02 = str4;
                            } else {
                                throw null;
                            }
                        }
                        for (AnonymousClass1XR r7 : r3.A01) {
                            AbstractC04160Jh A0B3 = C76213eB.A04.AQb();
                            String str5 = r7.A02;
                            A0B3.A02();
                            C76213eB r17 = (C76213eB) A0B3.A00;
                            if (str5 != null) {
                                r17.A00 |= 1;
                                r17.A03 = str5;
                                String str6 = r7.A01;
                                A0B3.A02();
                                C76213eB r18 = (C76213eB) A0B3.A00;
                                if (str6 != null) {
                                    r18.A00 |= 4;
                                    r18.A02 = str6;
                                    String str7 = r7.A00;
                                    if (!TextUtils.isEmpty(str7)) {
                                        A0B3.A02();
                                        C76213eB r19 = (C76213eB) A0B3.A00;
                                        if (str7 != null) {
                                            r19.A00 |= 2;
                                            r19.A01 = str7;
                                        } else {
                                            throw null;
                                        }
                                    }
                                    AnonymousClass078 A01 = A0B3.A01();
                                    A0B2.A02();
                                    C76233eD r23 = (C76233eD) A0B2.A00;
                                    if (A01 != null) {
                                        AbstractC04120Jd r110 = r23.A01;
                                        if (!((AbstractC05040Mx) r110).A00) {
                                            r110 = AnonymousClass078.A04(r110);
                                            r23.A01 = r110;
                                        }
                                        r110.add(A01);
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        }
                        AnonymousClass078 A012 = A0B2.A01();
                        A0B.A02();
                        C76243eE r24 = (C76243eE) A0B.A00;
                        if (A012 != null) {
                            AbstractC04120Jd r111 = r24.A02;
                            if (!((AbstractC05040Mx) r111).A00) {
                                r111 = AnonymousClass078.A04(r111);
                                r24.A02 = r111;
                            }
                            r111.add(A012);
                        } else {
                            throw null;
                        }
                    }
                    C76243eE r03 = (C76243eE) A0B.A01();
                    r4.A02();
                    C02840Dr r25 = (C02840Dr) r4.A00;
                    if (r03 != null) {
                        r25.A0K = r03;
                        r25.A00 |= 134217728;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    @Override // X.AbstractC02870Du
    public AbstractC007503q A2n(C007303n r4) {
        return new AnonymousClass0ZN(this, r4, this.A0E);
    }
}
