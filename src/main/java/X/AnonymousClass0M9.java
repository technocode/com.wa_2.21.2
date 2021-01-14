package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.0M9  reason: invalid class name */
public class AnonymousClass0M9 {
    public static volatile AnonymousClass0M9 A02;
    public final AnonymousClass01X A00;
    public final C03190Fd A01;

    public AnonymousClass0M9(C03190Fd r1, AnonymousClass01X r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static Uri.Builder A00() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority("faq.whatsapp.com");
        return builder;
    }

    public static AnonymousClass0M9 A01() {
        if (A02 == null) {
            synchronized (AnonymousClass0M9.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0M9(C03190Fd.A00(), AnonymousClass01X.A00());
                }
            }
        }
        return A02;
    }

    public Uri A02(String str, String str2) {
        Uri.Builder A002 = A00();
        A002.appendPath("general");
        A002.appendPath(str);
        A002.appendPath(str2);
        A04(A002);
        return A002.build();
    }

    public Uri A03(String str, String str2, String str3) {
        Uri.Builder A002 = A00();
        A002.appendPath(str);
        if (!TextUtils.isEmpty(str2)) {
            A002.appendPath(str2);
        }
        A04(A002);
        if (!TextUtils.isEmpty(str3)) {
            A002.encodedFragment(str3);
        }
        return A002.build();
    }

    public final void A04(Uri.Builder builder) {
        String str;
        AnonymousClass01X r2 = this.A00;
        builder.appendQueryParameter("lg", r2.A04());
        builder.appendQueryParameter("lc", r2.A03());
        if (this.A01.A07(AbstractC000400g.A0K)) {
            str = "1";
        } else {
            str = "0";
        }
        builder.appendQueryParameter("eea", str);
    }
}
