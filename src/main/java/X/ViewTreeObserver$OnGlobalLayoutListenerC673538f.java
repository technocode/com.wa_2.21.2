package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.voipcalling.CallLogActivity;

/* renamed from: X.38f  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC673538f implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ CallLogActivity A00;

    public /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC673538f(CallLogActivity callLogActivity) {
        this.A00 = callLogActivity;
    }

    public final void onGlobalLayout() {
        int i;
        CallLogActivity callLogActivity = this.A00;
        View childAt = callLogActivity.A02.getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (callLogActivity.A02.getWidth() > callLogActivity.A02.getHeight()) {
            if (callLogActivity.A02.getFirstVisiblePosition() == 0) {
                i = childAt.getTop();
            } else {
                i = (-callLogActivity.A00.getHeight()) + 1;
            }
            View view = callLogActivity.A00;
            view.offsetTopAndBottom(i - view.getTop());
        } else if (callLogActivity.A00.getTop() != 0) {
            View view2 = callLogActivity.A00;
            view2.offsetTopAndBottom(-view2.getTop());
        }
    }
}
