package X;

import com.whatsapp.util.Log;

/* renamed from: X.1w6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42071w6 implements AbstractC27861Rw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC27861Rw A01;
    public final /* synthetic */ C48072Ku A02;

    public /* synthetic */ C42071w6(C48072Ku r1, int i, AbstractC27861Rw r3) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = r3;
    }

    @Override // X.AbstractC27861Rw
    public final void AH7(C42301wU r6) {
        C48072Ku r4 = this.A02;
        int i = this.A00;
        AbstractC27861Rw r2 = this.A01;
        StringBuilder A0S = AnonymousClass008.A0S("loadProductImage failed  ");
        A0S.append(r4.A02);
        A0S.append(" quality ");
        A0S.append(i);
        Log.d(A0S.toString());
        if (r2 != null) {
            r2.AH7(r6);
        }
    }
}
