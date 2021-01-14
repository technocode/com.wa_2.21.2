package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0QA  reason: invalid class name */
public class AnonymousClass0QA {
    public final ArrayList A00 = new ArrayList();
    public final HashMap A01 = new HashMap();

    public AnonymousClass037 A00(String str) {
        C09450cu r0 = (C09450cu) this.A01.get(str);
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public AnonymousClass037 A01(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = this.A00;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AnonymousClass037 r1 = (AnonymousClass037) arrayList.get(size);
            if (r1 != null && str.equals(r1.A0Q)) {
                return r1;
            }
        }
        for (C09450cu r0 : this.A01.values()) {
            if (r0 != null) {
                AnonymousClass037 r12 = r0.A01;
                if (str.equals(r12.A0Q)) {
                    return r12;
                }
            }
        }
        return null;
    }

    public AnonymousClass037 A02(String str) {
        for (C09450cu r0 : this.A01.values()) {
            if (r0 != null) {
                AnonymousClass037 r1 = r0.A01;
                if (str.equals(r1.A0S) || (r1 = r1.A0G.A0Q.A02(str)) != null) {
                    return r1;
                }
            }
        }
        return null;
    }

    public List A03() {
        ArrayList arrayList = new ArrayList();
        for (C09450cu r0 : this.A01.values()) {
            if (r0 != null) {
                arrayList.add(r0.A01);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List A04() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.A00;
        if (arrayList2.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
        }
        return arrayList;
    }

    public void A05(AnonymousClass037 r3) {
        ArrayList arrayList = this.A00;
        if (!arrayList.contains(r3)) {
            synchronized (arrayList) {
                arrayList.add(r3);
            }
            r3.A0T = true;
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment already added: ");
        sb.append(r3);
        throw new IllegalStateException(sb.toString());
    }
}
