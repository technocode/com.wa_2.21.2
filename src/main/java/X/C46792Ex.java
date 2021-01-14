package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.chatinfo.ListChatInfo;

/* renamed from: X.2Ex  reason: invalid class name and case insensitive filesystem */
public class C46792Ex implements AbsListView.OnScrollListener {
    public final /* synthetic */ ListChatInfo A00;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C46792Ex(ListChatInfo listChatInfo) {
        this.A00 = listChatInfo;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        ListChatInfo listChatInfo = this.A00;
        View childAt = listChatInfo.A01.getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (listChatInfo.A01.getWidth() > listChatInfo.A01.getHeight()) {
            if (listChatInfo.A01.getFirstVisiblePosition() == 0) {
                i4 = childAt.getTop();
            } else {
                i4 = (-listChatInfo.A00.getHeight()) + 1;
            }
            View view = listChatInfo.A00;
            view.offsetTopAndBottom(i4 - view.getTop());
        } else if (listChatInfo.A00.getTop() != 0) {
            View view2 = listChatInfo.A00;
            view2.offsetTopAndBottom(-view2.getTop());
        }
    }
}
