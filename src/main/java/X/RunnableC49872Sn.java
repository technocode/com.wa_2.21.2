package X;

import java.util.Collections;

/* renamed from: X.2Sn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC49872Sn extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C40531tQ A02;
    public final /* synthetic */ C04420Kh A03;
    public final /* synthetic */ C56862jJ A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ RunnableC49872Sn(C04420Kh r1, long j, C56862jJ r4, boolean z, Integer num, int i, C40531tQ r8) {
        this.A03 = r1;
        this.A01 = j;
        this.A04 = r4;
        this.A06 = z;
        this.A05 = num;
        this.A00 = i;
        this.A02 = r8;
    }

    public final void run() {
        int i;
        C04420Kh r3 = this.A03;
        long j = this.A01;
        C56862jJ r9 = this.A04;
        boolean z = this.A06;
        Integer num = this.A05;
        int i2 = this.A00;
        C40531tQ r4 = this.A02;
        if (j > 0) {
            if (r9.A0K.A02.A00) {
                i = 3;
            } else {
                i = 1;
                if (z) {
                    i = 2;
                }
            }
            AnonymousClass0FM r6 = r3.A09;
            double d = (double) j;
            boolean z2 = false;
            if (num.intValue() == 0) {
                z2 = true;
            }
            r6.A04(d, z2, i2, i);
        }
        if (num.intValue() == 0) {
            for (AbstractC007503q r0 : Collections.unmodifiableList(r4.A01)) {
                r3.A09.A05(AnonymousClass0AH.A00(r0), i2);
            }
        }
    }
}
