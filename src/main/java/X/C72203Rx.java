package X;

import android.view.KeyEvent;

/* renamed from: X.3Rx  reason: invalid class name and case insensitive filesystem */
public class C72203Rx implements AbstractC26561Lk {
    public final /* synthetic */ C665134q A00;

    public C72203Rx(C665134q r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        this.A00.A03.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        C002001d.A2l(this.A00.A03, iArr, 1024);
    }
}
