package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.01Q  reason: invalid class name */
public class AnonymousClass01Q {
    public static volatile AnonymousClass01Q A03;
    public final C006903j A00;
    public final ArrayList A01 = new ArrayList();
    public final Comparator A02 = AnonymousClass1UU.A00;

    public AnonymousClass01Q(C006903j r2) {
        this.A00 = r2;
    }

    public static AnonymousClass01Q A00() {
        if (A03 == null) {
            synchronized (AnonymousClass01Q.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass01Q(C006903j.A00());
                }
            }
        }
        return A03;
    }

    public int A01() {
        C006903j r4 = this.A00;
        r4.A0A();
        int i = 0;
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (r4.A0E(((C08570bM) it.next()).A01)) {
                    i++;
                }
            }
        }
        return i;
    }

    public int A02() {
        int size;
        this.A00.A0A();
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            size = arrayList.size();
        }
        return size;
    }

    public int A03() {
        C006903j r4 = this.A00;
        r4.A0A();
        int i = 0;
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!r4.A0E(((C08570bM) it.next()).A01)) {
                    i++;
                }
            }
        }
        return i;
    }

    public final int A04(AnonymousClass02N r4) {
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (((C08570bM) arrayList.get(i)).A01.equals(r4)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public ArrayList A05() {
        C006903j r5 = this.A00;
        r5.A0A();
        ArrayList arrayList = this.A01;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C08570bM r1 = (C08570bM) it.next();
                if (r5.A0E(r1.A01)) {
                    arrayList2.add(r1.A01);
                }
            }
        }
        return arrayList2;
    }

    public ArrayList A06() {
        ArrayList arrayList;
        this.A00.A0A();
        ArrayList arrayList2 = this.A01;
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AnonymousClass02N r1 = ((C08570bM) it.next()).A01;
                if (AnonymousClass1VY.A0Y(r1) || AnonymousClass1VY.A0T(r1)) {
                    arrayList.add((AnonymousClass02W) r1);
                }
            }
        }
        return arrayList;
    }

    public ArrayList A07() {
        C006903j r5 = this.A00;
        r5.A0A();
        ArrayList arrayList = this.A01;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C08570bM r1 = (C08570bM) it.next();
                if (!r5.A0E(r1.A01)) {
                    arrayList2.add(r1.A01);
                }
            }
        }
        return arrayList2;
    }

    public ArrayList A08(AnonymousClass0BB r8) {
        this.A00.A0A();
        ArrayList arrayList = new ArrayList(this.A01.size());
        Set A0F = r8.A0F();
        synchronized (this.A01) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                C08570bM r2 = (C08570bM) it.next();
                if (!((HashSet) A0F).contains(r2.A01)) {
                    arrayList.add(r2.A01);
                }
            }
        }
        arrayList.addAll(0, A0F);
        return arrayList;
    }

    public ArrayList A09(AnonymousClass0BB r8) {
        this.A00.A0A();
        ArrayList arrayList = new ArrayList(this.A01.size());
        Set A0F = r8.A0F();
        arrayList.addAll(A0F);
        synchronized (this.A01) {
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                C08570bM r2 = (C08570bM) it.next();
                if (!this.A00.A0E(r2.A01) && !((HashSet) A0F).contains(r2.A01)) {
                    arrayList.add(r2.A01);
                }
            }
        }
        return arrayList;
    }

    public List A0A() {
        ArrayList arrayList;
        this.A00.A0A();
        ArrayList arrayList2 = this.A01;
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C08570bM) it.next()).A01);
            }
        }
        return arrayList;
    }

    public Map A0B(Collection collection) {
        Boolean bool;
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C007003k r1 = (C007003k) it.next();
            if (A0E((AnonymousClass02N) r1.A02(AnonymousClass02N.class))) {
                bool = Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            hashMap.put(r1, bool);
        }
        return hashMap;
    }

    public Set A0C() {
        HashSet hashSet;
        this.A00.A0A();
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            hashSet = new HashSet(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C08570bM) it.next()).A01);
            }
        }
        return hashSet;
    }

    public void A0D(AnonymousClass02N r3) {
        this.A00.A0A();
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            int A04 = A04(r3);
            if (A04 >= 0) {
                arrayList.remove(A04);
            }
        }
    }

    public boolean A0E(AnonymousClass02N r3) {
        this.A00.A0A();
        return A04(r3) >= 0;
    }

    public final boolean A0F(AnonymousClass02N r8, long j, AnonymousClass02N r11) {
        C08570bM r4;
        boolean z;
        ArrayList arrayList = this.A01;
        synchronized (arrayList) {
            int A04 = A04(r8);
            if (A04 >= 0) {
                r4 = (C08570bM) arrayList.remove(A04);
            } else {
                r4 = new C08570bM();
            }
            if (r11 != null) {
                r4.A01 = r11;
                r4.A00 = j;
                int binarySearch = Collections.binarySearch(arrayList, r4, this.A02);
                z = false;
                boolean z2 = false;
                if (binarySearch < 0) {
                    z2 = true;
                }
                AnonymousClass00E.A06(z2);
                int i = (-binarySearch) - 1;
                arrayList.add(i, r4);
                if (i != A04) {
                    z = true;
                }
            } else {
                throw null;
            }
        }
        return z;
    }
}
