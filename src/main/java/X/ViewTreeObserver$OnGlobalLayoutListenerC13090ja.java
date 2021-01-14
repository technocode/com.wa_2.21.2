package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0ja  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC13090ja implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass23P A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC13090ja(AnonymousClass23P r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        AnonymousClass23P r2 = this.A00;
        if (r2.ABa()) {
            AnonymousClass23U r1 = r2.A0I;
            if (!r1.A0G) {
                View view = r2.A03;
                if (view == null || !view.isShown()) {
                    r2.dismiss();
                } else {
                    r1.APf();
                }
            }
        }
    }
}
