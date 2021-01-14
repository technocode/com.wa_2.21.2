package X;

import java.util.HashSet;
import java.util.List;

/* renamed from: X.3Qy  reason: invalid class name and case insensitive filesystem */
public class C71953Qy extends AnonymousClass0SD implements AnonymousClass2Q8 {
    public List A00;
    public final C02270Bi A01 = new C02270Bi();
    public final C53492dM A02;

    public C71953Qy(C662733o r2, C53492dM r3) {
        this.A02 = r3;
        r2.A00 = new C71943Qx(this);
        r2.A02();
    }

    @Override // X.AnonymousClass2Q8
    public void AJi(AnonymousClass2Q9 r5) {
        List list = r5.A01;
        HashSet hashSet = new HashSet(list.size());
        for (int i = 0; i < list.size(); i++) {
            hashSet.add(list.get(i));
        }
        this.A01.A07(C002001d.A2G(hashSet, this.A00));
    }
}
