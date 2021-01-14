package X;

import android.os.Build;
import android.view.ViewTreeObserver;
import com.whatsapp.Conversation;

/* renamed from: X.1LA  reason: invalid class name */
public class AnonymousClass1LA implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Conversation A00;

    public AnonymousClass1LA(Conversation conversation) {
        this.A00 = conversation;
    }

    public void onGlobalLayout() {
        AnonymousClass377 r0;
        ScaleGestureDetector$OnScaleGestureListenerC669436n r02;
        Conversation conversation = this.A00;
        if (C06170Sb.A01(conversation.A0E)) {
            conversation.A0Y.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            conversation.A0t();
            if (Build.VERSION.SDK_INT >= 19 && (r0 = conversation.A1D) != null && r0.A0E && (r02 = conversation.A1C) != null) {
                r02.requestLayout();
            }
        }
    }
}
