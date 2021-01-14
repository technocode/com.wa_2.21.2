package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0bY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C08690bY implements AnonymousClass0RN {
    public final /* synthetic */ C08670bW A00;

    public /* synthetic */ C08690bY(C08670bW r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0RN
    public final Object A20(Object obj) {
        C08670bW r9 = this.A00;
        C666535g r11 = (C666535g) obj;
        C02270Bi r6 = r9.A03;
        r6.A08(Boolean.TRUE);
        C08680bX r3 = (C08680bX) r11.A01;
        C04080Iy r8 = r11.A00;
        StringBuilder A0S = AnonymousClass008.A0S("chatSearchManager/getContactsForQuery/");
        A0S.append(r9.A07.getAndIncrement());
        A0S.append("/");
        A0S.append(r3.A02().length());
        C04600Kz r5 = new C04600Kz(A0S.toString());
        ArrayList arrayList = new ArrayList();
        try {
            Integer num = 0;
            if (!num.equals(Integer.valueOf(r3.A02)) || r3.A05 != null || !r3.A05()) {
                r5.A02("empty");
                r6.A08(Boolean.FALSE);
                r5.A01();
                return arrayList;
            }
            AnonymousClass0AQ r7 = r9.A05;
            List singletonList = Collections.singletonList(new C39491rc(r7, r9.A04, r3.A03()));
            r5.A02("filter");
            r8.A02();
            Iterator it = ((AbstractCollection) r9.A06.A0A()).iterator();
            while (it.hasNext()) {
                AnonymousClass02N r1 = (AnonymousClass02N) it.next();
                r8.A02();
                if (AnonymousClass0AQ.A01(singletonList, r1)) {
                    arrayList.add(r7.A02(r1));
                }
            }
            r5.A02("done");
            r6.A08(Boolean.FALSE);
            r5.A01();
            return arrayList;
        } catch (C14750mp unused) {
            r5.A02("cancelled");
        } catch (Throwable th) {
            r5.A01();
            throw th;
        }
    }
}
