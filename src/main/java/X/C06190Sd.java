package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.Locale;

/* renamed from: X.0Sd  reason: invalid class name and case insensitive filesystem */
public class C06190Sd {
    public static final int A02 = C06200Se.A04;
    public static volatile C06190Sd A03;
    public final C000300f A00;
    public final C02040Ak A01;

    public C06190Sd(C000300f r1, C02040Ak r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static C06190Sd A00() {
        if (A03 == null) {
            synchronized (C06190Sd.class) {
                if (A03 == null) {
                    A03 = new C06190Sd(C000300f.A00(), C02040Ak.A00());
                }
            }
        }
        return A03;
    }

    public static UserJid A01(Uri uri) {
        String queryParameter = uri.getQueryParameter("phoneNumber");
        if ("wa.me".equals(uri.getHost())) {
            boolean z = false;
            if (uri.getPathSegments().size() == 2) {
                z = true;
            }
            AnonymousClass00E.A06(z);
            queryParameter = uri.getLastPathSegment();
        }
        if (queryParameter == null) {
            return null;
        }
        try {
            return UserJid.getFromIdentifier(queryParameter);
        } catch (AnonymousClass02Y unused) {
            return null;
        }
    }

    public static String A02(Uri uri) {
        String queryParameter = uri.getQueryParameter("phone");
        String host = uri.getHost();
        if (!TextUtils.isEmpty(host)) {
            host = host.toLowerCase(Locale.US);
        }
        return "wa.me".equals(host) ? uri.getLastPathSegment() : queryParameter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if ("wa.me".equals(r5) == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03(android.net.Uri r14) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06190Sd.A03(android.net.Uri):int");
    }

    public boolean A04(String str) {
        if (!TextUtils.isEmpty(str) && 6 == A03(Uri.parse(str))) {
            return true;
        }
        return false;
    }
}
