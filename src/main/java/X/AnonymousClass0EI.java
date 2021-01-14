package X;

/* renamed from: X.0EI  reason: invalid class name */
public class AnonymousClass0EI {
    public static volatile AnonymousClass0EI A0L;
    public final AnonymousClass009 A00;
    public final AnonymousClass01I A01;
    public final C000300f A02;
    public final AnonymousClass01J A03;
    public final AnonymousClass01A A04;
    public final AnonymousClass00C A05;
    public final AnonymousClass00S A06;
    public final AnonymousClass01K A07;
    public final AnonymousClass095 A08;
    public final C03120Ew A09;
    public final AnonymousClass09E A0A;
    public final C02430Bz A0B;
    public final AnonymousClass0DR A0C;
    public final AnonymousClass00Y A0D;
    public final C02770Dj A0E;
    public final AnonymousClass0EJ A0F;
    public final C02760Di A0G;
    public final C02130At A0H;
    public final C03100Eu A0I;
    public final C03110Ev A0J;
    public final AnonymousClass0AL A0K;

    public AnonymousClass0EI(AnonymousClass00S r2, AnonymousClass009 r3, AnonymousClass01I r4, AnonymousClass095 r5, AnonymousClass00Y r6, C000300f r7, AnonymousClass09E r8, AnonymousClass01J r9, C02770Dj r10, AnonymousClass01A r11, AnonymousClass0AL r12, AnonymousClass0EJ r13, C03100Eu r14, C02760Di r15, AnonymousClass01K r16, AnonymousClass00C r17, C03110Ev r18, AnonymousClass0DR r19, C03120Ew r20, C02130At r21, C02430Bz r22) {
        this.A06 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A08 = r5;
        this.A0D = r6;
        this.A02 = r7;
        this.A0A = r8;
        this.A03 = r9;
        this.A0E = r10;
        this.A04 = r11;
        this.A0K = r12;
        this.A0F = r13;
        this.A0I = r14;
        this.A0G = r15;
        this.A07 = r16;
        this.A05 = r17;
        this.A0J = r18;
        this.A0C = r19;
        this.A09 = r20;
        this.A0H = r21;
        this.A0B = r22;
    }

    public static AnonymousClass0EI A00() {
        if (A0L == null) {
            synchronized (AnonymousClass0EI.class) {
                if (A0L == null) {
                    A0L = new AnonymousClass0EI(AnonymousClass00S.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), AnonymousClass095.A00(), AnonymousClass00Y.A00(), C000300f.A00(), AnonymousClass09E.A00(), AnonymousClass01J.A00(), C02770Dj.A00(), AnonymousClass01A.A00(), AnonymousClass0AL.A01(), AnonymousClass0EJ.A01(), C03100Eu.A00(), C02760Di.A00(), AnonymousClass01K.A00(), AnonymousClass00C.A00(), C03110Ev.A00(), AnonymousClass0DR.A00(), C03120Ew.A00(), C02130At.A00(), C02430Bz.A00());
                }
            }
        }
        return A0L;
    }

    public static final EnumC69963Jf A01(int i) {
        if (i == 0) {
            return EnumC69963Jf.INITIAL_BOOTSTRAP;
        }
        if (i == 1) {
            return EnumC69963Jf.INITIAL_STATUS_V3;
        }
        if (i == 2) {
            return EnumC69963Jf.RECENT;
        }
        if (i == 3) {
            return EnumC69963Jf.FULL;
        }
        if (i == 4) {
            return EnumC69963Jf.PUSH_NAME;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0G("Unexpected type (", i, ")"));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0089, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A02(com.whatsapp.jid.DeviceJid r23, X.C76713ez r24, int r25, int r26, int r27, int r28, long r29, long r31, long r33, java.lang.String r35) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EI.A02(com.whatsapp.jid.DeviceJid, X.3ez, int, int, int, int, long, long, long, java.lang.String):long");
    }

    public final AnonymousClass0N0 A03(AbstractC007503q r8) {
        if (r8 == null) {
            return null;
        }
        this.A0J.A01(r8);
        C64392y7 A012 = C02760Di.A01(r8, null, false);
        if (A012 == null) {
            return null;
        }
        return A012.A04(this.A00, this.A01, this.A0I, this.A0H, A012.A0D, true);
    }

    public final void A04(C76693ex r13, AnonymousClass02N r14, long j, long j2, long j3) {
        EnumC69953Je r1 = EnumC69953Je.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY;
        AnonymousClass095 r6 = this.A08;
        long A062 = r6.A06(r14);
        if (A062 != 1) {
            if (A062 >= j) {
                r13.A04(EnumC69953Je.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY);
            } else if (A062 >= j3) {
            } else {
                if (j2 != 1) {
                    if (j2 < j3) {
                        r13.A04(r1);
                    }
                } else if (r6.A03(r14, j3, j) == 0) {
                    r13.A04(r1);
                }
            }
        }
    }

    public void A05(C76693ex r6, AbstractC007503q r7) {
        AnonymousClass0N0 A032 = A03(r7);
        if (A032 != null) {
            AbstractC04160Jh A0B2 = C76743f2.A04.AQb();
            A0B2.A02();
            C76743f2 r1 = (C76743f2) A0B2.A00;
            if (r1 != null) {
                r1.A03 = (AnonymousClass0Ms) A032.A01();
                r1.A01 |= 1;
                long j = r7.A0p;
                A0B2.A02();
                C76743f2 r12 = (C76743f2) A0B2.A00;
                r12.A01 |= 2;
                r12.A02 = j;
                AnonymousClass078 A012 = A0B2.A01();
                r6.A02();
                C76703ey r2 = (C76703ey) r6.A00;
                if (A012 != null) {
                    AbstractC04120Jd r13 = r2.A08;
                    if (!((AbstractC05040Mx) r13).A00) {
                        r13 = AnonymousClass078.A04(r13);
                        r2.A08 = r13;
                    }
                    r13.add(A012);
                    return;
                }
                throw null;
            }
            throw null;
        }
    }
}
