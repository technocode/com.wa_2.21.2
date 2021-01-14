package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.2u4  reason: invalid class name and case insensitive filesystem */
public class C61992u4 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;

    public C61992u4() {
    }

    public C61992u4(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.A02 = A02(str);
        this.A03 = A01(str2);
        this.A08 = A02(str3);
        this.A00 = A02(str4);
        this.A07 = A02(str5);
        this.A05 = A02(str6);
        this.A04 = A01(str7);
        this.A09 = A02(str8);
        this.A06 = A02(str9);
        String str10 = this.A09;
        if (str10 != null) {
            this.A09 = str10.toLowerCase(Locale.US);
        }
    }

    public static C61992u4 A00(Uri uri) {
        if (uri == null) {
            return null;
        }
        if ("upi".equalsIgnoreCase(uri.getScheme())) {
            return new C61992u4(uri.getQueryParameter("pn"), uri.getQueryParameter("am"), uri.getQueryParameter("tr"), uri.getQueryParameter("mc"), uri.getQueryParameter("tid"), uri.getQueryParameter("url"), uri.getQueryParameter("mam"), uri.getQueryParameter("pa"), uri.getQueryParameter("sign"));
        }
        try {
            HashMap A032 = A03(uri.toString().trim());
            HashMap A033 = A03((String) A032.get("26"));
            HashMap A034 = A03((String) A032.get("27"));
            return new C61992u4((String) A032.get("59"), (String) A032.get("54"), (String) A034.get("01"), (String) A032.get("52"), null, (String) A034.get("02"), (String) A033.get("02"), (String) A033.get("01"), null);
        } catch (Exception unused) {
            Log.e("PAY: unknown uri");
            return null;
        }
    }

    public static final String A01(String str) {
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str) || "0".equals(str) || "0.0".equals(str) || "0.00".equals(str)) {
            return null;
        }
        return str.trim();
    }

    public static final String A02(String str) {
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str)) {
            return null;
        }
        return str.trim();
    }

    public static HashMap A03(String str) {
        String str2;
        int i;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            int i2 = 0;
            while (true) {
                int length = str.length();
                if (i2 >= length) {
                    break;
                }
                int i3 = i2 + 2;
                String str3 = null;
                if (i3 < length) {
                    str2 = str.substring(i2, i3);
                } else {
                    str2 = null;
                }
                int i4 = i3 + 2;
                if (i4 < length) {
                    i = Integer.parseInt(str.substring(i3, i4));
                } else {
                    i = -1;
                }
                if (str2 == null || i == -1) {
                    i2 = i3;
                } else {
                    i2 = i + i4;
                    if (i2 <= length) {
                        str3 = str.substring(i4, i2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        hashMap.put(str2, str3);
                    } else {
                        i2 = i4;
                    }
                }
            }
        }
        return hashMap;
    }

    public static final void A04(StringBuffer stringBuffer, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append("&");
            }
            stringBuffer.append(str);
            stringBuffer.append("=");
            stringBuffer.append(Uri.encode(str2, "@"));
        }
    }

    public String A05() {
        StringBuffer stringBuffer = new StringBuffer();
        A04(stringBuffer, "pn", this.A02);
        A04(stringBuffer, "am", this.A03);
        A04(stringBuffer, "tr", this.A08);
        A04(stringBuffer, "mc", this.A00);
        A04(stringBuffer, "tid", this.A07);
        A04(stringBuffer, "url", this.A05);
        A04(stringBuffer, "mam", this.A04);
        A04(stringBuffer, "pa", this.A09);
        A04(stringBuffer, "sign", this.A06);
        String obj = stringBuffer.toString();
        StringBuilder A0S = AnonymousClass008.A0S("upi://pay");
        A0S.append(TextUtils.isEmpty(obj) ? "" : AnonymousClass008.A0K("?", obj));
        return A0S.toString();
    }
}
