package X;

import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.0IC  reason: invalid class name */
public class AnonymousClass0IC {
    public static volatile AnonymousClass0IC A08;
    public final C017009c A00;
    public final AnonymousClass0IH A01;
    public final AnonymousClass0IE A02;
    public final AnonymousClass0IF A03;
    public final AnonymousClass0IG A04;
    public final AnonymousClass0II A05;
    public final AnonymousClass0ID A06;
    public final AnonymousClass0IJ A07;

    public AnonymousClass0IC(C017009c r1, AnonymousClass0ID r2, AnonymousClass0IE r3, AnonymousClass0IF r4, AnonymousClass0IG r5, AnonymousClass0IH r6, AnonymousClass0II r7, AnonymousClass0IJ r8) {
        this.A00 = r1;
        this.A06 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r6;
        this.A05 = r7;
        this.A07 = r8;
    }

    public static AnonymousClass0IC A00() {
        if (A08 == null) {
            synchronized (AnonymousClass0IC.class) {
                if (A08 == null) {
                    C017009c A002 = C017009c.A00();
                    if (AnonymousClass0ID.A01 == null) {
                        synchronized (AnonymousClass0ID.class) {
                            if (AnonymousClass0ID.A01 == null) {
                                AnonymousClass0ID.A01 = new AnonymousClass0ID(AnonymousClass01A.A00());
                            }
                        }
                    }
                    AnonymousClass0ID r17 = AnonymousClass0ID.A01;
                    if (AnonymousClass0IE.A05 == null) {
                        synchronized (AnonymousClass0IE.class) {
                            if (AnonymousClass0IE.A05 == null) {
                                AnonymousClass0IE.A05 = new AnonymousClass0IE(AnonymousClass009.A00(), AnonymousClass01I.A00(), AnonymousClass01L.A00(), AnonymousClass0I8.A01(), C02430Bz.A00());
                            }
                        }
                    }
                    AnonymousClass0IE r18 = AnonymousClass0IE.A05;
                    if (AnonymousClass0IF.A02 == null) {
                        synchronized (AnonymousClass0IF.class) {
                            if (AnonymousClass0IF.A02 == null) {
                                AnonymousClass0IF.A02 = new AnonymousClass0IF(C018709t.A01(), C02040Ak.A00());
                            }
                        }
                    }
                    AnonymousClass0IF r19 = AnonymousClass0IF.A02;
                    if (AnonymousClass0IG.A01 == null) {
                        synchronized (AnonymousClass0IG.class) {
                            if (AnonymousClass0IG.A01 == null) {
                                AnonymousClass0IG.A01 = new AnonymousClass0IG(AnonymousClass0EY.A00());
                            }
                        }
                    }
                    AnonymousClass0IG r20 = AnonymousClass0IG.A01;
                    if (AnonymousClass0IH.A0A == null) {
                        synchronized (AnonymousClass0IH.class) {
                            if (AnonymousClass0IH.A0A == null) {
                                AnonymousClass0IH.A0A = new AnonymousClass0IH(AnonymousClass02M.A00(), AnonymousClass009.A00(), AnonymousClass00Y.A00(), AnonymousClass0AR.A00(), AnonymousClass01A.A00(), AnonymousClass08B.A00, AnonymousClass01K.A00(), AnonymousClass01P.A00(), AnonymousClass0IA.A00(), C017009c.A00());
                            }
                        }
                    }
                    AnonymousClass0IH r21 = AnonymousClass0IH.A0A;
                    if (AnonymousClass0II.A01 == null) {
                        synchronized (AnonymousClass0II.class) {
                            if (AnonymousClass0II.A01 == null) {
                                AnonymousClass0II.A01 = new AnonymousClass0II(AnonymousClass01A.A00());
                            }
                        }
                    }
                    AnonymousClass0II r22 = AnonymousClass0II.A01;
                    if (AnonymousClass0IJ.A01 == null) {
                        synchronized (AnonymousClass0IJ.class) {
                            if (AnonymousClass0IJ.A01 == null) {
                                AnonymousClass0IJ.A01 = new AnonymousClass0IJ(AnonymousClass01A.A00());
                            }
                        }
                    }
                    A08 = new AnonymousClass0IC(A002, r17, r18, r19, r20, r21, r22, AnonymousClass0IJ.A01);
                }
            }
        }
        return A08;
    }

    public void A01(C47162Gs r4, AnonymousClass2LB r5, C007003k r6) {
        UserJid userJid = r4.A07;
        if (userJid == null) {
            throw null;
        } else if (userJid.equals(r6.A09)) {
            A02(r5, Collections.singletonMap(r4.A07, r4), null, Collections.singletonList(new C47172Gt(r6)));
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("jid doesn't match, jid1=");
            A0S.append(r4.A07);
            A0S.append(", jid2=");
            A0S.append(r6.A09);
            throw new IllegalArgumentException(A0S.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:210:0x04c0, code lost:
        if (r8.get(r1) == null) goto L_0x04c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        if (r9 != 1) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        if (r3.A0X != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass2LB r21, java.util.Map r22, java.util.Map r23, java.util.List r24) {
        /*
        // Method dump skipped, instructions count: 1854
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IC.A02(X.2LB, java.util.Map, java.util.Map, java.util.List):void");
    }
}
