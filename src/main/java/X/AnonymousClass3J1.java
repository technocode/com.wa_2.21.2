package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3J1  reason: invalid class name */
public class AnonymousClass3J1 extends AnonymousClass0SD implements AnonymousClass2Q8 {
    public C02270Bi A00 = new C02270Bi();
    public C02270Bi A01 = new C02270Bi();
    public HashSet A02;
    public final C53492dM A03;

    public AnonymousClass3J1(C53492dM r4) {
        this.A03 = r4;
        this.A00.A07(new ArrayList(0));
        this.A01.A07(new ArrayList(0));
    }

    public void A02() {
        this.A01.A07(C002001d.A2G(this.A02, (List) this.A00.A01()));
    }

    @Override // X.AnonymousClass2Q8
    public void AJi(AnonymousClass2Q9 r5) {
        List list = r5.A01;
        HashSet hashSet = new HashSet(list.size());
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(list.get(i));
        }
        this.A02 = hashSet;
        A02();
    }
}
