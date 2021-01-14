package X;

import android.net.NetworkInfo;
import com.whatsapp.fieldstats.events.WamCall;

/* renamed from: X.0ET  reason: invalid class name */
public class AnonymousClass0ET {
    public static volatile AnonymousClass0ET A0D;
    public WamCall A00;
    public final AnonymousClass01I A01;
    public final C000300f A02;
    public final AnonymousClass03P A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass00G A05;
    public final AnonymousClass00D A06;
    public final C002701k A07;
    public final AnonymousClass038 A08;
    public final AnonymousClass00Y A09;
    public final AnonymousClass0EU A0A;
    public final AnonymousClass022 A0B;
    public final AnonymousClass00T A0C;

    public AnonymousClass0ET(AnonymousClass00G r1, AnonymousClass00S r2, C002701k r3, AnonymousClass01I r4, AnonymousClass00T r5, AnonymousClass00Y r6, C000300f r7, AnonymousClass03P r8, AnonymousClass038 r9, AnonymousClass00D r10, AnonymousClass022 r11, AnonymousClass0EU r12) {
        this.A05 = r1;
        this.A04 = r2;
        this.A07 = r3;
        this.A01 = r4;
        this.A0C = r5;
        this.A09 = r6;
        this.A02 = r7;
        this.A03 = r8;
        this.A08 = r9;
        this.A06 = r10;
        this.A0B = r11;
        this.A0A = r12;
    }

    public static AnonymousClass0ET A00() {
        if (A0D == null) {
            synchronized (AnonymousClass0ET.class) {
                if (A0D == null) {
                    A0D = new AnonymousClass0ET(AnonymousClass00G.A01, AnonymousClass00S.A00(), C002701k.A00(), AnonymousClass01I.A00(), C002101e.A00(), AnonymousClass00Y.A00(), C000300f.A00(), AnonymousClass03P.A00(), AnonymousClass038.A00(), AnonymousClass00D.A00(), AnonymousClass022.A00(), AnonymousClass0EU.A03);
                }
            }
        }
        return A0D;
    }

    public static Integer A01(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        int type = networkInfo.getType();
        int subtype = networkInfo.getSubtype();
        if (type == 0) {
            switch (subtype) {
                case 1:
                    return 104;
                case 2:
                    return 100;
                case 3:
                    return 102;
                case 4:
                    return Integer.valueOf((int) AnonymousClass0PW.A03);
                case 5:
                case 6:
                case 12:
                    return 103;
                case 7:
                    return 109;
                case 8:
                    return 105;
                case 9:
                    return 106;
                case 10:
                    return 107;
                case 11:
                    return 101;
                case 13:
                    return 111;
                case 14:
                    return 110;
                case 15:
                    return 112;
                default:
                    return 0;
            }
        } else if (type == 1) {
            return 1;
        } else {
            return null;
        }
    }

    public void A02(int i, int i2, Long l, Double d) {
        C445320m r3 = new C445320m();
        r3.A01 = Integer.valueOf(i);
        r3.A02 = Integer.valueOf(i2);
        r3.A00 = d;
        r3.A03 = l;
        this.A09.A0B(r3, null, false);
    }

    public void A03(int i, long j) {
        C445720q r2 = new C445720q();
        r2.A01 = Integer.valueOf(i);
        r2.A00 = Double.valueOf((double) j);
        r2.A02 = 0;
        this.A09.A09(r2, 1);
        AnonymousClass00Y.A01(r2, "");
    }

    public void A04(int i, long j) {
        AnonymousClass21J r1 = new AnonymousClass21J();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Long.valueOf(j);
        AnonymousClass00Y r4 = this.A09;
        r4.A0B(r1, null, false);
        C000300f r6 = this.A02;
        if (r6.A0D(AbstractC000400g.A2i)) {
            AnonymousClass21K r12 = new AnonymousClass21K();
            r12.A00 = Boolean.valueOf(this.A0A.A03());
            r4.A0B(r12, null, false);
        }
        if (r6.A0D(AbstractC000400g.A0A) || this.A07.A0E(241)) {
            r4.A0D(true);
            int A062 = r6.A06(AbstractC000400g.A0G);
            synchronized (r4) {
                r4.A0J = A062;
            }
            AnonymousClass21T r13 = new AnonymousClass21T();
            r13.A00 = Boolean.valueOf(this.A0A.A03());
            r4.A0B(r13, null, false);
            return;
        }
        r4.A0D(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r6.getType() != 1) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.net.NetworkInfo r6) {
        /*
            r5 = this;
            X.038 r4 = r5.A08
            r3 = 0
            r2 = 1
            if (r6 == 0) goto L_0x000d
            int r1 = r6.getType()
            r0 = 1
            if (r1 == r2) goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 23
            r4.A03(r0, r1, r3)
            r4.A03(r0, r1, r2)
            java.lang.Integer r1 = A01(r6)
            r0 = 105(0x69, float:1.47E-43)
            r4.A03(r0, r1, r3)
            r4.A03(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ET.A05(android.net.NetworkInfo):void");
    }

    public void A06(WamCall wamCall, boolean z) {
        this.A00 = wamCall;
        AnonymousClass00Y r1 = this.A09;
        r1.A09(wamCall, 1);
        AnonymousClass00Y.A01(wamCall, "");
        if (z) {
            r1.A04();
        }
    }

    public void A07(AbstractC007503q r7, int i) {
        Integer num;
        Integer num2;
        C445020j r1 = new C445020j();
        r1.A02 = Integer.valueOf(i);
        AnonymousClass02N r2 = r7.A0n.A00;
        if (AnonymousClass1VY.A0Y(r2)) {
            num = 2;
        } else if (AnonymousClass1VY.A0b(r2)) {
            num = 3;
        } else if (AnonymousClass1VY.A0U(r2)) {
            num = 4;
        } else {
            num = 1;
        }
        r1.A03 = Integer.valueOf(num.intValue());
        r1.A05 = Long.valueOf(this.A04.A05() - r7.A0C);
        byte b = r7.A0m;
        if (b == 11) {
            num2 = 1;
        } else if (b == 31) {
            num2 = 2;
        } else {
            num2 = 0;
        }
        r1.A04 = Integer.valueOf(num2.intValue());
        r1.A01 = Integer.valueOf(AnonymousClass0AH.A02(r7));
        r1.A00 = Integer.valueOf(AnonymousClass0AH.A01(r7));
        this.A09.A09(r1, 1);
        AnonymousClass00Y.A01(r1, "");
    }

    public void A08(boolean z, int i) {
        int i2;
        C44361zv r3 = new C44361zv();
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i > 1) {
                i2 = 3;
            }
        }
        r3.A00 = Integer.valueOf(i2);
        r3.A01 = Long.valueOf((long) i);
        this.A09.A09(r3, 1);
        AnonymousClass00Y.A01(r3, "");
    }
}
