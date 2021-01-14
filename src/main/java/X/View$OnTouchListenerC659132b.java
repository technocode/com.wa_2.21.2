package X;

import android.graphics.PointF;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.32b  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnTouchListenerC659132b implements View.OnTouchListener {
    public final /* synthetic */ PointF A00;
    public final /* synthetic */ AbstractC71663Pv A01;
    public final /* synthetic */ AtomicLong A02;

    public /* synthetic */ View$OnTouchListenerC659132b(AbstractC71663Pv r1, PointF pointF, AtomicLong atomicLong) {
        this.A01 = r1;
        this.A00 = pointF;
        this.A02 = atomicLong;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractC71663Pv r4 = this.A01;
        PointF pointF = this.A00;
        AtomicLong atomicLong = this.A02;
        if (r4.A00.A0B != 4 || r4.A0B().A08()) {
            return false;
        }
        if (motionEvent.getPointerCount() == 1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                pointF.set(motionEvent.getX(), motionEvent.getY());
                atomicLong.set(SystemClock.elapsedRealtime());
                r4.A0F();
                Handler handler = r4.A08;
                Runnable runnable = r4.A0P;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 500);
            } else if (action == 1) {
                pointF.set(motionEvent.getX(), motionEvent.getY());
                r4.A0G();
                view.performClick();
            }
        }
        if (motionEvent.getAction() != 3) {
            return false;
        }
        r4.A0G();
        r4.A0I();
        return false;
    }
}
