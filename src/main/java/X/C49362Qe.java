package X;

import android.widget.AbsListView;
import com.whatsapp.group.GroupParticipantsSearchFragment;

/* renamed from: X.2Qe  reason: invalid class name and case insensitive filesystem */
public class C49362Qe implements AbsListView.OnScrollListener {
    public int A00 = 0;
    public final /* synthetic */ GroupParticipantsSearchFragment A01;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public C49362Qe(GroupParticipantsSearchFragment groupParticipantsSearchFragment) {
        this.A01 = groupParticipantsSearchFragment;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        int i2 = this.A00;
        if (i2 == 0 && i != i2) {
            this.A01.A04.A02(absListView);
        }
        this.A00 = i;
    }
}
