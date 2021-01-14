package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.1Yt  reason: invalid class name */
public class AnonymousClass1Yt {
    public LinkedList A00 = new LinkedList();

    public AnonymousClass1Yt() {
    }

    public AnonymousClass1Yt(byte[] bArr) {
        for (AnonymousClass2B8 r2 : ((AnonymousClass2B7) AnonymousClass078.A02(AnonymousClass2B7.A01, bArr)).A00) {
            this.A00.add(new C29471Yu(r2));
        }
    }

    public C29471Yu A00() {
        if (!this.A00.isEmpty()) {
            return (C29471Yu) this.A00.get(0);
        }
        throw new C29371Yf("No key state in record!");
    }

    public byte[] A01() {
        AbstractC04160Jh A0B = AnonymousClass2B7.A01.AQb();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            AnonymousClass2B8 r3 = ((C29471Yu) it.next()).A00;
            A0B.A02();
            AnonymousClass2B7 r2 = (AnonymousClass2B7) A0B.A00;
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
