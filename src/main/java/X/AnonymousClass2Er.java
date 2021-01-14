package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.chatinfo.ChatInfoLayout;

/* renamed from: X.2Er  reason: invalid class name */
public class AnonymousClass2Er extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ChatInfoLayout A01;

    public AnonymousClass2Er(ChatInfoLayout chatInfoLayout, int i) {
        this.A01 = chatInfoLayout;
        this.A00 = i;
    }

    public void run() {
        ChatInfoLayout chatInfoLayout = this.A01;
        View childAt = chatInfoLayout.A0D.getChildAt(0);
        if (childAt != null && chatInfoLayout.A0D.getFirstVisiblePosition() == 0) {
            int top = childAt.getTop();
            int i = this.A00;
            if (top != i) {
                chatInfoLayout.A0D.setSelectionFromTop(0, i);
                chatInfoLayout.A0D.post(this);
                return;
            }
            Activity activity = (Activity) chatInfoLayout.getContext();
            if (activity != null) {
                AnonymousClass0TX.A0E(activity);
                chatInfoLayout.A0D.setOnScrollListener(new C46742Eq(this));
                return;
            }
            throw null;
        }
    }
}
