package X;

import android.view.KeyEvent;

/* renamed from: X.1sq  reason: invalid class name and case insensitive filesystem */
public class C40221sq implements AbstractC26561Lk {
    public final /* synthetic */ AnonymousClass1MN A00;

    public C40221sq(AnonymousClass1MN r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        this.A00.A05.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        C002001d.A2l(this.A00.A05, iArr, 1024);
    }
}
