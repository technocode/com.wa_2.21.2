package X;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.whatsapp.chatinfo.ChatInfoLayout;

/* renamed from: X.2Eo  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC46722Eo implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ChatInfoLayout A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC46722Eo(ChatInfoLayout chatInfoLayout) {
        this.A00 = chatInfoLayout;
    }

    public void onGlobalLayout() {
        ChatInfoLayout chatInfoLayout = this.A00;
        chatInfoLayout.A02();
        chatInfoLayout.A0D.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (chatInfoLayout.getWidth() > chatInfoLayout.getHeight()) {
            Activity activity = (Activity) chatInfoLayout.getContext();
            if (activity != null) {
                AnonymousClass0TX.A0E(activity);
                chatInfoLayout.A0D.setOnScrollListener(new C46732Ep(chatInfoLayout));
                return;
            }
            throw null;
        }
        int measuredWidth = ((int) (((float) chatInfoLayout.getMeasuredWidth()) * 0.5625f)) - chatInfoLayout.getMeasuredWidth();
        AnonymousClass008.A0t("chatinfolayout/initial scroll ", measuredWidth);
        chatInfoLayout.A0D.setSelectionFromTop(0, measuredWidth);
        chatInfoLayout.setScrollPos(measuredWidth);
        chatInfoLayout.A0D.post(new AnonymousClass2Er(chatInfoLayout, measuredWidth));
    }
}
