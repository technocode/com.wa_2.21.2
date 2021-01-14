package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Dy  reason: invalid class name and case insensitive filesystem */
public final class C02910Dy {
    public C02900Dx A00;
    public final long A01;
    public final C007303n A02;
    public final List A03;

    public C02910Dy(long j, List list, C007303n r5) {
        ArrayList arrayList = new ArrayList();
        this.A03 = arrayList;
        this.A02 = r5;
        this.A01 = j;
        if (list != null) {
            arrayList.addAll(list);
        }
    }
}
