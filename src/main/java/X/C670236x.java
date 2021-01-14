package X;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;

/* renamed from: X.36x  reason: invalid class name and case insensitive filesystem */
public class C670236x {
    public static final String[] A03 = {"facebook.com", "www.facebook.com", "m.facebook.com"};
    public static final String[] A04 = {"fbwat.ch", "www.fbwat.ch", "fb.watch", "www.fb.watch"};
    public static final String[] A05 = {"instagram.com", "www.instagram.com"};
    public static final String[] A06 = {"lassovideos.com", "www.lassovideos.com"};
    public static final String[] A07 = {"netflix.com", "www.netflix.com"};
    public static final String[] A08 = {"sharechat.com", "www.sharechat.com"};
    public static final String[] A09 = {"streamable.com", "www.streamable.com"};
    public final int A00;
    public final int A01;
    public final String A02;

    public C670236x(String str, int i, int i2) {
        this.A02 = str;
        this.A00 = i2;
        this.A01 = i;
    }

    public static int A00(int i) {
        if (i == 2) {
            return R.drawable.ic_pip_facebook;
        }
        if (i == 3) {
            return R.drawable.ic_pip_instagram;
        }
        if (i == 4) {
            return R.drawable.ic_pip_youtube;
        }
        if (i == 5) {
            return R.drawable.ic_pip_fb_watch;
        }
        if (i == 6) {
            return R.drawable.ic_pip_lasso;
        }
        if (i != 8) {
            return -1;
        }
        return R.drawable.ic_pip_sharechat;
    }

    public static int A01(String str) {
        Uri parse = Uri.parse(AnonymousClass1Y8.A03(str, AnonymousClass1Y8.A03));
        if (A03(parse)) {
            return 5;
        }
        if (A04(parse, A03)) {
            return 2;
        }
        if (A04(parse, A05)) {
            return 3;
        }
        if (A04(parse, A09)) {
            return 1;
        }
        if (!TextUtils.isEmpty(A02(parse))) {
            return 4;
        }
        if (A04(parse, A06)) {
            return 6;
        }
        if (A04(parse, A07)) {
            return 7;
        }
        return A04(parse, A08) ? 8 : 0;
    }

    public static String A02(Uri uri) {
        String host;
        if (uri == null || (host = uri.getHost()) == null) {
            return null;
        }
        if ("m.youtube.com".equalsIgnoreCase(host) || "www.youtube.com".equalsIgnoreCase(host) || "youtube.com".equalsIgnoreCase(host)) {
            return uri.getQueryParameter("v");
        }
        if ("youtu.be".equalsIgnoreCase(host)) {
            return uri.getLastPathSegment();
        }
        return null;
    }

    public static boolean A03(Uri uri) {
        if (!A04(uri, A04)) {
            return A04(uri, A03) && "1".equalsIgnoreCase(uri.getQueryParameter("fw"));
        }
        return true;
    }

    public static boolean A04(Uri uri, String[] strArr) {
        String host;
        if (uri == null || (host = uri.getHost()) == null) {
            return false;
        }
        for (String str : strArr) {
            if (host.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
