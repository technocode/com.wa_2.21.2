package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.0CW  reason: invalid class name */
public class AnonymousClass0CW {
    public static volatile AnonymousClass0CW A06;
    public AtomicInteger A00 = new AtomicInteger();
    public boolean A01 = false;
    public final C000300f A02;
    public final C002701k A03;
    public final AnonymousClass03U A04;
    public final AnonymousClass03A A05;

    public AnonymousClass0CW(C002701k r2, AnonymousClass03A r3, C000300f r4, AnonymousClass03U r5) {
        this.A03 = r2;
        this.A05 = r3;
        this.A02 = r4;
        this.A04 = r5;
    }

    public static AnonymousClass0CW A00() {
        if (A06 == null) {
            synchronized (AnonymousClass0CW.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass0CW(C002701k.A00(), AnonymousClass03A.A00(), C000300f.A00(), AnonymousClass03U.A00());
                }
            }
        }
        return A06;
    }

    public AnonymousClass0J3 A01(String str, AnonymousClass0J2 r9) {
        return new AnonymousClass0J3(this.A04, str, this.A05.A02(), r9, A06(), A05());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r6.A02.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d2, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d6, code lost:
        if (r7 != null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00db, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC28621Va A02(java.net.URL r12, long r13, long r15, X.AnonymousClass0J5 r17) {
        /*
        // Method dump skipped, instructions count: 353
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CW.A02(java.net.URL, long, long, X.0J5):X.1Va");
    }

    public final AbstractC28621Va A03(URL url, String str, String str2) {
        AnonymousClass230 r5;
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        boolean z = false;
        if (A06()) {
            AnonymousClass230 A032 = this.A04.A03(false);
            r5 = A032;
            if (A05()) {
                httpsURLConnection.setHostnameVerifier(new C29231Xp(str, HttpsURLConnection.getDefaultHostnameVerifier()));
                r5 = A032;
            }
        } else {
            r5 = this.A04.A04();
        }
        int A5N = r5.A5N();
        httpsURLConnection.setSSLSocketFactory(r5);
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestMethod(str2);
        httpsURLConnection.setRequestProperty("Host", str);
        httpsURLConnection.setRequestProperty("User-Agent", this.A05.A02());
        try {
            httpsURLConnection.connect();
            if (r5.A5N() == A5N) {
                z = true;
            }
            return new AnonymousClass21V(httpsURLConnection, Boolean.valueOf(z));
        } catch (IllegalArgumentException e) {
            throw new IOException(e);
        }
    }

    public void A04() {
        if (this.A00.addAndGet(1) > 15) {
            Log.i("Disable WATLS stack.");
            this.A01 = true;
        }
    }

    public boolean A05() {
        if (!A06()) {
            return false;
        }
        C002701k r2 = this.A03;
        if (r2.A0F(58)) {
            return r2.A0E(58);
        }
        return this.A02.A0D(AbstractC000400g.A2k);
    }

    public final boolean A06() {
        if (this.A01) {
            return false;
        }
        C002701k r2 = this.A03;
        if (r2.A0F(48)) {
            return r2.A0E(48);
        }
        return this.A02.A0D(AbstractC000400g.A2j);
    }
}
