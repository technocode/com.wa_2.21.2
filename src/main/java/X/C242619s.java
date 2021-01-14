package X;

import android.text.TextUtils;

/* renamed from: X.19s  reason: invalid class name and case insensitive filesystem */
public class C242619s {
    public final C242819u A00;

    public C242619s(C242819u r1) {
        C001801b.A1Q(r1);
        this.A00 = r1;
    }

    public static String A00(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj == Boolean.TRUE ? "true" : "false";
        }
        boolean z = obj instanceof Throwable;
        String obj2 = obj.toString();
        if (z) {
            return obj2;
        }
        return obj2;
    }

    public static String A01(String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String A002 = A00(obj);
        String A003 = A00(obj2);
        String A004 = A00(obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(A002)) {
            sb.append(str2);
            sb.append(A002);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(A003)) {
            sb.append(str2);
            sb.append(A003);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(A004)) {
            sb.append(str3);
            sb.append(A004);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r12 == false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(int r16, java.lang.String r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
        // Method dump skipped, instructions count: 487
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C242619s.A02(int, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    public final void A03(String str) {
        A02(2, str, null, null, null);
    }

    public final void A04(String str) {
        A02(5, str, null, null, null);
    }

    public final void A05(String str) {
        A02(6, str, null, null, null);
    }

    public final void A06(String str, Object obj) {
        A02(2, str, obj, null, null);
    }

    public final void A07(String str, Object obj) {
        A02(3, str, obj, null, null);
    }

    public final void A08(String str, Object obj) {
        A02(5, str, obj, null, null);
    }

    public final void A09(String str, Object obj) {
        A02(6, str, obj, null, null);
    }

    public final void A0A(String str, Object obj, Object obj2) {
        A02(5, str, obj, obj2, null);
    }
}
