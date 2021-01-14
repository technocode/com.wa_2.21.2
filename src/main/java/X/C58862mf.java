package X;

import android.view.View;

/* renamed from: X.2mf  reason: invalid class name and case insensitive filesystem */
public class C58862mf extends C51262Ya {
    public final /* synthetic */ C06330Su A00;
    public final /* synthetic */ AbstractC11910hD A01;
    public final /* synthetic */ C58912mk A02;

    public C58862mf(C58912mk r1, AbstractC11910hD r2, C06330Su r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    @Override // X.AbstractC14990nD
    public void ACk(View view) {
        this.A00.A06(null);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        C58912mk r2 = this.A02;
        AbstractC11910hD r1 = this.A01;
        r2.A05(r1);
        r2.A0A.remove(r1);
        if (!r2.A06()) {
            r2.A03();
        }
    }

    @Override // X.AbstractC14990nD
    public void ACo(View view) {
        if (this.A02 == null) {
            throw null;
        }
    }
}
