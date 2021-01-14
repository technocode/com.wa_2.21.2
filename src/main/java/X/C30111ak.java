package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: X.1ak  reason: invalid class name and case insensitive filesystem */
public class C30111ak implements AbstractC14870n1 {
    public static final int A0L = ViewConfiguration.getDoubleTapTimeout();
    public static final int A0M = ViewConfiguration.getLongPressTimeout();
    public static final int A0N = ViewConfiguration.getTapTimeout();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public GestureDetector.OnDoubleTapListener A08;
    public MotionEvent A09;
    public MotionEvent A0A;
    public VelocityTracker A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final Handler A0J = new HandlerC14880n2(this);
    public final GestureDetector.OnGestureListener A0K;

    public C30111ak(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.A0K = onGestureListener;
        if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
            this.A08 = (GestureDetector.OnDoubleTapListener) onGestureListener;
        }
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        } else if (onGestureListener != null) {
            this.A0H = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.A06 = viewConfiguration.getScaledMinimumFlingVelocity();
            this.A05 = viewConfiguration.getScaledMaximumFlingVelocity();
            this.A07 = scaledTouchSlop * scaledTouchSlop;
            this.A04 = scaledDoubleTapSlop * scaledDoubleTapSlop;
        } else {
            throw new IllegalArgumentException("OnGestureListener must not be null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x024f  */
    @Override // X.AbstractC14870n1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AL5(android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 645
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30111ak.AL5(android.view.MotionEvent):boolean");
    }

    @Override // X.AbstractC14870n1
    public void AOQ(boolean z) {
        this.A0H = z;
    }
}
