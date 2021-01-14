package X;

import android.view.View;

/* renamed from: X.35p  reason: invalid class name and case insensitive filesystem */
public class C667335p {
    public final View A00;
    public final AbstractC007503q A01;
    public final AnonymousClass0D9 A02;
    public final AbstractC667235o A03;
    public final Object A04;
    public final boolean A05;

    public C667335p(AbstractC007503q r1, View view, AnonymousClass0D9 r3, AbstractC667235o r4, Object obj, boolean z) {
        this.A01 = r1;
        this.A00 = view;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = obj;
        this.A05 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C667335p.class != obj.getClass()) {
            return false;
        }
        return this.A01.A0n.equals(((C667335p) obj).A01.A0n);
    }

    public int hashCode() {
        return this.A01.A0n.hashCode();
    }
}
