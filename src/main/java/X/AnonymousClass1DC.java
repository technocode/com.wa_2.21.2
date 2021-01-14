package X;

import android.view.View;

/* renamed from: X.1DC  reason: invalid class name */
public class AnonymousClass1DC {
    public int A00;
    public int A01;
    public int A02;
    public final View A03;

    public AnonymousClass1DC(View view) {
        this.A03 = view;
    }

    public final void A00() {
        View view = this.A03;
        AnonymousClass0Q7.A0U(view, this.A02 - (view.getTop() - this.A01));
        AnonymousClass0Q7.A0T(view, 0 - (view.getLeft() - this.A00));
    }

    public boolean A01(int i) {
        if (this.A02 == i) {
            return false;
        }
        this.A02 = i;
        A00();
        return true;
    }
}
