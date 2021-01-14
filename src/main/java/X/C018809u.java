package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.09u  reason: invalid class name and case insensitive filesystem */
public class C018809u {
    public String A00;
    public String A01;
    public String A02;
    public final C018909v A03;

    public C018809u(C018909v r1, String str, String str2, String str3) {
        this.A03 = r1;
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public static C018809u A00(String str, String str2, String str3) {
        if (C018909v.A03 == null) {
            synchronized (C018909v.class) {
                if (C018909v.A03 == null) {
                    C018909v.A03 = new C018909v(AnonymousClass00S.A00());
                }
            }
        }
        return new C018809u(C018909v.A03, str, str2, str3);
    }

    public static String A01(String str, String str2) {
        StringBuilder A0S = AnonymousClass008.A0S("PAY: ");
        StringBuilder sb = new StringBuilder(" - ");
        sb.append(str);
        sb.append(":");
        A0S.append(sb.toString());
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder(" ");
            sb2.append(str2);
            A0S.append(sb2.toString());
        }
        return A0S.toString();
    }

    public final StringBuilder A02(String str, String str2) {
        StringBuilder A0S = AnonymousClass008.A0S("PAY: ");
        if (!TextUtils.isEmpty(this.A01)) {
            A0S.append(String.format("[%s]", this.A01));
        }
        if (TextUtils.isEmpty(str)) {
            str = this.A02;
        }
        A0S.append(String.format("[%s]", str));
        A0S.append(String.format("[%s]", this.A03.A01));
        StringBuilder sb = new StringBuilder(" - ");
        sb.append(this.A00);
        sb.append(":");
        A0S.append(sb.toString());
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder(" ");
            sb2.append(str2);
            A0S.append(sb2.toString());
        }
        return A0S;
    }

    public void A03(String str) {
        this.A03.A01();
        Log.d(A02(null, str).toString());
    }

    public void A04(String str) {
        this.A03.A01();
        C018909v.A00(A02(null, str).toString(), null);
    }

    public void A05(String str) {
        this.A03.A01();
        A02(null, str);
    }

    public void A06(String str, String str2, Throwable th) {
        this.A03.A01();
        C018909v.A00(A02(str, str2).toString(), th);
    }

    public void A07(String str, String str2, AnonymousClass1X2[] r9) {
        int length;
        this.A03.A01();
        StringBuilder A022 = A02(str, str2);
        if (r9 != null && (length = r9.length) > 0) {
            A022.append(" [");
            for (int i = 0; i < length; i++) {
                AnonymousClass1X2 r2 = r9[i];
                StringBuilder A0S = AnonymousClass008.A0S("{");
                A0S.append(r2.A00);
                A0S.append(" : ");
                A0S.append(r2.A01);
                A0S.append("}");
                A022.append(A0S.toString());
                if (i != length - 1) {
                    A022.append(",");
                }
            }
            A022.append("]");
        }
        Log.i(A022.toString());
    }

    public void A08(String str, Throwable th) {
        this.A03.A01();
        C018909v.A00(A02(null, str).toString(), th);
    }
}
