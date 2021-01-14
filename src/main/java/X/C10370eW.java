package X;

import java.util.Collection;

/* renamed from: X.0eW  reason: invalid class name and case insensitive filesystem */
public class C10370eW extends AnonymousClass0JW {
    public final int A00 = 200;
    public final C54692fL A01;
    public final AbstractC03920Ih A02;
    public final boolean A03;
    public final boolean A04;
    public final /* synthetic */ AnonymousClass2Q7 A05;

    public C10370eW(AnonymousClass2Q7 r2, C54692fL r3, AbstractC03920Ih r4, boolean z, boolean z2) {
        this.A05 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = z;
        this.A04 = z2;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Collection collection = (Collection) obj;
        AnonymousClass2Q7 r1 = this.A05;
        if (r1.A00 == this) {
            r1.A00 = null;
        }
        if (!super.A00.isCancelled()) {
            AnonymousClass2Q9 r12 = this.A01.A00;
            if (r12 != null) {
                AnonymousClass00E.A01();
                if (collection != null) {
                    r12.A01.addAll(collection);
                }
                AnonymousClass2Q8 r0 = r12.A00;
                if (r0 != null) {
                    r0.AJi(r12);
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
