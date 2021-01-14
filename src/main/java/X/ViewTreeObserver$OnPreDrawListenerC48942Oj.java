package X;

import android.view.ViewTreeObserver;

/* renamed from: X.2Oj  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC48942Oj implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C53812ds A00;
    public final /* synthetic */ C59592ny A01;

    public ViewTreeObserver$OnPreDrawListenerC48942Oj(C53812ds r1, C59592ny r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean onPreDraw() {
        this.A01.getViewTreeObserver().removeOnPreDrawListener(this);
        ActivityC004902h A0A = this.A00.A04.A0A();
        if (A0A != null) {
            AnonymousClass0TX.A0E(A0A);
            return true;
        }
        throw null;
    }
}
