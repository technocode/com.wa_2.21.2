package X;

import java.util.List;

/* renamed from: X.1Ry  reason: invalid class name and case insensitive filesystem */
public final class C27881Ry {
    public static volatile C27881Ry A0A;
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public C55132g3 A02;
    public final AnonymousClass02M A03;
    public final C000300f A04;
    public final AnonymousClass0CL A05;
    public final AnonymousClass00G A06;
    public final AnonymousClass00Y A07;
    public final AnonymousClass0CW A08;
    public final AnonymousClass0CT A09;

    public C27881Ry(AnonymousClass00G r2, AnonymousClass02M r3, AnonymousClass0CL r4, C000300f r5, AnonymousClass00Y r6, AnonymousClass0CT r7, AnonymousClass0CW r8) {
        this.A06 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A04 = r5;
        this.A07 = r6;
        this.A09 = r7;
        this.A08 = r8;
    }

    public static C27881Ry A00() {
        if (A0A == null) {
            synchronized (C27881Ry.class) {
                if (A0A == null) {
                    A0A = new C27881Ry(AnonymousClass00G.A01, AnonymousClass02M.A00(), AnonymousClass0CL.A00(), C000300f.A00(), AnonymousClass00Y.A00(), AnonymousClass0CT.A00(), AnonymousClass0CW.A00());
                }
            }
        }
        return A0A;
    }

    public void A01(C42301wU r5) {
        r5.A03 = true;
        C55132g3 r0 = this.A02;
        if (r0 != null) {
            synchronized (r0.A05) {
                AnonymousClass1RL r2 = (AnonymousClass1RL) r0.A08.get(r5.getId());
                if (r2 != null && r5.getId().equals(r2.A03)) {
                    r2.A05.remove(r5);
                }
            }
        }
        List list = r5.A02;
        if (list != null && list.size() > 0) {
            for (C42301wU r02 : r5.A02) {
                A01(r02);
            }
        }
    }
}
