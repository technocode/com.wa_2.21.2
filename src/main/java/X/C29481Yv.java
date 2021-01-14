package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.1Yv  reason: invalid class name and case insensitive filesystem */
public class C29481Yv {
    public LinkedList A00 = new LinkedList();

    public C29481Yv() {
    }

    public C29481Yv(byte[] bArr) {
        for (AnonymousClass2BB r2 : ((AnonymousClass2BA) AnonymousClass078.A02(AnonymousClass2BA.A01, bArr)).A00) {
            this.A00.add(new AnonymousClass1Yw(r2));
        }
    }

    public byte[] A00() {
        AbstractC04160Jh A0B = AnonymousClass2BA.A01.AQb();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            AnonymousClass2BB r3 = ((AnonymousClass1Yw) it.next()).A00;
            A0B.A02();
            AnonymousClass2BA r2 = (AnonymousClass2BA) A0B.A00;
            if (r3 != null) {
                AbstractC04120Jd r1 = r2.A00;
                if (!((AbstractC05040Mx) r1).A00) {
                    r1 = AnonymousClass078.A04(r1);
                    r2.A00 = r1;
                }
                r1.add(r3);
            } else {
                throw null;
            }
        }
        return A0B.A01().A09();
    }
}
