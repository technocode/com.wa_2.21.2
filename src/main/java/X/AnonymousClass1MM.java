package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.1MM  reason: invalid class name */
public class AnonymousClass1MM implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass1MN A00;

    public AnonymousClass1MM(AnonymousClass1MN r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        AnonymousClass1MN r1 = this.A00;
        if (C06170Sb.A01(r1.A01)) {
            if (!r1.A06.isShowing()) {
                View view = r1.A00;
                if (view.getVisibility() == 8) {
                    view.startAnimation(AnonymousClass1MN.A00(true));
                    view.setVisibility(0);
                }
            }
        } else if (!r1.A06.isShowing()) {
            View view2 = r1.A00;
            if (view2.getVisibility() == 0) {
                view2.startAnimation(AnonymousClass1MN.A00(false));
                view2.setVisibility(8);
            }
        }
    }
}
