package X;

import android.view.View;

/* renamed from: X.23V  reason: invalid class name */
public class AnonymousClass23V extends C30131am {
    public boolean A00 = false;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C08290ao A02;

    public AnonymousClass23V(C08290ao r2, int i) {
        this.A02 = r2;
        this.A01 = i;
    }

    @Override // X.AbstractC14990nD
    public void ACk(View view) {
        if (!this.A00) {
            this.A02.A09.setVisibility(this.A01);
        }
    }
}
