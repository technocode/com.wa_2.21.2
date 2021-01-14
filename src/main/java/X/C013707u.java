package X;

import android.os.Handler;

/* renamed from: X.07u  reason: invalid class name and case insensitive filesystem */
public class C013707u implements AbstractC005102k {
    public static final C013707u A08 = new C013707u();
    public int A00 = 0;
    public int A01 = 0;
    public Handler A02;
    public AnonymousClass081 A03 = new AnonymousClass080(this);
    public Runnable A04 = new RunnableEBaseShape0S0100000_I0_0(this, 19);
    public boolean A05 = true;
    public boolean A06 = true;
    public final C013807v A07 = new C013807v(this);

    public void A00() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i != 1) {
            return;
        }
        if (this.A05) {
            this.A07.A04(AnonymousClass082.ON_RESUME);
            this.A05 = false;
            return;
        }
        this.A02.removeCallbacks(this.A04);
    }

    @Override // X.AbstractC005102k
    public AbstractC013907w A75() {
        return this.A07;
    }
}
