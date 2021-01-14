package X;

import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.View;
import android.widget.OverScroller;

/* renamed from: X.0um  reason: invalid class name and case insensitive filesystem */
public class RunnableC19290um extends RunnableEmptyBase implements Runnable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public long A04;
    public long A05;
    public Matrix A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public float[] A0D = new float[2];
    public final View A0E;
    public final OverScroller A0F;
    public final AbstractC19280ul A0G;

    public RunnableC19290um(View view, AbstractC19280ul r4) {
        this.A0E = view;
        this.A0G = r4;
        OverScroller overScroller = new OverScroller(view.getContext());
        this.A0F = overScroller;
        overScroller.setFriction(0.035f);
    }

    public void run() {
        boolean z;
        int i;
        int i2;
        if (this.A08) {
            C32061eH r1 = (C32061eH) this.A0G;
            r1.A0M.A04();
            r1.A05();
            return;
        }
        if (!this.A0C) {
            if (this.A09) {
                this.A0F.forceFinished(true);
                this.A01 = 0.0f;
            } else if (this.A0A) {
                this.A0F.forceFinished(true);
                this.A00 = 0.0f;
            }
            this.A0A = false;
            this.A09 = false;
            this.A0C = true;
        }
        OverScroller overScroller = this.A0F;
        if (overScroller.computeScrollOffset()) {
            this.A0D[0] = (float) overScroller.getCurrX();
            this.A0D[1] = (float) overScroller.getCurrY();
            Matrix matrix = this.A06;
            if (matrix != null) {
                matrix.mapPoints(this.A0D);
            }
            float[] fArr = this.A0D;
            float f = fArr[0];
            float f2 = fArr[1];
            if (this.A0B) {
                this.A0B = false;
                this.A02 = f;
                this.A03 = f2;
            }
            ((C32061eH) this.A0G).A0A(f - this.A02, f2 - this.A03);
            this.A02 = f;
            this.A03 = f2;
            z = true;
        } else {
            z = false;
        }
        double d = (double) this.A01;
        if (d < -0.01d || d > 0.01d) {
            long j = this.A05;
            int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            long uptimeMillis = SystemClock.uptimeMillis();
            if (i3 == 0) {
                this.A05 = uptimeMillis;
                i2 = 1;
            } else {
                i2 = ((int) (uptimeMillis - j)) / 10;
                this.A05 = j + ((long) (i2 * 10));
            }
            float pow = (float) (Math.pow(0.9150000214576721d, (double) i2) * d);
            this.A01 = pow;
            C32061eH r2 = (C32061eH) this.A0G;
            if (r2.A0K(pow + 1.0f, r2.A08, r2.A09)) {
                z = true;
            } else {
                this.A01 = 0.0f;
            }
        }
        double d2 = (double) this.A00;
        if (d2 < -0.01d || d2 > 0.01d) {
            long j2 = this.A04;
            int i4 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            long uptimeMillis2 = SystemClock.uptimeMillis();
            if (i4 == 0) {
                this.A04 = uptimeMillis2;
                i = 1;
            } else {
                i = ((int) (uptimeMillis2 - j2)) / 10;
                this.A04 = j2 + ((long) (i * 10));
            }
            float pow2 = (float) (Math.pow(0.8500000238418579d, (double) i) * d2);
            this.A00 = pow2;
            C32061eH r3 = (C32061eH) this.A0G;
            r3.A0B(r3.A0B + pow2, r3.A08, r3.A09);
        } else if (!z) {
            this.A0C = false;
            this.A07 = false;
            C32061eH r12 = (C32061eH) this.A0G;
            r12.A0M.A04();
            r12.A05();
            return;
        }
        View view = this.A0E;
        view.invalidate();
        view.postOnAnimation(this);
    }
}
