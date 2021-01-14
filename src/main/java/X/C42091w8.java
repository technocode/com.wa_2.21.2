package X;

import android.graphics.Bitmap;

/* renamed from: X.1w8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42091w8 implements AbstractC27871Rx {
    public final /* synthetic */ AbstractC27871Rx A00;
    public final /* synthetic */ AnonymousClass1S0 A01;

    public /* synthetic */ C42091w8(AnonymousClass1S0 r1, AbstractC27871Rx r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC27871Rx
    public final void AHF(C42301wU r3, Bitmap bitmap, boolean z) {
        AnonymousClass1S0 r0 = this.A01;
        AbstractC27871Rx r1 = this.A00;
        if (!z) {
            r0.A02.remove(r3);
        }
        r1.AHF(r3, bitmap, z);
    }
}
