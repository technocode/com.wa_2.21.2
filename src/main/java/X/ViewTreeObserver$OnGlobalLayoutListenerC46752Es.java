package X;

import android.view.ViewTreeObserver;
import com.whatsapp.chatinfo.ChatInfoLayout;

/* renamed from: X.2Es  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC46752Es implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ChatInfoLayout A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC46752Es(ChatInfoLayout chatInfoLayout) {
        this.A00 = chatInfoLayout;
    }

    public void onGlobalLayout() {
        ChatInfoLayout chatInfoLayout = this.A00;
        chatInfoLayout.A0D.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (!chatInfoLayout.A0L) {
            int measuredWidth = ((int) (((float) chatInfoLayout.getMeasuredWidth()) * 0.5625f)) - chatInfoLayout.getMeasuredWidth();
            chatInfoLayout.A0D.setSelectionFromTop(0, measuredWidth);
            chatInfoLayout.setScrollPos(measuredWidth);
        }
    }
}
