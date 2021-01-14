package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: X.0uy  reason: invalid class name and case insensitive filesystem */
public class C19410uy {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06 = 1.0f;
    public float A07 = 1.0f;
    public float A08 = 1.0f;
    public float A09;
    public float A0A = 1.0f;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public Matrix A0L;
    public VelocityTracker A0M;
    public AbstractC19400ux A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final int A0U;
    public final long A0V;
    public final AbstractRunnableC19430v0 A0W = new C32161eR(this);
    public final AbstractRunnableC19430v0 A0X = new C32151eQ(this);
    public final float[] A0Y = new float[2];

    public C19410uy(Context context, AbstractC19400ux r5) {
        this.A0N = r5;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0U = viewConfiguration.getScaledTouchSlop();
        this.A0V = (long) ViewConfiguration.getLongPressTimeout();
        this.A0G = ViewConfiguration.getDoubleTapTimeout();
        this.A0F = viewConfiguration.getScaledDoubleTapSlop();
        this.A09 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0S = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
    }
}
