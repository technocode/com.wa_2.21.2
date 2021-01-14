package X;

import android.view.Choreographer;

/* renamed from: X.0dT  reason: invalid class name and case insensitive filesystem */
public class Choreographer$FrameCallbackC09750dT implements Choreographer.FrameCallback {
    public final /* synthetic */ C09740dS A00;

    public Choreographer$FrameCallbackC09750dT(C09740dS r1) {
        this.A00 = r1;
    }

    public void doFrame(long j) {
        C09740dS r6 = this.A00;
        if (!r6.A03) {
            r6.A05.removeFrameCallback(this);
        } else if (r6.A00 == -1) {
            r6.A00 = j;
            r6.A01 = j;
            r6.A05.postFrameCallback(this);
        } else {
            long j2 = j - r6.A01;
            r6.A01 = j;
            C09730dR r2 = r6.A02;
            if (r2 != null) {
                C09720dQ r7 = r2.A00;
                double d = r7.A06;
                long max = Math.max(Math.round(((double) j2) / d), 1L);
                long min = Math.min(max - 1, 100L);
                double d2 = (double) min;
                r7.A01 += d2;
                if (min > 4) {
                    r7.A00 = (d2 / 4.0d) + r7.A00;
                }
                r7.A02 = (long) ((d * ((double) max)) + ((double) r7.A02));
            }
            r6.A05.postFrameCallback(this);
        }
    }
}
