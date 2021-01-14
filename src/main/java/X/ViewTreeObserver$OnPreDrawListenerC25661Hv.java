package X;

import android.view.ViewTreeObserver;
import com.whatsapp.Conversation;

/* renamed from: X.1Hv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class ViewTreeObserver$OnPreDrawListenerC25661Hv implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ Conversation A00;

    public /* synthetic */ ViewTreeObserver$OnPreDrawListenerC25661Hv(Conversation conversation) {
        this.A00 = conversation;
    }

    public final boolean onPreDraw() {
        this.A00.A4P.A07();
        return true;
    }
}
