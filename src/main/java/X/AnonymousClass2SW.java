package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2SW  reason: invalid class name */
public class AnonymousClass2SW implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC49792Sd A01;

    public AnonymousClass2SW(AbstractC49792Sd r2) {
        this.A01 = r2;
    }

    public void onGlobalLayout() {
        AbstractC49792Sd r2 = this.A01;
        boolean A012 = C06170Sb.A01(r2.A0Q);
        if (A012 != this.A00) {
            this.A00 = A012;
            r2.A0T(false, null);
        }
    }
}
