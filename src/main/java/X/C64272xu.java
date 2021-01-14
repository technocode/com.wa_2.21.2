package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2xu  reason: invalid class name and case insensitive filesystem */
public class C64272xu {
    public String A00;
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();

    public C64272xu(String str) {
        this.A00 = str;
    }

    public AnonymousClass0M5 A00() {
        AnonymousClass0OS[] r3;
        AnonymousClass0M5[] r2;
        List list = this.A01;
        if (!list.isEmpty()) {
            r3 = (AnonymousClass0OS[]) list.toArray(new AnonymousClass0OS[0]);
        } else {
            r3 = null;
        }
        List list2 = this.A02;
        if (list2.isEmpty() || (r2 = (AnonymousClass0M5[]) list2.toArray(new AnonymousClass0M5[0])) == null) {
            return new AnonymousClass0M5(this.A00, r3, null, null);
        }
        return new AnonymousClass0M5(this.A00, r3, r2, null);
    }
}
