package X;

import java.util.ArrayList;

/* renamed from: X.1o5  reason: invalid class name and case insensitive filesystem */
public class C37361o5 implements AbstractC25321Gj {
    public final /* synthetic */ C011206s A00;

    public C37361o5(C011206s r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC25321Gj
    public boolean AR3(AnonymousClass05l r8) {
        AnonymousClass06d r4;
        AbstractC009505y r3;
        AbstractC008905s r82 = (AbstractC008905s) r8;
        AbstractC009505y r32 = r82.A03;
        if (r32 != null) {
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() == 0) {
                arrayList.add(C008805h.A0T(r82));
                this.A00.A00(r32, new C010106g(arrayList));
            } else {
                throw new IllegalArgumentException("arguments have to be continuous");
            }
        }
        for (AbstractC010006f r42 : r82.A06) {
            if ((r42 instanceof AnonymousClass06d) && (r3 = (r4 = (AnonymousClass06d) r42).A00) != null) {
                C011206s r2 = this.A00;
                ArrayList arrayList2 = new ArrayList();
                if (arrayList2.size() == 0) {
                    arrayList2.add(C008805h.A0T(r4));
                    r2.A00(r3, new C010106g(arrayList2));
                } else {
                    throw new IllegalArgumentException("arguments have to be continuous");
                }
            }
        }
        return false;
    }
}
