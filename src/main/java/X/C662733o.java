package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.33o  reason: invalid class name and case insensitive filesystem */
public class C662733o {
    public AbstractC63982xK A00;
    public AnonymousClass3R1 A01;
    public AnonymousClass3R6 A02;
    public List A03;
    public final C04230Jo A04;
    public final AnonymousClass33L A05 = new AnonymousClass3R9(this);
    public final C03620Gz A06;
    public final C03570Gt A07;
    public final AnonymousClass00T A08;
    public final HashMap A09;
    public final HashMap A0A;
    public final HashSet A0B;

    public C662733o(C03570Gt r2, AnonymousClass00T r3, C04230Jo r4, C03620Gz r5) {
        this.A07 = r2;
        this.A08 = r3;
        this.A04 = r4;
        this.A06 = r5;
        this.A0B = new HashSet();
        this.A0A = new HashMap();
        this.A09 = new HashMap();
    }

    public static void A00(C662733o r4, List list, String str) {
        HashSet hashSet = r4.A0B;
        hashSet.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass33N r1 = (AnonymousClass33N) it.next();
            if (r1.A0N) {
                hashSet.add(r1.A0D);
            }
        }
        if (str == null) {
            r4.A04(list, null);
        } else {
            r4.A04(list, str);
        }
    }

    public List A01(List list, List list2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C29241Xq r0 = (C29241Xq) it.next();
                arrayList.add(r0);
                hashSet.add(r0.A0A);
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C29241Xq r1 = (C29241Xq) it2.next();
                if (hashSet.add(r1.A0A)) {
                    arrayList.add(r1);
                }
            }
        }
        List<AnonymousClass33N> list3 = this.A03;
        if (list3 != null) {
            for (AnonymousClass33N r02 : list3) {
                for (C29241Xq r12 : r02.A04) {
                    if (hashSet.add(r12.A0A)) {
                        arrayList.add(r12);
                    }
                }
            }
        }
        return arrayList;
    }

    public void A02() {
        AnonymousClass3R1 r0 = this.A01;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C74173aI r2 = new C74173aI(this, this.A07, true);
        this.A01 = r2;
        this.A08.ANC(r2, new Void[0]);
    }

    public void A03() {
        AnonymousClass3R1 r0 = this.A01;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C74173aI r2 = new C74173aI(this, this.A07, false);
        this.A01 = r2;
        this.A08.ANC(r2, new Void[0]);
    }

    public final void A04(List list, String str) {
        this.A03 = list;
        AnonymousClass3R6 r0 = this.A02;
        if (r0 != null) {
            r0.A04(list, this.A0B, this.A0A, this.A09, str);
        }
    }
}
