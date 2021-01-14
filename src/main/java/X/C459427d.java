package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.27d  reason: invalid class name and case insensitive filesystem */
public class C459427d extends C41191ud {
    public int A00;
    public boolean A01 = false;
    public final List A02;
    public final List A03;

    public C459427d(List list) {
        AnonymousClass00E.A09(list.size() > 0, "AllOfAsyncFuture: futures list is empty");
        this.A02 = new ArrayList(Collections.nCopies(list.size(), null));
        this.A03 = new ArrayList(Collections.nCopies(list.size(), null));
        this.A00 = list.size();
        for (int i = 0; i < list.size(); i++) {
            C41191ud r2 = (C41191ud) list.get(i);
            r2.A01.A03(new C41181uc(this, i), null);
            r2.A00.A03(new C41171ub(this, i), null);
        }
    }

    public final void A03() {
        ArrayList arrayList;
        C48752No r1;
        synchronized (this) {
            arrayList = null;
            if (this.A01) {
                r1 = null;
                arrayList = new ArrayList(this.A02);
            } else {
                r1 = new C48752No(this.A03);
            }
        }
        if (arrayList != null) {
            A00(arrayList);
        } else {
            A01(r1);
        }
    }
}
