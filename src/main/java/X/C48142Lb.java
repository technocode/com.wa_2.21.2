package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.2Lb  reason: invalid class name and case insensitive filesystem */
public class C48142Lb {
    public final int A00;
    public final List A01;

    public C48142Lb(int i) {
        this.A01 = Collections.emptyList();
        this.A00 = i;
    }

    public C48142Lb(List list) {
        this.A01 = Collections.unmodifiableList(list);
        this.A00 = 0;
    }
}
