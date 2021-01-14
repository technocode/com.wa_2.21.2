package X;

import java.util.ArrayList;

/* renamed from: X.1H3  reason: invalid class name */
public class AnonymousClass1H3 {
    public final ArrayList A00 = new ArrayList();

    public final void A00(int i, Object obj, boolean z) {
        ArrayList arrayList = this.A00;
        if (arrayList.size() != i) {
            throw new IllegalArgumentException("arguments have to be continuous");
        } else if (z) {
            arrayList.add(C008805h.A0T(obj));
        } else {
            arrayList.add(obj);
        }
    }
}
