package X;

import java.util.ArrayList;

/* renamed from: X.3Dt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68583Dt implements AbstractC61222sp {
    public final /* synthetic */ AbstractC61272su A00;
    public final /* synthetic */ C61282sv A01;

    public /* synthetic */ C68583Dt(C61282sv r1, AbstractC61272su r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC61222sp
    public final void AEy(C43761yu r4, ArrayList arrayList, C61072sS r6) {
        C61282sv r0 = this.A01;
        AbstractC61272su r2 = this.A00;
        if (r6 == null) {
            r0.A08.A01().A01(r4, new C68573Ds(r2, arrayList));
        } else {
            r2.AJf(null, r6);
        }
    }
}
