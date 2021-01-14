package X;

import java.util.List;

/* renamed from: X.2Pt  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC49272Pt {
    public void A00() {
        if (this instanceof AnonymousClass3Io) {
            ((AnonymousClass3Io) this).A00.A01();
        } else if (this instanceof C54442ev) {
            ((C54442ev) this).A00.A0B.A01();
        }
    }

    public void A01(AnonymousClass2Q3 r8) {
        if (this instanceof AnonymousClass3Io) {
            AnonymousClass3Z4 r6 = ((AnonymousClass3Io) this).A00;
            C59912oU r5 = (C59912oU) r6.A00();
            int i = -1;
            for (int i2 = 0; i2 < r5.A02.size(); i2++) {
                if (((AnonymousClass2Q3) r5.A02.get(i2)).A5u().equals(r8.A5u())) {
                    i = i2;
                }
            }
            if (i != -1) {
                List list = r5.A02;
                list.remove(list.get(i));
                ((AbstractC16300pa) r5).A01.A00();
            }
            r6.A01();
        } else if (this instanceof C54442ev) {
            ((C54442ev) this).A00.A0B.A01();
        }
    }
}
