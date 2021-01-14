package X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/* renamed from: X.335  reason: invalid class name */
public final /* synthetic */ class AnonymousClass335 implements View.OnTouchListener {
    public final /* synthetic */ C74143aE A00;
    public final /* synthetic */ C71833Qm A01;

    public /* synthetic */ AnonymousClass335(C74143aE r1, C71833Qm r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C74143aE r1 = this.A00;
        C71833Qm r4 = this.A01;
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        C30511bT r3 = r1.A00.A01;
        boolean z = false;
        if ((r3.A0I.A02(r3.A0M) & 16711680) != 0) {
            z = true;
        }
        if (!z) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return false;
        } else if (r4.A0H.getParent() != r3.A0M) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return false;
        } else {
            VelocityTracker velocityTracker = r3.A0F;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            r3.A0F = VelocityTracker.obtain();
            r3.A01 = 0.0f;
            r3.A00 = 0.0f;
            r3.A07(r4, 2);
            return false;
        }
    }
}
