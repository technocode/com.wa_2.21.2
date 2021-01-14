package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.2xk  reason: invalid class name and case insensitive filesystem */
public class C64172xk {
    public final Long A00;
    public final String A01;
    public final Set A02;

    public C64172xk(String str, Set set) {
        this.A01 = str;
        this.A02 = Collections.unmodifiableSet(set);
        this.A00 = null;
    }

    public C64172xk(String str, Set set, Long l) {
        this.A01 = str;
        this.A02 = Collections.unmodifiableSet(set);
        this.A00 = l;
    }
}
