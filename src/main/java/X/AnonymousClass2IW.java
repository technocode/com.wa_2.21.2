package X;

import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.2IW  reason: invalid class name */
public class AnonymousClass2IW {
    public static String A00(String str) {
        try {
            String host = new URL(str).getHost();
            if (!C670236x.A03(Uri.parse(AnonymousClass1Y8.A03(str, AnonymousClass1Y8.A03)))) {
                return host;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(host);
            sb.append("/watch");
            return sb.toString();
        } catch (MalformedURLException unused) {
            return null;
        }
    }
}
