package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Gz  reason: invalid class name and case insensitive filesystem */
public class C03620Gz extends AbstractC003401r {
    public static volatile C03620Gz A01;
    public final AnonymousClass0H0 A00;

    public C03620Gz(AnonymousClass0H0 r1) {
        this.A00 = r1;
    }

    public static C03620Gz A00() {
        if (A01 == null) {
            synchronized (C03620Gz.class) {
                if (A01 == null) {
                    A01 = new C03620Gz(AnonymousClass0H0.A00());
                }
            }
        }
        return A01;
    }

    /* renamed from: A02 */
    public void A01(AnonymousClass33L r5) {
        super.A01(r5);
        AnonymousClass0H0 r0 = this.A00;
        if (r0 != null) {
            HashMap hashMap = new HashMap(r0.A01);
            for (String str : hashMap.keySet()) {
                A03(str, ((Number) hashMap.get(str)).intValue());
            }
            return;
        }
        throw null;
    }

    public void A03(String str, int i) {
        C662733o r0;
        AnonymousClass3R6 r3;
        List list;
        AnonymousClass00E.A01();
        Iterator it = super.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                AnonymousClass33L r12 = (AnonymousClass33L) r1.next();
                r12.toString();
                if (!(!(r12 instanceof AnonymousClass3R9) || (r3 = (r0 = ((AnonymousClass3R9) r12).A00).A02) == null || (list = r0.A03) == null)) {
                    HashSet hashSet = r0.A0B;
                    HashMap hashMap = r0.A0A;
                    HashMap hashMap2 = r0.A09;
                    if (!r3.A0E.containsKey(str)) {
                        r3.A04(list, hashSet, hashMap, hashMap2, null);
                    } else {
                        C74223aN r02 = (C74223aN) r3.A0E.get(str);
                        r02.A00 = i;
                        r02.A05();
                    }
                }
            } else {
                return;
            }
        }
    }
}
