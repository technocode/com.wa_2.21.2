package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: X.37A  reason: invalid class name */
public class AnonymousClass37A extends RelativeLayout {
    public final int A00;

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public AnonymousClass37A(Context context, int i) {
        super(context);
        this.A00 = i;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            int i6 = this.A00;
            childAt.layout(i, i2 - i6, i3, i6 + i4);
        }
    }
}
