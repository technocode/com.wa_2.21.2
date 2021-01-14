package X;

import android.widget.AbsListView;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;

/* renamed from: X.2It  reason: invalid class name */
public class AnonymousClass2It implements AbsListView.OnScrollListener {
    public int A00;
    public int A01;
    public final /* synthetic */ StarredMessagesActivity A02;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public AnonymousClass2It(StarredMessagesActivity starredMessagesActivity) {
        this.A02 = starredMessagesActivity;
    }

    public final void A00(int i, int i2) {
        AbstractC007503q A04;
        StarredMessagesActivity starredMessagesActivity = this.A02;
        int count = starredMessagesActivity.A03.getCount();
        while (i <= i2) {
            int headerViewsCount = i - starredMessagesActivity.A0T().getHeaderViewsCount();
            if (headerViewsCount >= 0 && headerViewsCount <= count - 1 && (A04 = starredMessagesActivity.A03.getItem(headerViewsCount)) != null && A04.A0m == 13) {
                starredMessagesActivity.A3i(A04.A0n);
            }
            i++;
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        if (!(i2 == 0 || (i4 = this.A01) == 0)) {
            int i5 = i + i2;
            int i6 = this.A00;
            int i7 = i4 + i6;
            if (i6 < i) {
                A00(i6, i - 1);
            } else if (i5 < i7) {
                A00(i5 + 1, i7);
            }
        }
        this.A00 = i;
        this.A01 = i2;
    }
}
