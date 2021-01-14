package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.0YL  reason: invalid class name */
public class AnonymousClass0YL {
    public static final Uri A00;

    static {
        StringBuilder A0S = AnonymousClass008.A0S("content://");
        A0S.append("com.whatsapp.provider.contact");
        A0S.append("/contacts");
        A00 = Uri.parse(A0S.toString());
    }

    public static boolean A00(Uri uri) {
        return uri != null && TextUtils.equals(uri.getScheme(), "content") && TextUtils.equals(uri.getAuthority(), "com.whatsapp.provider.contact");
    }
}
