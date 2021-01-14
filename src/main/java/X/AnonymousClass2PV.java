package X;

import android.view.View;

/* renamed from: X.2PV  reason: invalid class name */
public class AnonymousClass2PV extends RunnableEmptyBase implements Runnable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public long A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final View A09;
    public final AnonymousClass2PX A0A;

    public AnonymousClass2PV(View view, AnonymousClass2PX r2) {
        this.A09 = view;
        this.A0A = r2;
    }

    public void A00(float f, float f2, float f3, float f4, long j) {
        if (!this.A06) {
            this.A00 = f3;
            this.A01 = f4;
            this.A03 = f2;
            this.A05 = System.currentTimeMillis();
            this.A02 = f;
            boolean z = false;
            if (f2 > f) {
                z = true;
            }
            this.A08 = z;
            this.A04 = (f2 - f) / ((float) j);
            this.A06 = true;
            this.A07 = false;
            this.A09.post(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r2 == r0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r6.A05
            long r2 = r2 - r0
            float r1 = r6.A02
            float r5 = r6.A04
            float r0 = (float) r2
            float r5 = r5 * r0
            float r5 = r5 + r1
            X.2PX r4 = r6.A0A
            float r1 = r6.A00
            float r0 = r6.A01
            r4.A00(r5, r1, r0)
            float r3 = r6.A03
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x002c
            boolean r2 = r6.A08
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x002a
            r0 = 1
        L_0x002a:
            if (r2 != r0) goto L_0x0039
        L_0x002c:
            float r1 = r6.A00
            float r0 = r6.A01
            r4.A00(r3, r1, r0)
            r0 = 0
            r6.A06 = r0
            r0 = 1
            r6.A07 = r0
        L_0x0039:
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x0042
            android.view.View r0 = r6.A09
            r0.post(r6)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PV.run():void");
    }
}
