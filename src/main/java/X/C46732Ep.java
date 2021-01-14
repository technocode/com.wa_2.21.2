package X;

import android.widget.AbsListView;
import com.whatsapp.chatinfo.ChatInfoLayout;

/* renamed from: X.2Ep  reason: invalid class name and case insensitive filesystem */
public class C46732Ep implements AbsListView.OnScrollListener {
    public final /* synthetic */ ChatInfoLayout A00;

    public C46732Ep(ChatInfoLayout chatInfoLayout) {
        this.A00 = chatInfoLayout;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ChatInfoLayout.A00(this.A00);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ChatInfoLayout.A00(this.A00);
    }
}
