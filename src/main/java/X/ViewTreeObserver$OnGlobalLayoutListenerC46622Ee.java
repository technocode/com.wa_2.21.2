package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoLayout;

/* renamed from: X.2Ee  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC46622Ee implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ Adapter A03;
    public final /* synthetic */ ChatInfoLayout A04;

    public /* synthetic */ ViewTreeObserver$OnGlobalLayoutListenerC46622Ee(ChatInfoLayout chatInfoLayout, View view, Adapter adapter, View view2, View view3) {
        this.A04 = chatInfoLayout;
        this.A00 = view;
        this.A03 = adapter;
        this.A01 = view2;
        this.A02 = view3;
    }

    public final void onGlobalLayout() {
        ChatInfoLayout chatInfoLayout = this.A04;
        View view = this.A00;
        Adapter adapter = this.A03;
        View view2 = this.A01;
        View view3 = this.A02;
        if (chatInfoLayout.A0D.isLayoutRequested()) {
            return;
        }
        if (chatInfoLayout.getHeight() >= chatInfoLayout.getWidth()) {
            int max = Math.max(chatInfoLayout.getMeasuredHeight() - ((((view.getMeasuredHeight() - chatInfoLayout.getMeasuredWidth()) + (adapter.getCount() * chatInfoLayout.getResources().getDimensionPixelSize(R.dimen.small_list_row_height))) + view2.getMeasuredHeight()) + ((int) (((float) chatInfoLayout.A09.getMeasuredWidth()) * 0.5625f))), 0) + chatInfoLayout.getResources().getDimensionPixelSize(R.dimen.card_v_padding2);
            if (view3.getPaddingBottom() != max) {
                view3.setPadding(0, 0, 0, max);
            }
        } else if (view3.getPaddingBottom() != 0) {
            view3.setPadding(0, 0, 0, 0);
        }
    }
}
