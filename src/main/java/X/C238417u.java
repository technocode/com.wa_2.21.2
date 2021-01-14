package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.17u  reason: invalid class name and case insensitive filesystem */
public final class C238417u {
    public Integer A00;
    public final C36121lc A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final Set A05;
    public final Set A06;

    public C238417u(Set set, Map map, String str, String str2, C36121lc r8) {
        Set unmodifiableSet;
        if (set == null) {
            unmodifiableSet = Collections.EMPTY_SET;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.A05 = unmodifiableSet;
        this.A04 = map == null ? Collections.EMPTY_MAP : map;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r8;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = this.A04.values().iterator();
        if (it.hasNext()) {
            it.next();
            throw null;
        } else {
            this.A06 = Collections.unmodifiableSet(hashSet);
        }
    }
}
