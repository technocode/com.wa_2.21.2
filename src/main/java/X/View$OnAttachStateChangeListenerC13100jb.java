package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0jb  reason: invalid class name and case insensitive filesystem */
public class View$OnAttachStateChangeListenerC13100jb implements View.OnAttachStateChangeListener {
    public final /* synthetic */ AnonymousClass23P A00;

    public void onViewAttachedToWindow(View view) {
    }

    public View$OnAttachStateChangeListenerC13100jb(AnonymousClass23P r1) {
        this.A00 = r1;
    }

    public void onViewDetachedFromWindow(View view) {
        AnonymousClass23P r2 = this.A00;
        ViewTreeObserver viewTreeObserver = r2.A04;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                r2.A04 = view.getViewTreeObserver();
            }
            r2.A04.removeGlobalOnLayoutListener(r2.A0F);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
