package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.07y  reason: invalid class name and case insensitive filesystem */
public class C014107y implements Iterable {
    public int A00 = 0;
    public AnonymousClass0SN A01;
    public AnonymousClass0SN A02;
    public WeakHashMap A03 = new WeakHashMap();

    public AnonymousClass0SN A00(Object obj) {
        if (this instanceof C014007x) {
            return (AnonymousClass0SN) ((C014007x) this).A00.get(obj);
        }
        AnonymousClass0SN r1 = this.A02;
        while (r1 != null && !r1.A02.equals(obj)) {
            r1 = r1.A00;
        }
        return r1;
    }

    public Object A01(Object obj) {
        AnonymousClass0SN A002 = A00(obj);
        if (A002 == null) {
            return null;
        }
        this.A00--;
        if (!this.A03.isEmpty()) {
            for (AbstractC07140Wb r0 : this.A03.keySet()) {
                r0.AQN(A002);
            }
        }
        AnonymousClass0SN r1 = A002.A01;
        if (r1 != null) {
            r1.A00 = A002.A00;
        } else {
            this.A02 = A002.A00;
        }
        AnonymousClass0SN r02 = A002.A00;
        if (r02 != null) {
            r02.A01 = r1;
        } else {
            this.A01 = r1;
        }
        A002.A00 = null;
        A002.A01 = null;
        return A002.A03;
    }

    public Object A02(Object obj, Object obj2) {
        if (!(this instanceof C014007x)) {
            AnonymousClass0SN A002 = A00(obj);
            if (A002 != null) {
                return A002.A03;
            }
            AnonymousClass0SN r1 = new AnonymousClass0SN(obj, obj2);
            this.A00++;
            AnonymousClass0SN r0 = this.A01;
            if (r0 == null) {
                this.A02 = r1;
                this.A01 = r1;
                return null;
            }
            r0.A00 = r1;
            r1.A01 = r0;
            this.A01 = r1;
            return null;
        }
        C014007x r3 = (C014007x) this;
        AnonymousClass0SN r02 = (AnonymousClass0SN) r3.A00.get(obj);
        if (r02 != null) {
            return r02.A03;
        }
        HashMap hashMap = r3.A00;
        AnonymousClass0SN r12 = new AnonymousClass0SN(obj, obj2);
        ((C014107y) r3).A00++;
        AnonymousClass0SN r03 = r3.A01;
        if (r03 == null) {
            r3.A02 = r12;
            r3.A01 = r12;
        } else {
            r03.A00 = r12;
            r12.A01 = r03;
            r3.A01 = r12;
        }
        hashMap.put(obj, r12);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 1
            if (r9 != r8) goto L_0x0004
            return r7
        L_0x0004:
            boolean r0 = r9 instanceof X.C014107y
            r6 = 0
            if (r0 != 0) goto L_0x000a
            return r6
        L_0x000a:
            X.07y r9 = (X.C014107y) r9
            int r1 = r8.A00
            int r0 = r9.A00
            if (r1 == r0) goto L_0x0013
            return r6
        L_0x0013:
            java.util.Iterator r5 = r8.iterator()
            java.util.Iterator r4 = r9.iterator()
        L_0x001b:
            r3 = r5
            X.0fs r3 = (X.AbstractC11200fs) r3
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0043
            r2 = r4
            X.0fs r2 = (X.AbstractC11200fs) r2
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r2.next()
            if (r1 != 0) goto L_0x003c
            if (r0 != 0) goto L_0x0042
            goto L_0x001b
        L_0x003c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001b
        L_0x0042:
            return r6
        L_0x0043:
            if (r1 != 0) goto L_0x004e
            X.0fs r4 = (X.AbstractC11200fs) r4
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L_0x004e
            return r7
        L_0x004e:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014107y.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            AbstractC11200fs r1 = (AbstractC11200fs) it;
            if (!r1.hasNext()) {
                return i;
            }
            i += ((Map.Entry) r1.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        C11190fr r2 = new C11190fr(this.A02, this.A01);
        this.A03.put(r2, Boolean.FALSE);
        return r2;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[");
        Iterator it = iterator();
        while (true) {
            AbstractC11200fs r1 = (AbstractC11200fs) it;
            if (r1.hasNext()) {
                A0S.append(r1.next().toString());
                if (r1.hasNext()) {
                    A0S.append(", ");
                }
            } else {
                A0S.append("]");
                return A0S.toString();
            }
        }
    }
}
