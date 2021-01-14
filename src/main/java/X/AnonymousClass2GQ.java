package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2GQ  reason: invalid class name */
public class AnonymousClass2GQ implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ AnonymousClass2GR A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass2GQ(AnonymousClass2GR r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public boolean onPreDraw() {
        AnonymousClass2GR r1 = this.A00;
        r1.A0A.getViewTreeObserver().removeOnPreDrawListener(this);
        r1.A0A.A03(this.A01, true);
        return false;
    }
}
