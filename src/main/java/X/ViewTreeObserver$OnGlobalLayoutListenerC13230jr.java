package X;

import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0jr  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC13230jr implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AnonymousClass23S A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC13230jr(AnonymousClass23S r1) {
        this.A00 = r1;
    }

    public void onGlobalLayout() {
        AnonymousClass23S r2 = this.A00;
        AppCompatSpinner appCompatSpinner = r2.A04;
        if (!AnonymousClass0Q7.A0i(appCompatSpinner) || !appCompatSpinner.getGlobalVisibleRect(r2.A03)) {
            r2.dismiss();
            return;
        }
        r2.A01();
        ViewTreeObserver$OnGlobalLayoutListenerC13230jr.super.APf();
    }
}
