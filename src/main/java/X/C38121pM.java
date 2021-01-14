package X;

import java.util.LinkedList;

/* renamed from: X.1pM  reason: invalid class name and case insensitive filesystem */
public class C38121pM implements AbstractC25321Gj {
    public final AnonymousClass1H0 A00;

    public C38121pM(AnonymousClass1H0 r1) {
        this.A00 = r1;
    }

    /* renamed from: A00 */
    public boolean AR3(AbstractC008905s r4) {
        LinkedList<C37971p5> linkedList = r4.A05;
        if (linkedList == null) {
            return false;
        }
        for (C37971p5 r1 : linkedList) {
            if (this.A00.AR4(r1)) {
                return true;
            }
        }
        return false;
    }
}
