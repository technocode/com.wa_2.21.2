package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0jR  reason: invalid class name and case insensitive filesystem */
public class View$OnAttachStateChangeListenerC13000jR implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AnonymousClass23N A00;

    public void onViewAttachedToWindow(View view) {
    }

    public View$OnAttachStateChangeListenerC13000jR(AnonymousClass23N r1) {
        this.A00 = r1;
    }

    public void onViewDetachedFromWindow(View view) {
        AnonymousClass23N r2 = this.A00;
        ViewTreeObserver viewTreeObserver = r2.A07;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                r2.A07 = view.getViewTreeObserver();
            }
            r2.A07.removeGlobalOnLayoutListener(r2.A0L);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
