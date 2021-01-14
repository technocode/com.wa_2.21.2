package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1hl  reason: invalid class name and case insensitive filesystem */
public final class C34011hl extends AnonymousClass13L {
    public final long A00;
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();

    public C34011hl(int i, long j) {
        super(i);
        this.A00 = j;
    }

    public C34011hl A00(int i) {
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C34011hl r1 = (C34011hl) list.get(i2);
            if (((AnonymousClass13L) r1).A00 == i) {
                return r1;
            }
        }
        return null;
    }

    public C34021hm A01(int i) {
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C34021hm r1 = (C34021hm) list.get(i2);
            if (((AnonymousClass13L) r1).A00 == i) {
                return r1;
            }
        }
        return null;
    }

    @Override // X.AnonymousClass13L
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass13L.A00(super.A00));
        sb.append(" leaves: ");
        sb.append(Arrays.toString(this.A02.toArray()));
        sb.append(" containers: ");
        sb.append(Arrays.toString(this.A01.toArray()));
        return sb.toString();
    }
}
