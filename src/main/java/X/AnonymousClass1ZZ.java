package X;

import android.view.View;

/* renamed from: X.1ZZ  reason: invalid class name */
public class AnonymousClass1ZZ implements AbstractC14990nD {
    public int A00;
    public boolean A01 = false;
    public final /* synthetic */ AbstractC06350Sx A02;

    public AnonymousClass1ZZ(AbstractC06350Sx r2) {
        this.A02 = r2;
    }

    @Override // X.AbstractC14990nD
    public void ACi(View view) {
        this.A01 = true;
    }

    @Override // X.AbstractC14990nD
    public void ACk(View view) {
        if (!this.A01) {
            AbstractC06350Sx r1 = this.A02;
            r1.A03 = null;
            AnonymousClass1ZZ.super.setVisibility(this.A00);
        }
    }

    @Override // X.AbstractC14990nD
    public void ACo(View view) {
        AnonymousClass1ZZ.super.setVisibility(0);
        this.A01 = false;
    }
}
