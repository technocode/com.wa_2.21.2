package X;

import android.util.SparseBooleanArray;

/* renamed from: X.3Q8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3Q8 implements AnonymousClass33F {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3QO A01;

    public /* synthetic */ AnonymousClass3Q8(AnonymousClass3QO r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // X.AnonymousClass33F
    public final void AKW(boolean z) {
        AnonymousClass3QO r0 = this.A01;
        int i = this.A00;
        SparseBooleanArray sparseBooleanArray = r0.A04.A00;
        if (sparseBooleanArray != null) {
            sparseBooleanArray.put(i, z);
        }
    }
}
