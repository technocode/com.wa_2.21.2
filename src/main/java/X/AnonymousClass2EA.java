package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2EA  reason: invalid class name */
public class AnonymousClass2EA implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass0YW A00;

    public AnonymousClass2EA(AnonymousClass0YW r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        AnonymousClass0YW r1 = this.A00;
        r1.A07.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        r1.A0N.AN4();
    }
}
