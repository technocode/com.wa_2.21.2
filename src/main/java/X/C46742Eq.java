package X;

import android.widget.AbsListView;
import com.whatsapp.chatinfo.ChatInfoLayout;

/* renamed from: X.2Eq  reason: invalid class name and case insensitive filesystem */
public class C46742Eq implements AbsListView.OnScrollListener {
    public final /* synthetic */ AnonymousClass2Er A00;

    public C46742Eq(AnonymousClass2Er r1) {
        this.A00 = r1;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ChatInfoLayout.A00(this.A00.A01);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ChatInfoLayout.A00(this.A00.A01);
    }
}
