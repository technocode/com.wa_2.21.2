package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.07W  reason: invalid class name */
public final class AnonymousClass07W extends AnonymousClass07F {
    public final AnonymousClass07F A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;

    public AnonymousClass07W(C008505d r9, AnonymousClass07F r10) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (AnonymousClass07I r0 : r9.A03) {
            int i = r0.A00;
            Class cls = r0.A01;
            if (i == 2) {
                hashSet3.add(cls);
            } else {
                hashSet.add(cls);
            }
        }
        Set set = r9.A05;
        if (!set.isEmpty()) {
            hashSet.add(AnonymousClass07N.class);
        }
        this.A01 = Collections.unmodifiableSet(hashSet);
        this.A02 = Collections.unmodifiableSet(hashSet2);
        this.A04 = Collections.unmodifiableSet(hashSet3);
        this.A05 = Collections.unmodifiableSet(hashSet4);
        this.A03 = set;
        this.A00 = r10;
    }
}
