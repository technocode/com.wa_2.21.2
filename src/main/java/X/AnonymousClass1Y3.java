package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.1Y3  reason: invalid class name */
public enum AnonymousClass1Y3 {
    CRYPT12(12),
    CRYPT14(14);
    
    public static SparseArray A00;
    public static AnonymousClass1Y3 A01;
    public static AnonymousClass1Y3 A02;
    public final int version;

    /* access modifiers changed from: public */
    AnonymousClass1Y3(int i) {
        this.version = i;
    }

    public static synchronized AnonymousClass1Y3 A00() {
        AnonymousClass1Y3 r6;
        synchronized (AnonymousClass1Y3.class) {
            r6 = A01;
            if (r6 == null) {
                r6 = CRYPT14;
                AnonymousClass1Y3[] values = values();
                for (AnonymousClass1Y3 r2 : values) {
                    if (r2.version > r6.version) {
                        r6 = r2;
                    }
                }
                A01 = r6;
            }
        }
        return r6;
    }

    public static synchronized AnonymousClass1Y3 A01() {
        AnonymousClass1Y3 r6;
        synchronized (AnonymousClass1Y3.class) {
            r6 = A02;
            if (r6 == null) {
                r6 = CRYPT12;
                AnonymousClass1Y3[] values = values();
                for (AnonymousClass1Y3 r2 : values) {
                    if (r2.version < r6.version) {
                        r6 = r2;
                    }
                }
                A02 = r6;
            }
        }
        return r6;
    }

    public static synchronized void A02() {
        synchronized (AnonymousClass1Y3.class) {
            A00 = new SparseArray(values().length);
            AnonymousClass1Y3[] values = values();
            for (AnonymousClass1Y3 r2 : values) {
                A00.append(r2.version, r2);
            }
        }
    }

    public static synchronized AnonymousClass1Y3[] A03(AnonymousClass1Y3 r6, AnonymousClass1Y3 r7) {
        AnonymousClass1Y3[] r0;
        synchronized (AnonymousClass1Y3.class) {
            if (A00 == null) {
                A02();
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                SparseArray sparseArray = A00;
                if (i < sparseArray.size()) {
                    int keyAt = sparseArray.keyAt(i);
                    if (keyAt >= r6.version && keyAt <= r7.version) {
                        arrayList.add(A00.get(keyAt));
                    }
                    i++;
                } else {
                    Collections.sort(arrayList, AnonymousClass35C.A00);
                    r0 = (AnonymousClass1Y3[]) arrayList.toArray(new AnonymousClass1Y3[0]);
                }
            }
        }
        return r0;
    }
}
