package X;

import android.util.SparseArray;

/* renamed from: X.0GF  reason: invalid class name */
public class AnonymousClass0GF {
    public final SparseArray A00;

    public AnonymousClass0GF(int i) {
        this.A00 = new SparseArray(i);
    }

    public static final int A00(String str) {
        char charAt;
        char charAt2;
        if (str == null || str.length() != 2 || 'A' > (charAt = str.charAt(0)) || charAt > 'Z' || 'A' > (charAt2 = str.charAt(1)) || charAt2 > 'Z') {
            return -1;
        }
        return (charAt2 - 'A') + ((charAt - 'A') * 26);
    }

    public Object A01(String str) {
        int A002 = A00(str);
        if (A002 != -1) {
            return this.A00.get(A002);
        }
        throw new IllegalArgumentException(AnonymousClass008.A0L("Invalid country code \"", str, "\"."));
    }

    public void A02(String str, Object obj) {
        int A002 = A00(str);
        if (A002 != -1) {
            this.A00.append(A002, obj);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0L("Invalid country code \"", str, "\"."));
    }

    public void A03(String str, Object obj) {
        int A002 = A00(str);
        if (A002 != -1) {
            this.A00.put(A002, obj);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0L("Invalid country code \"", str, "\"."));
    }
}
