package X;

import java.util.Collections;

/* renamed from: X.1J2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1J2 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C40531tQ A00;
    public final /* synthetic */ C04350Ka A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass1J2(C04350Ka r1, C40531tQ r2, boolean z, boolean z2) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void run() {
        C04350Ka r4 = this.A01;
        C40531tQ r5 = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        byte[] bArr = null;
        for (AbstractC007503q r1 : Collections.unmodifiableList(r5.A01)) {
            r4.A0H.A01(r1);
            if (bArr == null && r1.A0B() != null) {
                bArr = r1.A0B().A08();
            }
        }
        r4.A0D.A04(r5, new C50132Tn(z, r5.A04()), null, null, z2, false, bArr);
    }
}
