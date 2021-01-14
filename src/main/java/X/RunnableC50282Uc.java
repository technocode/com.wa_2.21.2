package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.2Uc  reason: invalid class name and case insensitive filesystem */
public class RunnableC50282Uc extends RunnableEmptyBase implements Runnable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public long A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final PhotoView A09;

    public RunnableC50282Uc(PhotoView photoView) {
        this.A09 = photoView;
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
            com.whatsapp.mediaview.PhotoView r4 = r6.A09
            float r1 = r6.A00
            float r0 = r6.A01
            r4.A05(r5, r1, r0)
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
            r4.A05(r3, r1, r0)
            r0 = 0
            r6.A06 = r0
            r0 = 1
            r6.A07 = r0
        L_0x0039:
            boolean r0 = r6.A07
            if (r0 != 0) goto L_0x0040
            r4.post(r6)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC50282Uc.run():void");
    }
}
