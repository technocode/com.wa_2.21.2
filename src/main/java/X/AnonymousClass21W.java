package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.21W  reason: invalid class name */
public class AnonymousClass21W {
    public final AnonymousClass03A A00;

    public AnonymousClass21W(AnonymousClass03A r1) {
        this.A00 = r1;
    }

    public static AbstractC28621Va A00(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.connect();
        return new AnonymousClass21V(httpURLConnection);
    }

    public AbstractC28621Va A01(String str, AnonymousClass03U r6, String str2) {
        try {
            try {
                URLConnection openConnection = new URL(Uri.parse(str).toString()).openConnection();
                if (openConnection instanceof HttpsURLConnection) {
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setSSLSocketFactory(r6.A04());
                    httpsURLConnection.setConnectTimeout(15000);
                    httpsURLConnection.setReadTimeout(30000);
                    if (str2 != null) {
                        httpsURLConnection.addRequestProperty("If-None-Match", str2);
                    }
                    httpsURLConnection.setRequestProperty("User-Agent", this.A00.A02());
                    return new AnonymousClass21V(httpsURLConnection);
                }
                throw new IOException("WaHttpUrlConnectionClient/createDownloadableFilesConnection/failed to open http url connection");
            } catch (IOException e) {
                throw new IOException("WaHttpUrlConnectionClient/createDownloadableFilesConnection/failed to open http url connection", e);
            }
        } catch (MalformedURLException e2) {
            Log.e("WaHttpUrlConnectionClient/createDownloadableFilesConnection/malformed-url : ", e2);
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        if (r1 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC28621Va A02(java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            java.net.URL r0 = new java.net.URL
            r0.<init>(r4)
            java.net.URLConnection r2 = r0.openConnection()
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r0 = 15000(0x3a98, float:2.102E-41)
            r2.setConnectTimeout(r0)
            r0 = 30000(0x7530, float:4.2039E-41)
            r2.setReadTimeout(r0)
            X.03A r0 = r3.A00
            java.lang.String r1 = r0.A02()
            java.lang.String r0 = "User-Agent"
            r2.setRequestProperty(r0, r1)
            if (r6 == 0) goto L_0x0029
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "gzip"
            r2.setRequestProperty(r1, r0)
        L_0x0029:
            if (r5 == 0) goto L_0x0055
            java.lang.String r0 = "POST"
            r2.setRequestMethod(r0)
            r0 = 1
            r2.setDoOutput(r0)
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = "application/json"
            r2.setRequestProperty(r1, r0)
            java.io.OutputStream r1 = r2.getOutputStream()
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r5.getBytes(r0)     // Catch:{ all -> 0x0049 }
            r1.write(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x0052
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0
        L_0x0052:
            r1.close()
        L_0x0055:
            r2.connect()
            X.21V r0 = new X.21V
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass21W.A02(java.lang.String, java.lang.String, boolean):X.1Va");
    }
}
