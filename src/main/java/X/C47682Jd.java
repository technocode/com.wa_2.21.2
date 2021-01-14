package X;

import android.widget.AbsListView;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.2Jd  reason: invalid class name and case insensitive filesystem */
public class C47682Jd implements AbsListView.OnScrollListener {
    public final /* synthetic */ ConversationsFragment A00;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C47682Jd(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i != 0) {
            if (i == 1) {
                this.A00.A1i.A02(2);
            }
            C36901n6 r1 = this.A00.A0D;
            if (r1 != null) {
                r1.A02(3);
                return;
            }
            return;
        }
        this.A00.A1i.A01();
    }
}
