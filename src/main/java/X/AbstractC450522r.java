package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.22r  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC450522r implements AbstractC29161Xi {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public AbstractC450522r(String str, String str2, String str3) {
        String str4;
        if (!TextUtils.isEmpty(str)) {
            str4 = C003701u.A05(str);
        } else {
            str4 = null;
        }
        this.A03 = str4;
        this.A01 = str2;
        this.A00 = str3 == null ? "mms" : str3;
        this.A02 = str;
    }

    public static Uri.Builder A00(Uri.Builder builder, String str, String str2) {
        Uri build = builder.build();
        if (build.getQueryParameter(str) == null) {
            return builder.appendQueryParameter(str, str2);
        }
        builder.clearQuery();
        for (String str3 : build.getQueryParameterNames()) {
            if (str.equals(str3)) {
                builder.appendQueryParameter(str3, str2);
            } else {
                builder.appendQueryParameter(str3, build.getQueryParameter(str3));
            }
        }
        return builder;
    }

    public Uri.Builder A01(AnonymousClass0J5 r5) {
        String str = this.A03;
        if (str != null) {
            Uri.Builder builder = new Uri.Builder();
            Uri.Builder appendEncodedPath = builder.scheme("https").encodedAuthority(r5.A02).appendPath(this.A00).appendPath(this.A01).appendEncodedPath(C003701u.A05(str));
            int i = 1;
            if (r5.A00 == 0) {
                i = 0;
            }
            appendEncodedPath.appendQueryParameter("direct_ip", String.valueOf(i));
            return builder;
        }
        throw null;
    }
}
