package X;

import android.view.View;

/* renamed from: X.2mj  reason: invalid class name and case insensitive filesystem */
public class C58902mj extends C51262Ya {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C06330Su A01;
    public final /* synthetic */ C47032Ge A02;
    public final /* synthetic */ C58912mk A03;

    public C58902mj(C58912mk r1, C47032Ge r2, C06330Su r3, View view) {
        this.A03 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = view;
    }

    @Override // X.AbstractC14990nD
    public void ACk(View view) {
        this.A01.A06(null);
        View view2 = this.A00;
        view2.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        C58912mk r3 = this.A03;
        C47032Ge r2 = this.A02;
        r3.A05(r2.A04);
        r3.A02.remove(r2.A04);
        if (!r3.A06()) {
            r3.A03();
        }
    }

    @Override // X.AbstractC14990nD
    public void ACo(View view) {
        if (this.A03 == null) {
            throw null;
        }
    }
}
