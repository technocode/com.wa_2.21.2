package X;

import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1Ou  reason: invalid class name and case insensitive filesystem */
public class C27261Ou {
    public static AnonymousClass04h A00 = new AnonymousClass04h(16);
    public static HashMap A01 = new HashMap();

    public static C27241Os A00(String str) {
        if (str == null) {
            return null;
        }
        return (C27241Os) A00.get(str);
    }

    public static void A01(C002701k r5, AnonymousClass02M r6, AnonymousClass00T r7, AnonymousClass01X r8, String str, AbstractC27251Ot r10) {
        if (!TextUtils.isEmpty(str)) {
            C27241Os A002 = A00(str);
            if (A002 == null) {
                AbstractCollection abstractCollection = (AbstractCollection) A01.get(str);
                if (abstractCollection != null) {
                    abstractCollection.add(r10);
                    return;
                }
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(r10);
                A01.put(str, arrayList);
                r7.ANF(new RunnableEBaseShape1S1300000_I1(new C27241Os(r5, str), r8, r6, str, 0));
            } else if (r10 != null) {
                r10.AIE(A002, true);
            }
        } else if (r10 != null) {
            r10.AIE(null, true);
        }
    }
}
