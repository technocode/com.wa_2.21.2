package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.0Cb  reason: invalid class name and case insensitive filesystem */
public class C02450Cb {
    public static volatile C02450Cb A01;
    public final AnonymousClass009 A00;

    public C02450Cb(AnonymousClass009 r1) {
        this.A00 = r1;
    }

    public static C02450Cb A00() {
        if (A01 == null) {
            synchronized (C02450Cb.class) {
                if (A01 == null) {
                    A01 = new C02450Cb(AnonymousClass009.A00());
                }
            }
        }
        return A01;
    }

    public String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (parse.getQueryParameter("oe") != null && parse.getQueryParameter("oh") != null) {
            return str;
        }
        AnonymousClass008.A17("DirectPathUtils/direct_path missing signature or expiry ", str);
        this.A00.A03("Invalid direct_path", 1);
        return null;
    }
}
