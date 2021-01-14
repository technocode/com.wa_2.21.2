package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2OR  reason: invalid class name */
public class AnonymousClass2OR implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass2OT A00;

    public AnonymousClass2OR(AnonymousClass2OT r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        AnonymousClass2OT r1 = this.A00;
        r1.A0P.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        AnonymousClass2OT.A00(r1);
    }
}
