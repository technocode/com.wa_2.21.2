package X;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: X.0js  reason: invalid class name and case insensitive filesystem */
public class C13240js implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener A00;
    public final /* synthetic */ AnonymousClass23S A01;

    public C13240js(AnonymousClass23S r1, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.A01 = r1;
        this.A00 = onGlobalLayoutListener;
    }

    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.A01.A04.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.A00);
        }
    }
}
