package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.MessageReplyActivity;
import com.whatsapp.status.playback.StatusReplyActivity;

/* renamed from: X.32P  reason: invalid class name */
public class AnonymousClass32P implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ StatusReplyActivity A00;

    public AnonymousClass32P(StatusReplyActivity statusReplyActivity) {
        this.A00 = statusReplyActivity;
    }

    public void onGlobalLayout() {
        int i;
        int identifier;
        C59842oN r0;
        StatusReplyActivity statusReplyActivity = this.A00;
        View view = ((MessageReplyActivity) statusReplyActivity).A02;
        Rect rect = statusReplyActivity.A00;
        view.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        ((MessageReplyActivity) statusReplyActivity).A02.getLocationOnScreen(iArr);
        int measuredHeight = rect.bottom - ((MessageReplyActivity) statusReplyActivity).A01.getMeasuredHeight();
        if (C06170Sb.A01(((MessageReplyActivity) statusReplyActivity).A02) || (r0 = ((MessageReplyActivity) statusReplyActivity).A0C) == null || !r0.isShowing()) {
            i = 0;
        } else {
            i = ((AnonymousClass1MI) ((MessageReplyActivity) statusReplyActivity).A0C).A01;
        }
        int i2 = (measuredHeight - i) - iArr[1];
        if (C006803i.A0j() && (identifier = statusReplyActivity.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            i2 -= statusReplyActivity.getResources().getDimensionPixelSize(identifier);
        }
        View view2 = ((MessageReplyActivity) statusReplyActivity).A01;
        AnonymousClass0Q7.A0U(view2, i2 - view2.getTop());
        View view3 = ((MessageReplyActivity) statusReplyActivity).A02;
        Runnable runnable = statusReplyActivity.A03;
        view3.removeCallbacks(runnable);
        ((MessageReplyActivity) statusReplyActivity).A02.postDelayed(runnable, (long) statusReplyActivity.getResources().getInteger(17694722));
    }
}
