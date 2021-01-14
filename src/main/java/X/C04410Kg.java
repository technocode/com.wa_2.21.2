package X;

import com.whatsapp.util.Log;

/* renamed from: X.0Kg  reason: invalid class name and case insensitive filesystem */
public class C04410Kg {
    public static volatile C04410Kg A0B;
    public final AnonymousClass02M A00;
    public final C27331Pi A01;
    public final AnonymousClass00S A02;
    public final AnonymousClass00D A03;
    public final AnonymousClass0DG A04;
    public final C006903j A05;
    public final AnonymousClass0A8 A06;
    public final AnonymousClass01K A07;
    public final AnonymousClass0AP A08;
    public final C02360Br A09;
    public final AnonymousClass0FE A0A;

    public C04410Kg(AnonymousClass00S r1, AnonymousClass02M r2, C006903j r3, AnonymousClass0DG r4, C27331Pi r5, C02360Br r6, AnonymousClass01K r7, AnonymousClass0AP r8, AnonymousClass0FE r9, AnonymousClass00D r10, AnonymousClass0A8 r11) {
        this.A02 = r1;
        this.A00 = r2;
        this.A05 = r3;
        this.A04 = r4;
        this.A01 = r5;
        this.A09 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A0A = r9;
        this.A03 = r10;
        this.A06 = r11;
    }

    public static C04410Kg A00() {
        if (A0B == null) {
            synchronized (C04410Kg.class) {
                if (A0B == null) {
                    A0B = new C04410Kg(AnonymousClass00S.A00(), AnonymousClass02M.A00(), C006903j.A00(), AnonymousClass0DG.A00(), C27331Pi.A00(), C02360Br.A00(), AnonymousClass01K.A00(), AnonymousClass0AP.A00(), AnonymousClass0FE.A00(), AnonymousClass00D.A00(), AnonymousClass0A8.A00);
                }
            }
        }
        return A0B;
    }

    public void A01(AnonymousClass02N r9, boolean z) {
        AnonymousClass0DG r3 = this.A04;
        r3.A0C.A01(8, r9);
        C08560bL A052 = r3.A05.A05(r9);
        if (A052 == null) {
            AnonymousClass008.A12("msgstore/setchatunseen/nochat/", r9);
        } else {
            StringBuilder A0W = AnonymousClass008.A0W("msgstore/setchatunseen/", r9, "/");
            A0W.append(A052.A0H());
            Log.i(A0W.toString());
            A052.A0J(-1, 0, 0);
            r3.A03.A01(new RunnableEBaseShape0S0310000_I0(r3, r9, A052, z, 2), 1);
        }
        this.A06.A05(r9);
        if (z) {
            this.A09.A06(r9, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        if (r14 == 0) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass02N r18, boolean r19, X.C007303n r20, java.lang.Integer r21, boolean r22) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04410Kg.A02(X.02N, boolean, X.03n, java.lang.Integer, boolean):void");
    }

    public void A03(AnonymousClass02N r7, boolean z, boolean z2) {
        A02(r7, z, null, null, z2);
    }
}
