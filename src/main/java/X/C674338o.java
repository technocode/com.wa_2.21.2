package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.voipcalling.CallLogActivity;

/* renamed from: X.38o  reason: invalid class name and case insensitive filesystem */
public class C674338o implements AbsListView.OnScrollListener {
    public final /* synthetic */ CallLogActivity A00;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C674338o(CallLogActivity callLogActivity) {
        this.A00 = callLogActivity;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        CallLogActivity callLogActivity = this.A00;
        View childAt = callLogActivity.A02.getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (callLogActivity.A02.getWidth() > callLogActivity.A02.getHeight()) {
            if (callLogActivity.A02.getFirstVisiblePosition() == 0) {
                i4 = childAt.getTop();
            } else {
                i4 = (-callLogActivity.A00.getHeight()) + 1;
            }
            View view = callLogActivity.A00;
            view.offsetTopAndBottom(i4 - view.getTop());
        } else if (callLogActivity.A00.getTop() != 0) {
            View view2 = callLogActivity.A00;
            view2.offsetTopAndBottom(-view2.getTop());
        }
    }
}
