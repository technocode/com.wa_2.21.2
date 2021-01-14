package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.2cH  reason: invalid class name and case insensitive filesystem */
public class C53022cH implements AbstractC03920Ih {
    public static volatile C53022cH A08;
    public final C000300f A00;
    public final C52982cD A01;
    public final C02590Cr A02;
    public final C03910Ig A03;
    public final Map A04;
    public final Map A05;
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();

    public C53022cH(C02590Cr r7, C000300f r8, C52982cD r9, C03910Ig r10) {
        this.A02 = r7;
        this.A00 = r8;
        this.A01 = r9;
        this.A03 = r10;
        ArrayList arrayList = new ArrayList();
        EnumC48532Mq[] values = EnumC48532Mq.values();
        for (EnumC48532Mq r1 : values) {
            if (r1 == EnumC48532Mq.PEOPLE || r1 == EnumC48532Mq.NATURE || r1 == EnumC48532Mq.FOOD || r1 == EnumC48532Mq.ACTIVITY || r1 == EnumC48532Mq.SYMBOLS || r1 == EnumC48532Mq.OBJECTS) {
                arrayList.addAll(Arrays.asList(r1.shapeData));
            }
        }
        List A012 = C48542Mr.A01(true);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A01((C53122cU) it.next(), this.A07);
        }
        Iterator it2 = ((AbstractCollection) A012).iterator();
        while (it2.hasNext()) {
            A01((AbstractC48432Mf) it2.next(), this.A06);
        }
        this.A04 = new HashMap();
        this.A05 = new HashMap();
    }

    public static C53022cH A00() {
        if (A08 == null) {
            synchronized (C53022cH.class) {
                if (A08 == null) {
                    A08 = new C53022cH(C02590Cr.A00(), C000300f.A00(), C52982cD.A00(), C03910Ig.A00());
                }
            }
        }
        return A08;
    }

    public static void A01(AbstractC48432Mf r5, Map map) {
        C03960Il[] A6B = r5.A6B();
        for (C03960Il r1 : A6B) {
            Collection collection = (Collection) map.get(r1);
            if (collection == null) {
                collection = new LinkedHashSet();
                map.put(r1, collection);
            }
            collection.add(r5);
        }
    }

    public synchronized void A02(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A01((AbstractC48432Mf) it.next(), this.A05);
        }
    }

    @Override // X.AbstractC03920Ih
    public void A2f() {
        this.A03.A2f();
    }

    @Override // X.AbstractC03920Ih
    public Collection A4D(String str, int i, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (AbstractC48432Mf r1 : this.A01.A02()) {
            if (r1 instanceof AnonymousClass2cX) {
                A01(r1, hashMap);
            }
            arrayList.addAll(Arrays.asList(r1.A6B()));
        }
        List A032 = this.A03.A03(str, i, arrayList, new ArrayList(), z2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        boolean A0D = this.A00.A0D(AbstractC000400g.A2I);
        ArrayList arrayList2 = new ArrayList(4);
        arrayList2.add(hashMap);
        arrayList2.add(this.A04);
        if (!A0D) {
            arrayList2.add(this.A07);
        }
        arrayList2.add(this.A05);
        arrayList2.add(this.A06);
        synchronized (this) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                Iterator it2 = ((ArrayList) A032).iterator();
                while (it2.hasNext()) {
                    Collection<AbstractC48432Mf> collection = (Collection) map.get((C03960Il) it2.next());
                    if (collection != null) {
                        for (AbstractC48432Mf r12 : collection) {
                            if (r12 instanceof AnonymousClass2cX) {
                                linkedHashSet2.add(r12);
                            } else {
                                linkedHashSet.add(r12);
                            }
                        }
                    }
                }
            }
        }
        if (A0D) {
            Iterator it3 = ((ArrayList) A032).iterator();
            while (it3.hasNext()) {
                linkedHashSet.add(new C52972cC((C03960Il) it3.next(), this.A02, this.A00));
            }
        }
        LinkedHashSet linkedHashSet3 = linkedHashSet2;
        if (z) {
            linkedHashSet3 = linkedHashSet;
        }
        LinkedHashSet linkedHashSet4 = new LinkedHashSet(linkedHashSet3);
        if (z) {
            linkedHashSet = linkedHashSet2;
        }
        linkedHashSet4.addAll(linkedHashSet);
        return linkedHashSet4;
    }

    @Override // X.AbstractC03920Ih
    public void AOP(boolean z) {
        this.A03.A00 = z;
    }

    @Override // X.AbstractC03920Ih
    public int getCount() {
        return this.A03.getCount();
    }
}
