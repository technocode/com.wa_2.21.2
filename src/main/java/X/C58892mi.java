package X;

import android.view.View;

/* renamed from: X.2mi  reason: invalid class name and case insensitive filesystem */
public class C58892mi extends C51262Ya {
    public final /* synthetic */ C06330Su A00;
    public final /* synthetic */ C47032Ge A01;
    public final /* synthetic */ C58912mk A02;

    public C58892mi(C58912mk r1, C47032Ge r2, C06330Su r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    @Override // X.AbstractC14990nD
    public void ACk(View view) {
        this.A00.A06(null);
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C58912mk r3 = this.A02;
        C47032Ge r2 = this.A01;
        r3.A05(r2.A05);
        r3.A02.remove(r2.A05);
        if (!r3.A06()) {
            r3.A03();
        }
    }

    @Override // X.AbstractC14990nD
    public void ACo(View view) {
        if (this.A02 == null) {
            throw null;
        }
    }
}
