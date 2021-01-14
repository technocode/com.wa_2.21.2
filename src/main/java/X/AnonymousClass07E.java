package X;

import com.google.firebase.iid.Registrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.07E  reason: invalid class name */
public class AnonymousClass07E extends AnonymousClass07F {
    public static final AnonymousClass07L A04 = AnonymousClass07K.A00;
    public final AnonymousClass07M A00;
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();

    public AnonymousClass07E(Executor executor, Iterable iterable, C008505d... r16) {
        AnonymousClass07M r3 = new AnonymousClass07M(executor);
        this.A00 = r3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C008505d.A00(r3, AnonymousClass07M.class, AnonymousClass07M.class, AnonymousClass07N.class));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Registrar) it.next()).getComponents());
        }
        Collections.addAll(arrayList, r16);
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C008505d r9 = (C008505d) it2.next();
            AnonymousClass07R r5 = new AnonymousClass07R(r9);
            Iterator it3 = r9.A04.iterator();
            while (true) {
                if (it3.hasNext()) {
                    Class cls = (Class) it3.next();
                    AnonymousClass07S r2 = new AnonymousClass07S(cls, !(r9.A01 == 0));
                    if (!hashMap.containsKey(r2)) {
                        hashMap.put(r2, new HashSet());
                    }
                    Set set = (Set) hashMap.get(r2);
                    if (set.isEmpty() || r2.A01) {
                        set.add(r5);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                }
            }
        }
        for (Set<AnonymousClass07R> set2 : hashMap.values()) {
            for (AnonymousClass07R r4 : set2) {
                for (AnonymousClass07I r0 : r4.A00.A03) {
                    Set<AnonymousClass07R> set3 = (Set) hashMap.get(new AnonymousClass07S(r0.A01, r0.A00 == 2));
                    if (set3 != null) {
                        for (AnonymousClass07R r1 : set3) {
                            r4.A01.add(r1);
                            r1.A02.add(r4);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Collection collection : hashMap.values()) {
            hashSet.addAll(collection);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it4 = hashSet.iterator();
        while (it4.hasNext()) {
            AnonymousClass07R r12 = (AnonymousClass07R) it4.next();
            if (r12.A02.isEmpty()) {
                hashSet2.add(r12);
            }
        }
        int i = 0;
        while (!hashSet2.isEmpty()) {
            AnonymousClass07R r32 = (AnonymousClass07R) hashSet2.iterator().next();
            hashSet2.remove(r32);
            i++;
            for (AnonymousClass07R r13 : r32.A01) {
                Set set4 = r13.A02;
                set4.remove(r32);
                if (set4.isEmpty()) {
                    hashSet2.add(r13);
                }
            }
        }
        if (i == arrayList.size()) {
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                C008505d r22 = (C008505d) it5.next();
                this.A01.put(r22, new AnonymousClass07U(new AnonymousClass07T(this, r22)));
            }
            for (Map.Entry entry : this.A01.entrySet()) {
                C008505d r14 = (C008505d) entry.getKey();
                if (r14.A01 == 0) {
                    Object value = entry.getValue();
                    for (Object obj : r14.A04) {
                        this.A02.put(obj, value);
                    }
                }
            }
            for (C008505d r42 : this.A01.keySet()) {
                Iterator it6 = r42.A03.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        AnonymousClass07I r15 = (AnonymousClass07I) it6.next();
                        if (r15.A00 == 1) {
                            Map map = this.A02;
                            Class cls2 = r15.A01;
                            if (!map.containsKey(cls2)) {
                                throw new C36971nI(String.format("Unsatisfied dependency for component %s: %s", r42, cls2));
                            }
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : this.A01.entrySet()) {
                C008505d r17 = (C008505d) entry2.getKey();
                if (r17.A01 != 0) {
                    Object value2 = entry2.getValue();
                    for (Object obj2 : r17.A04) {
                        if (!hashMap2.containsKey(obj2)) {
                            hashMap2.put(obj2, new HashSet());
                        }
                        ((Set) hashMap2.get(obj2)).add(value2);
                    }
                }
            }
            for (Map.Entry entry3 : hashMap2.entrySet()) {
                this.A03.put(entry3.getKey(), new AnonymousClass07U(new AnonymousClass07V((Set) entry3.getValue())));
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            AnonymousClass07R r18 = (AnonymousClass07R) it7.next();
            if (!r18.A02.isEmpty() && !r18.A01.isEmpty()) {
                arrayList2.add(r18.A00);
            }
        }
        throw new C36961nH(arrayList2);
    }
}
