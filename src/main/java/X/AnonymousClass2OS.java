package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2OS  reason: invalid class name */
public class AnonymousClass2OS implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass2OT A00;

    public AnonymousClass2OS(AnonymousClass2OT r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        AnonymousClass2OT r1 = this.A00;
        r1.A0P.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        AnonymousClass2OT.A00(r1);
        C53602dX r0 = r1.A0B;
        if (r0 != null) {
            ((AbstractC16300pa) r0).A01.A00();
        }
    }
}
