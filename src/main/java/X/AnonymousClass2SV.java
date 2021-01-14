package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.2SV  reason: invalid class name */
public class AnonymousClass2SV implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AbstractC49792Sd A01;
    public final /* synthetic */ Float A02;

    public AnonymousClass2SV(AbstractC49792Sd r1, View view, Float f) {
        this.A01 = r1;
        this.A00 = view;
        this.A02 = f;
    }

    public void onGlobalLayout() {
        View view = this.A00;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.A01.A0H(view.getMeasuredHeight(), false, this.A02);
    }
}
