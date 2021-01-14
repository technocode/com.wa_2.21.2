package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.0Kd  reason: invalid class name and case insensitive filesystem */
public class C04380Kd {
    public static volatile C04380Kd A09;
    public AnonymousClass1Ny A00;
    public C27091Nz A01;
    public final AnonymousClass0CU A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass00Y A04;
    public final AnonymousClass0FM A05;
    public final AnonymousClass00T A06;
    public final LinkedHashMap A07 = new C04390Ke(this);
    public final Random A08 = new Random();

    public C04380Kd(AnonymousClass00S r2, AnonymousClass00T r3, AnonymousClass00Y r4, AnonymousClass0FM r5, AnonymousClass0C2 r6) {
        C04400Kf r0 = new C04400Kf(this);
        this.A02 = r0;
        this.A03 = r2;
        this.A06 = r3;
        this.A04 = r4;
        this.A05 = r5;
        r6.A01(r0);
    }

    public static C04380Kd A00() {
        if (A09 == null) {
            synchronized (C04380Kd.class) {
                if (A09 == null) {
                    A09 = new C04380Kd(AnonymousClass00S.A00(), C002101e.A00(), AnonymousClass00Y.A00(), AnonymousClass0FM.A00(), AnonymousClass0C2.A00());
                }
            }
        }
        return A09;
    }

    public void A01() {
        AnonymousClass1Ny r3 = this.A00;
        if (r3 != null) {
            AnonymousClass21B r2 = new AnonymousClass21B();
            r2.A02 = Long.valueOf(r3.A05);
            r2.A04 = Long.valueOf(SystemClock.elapsedRealtime() - r3.A06);
            r2.A05 = Long.valueOf((long) r3.A03);
            r2.A03 = Long.valueOf((long) r3.A02);
            int i = r3.A00;
            if (i != 0) {
                r2.A01 = Integer.valueOf(i);
            }
            int i2 = r3.A01;
            if (i2 != 0) {
                r2.A00 = Integer.valueOf(i2);
            }
            this.A04.A09(r2, 1);
            AnonymousClass00Y.A01(r2, "");
            this.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r0.A04 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(int r4) {
        /*
            r3 = this;
            X.1Ny r0 = r3.A00
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.A04
            r1 = 1
            if (r0 == 0) goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            java.lang.String r0 = "Report tab open only once per session"
            X.AnonymousClass00E.A08(r1, r0)
            X.21C r2 = new X.21C
            r2.<init>()
            X.1Ny r0 = r3.A00
            if (r0 != 0) goto L_0x0039
            r0 = 0
        L_0x001a:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A01 = r0
            long r0 = (long) r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00 = r0
            X.00Y r0 = r3.A04
            r1 = 1
            r0.A09(r2, r1)
            java.lang.String r0 = ""
            X.AnonymousClass00Y.A01(r2, r0)
            X.1Ny r0 = r3.A00
            if (r0 == 0) goto L_0x0038
            r0.A04 = r1
        L_0x0038:
            return
        L_0x0039:
            long r0 = r0.A05
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04380Kd.A02(int):void");
    }

    public void A03(AbstractC007503q r4, int i) {
        long j;
        Object of;
        C27081Nw r1;
        AnonymousClass218 r2 = new AnonymousClass218();
        AnonymousClass1Ny r0 = this.A00;
        if (r0 == null) {
            j = 0;
        } else {
            j = r0.A05;
        }
        r2.A01 = Long.valueOf(j);
        r2.A00 = Integer.valueOf(i);
        this.A04.A09(r2, 1);
        AnonymousClass00Y.A01(r2, "");
        if (i == 1) {
            AnonymousClass1Ny r12 = this.A00;
            if (r12 != null) {
                r12.A02++;
            }
            C27091Nz r02 = this.A01;
            if (r02 != null) {
                Map map = r02.A09;
                C007303n r13 = r4.A0n;
                if (r13.A02) {
                    of = AnonymousClass02Z.A00;
                } else {
                    of = UserJid.of(r4.A07());
                }
                AnonymousClass1Nx r03 = (AnonymousClass1Nx) map.get(of);
                if (r03 != null && (r1 = (C27081Nw) r03.A07.get(r13)) != null) {
                    r1.A01++;
                }
            }
        }
    }

    public void A04(AbstractC007503q r6, long j, int i) {
        long j2;
        AnonymousClass217 r4 = new AnonymousClass217();
        AnonymousClass1Ny r0 = this.A00;
        if (r0 == null) {
            j2 = 0;
        } else {
            j2 = r0.A05;
        }
        r4.A04 = Long.valueOf(j2);
        r4.A00 = Integer.valueOf(AnonymousClass0AH.A01(r6));
        r4.A03 = Long.valueOf(j);
        int i2 = r6.A04;
        int i3 = 3;
        if (i2 != 3) {
            i3 = 4;
            if (i2 == 4) {
                i3 = 1;
            } else if (i2 == 5) {
                i3 = 2;
            }
        }
        r4.A01 = Integer.valueOf(i3);
        r4.A02 = Integer.valueOf(i);
        this.A04.A09(r4, 1);
        AnonymousClass00Y.A01(r4, "");
    }

    public void A05(List list, List list2, List list3) {
        AnonymousClass1Ny r0 = this.A00;
        if (r0 != null) {
            this.A01 = new C27091Nz(r0.A05, this.A08.nextLong(), list, list2, list3, this.A07);
        }
    }
}
