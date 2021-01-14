package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.1Lf  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC26511Lf implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C40011sT A01;

    public ViewTreeObserver$OnPreDrawListenerC26511Lf(C40011sT r1, View view) {
        this.A01 = r1;
        this.A00 = view;
    }

    public boolean onPreDraw() {
        View view = this.A00;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        C40011sT r0 = this.A01;
        view.post(new RunnableEBaseShape2S0300000_I1(this, r0.A00, r0.A03, 13));
        return true;
    }
}
