package X;

import java.util.List;

/* renamed from: X.1du  reason: invalid class name and case insensitive filesystem */
public class C31851du implements AbstractC18510tT {
    public List A00;

    public C31851du(List list) {
        this.A00 = list;
    }

    @Override // X.AbstractC18510tT
    public boolean ABy(C18540tW r3, AbstractC31941e3 r4) {
        for (C18560tY r0 : this.A00) {
            if (C18590tb.A04(r3, r0, r4)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("not(");
        A0S.append(this.A00);
        A0S.append(")");
        return A0S.toString();
    }
}
