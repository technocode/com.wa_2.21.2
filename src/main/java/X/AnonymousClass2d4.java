package X;

import android.view.KeyEvent;

/* renamed from: X.2d4  reason: invalid class name */
public class AnonymousClass2d4 implements AbstractC26561Lk {
    public final /* synthetic */ AnonymousClass2d6 A00;

    public AnonymousClass2d4(AnonymousClass2d6 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        this.A00.A01.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        AnonymousClass2d6 r0 = this.A00;
        C002001d.A2l(r0.A01, iArr, r0.A0B);
    }
}
