package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1cY  reason: invalid class name and case insensitive filesystem */
public class C31101cY extends AbstractC17660rw {
    public static final String A09 = AbstractC17610rq.A01("WorkContinuationImpl");
    public AbstractC17640rt A00;
    public boolean A01;
    public final EnumC17570rl A02;
    public final C31221cl A03;
    public final String A04;
    public final List A05 = new ArrayList();
    public final List A06;
    public final List A07;
    public final List A08;

    public C31101cY(C31221cl r4, String str, EnumC17570rl r6, List list, List list2) {
        this.A03 = r4;
        this.A04 = str;
        this.A02 = r6;
        this.A08 = list;
        this.A07 = list2;
        this.A06 = new ArrayList(list.size());
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.A05.addAll(((C31101cY) it.next()).A05);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String obj = ((AnonymousClass0s0) list.get(i)).A02.toString();
            this.A06.add(obj);
            this.A05.add(obj);
        }
    }

    public static Set A00(C31101cY r3) {
        HashSet hashSet = new HashSet();
        List<C31101cY> list = r3.A07;
        if (list != null && !list.isEmpty()) {
            for (C31101cY r0 : list) {
                hashSet.addAll(r0.A06);
            }
        }
        return hashSet;
    }

    public static boolean A01(C31101cY r6, Set set) {
        List list = r6.A06;
        set.addAll(list);
        Set A002 = A00(r6);
        for (Object obj : set) {
            if (((AbstractCollection) A002).contains(obj)) {
                return true;
            }
        }
        List<C31101cY> list2 = r6.A07;
        if (list2 != null && !list2.isEmpty()) {
            for (C31101cY r0 : list2) {
                if (A01(r0, set)) {
                    return true;
                }
            }
        }
        set.removeAll(list);
        return false;
    }
}
