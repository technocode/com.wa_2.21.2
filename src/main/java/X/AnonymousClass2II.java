package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2II  reason: invalid class name */
public class AnonymousClass2II implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C51742Zx A00;

    public AnonymousClass2II(C51742Zx r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        C51742Zx r1 = this.A00;
        r1.A00.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        AnonymousClass2IJ r12 = r1.A01;
        r12.A00 = -1;
        r12.invalidateSelf();
    }
}
