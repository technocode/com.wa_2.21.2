package X;

import android.util.SparseBooleanArray;

/* renamed from: X.3QN  reason: invalid class name */
public class AnonymousClass3QN implements AnonymousClass34f {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3QO A01;

    @Override // X.AnonymousClass34f
    public void AH4() {
    }

    public AnonymousClass3QN(AnonymousClass3QO r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // X.AnonymousClass34f
    public void AKx() {
        AnonymousClass33O r0 = this.A01.A04;
        int i = this.A00;
        SparseBooleanArray sparseBooleanArray = r0.A00;
        if (sparseBooleanArray != null) {
            sparseBooleanArray.put(i, true);
        }
    }
}
