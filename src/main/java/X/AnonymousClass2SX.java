package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2SX  reason: invalid class name */
public class AnonymousClass2SX implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AbstractC49792Sd A00;

    public AnonymousClass2SX(AbstractC49792Sd r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        AbstractC49792Sd r4 = this.A00;
        r4.A0L.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        r4.A03 = r4.A0L.getMeasuredHeight();
        r4.A04 = (int) (((double) r4.A0L.getMeasuredHeight()) * 0.6d);
        r4.A0S(false, null);
    }
}
