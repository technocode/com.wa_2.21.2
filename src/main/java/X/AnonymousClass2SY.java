package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2SY  reason: invalid class name */
public class AnonymousClass2SY implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AbstractC49792Sd A00;

    public AnonymousClass2SY(AbstractC49792Sd r1) {
        this.A00 = r1;
    }

    public boolean onPreDraw() {
        AbstractC49792Sd r4 = this.A00;
        r4.A0A.getViewTreeObserver().removeOnPreDrawListener(this);
        AnonymousClass2SS r2 = r4.A0d;
        r2.A02.A00((float) r4.A0A.getHeight());
        r4.A0J(r4.A02(), r4.A00(), null, false);
        r4.A0S(true, null);
        return true;
    }
}
