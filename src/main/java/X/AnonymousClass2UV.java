package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.2UV  reason: invalid class name */
public final class AnonymousClass2UV implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;

    public AnonymousClass2UV(View view) {
        this.A00 = view;
    }

    public boolean onPreDraw() {
        View view = this.A00;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        View findViewById = view.findViewById(16908335);
        if (findViewById != null) {
            AnonymousClass0Q7.A0g(findViewById, "statusBar");
        }
        View findViewById2 = view.findViewById(16908336);
        if (findViewById2 == null) {
            return true;
        }
        AnonymousClass0Q7.A0g(findViewById2, "navigationBar");
        return true;
    }
}
