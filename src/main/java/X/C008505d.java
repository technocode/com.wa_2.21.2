package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.05d  reason: invalid class name and case insensitive filesystem */
public final class C008505d {
    public final int A00;
    public final int A01;
    public final AbstractC008705g A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;

    public C008505d(Set set, Set set2, int i, int i2, AbstractC008705g r6, Set set3) {
        this.A04 = Collections.unmodifiableSet(set);
        this.A03 = Collections.unmodifiableSet(set2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r6;
        this.A05 = Collections.unmodifiableSet(set3);
    }

    public static C008505d A00(Object obj, Class cls, Class... clsArr) {
        C008605e r2 = new C008605e(cls, clsArr);
        AnonymousClass05f r1 = new AnonymousClass05f(obj);
        C001801b.A1R(r1, "Null factory");
        r2.A01 = r1;
        return r2.A00();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.A04.toArray()));
        sb.append(">{");
        sb.append(this.A00);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.A03.toArray()));
        sb.append("}");
        return sb.toString();
    }
}
