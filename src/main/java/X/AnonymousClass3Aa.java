package X;

import android.content.Intent;

/* renamed from: X.3Aa  reason: invalid class name */
public abstract class AnonymousClass3Aa {
    public Intent A00;
    public ActivityC004702f A01;

    public void A00() {
        ActivityC004702f r3 = this.A01;
        AnonymousClass0LW A04 = r3.A04();
        if (A04.A03() <= 1) {
            r3.setResult(0, this.A00);
            this.A01.finish();
            return;
        }
        A04.A0C();
        A04.A0A();
    }
}
