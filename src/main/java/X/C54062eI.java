package X;

import android.view.KeyEvent;

/* renamed from: X.2eI  reason: invalid class name and case insensitive filesystem */
public class C54062eI implements AbstractC26561Lk {
    public final /* synthetic */ AnonymousClass2P5 A00;

    public C54062eI(AnonymousClass2P5 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        this.A00.A01.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        C002001d.A2l(this.A00.A01, iArr, 1024);
    }
}
