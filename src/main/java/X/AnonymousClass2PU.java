package X;

import android.view.View;

/* renamed from: X.2PU  reason: invalid class name */
public class AnonymousClass2PU extends RunnableEmptyBase implements Runnable {
    public float A00;
    public long A01;
    public boolean A02;
    public final View A03;
    public final AnonymousClass2PX A04;

    public AnonymousClass2PU(View view, AnonymousClass2PX r2) {
        this.A03 = view;
        this.A04 = r2;
    }

    public void run() {
        long j;
        if (!this.A02) {
            float f = this.A00;
            if (f != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = this.A01;
                if (j2 != -1) {
                    j = currentTimeMillis - j2;
                } else {
                    j = 0;
                }
                float f2 = 0.0f * ((float) j);
                if ((f < 0.0f && f + f2 > 0.0f) || (f > 0.0f && f + f2 < 0.0f)) {
                    f2 = 0.0f - f;
                }
                AnonymousClass2PX r4 = this.A04;
                r4.A06 += f2;
                r4.A0A.postRotate(f2, (float) (r4.A0I.getWidth() >> 1), (float) (r4.A0I.getHeight() >> 1));
                r4.A0K.A00(r4.A0A);
                float f3 = this.A00 + f2;
                this.A00 = f3;
                if (f3 == 0.0f) {
                    this.A02 = true;
                    r4.A06 = (float) Math.round(r4.A06);
                    r4.A01(true);
                    View view = this.A03;
                    view.requestLayout();
                    view.invalidate();
                }
                this.A01 = currentTimeMillis;
            }
            if (!this.A02) {
                this.A03.post(this);
            }
        }
    }
}
