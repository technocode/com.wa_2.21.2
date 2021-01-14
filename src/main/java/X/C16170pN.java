package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.0pN  reason: invalid class name and case insensitive filesystem */
public class C16170pN extends GestureDetector.SimpleOnGestureListener {
    public boolean A00 = true;
    public final /* synthetic */ C30511bT A01;

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C16170pN(C30511bT r2) {
        this.A01 = r2;
    }

    public void onLongPress(MotionEvent motionEvent) {
        C30511bT r2;
        View A03;
        int i;
        if (this.A00 && (A03 = (r2 = this.A01).A03(motionEvent)) != null && r2.A0M.A0E(A03) != null && (r2.A0I.A02(r2.A0M) & 16711680) != 0 && motionEvent.getPointerId(0) == (i = r2.A09)) {
            int findPointerIndex = motionEvent.findPointerIndex(i);
            float x = motionEvent.getX(findPointerIndex);
            float y = motionEvent.getY(findPointerIndex);
            r2.A02 = x;
            r2.A03 = y;
            r2.A01 = 0.0f;
            r2.A00 = 0.0f;
            if (r2.A0I == null) {
                throw null;
            }
        }
    }
}
