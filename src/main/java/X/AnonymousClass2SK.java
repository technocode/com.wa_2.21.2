package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.2SK  reason: invalid class name */
public class AnonymousClass2SK implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AbstractView$OnCreateContextMenuListenerC56112i5 A00;

    public AnonymousClass2SK(AbstractView$OnCreateContextMenuListenerC56112i5 r1) {
        this.A00 = r1;
    }

    public boolean onPreDraw() {
        AbstractView$OnCreateContextMenuListenerC56112i5 r1 = this.A00;
        if (r1.A0M.getHeight() <= 0 || !r1.A1N.isEmpty()) {
            return true;
        }
        r1.A0M.getViewTreeObserver().removeOnPreDrawListener(this);
        View view = r1.A0M;
        view.setTranslationY((float) view.getHeight());
        return true;
    }
}
