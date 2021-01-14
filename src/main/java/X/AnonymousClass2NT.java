package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2NT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2NT implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C53392d8 A00;

    public /* synthetic */ AnonymousClass2NT(C53392d8 r1) {
        this.A00 = r1;
    }

    public final void onGlobalLayout() {
        boolean A01;
        C53392d8 r2 = this.A00;
        if (((AnonymousClass1MI) r2).A02.getResources().getConfiguration().keyboard != 1) {
            A01 = false;
        } else {
            A01 = C06170Sb.A01(r2.A0C);
        }
        int i = A01 ? 1 : 0;
        int i2 = A01 ? 1 : 0;
        int i3 = A01 ? 1 : 0;
        ((AnonymousClass1MI) r2).A00 = i;
    }
}
