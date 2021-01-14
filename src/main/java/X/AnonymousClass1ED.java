package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.transformation.ExpandableBehavior;

/* renamed from: X.1ED  reason: invalid class name */
public class AnonymousClass1ED implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AbstractC08020aL A02;
    public final /* synthetic */ ExpandableBehavior A03;

    public AnonymousClass1ED(ExpandableBehavior expandableBehavior, View view, int i, AbstractC08020aL r4) {
        this.A03 = expandableBehavior;
        this.A01 = view;
        this.A00 = i;
        this.A02 = r4;
    }

    public boolean onPreDraw() {
        View view = this.A01;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.A03;
        if (expandableBehavior.A00 == this.A00) {
            AbstractC08020aL r0 = this.A02;
            expandableBehavior.A07((View) r0, view, r0.AB2(), false);
        }
        return false;
    }
}
