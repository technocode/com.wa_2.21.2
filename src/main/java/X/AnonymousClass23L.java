package X;

import android.view.View;

/* renamed from: X.23L  reason: invalid class name */
public class AnonymousClass23L extends C30131am {
    public int A00 = 0;
    public boolean A01 = false;
    public final /* synthetic */ C12960jN A02;

    public AnonymousClass23L(C12960jN r2) {
        this.A02 = r2;
    }

    @Override // X.AbstractC14990nD
    public void ACk(View view) {
        int i = this.A00 + 1;
        this.A00 = i;
        C12960jN r2 = this.A02;
        if (i == r2.A05.size()) {
            AbstractC14990nD r1 = r2.A02;
            if (r1 != null) {
                r1.ACk(null);
            }
            this.A00 = 0;
            this.A01 = false;
            r2.A03 = false;
        }
    }
}
