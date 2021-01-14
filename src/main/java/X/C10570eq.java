package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0eq  reason: invalid class name and case insensitive filesystem */
public class C10570eq extends AnonymousClass0JW {
    public final C52982cD A00;
    public final AnonymousClass2cQ A01;
    public final Map A02;

    public C10570eq(C52982cD r1, AnonymousClass2cQ r2, Map map) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = map;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C52982cD r1 = this.A00;
        Iterator it = ((AbstractCollection) r1.A06(r1.A00())).iterator();
        while (it.hasNext()) {
            AbstractC48432Mf r2 = (AbstractC48432Mf) it.next();
            this.A02.put(r2.A9J(), r2);
        }
        this.A01.A0A();
    }
}
