package com.google.android.gms.common.api.internal;

import X.AbstractC237817o;
import X.AbstractC34701j2;
import X.AnonymousClass16z;
import X.AnonymousClass17T;
import X.AnonymousClass180;
import X.AnonymousClass262;
import X.C238417u;
import X.C34661ix;
import X.C34811jG;
import X.C34821jH;
import X.C34831jI;
import X.C34841jJ;
import X.C34881jN;
import X.HandlerC34951jU;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RunnablezaauShape0S0200000_I1 extends AnonymousClass17T {
    public Object A00;
    public Object A01;
    public final int A02 = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunnablezaauShape0S0200000_I1(C34811jG r2, ArrayList arrayList) {
        super(r2);
        this.A00 = r2;
        this.A01 = arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RunnablezaauShape0S0200000_I1(C34811jG r2, Map map) {
        super(r2);
        this.A00 = r2;
        this.A01 = map;
    }

    @Override // X.AnonymousClass17T
    public final void A00() {
        Set hashSet;
        switch (this.A02) {
            case 0:
                C34811jG r7 = (C34811jG) this.A00;
                AnonymousClass180 r6 = new AnonymousClass180(r7.A0E);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Map map = (Map) this.A01;
                for (AbstractC34701j2 r1 : map.keySet()) {
                    if (!r1.AMu() || ((C34821jH) map.get(r1)).A02) {
                        arrayList2.add(r1);
                    } else {
                        arrayList.add(r1);
                    }
                }
                int i = -1;
                int i2 = 0;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        i = r6.A00(r7.A0C, (AbstractC34701j2) obj);
                        if (i == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        i = r6.A00(r7.A0C, (AbstractC34701j2) obj2);
                        if (i != 0) {
                        }
                    }
                }
                if (i != 0) {
                    C34661ix r2 = new C34661ix(i, null);
                    AnonymousClass262 r12 = r7.A0G;
                    C34831jI r0 = new C34831jI(this, r7, r2);
                    HandlerC34951jU r13 = r12.A06;
                    r13.sendMessage(r13.obtainMessage(1, r0));
                    return;
                }
                if (r7.A08) {
                    r7.A05.connect();
                }
                for (AbstractC34701j2 r14 : map.keySet()) {
                    AbstractC237817o r22 = (AbstractC237817o) map.get(r14);
                    if (!r14.AMu() || r6.A00(r7.A0C, r14) == 0) {
                        r14.A2x(r22);
                    } else {
                        AnonymousClass262 r15 = r7.A0G;
                        C34841jJ r02 = new C34841jJ(r7, r22);
                        HandlerC34951jU r16 = r15.A06;
                        r16.sendMessage(r16.obtainMessage(1, r02));
                    }
                }
                return;
            case 1:
                C34811jG r72 = (C34811jG) this.A00;
                AnonymousClass262 r8 = r72.A0G;
                C34881jN r62 = r8.A05;
                C238417u r17 = r72.A0H;
                if (r17 == null) {
                    hashSet = Collections.emptySet();
                } else {
                    hashSet = new HashSet(r17.A05);
                    Map map2 = r17.A04;
                    for (AnonymousClass16z r23 : map2.keySet()) {
                        if (!r8.A0B.containsKey(r23.A00())) {
                            map2.get(r23);
                            throw null;
                        }
                    }
                }
                r62.A05 = hashSet;
                AbstractList abstractList = (AbstractList) this.A01;
                int size3 = abstractList.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = abstractList.get(i3);
                    i3++;
                    ((AbstractC34701j2) obj3).A8h(r72.A04, r62.A05);
                }
                return;
            default:
                super.A00();
                return;
        }
    }
}
