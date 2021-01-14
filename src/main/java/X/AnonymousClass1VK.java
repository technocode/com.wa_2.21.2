package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.1VK  reason: invalid class name */
public class AnonymousClass1VK {
    public static AbstractC05890Qx[] A00 = {C05880Qw.A02, C05880Qw.A01, C05880Qw.A00};

    public static AbstractC05890Qx A00(AnonymousClass1VM r3) {
        AbstractC43781yw r1;
        LinkedHashSet linkedHashSet;
        C05870Qv r0 = r3.A05;
        if (!(r0 == null || (r1 = r3.A06) == null)) {
            LinkedHashSet linkedHashSet2 = r0.A0A;
            if (r1 instanceof C74733bP) {
                linkedHashSet = new LinkedHashSet(Collections.singletonList(C05880Qw.A00));
            } else if (r1 instanceof C74723bO) {
                linkedHashSet = new LinkedHashSet(Collections.singletonList(C05880Qw.A00));
            } else if (!(r1 instanceof C74713bN)) {
                linkedHashSet = new LinkedHashSet(Collections.singletonList(C05880Qw.A01));
            } else {
                linkedHashSet = new LinkedHashSet(Collections.singletonList(C05880Qw.A00));
            }
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                AbstractC05890Qx r12 = (AbstractC05890Qx) it.next();
                if (linkedHashSet2.contains(r12)) {
                    return r12;
                }
            }
        }
        return C05880Qw.A02;
    }

    public static AbstractC05890Qx A01(String str) {
        if (str != null) {
            AbstractC05890Qx[] r4 = A00;
            for (AbstractC05890Qx r1 : r4) {
                if (str.equals(r1.A5e())) {
                    return r1;
                }
            }
        }
        return C05880Qw.A02;
    }
}
