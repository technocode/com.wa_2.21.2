package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1hj  reason: invalid class name and case insensitive filesystem */
public class C33991hj implements AnonymousClass138 {
    public static List A00(AnonymousClass135 r6) {
        int i = r6.A01;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            AnonymousClass134 r2 = r6.A03[i2];
            if (r2.A00(null) || (AnonymousClass11u.A00.equals(null) && r2.A00(AnonymousClass11u.A01))) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }
}
