package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2Dm  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Dm implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass0YW A00;

    public /* synthetic */ AnonymousClass2Dm(AnonymousClass0YW r1) {
        this.A00 = r1;
    }

    public final void onGlobalLayout() {
        AnonymousClass0YW r4 = this.A00;
        if ((r4.A07.getWidth() > r4.A07.getHeight() || !r4.A0k) && r4.A0J.A0B == 4) {
            if (r4.A03.getVisibility() != 8) {
                r4.A03.setVisibility(8);
            }
        } else if (r4.A03.getVisibility() != 0) {
            r4.A03.setVisibility(0);
        }
        if (r4.A07.getWidth() > r4.A07.getHeight() || r4.A0N.ABT() || !r4.A0m) {
            r4.A0F.setVisibility(8);
        } else {
            r4.A0F.setVisibility(0);
        }
    }
}
