package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.1al  reason: invalid class name and case insensitive filesystem */
public class C30121al implements AbstractC14870n1 {
    public final GestureDetector A00;

    public C30121al(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.A00 = new GestureDetector(context, onGestureListener, null);
    }

    @Override // X.AbstractC14870n1
    public boolean AL5(MotionEvent motionEvent) {
        return this.A00.onTouchEvent(motionEvent);
    }

    @Override // X.AbstractC14870n1
    public void AOQ(boolean z) {
        this.A00.setIsLongpressEnabled(z);
    }
}
