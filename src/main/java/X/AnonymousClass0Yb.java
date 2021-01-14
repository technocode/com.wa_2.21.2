package X;

import java.util.ArrayList;

/* renamed from: X.0Yb  reason: invalid class name */
public class AnonymousClass0Yb implements AnonymousClass0QD {
    public final int A00;
    public final int A01;
    public final String A02;
    public final /* synthetic */ AnonymousClass0LW A03;

    public AnonymousClass0Yb(AnonymousClass0LW r1, String str, int i, int i2) {
        this.A03 = r1;
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.AnonymousClass0QD
    public boolean A4X(ArrayList arrayList, ArrayList arrayList2) {
        AnonymousClass0LW r2 = this.A03;
        AnonymousClass037 r1 = r2.A03;
        if (r1 == null || this.A01 >= 0 || this.A02 != null || !r1.A0C().A0t()) {
            return r2.A0z(arrayList, arrayList2, this.A02, this.A01, this.A00);
        }
        return false;
    }
}
