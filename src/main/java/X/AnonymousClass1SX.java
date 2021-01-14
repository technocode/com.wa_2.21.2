package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1SX  reason: invalid class name */
public class AnonymousClass1SX {
    /* JADX WARNING: Removed duplicated region for block: B:106:0x013a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C48052Ks A00(X.AnonymousClass0M5 r29) {
        /*
        // Method dump skipped, instructions count: 459
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SX.A00(X.0M5):X.2Ks");
    }

    public AnonymousClass2KX A01(AnonymousClass0M5 r6) {
        AnonymousClass2KY r2;
        AnonymousClass0M5 A0D = r6.A0D("product_catalog");
        String str = null;
        if (A0D == null) {
            return null;
        }
        List<AnonymousClass0M5> A0H = A0D.A0H("product");
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass0M5 r0 : A0H) {
            C48052Ks A00 = A00(r0);
            if (A00 != null) {
                arrayList.add(A00);
            }
        }
        AnonymousClass0M5 A0D2 = A0D.A0D("paging");
        if (A0D2 != null) {
            AnonymousClass0M5 A0D3 = A0D2.A0D("after");
            if (A0D3 != null) {
                str = AnonymousClass0M5.A00(A0D3.A01);
            }
            r2 = new AnonymousClass2KY(!TextUtils.isEmpty(str), str);
        } else {
            r2 = new AnonymousClass2KY(false, null);
        }
        return new AnonymousClass2KX(arrayList, r2);
    }
}
