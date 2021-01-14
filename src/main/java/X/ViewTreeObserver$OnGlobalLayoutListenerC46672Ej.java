package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.chatinfo.ListChatInfo;

/* renamed from: X.2Ej  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC46672Ej implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ListChatInfo A00;

    public /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC46672Ej(ListChatInfo listChatInfo) {
        this.A00 = listChatInfo;
    }

    public final void onGlobalLayout() {
        int i;
        ListChatInfo listChatInfo = this.A00;
        View childAt = listChatInfo.A01.getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (listChatInfo.A01.getWidth() > listChatInfo.A01.getHeight()) {
            if (listChatInfo.A01.getFirstVisiblePosition() == 0) {
                i = childAt.getTop();
            } else {
                i = (-listChatInfo.A00.getHeight()) + 1;
            }
            View view = listChatInfo.A00;
            view.offsetTopAndBottom(i - view.getTop());
        } else if (listChatInfo.A00.getTop() != 0) {
            View view2 = listChatInfo.A00;
            view2.offsetTopAndBottom(-view2.getTop());
        }
    }
}
