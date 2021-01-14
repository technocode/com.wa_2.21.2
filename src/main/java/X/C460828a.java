package X;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.28a  reason: invalid class name and case insensitive filesystem */
public class C460828a implements AbstractC32551fB {
    public long A00 = 1000;
    public long A01 = 2000;
    public long A02;
    public Rect A03;
    public AbstractC32551fB A04;
    public C454824z A05;
    public boolean A06 = false;
    public final AbstractC20100w7 A07;
    public final Runnable A08 = new RunnableEBaseShape5S0100000_I1_0(this, 26);
    public final ScheduledExecutorService A09;

    public C460828a(AbstractC32551fB r3, C454824z r4, AbstractC20100w7 r5, ScheduledExecutorService scheduledExecutorService) {
        this.A04 = r3;
        this.A05 = r4;
        this.A07 = r5;
        this.A09 = scheduledExecutorService;
    }

    public final synchronized void A00() {
        if (!this.A06) {
            this.A06 = true;
            this.A09.schedule(this.A08, 1000, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    @Override // X.AbstractC32551fB
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A3v(android.graphics.drawable.Drawable r3, android.graphics.Canvas r4, int r5) {
        /*
            r2 = this;
            X.0w7 r0 = r2.A07
            long r0 = r0.now()
            r2.A02 = r0
            X.1fB r0 = r2.A04
            if (r0 == 0) goto L_0x0013
            boolean r1 = r0.A3v(r3, r4, r5)
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r2.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C460828a.A3v(android.graphics.drawable.Drawable, android.graphics.Canvas, int):boolean");
    }

    @Override // X.AbstractC20210wK
    public int A6V(int i) {
        AbstractC32551fB r0 = this.A04;
        if (r0 == null) {
            return 0;
        }
        return r0.A6V(i);
    }

    @Override // X.AbstractC32551fB
    public int A6s() {
        AbstractC32551fB r0 = this.A04;
        if (r0 == null) {
            return -1;
        }
        return r0.A6s();
    }

    @Override // X.AbstractC32551fB
    public int A6t() {
        AbstractC32551fB r0 = this.A04;
        if (r0 == null) {
            return -1;
        }
        return r0.A6t();
    }

    @Override // X.AbstractC32551fB
    public void ANu(int i) {
        AbstractC32551fB r0 = this.A04;
        if (r0 != null) {
            r0.ANu(i);
        }
    }

    @Override // X.AbstractC32551fB
    public void AO0(Rect rect) {
        AbstractC32551fB r0 = this.A04;
        if (r0 != null) {
            r0.AO0(rect);
        }
        this.A03 = rect;
    }

    @Override // X.AbstractC32551fB
    public void AO3(ColorFilter colorFilter) {
        AbstractC32551fB r0 = this.A04;
        if (r0 != null) {
            r0.AO3(colorFilter);
        }
    }

    @Override // X.AbstractC20210wK
    public int getFrameCount() {
        AbstractC32551fB r0 = this.A04;
        if (r0 == null) {
            return 0;
        }
        return r0.getFrameCount();
    }

    @Override // X.AbstractC20210wK
    public int getLoopCount() {
        AbstractC32551fB r0 = this.A04;
        if (r0 == null) {
            return 0;
        }
        return r0.getLoopCount();
    }
}
