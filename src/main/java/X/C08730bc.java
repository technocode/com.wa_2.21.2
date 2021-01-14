package X;

import com.whatsapp.jid.Jid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0bc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C08730bc implements AnonymousClass0RN {
    public final /* synthetic */ C08720bb A00;

    public /* synthetic */ C08730bc(C08720bb r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0RN
    public final Object A20(Object obj) {
        C08720bb r8 = this.A00;
        C666535g r12 = (C666535g) obj;
        C02270Bi r6 = r8.A03;
        r6.A08(Boolean.TRUE);
        C08680bX r7 = (C08680bX) r12.A01;
        C04080Iy r9 = r12.A00;
        StringBuilder A0S = AnonymousClass008.A0S("ContactSearchManager/getForContactsQuery/");
        A0S.append(r7.A02().length());
        C04600Kz r4 = new C04600Kz(A0S.toString());
        ArrayList arrayList = new ArrayList();
        try {
            r9.A02();
            Integer num = 0;
            if (!num.equals(Integer.valueOf(r7.A02)) || r7.A05 != null || !r7.A05()) {
                r4.A02("empty");
                r6.A08(Boolean.FALSE);
                r4.A01();
                return arrayList;
            }
            AnonymousClass0AQ r3 = r8.A05;
            List singletonList = Collections.singletonList(new C39491rc(r3, r8.A04, r7.A03()));
            r4.A02("filter");
            r9.A02();
            for (C007003k r32 : r3.A03()) {
                r9.A02();
                if (r32.A08 != null) {
                    if (((AbstractCollection) r8.A06.A0A()).contains(r32.A02(AnonymousClass02N.class))) {
                        continue;
                    } else {
                        Jid A02 = r32.A02(AnonymousClass02N.class);
                        if (A02 == null) {
                            throw null;
                        } else if (AnonymousClass0AQ.A01(singletonList, (AnonymousClass02N) A02)) {
                            arrayList.add(r32);
                        }
                    }
                }
            }
            r4.A02("done");
            r6.A08(Boolean.FALSE);
            r4.A01();
            return arrayList;
        } catch (C14750mp unused) {
            r4.A02("cancelled");
        } catch (Throwable th) {
            r4.A01();
            throw th;
        }
    }
}
