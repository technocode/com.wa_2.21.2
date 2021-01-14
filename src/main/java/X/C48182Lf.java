package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.2Lf  reason: invalid class name and case insensitive filesystem */
public class C48182Lf {
    public static final String[] A00 = new String[0];

    public static Boolean A00(String str) {
        if ("1".equals(str)) {
            return Boolean.TRUE;
        }
        if ("0".equals(str)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static String[] A01(Collection collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(AbstractC48162Ld.A00(((AbstractC48162Ld) it.next()).A03()));
        }
        return (String[]) linkedHashSet.toArray(A00);
    }

    public static String[] A02(String[] strArr, C007303n r7, AnonymousClass02N r8) {
        String str;
        int length = strArr.length;
        String[] strArr2 = new String[(length + 4)];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            strArr2[i2] = strArr[i];
            i++;
            i2++;
        }
        int i3 = i2 + 1;
        AnonymousClass02N r0 = r7.A00;
        if (r0 != null) {
            strArr2[i2] = r0.getRawString();
            int i4 = i3 + 1;
            strArr2[i3] = r7.A01;
            int i5 = i4 + 1;
            if (r7.A02) {
                str = "1";
            } else {
                str = "0";
            }
            strArr2[i4] = str;
            strArr2[i5] = r8 != null ? r8.getRawString() : "0";
            return strArr2;
        }
        throw null;
    }
}
