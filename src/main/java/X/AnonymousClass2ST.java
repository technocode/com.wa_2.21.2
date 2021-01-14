package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2ST  reason: invalid class name */
public class AnonymousClass2ST implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AbstractC49792Sd A00;

    public AnonymousClass2ST(AbstractC49792Sd r1) {
        this.A00 = r1;
    }

    public boolean onPreDraw() {
        AbstractC49792Sd r2 = this.A00;
        r2.A0J.getViewTreeObserver().removeOnPreDrawListener(this);
        r2.A0G(r2.A0J.getHeight());
        r2.A0Q(false);
        r2.A0T(false, null);
        return true;
    }
}
