package X;

import android.view.View;

/* renamed from: X.2mh  reason: invalid class name and case insensitive filesystem */
public class C58882mh extends C51262Ya {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C06330Su A02;
    public final /* synthetic */ AbstractC11910hD A03;
    public final /* synthetic */ C58912mk A04;

    public C58882mh(C58912mk r1, AbstractC11910hD r2, int i, int i2, C06330Su r5) {
        this.A04 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r5;
    }

    @Override // X.AbstractC14990nD
    public void ACk(View view) {
        this.A02.A06(null);
        C58912mk r2 = this.A04;
        AbstractC11910hD r1 = this.A03;
        r2.A05(r1);
        r2.A04.remove(r1);
        if (!r2.A06()) {
            r2.A03();
        }
    }

    @Override // X.AbstractC14990nD
    public void ACo(View view) {
        if (this.A04 == null) {
            throw null;
        }
    }
}
