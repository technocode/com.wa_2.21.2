package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0ez  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC10660ez extends AnonymousClass0JW {
    public final AbstractC48012Ko A00;
    public final C018709t A01;
    public final AbstractC449322f A02;
    public final AnonymousClass00T A03;

    public AbstractC10660ez(AnonymousClass00T r1, C018709t r2, AbstractC449322f r3, AbstractC48012Ko r4) {
        this.A03 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r4;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C48022Kp r3 = (C48022Kp) obj;
        AbstractC48012Ko r1 = this.A00;
        if (r1 != null && r3.A01) {
            r1.ACf(r3.A00);
        }
    }

    public C48022Kp A04(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1VM r3 = (AnonymousClass1VM) it.next();
            AnonymousClass2LO r1 = null;
            AbstractC07650Yy serviceBy = this.A02.getServiceBy(r3.A05.A02, (String) null);
            if (!(serviceBy == null || (r1 = serviceBy.A5Z()) == null)) {
                r1.A2B(r3);
            }
            arrayList.add(r3);
            if (r1 != null && !hashMap.containsKey(r3.A05.A02)) {
                hashMap.put(r3.A05.A02, r1);
            }
        }
        C018709t r4 = this.A01;
        boolean A0H = r4.A0H(arrayList);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (A0H && arrayList.size() > 0) {
            for (AnonymousClass2LO r0 : hashMap.values()) {
                r0.A1v(arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AnonymousClass1VM r8 = (AnonymousClass1VM) it2.next();
                AnonymousClass1VM A08 = r4.A08(r8.A07);
                if (A08 != null) {
                    arrayList2.add(A08);
                    byte[] bArr = A08.A0B;
                    if (bArr == null || bArr.length <= 0) {
                        this.A03.ANF(new RunnableEBaseShape0S0400000_I0(this, hashMap, r8, A08, 5));
                    }
                } else {
                    throw null;
                }
            }
        }
        return new C48022Kp(A0H, arrayList2);
    }
}
