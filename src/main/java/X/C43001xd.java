package X;

import java.util.ArrayList;

/* renamed from: X.1xd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C43001xd implements AnonymousClass1MK {
    public final /* synthetic */ AnonymousClass05q A00;
    public final /* synthetic */ C43231y0 A01;
    public final /* synthetic */ AnonymousClass2B0 A02;

    public /* synthetic */ C43001xd(AnonymousClass2B0 r1, C43231y0 r2, AnonymousClass05q r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    @Override // X.AnonymousClass1MK
    public final void A2l() {
        AnonymousClass2B0 r1 = this.A02;
        C43231y0 r0 = this.A01;
        AnonymousClass05q r4 = this.A00;
        AbstractC009505y r3 = r1.A01;
        if (r3 != null) {
            ArrayList arrayList = new ArrayList();
            String str = r0.A02;
            if (arrayList.size() == 0) {
                arrayList.add(C008805h.A0T(str));
                C008805h.A0P(r3, new C010106g(arrayList), r4);
                return;
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
    }
}
