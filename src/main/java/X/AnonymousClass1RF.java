package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRoute;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.DefaultHttpRoutePlanner;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;

/* renamed from: X.1RF  reason: invalid class name */
public class AnonymousClass1RF {
    public static final ConnPerRoute A0H = AnonymousClass1R8.A00;
    public String A00;
    public boolean A01 = true;
    public final Context A02;
    public final AnonymousClass009 A03;
    public final C27461Qc A04;
    public final AnonymousClass0JJ A05;
    public final AnonymousClass1R0 A06;
    public final C003301q A07;
    public final AnonymousClass03R A08;
    public final AnonymousClass03S A09;
    public final AnonymousClass00T A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final AtomicInteger A0E = new AtomicInteger(0);
    public final SSLSocketFactory A0F;
    public final DefaultHttpClient A0G;

    public AnonymousClass1RF(Context context, AnonymousClass009 r10, AnonymousClass03A r11, AnonymousClass0CL r12, AnonymousClass03R r13, AnonymousClass0JJ r14, AnonymousClass1R0 r15, AnonymousClass03S r16, String str, C003301q r18, AnonymousClass00T r19, String str2) {
        String str3;
        this.A02 = context;
        this.A03 = r10;
        this.A08 = r13;
        this.A05 = r14;
        this.A06 = r15;
        this.A09 = r16;
        this.A0B = str;
        this.A07 = r18;
        this.A0A = r19;
        synchronized (r11) {
            if (r11.A01 == null) {
                r11.A01 = AnonymousClass03A.A01(r11.A02, "2.21.2.4", true);
            }
            str3 = r11.A01;
        }
        this.A0D = str3;
        this.A0F = new C27501Qg(r12);
        C27461Qc r6 = new C27461Qc(r12);
        this.A04 = r6;
        C27481Qe r5 = new C27481Qe(r12);
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        basicHttpParams.setParameter("http.protocol.version", HttpVersion.HTTP_1_1);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, A0H);
        StringBuilder sb = new StringBuilder("gdrive-api-v2/construct max connections per route: ");
        sb.append(ConnManagerParams.getMaxConnectionsPerRoute(basicHttpParams).getMaxForRoute(new HttpRoute(new HttpHost("backup.googleapis.com"))));
        Log.d(sb.toString());
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, true);
        HttpProtocolParams.setUserAgent(basicHttpParams, this.A0D);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("https", new AnonymousClass1RC(), 443));
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
        defaultHttpClient.setRoutePlanner(new DefaultHttpRoutePlanner(schemeRegistry));
        defaultHttpClient.addResponseInterceptor(r5);
        defaultHttpClient.addRequestInterceptor(r6);
        this.A0G = defaultHttpClient;
        this.A0C = str2;
    }

    public static String A00(String str) {
        return new URI("https", null, "backup.googleapis.com", -1, str, null, null).toASCIIString().replaceAll("\\+", "%2B");
    }

    public static HttpResponse A01(AnonymousClass1RF r2, HttpRequestBase httpRequestBase) {
        if (r2 != null) {
            httpRequestBase.getURI();
            httpRequestBase.setHeader("Host", "backup.googleapis.com");
            StringBuilder sb = new StringBuilder("Bearer ");
            sb.append(r2.A00);
            httpRequestBase.setHeader("Authorization", sb.toString());
            return r2.A0G.execute(httpRequestBase);
        }
        throw null;
    }

    public static void A02(AnonymousClass009 r3, String str, int i) {
        if (i >= 400 && i < 500) {
            String A0K = AnonymousClass008.A0K("gdrive-api-v2/unhandled/error/", str);
            StringBuilder sb = new StringBuilder("status-code = ");
            sb.append(i);
            r3.A04(A0K, sb.toString(), false);
        }
    }

    public static final boolean A03(File file, File file2) {
        if (file.renameTo(file2)) {
            return true;
        }
        StringBuilder A0S = AnonymousClass008.A0S("gdrive-api-v2/rename-local/file/failed ");
        A0S.append(file.getAbsolutePath());
        A0S.append(" -> ");
        A0S.append(file2.getAbsolutePath());
        Log.e(A0S.toString());
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x01de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A04(java.lang.String r21, int r22, java.lang.String r23, java.lang.String r24) {
        /*
        // Method dump skipped, instructions count: 485
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RF.A04(java.lang.String, int, java.lang.String, java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1RA A05(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RF.A05(java.lang.String):X.1RA");
    }

    public HttpURLConnection A06(String str, String str2, Map map, String str3, boolean z) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("/v1/");
            sb.append(str2);
            return A07(str, new URI("https", null, "backup.googleapis.com", -1, sb.toString(), null, null).toASCIIString(), map, str3, z);
        } catch (URISyntaxException e) {
            throw new IOException(e);
        }
    }

    public HttpURLConnection A07(String str, String str2, Map map, String str3, boolean z) {
        String str4 = this.A0C;
        if (str4 != null) {
            if (map == null) {
                map = new HashMap(1);
            }
            AnonymousClass00E.A08(true ^ map.containsKey("mode"), "mode param should not be included in params");
            map.put("mode", str4);
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(AnonymousClass0JJ.A0C(str2, map)).openConnection();
        httpsURLConnection.setSSLSocketFactory(this.A0F);
        httpsURLConnection.setRequestProperty("Host", "backup.googleapis.com");
        httpsURLConnection.setHostnameVerifier(new C29231Xp("backup.googleapis.com", new BrowserCompatHostnameVerifier()));
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(this.A00);
        httpsURLConnection.setRequestProperty("Authorization", sb.toString());
        httpsURLConnection.setRequestProperty("User-Agent", this.A0D);
        httpsURLConnection.setConnectTimeout(15000);
        httpsURLConnection.setReadTimeout(30000);
        httpsURLConnection.setRequestMethod(str);
        if (str3 != null) {
            httpsURLConnection.setRequestProperty("Content-Type", str3);
        }
        httpsURLConnection.setDoOutput(z);
        this.A0E.incrementAndGet();
        return httpsURLConnection;
    }

    public boolean A08() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("gdrive-api-v2/auth-request asking GoogleAuthUtil for auth token: ");
            String str = this.A0B;
            sb.append(AnonymousClass0JJ.A0B(str));
            Log.i(sb.toString());
            String str2 = this.A00;
            if (str2 != null) {
                Context context = this.A02;
                C001801b.A1U("Calling this from your main thread can lead to deadlock");
                C235816m.A02(context);
                Bundle bundle = new Bundle();
                String str3 = context.getApplicationInfo().packageName;
                bundle.putString("clientPackageName", str3);
                if (!bundle.containsKey("androidPackageName")) {
                    bundle.putString("androidPackageName", str3);
                }
                C235816m.A00(context, C235816m.A00, new C34651iw(str2, bundle));
            }
            this.A00 = C34531if.A04(this.A02, str);
            Log.i("gdrive-api-v2/auth-request/received-auth-token");
            return true;
        } catch (C456025m e) {
            Log.e("gdrive-api-v2/auth-request Google Play services is unavailable, if it was unavailable from the beginning code would not have reached here, so, most likely it became unavailable while the backup/restore was in progress");
            Log.e("gdrive-api-v2/auth-request", e);
            this.A00 = null;
            throw new C41491v9(e);
        } catch (C34541ih e2) {
            StringBuilder A0S = AnonymousClass008.A0S("gdrive-api-v2/auth-request permission to access Google Drive for ");
            A0S.append(AnonymousClass0JJ.A0B(this.A0B));
            A0S.append(" is not available and we cannot ask user for permission either.");
            Log.i(A0S.toString());
            throw new C41491v9(e2);
        } catch (IOException e3) {
            Log.d("gdrive-api-v2/auth-request IOException while trying to fetch auth token");
            Log.e("gdrive-api-v2/auth-request", e3);
            this.A00 = null;
            return false;
        } catch (AnonymousClass16O e4) {
            Log.e("gdrive-api-v2/auth-request", e4);
            if ("BadUsername".equals(e4.getMessage())) {
                throw new C41481v8(e4);
            } else if ("ServiceUnavailable".equals(e4.getMessage())) {
                return false;
            } else {
                this.A00 = null;
                throw new C41491v9(e4);
            }
        } catch (SecurityException e5) {
            Log.e("gdrive-api-v2/auth-request", e5);
            this.A00 = null;
            throw new C41491v9(e5);
        } catch (NullPointerException e6) {
            StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-api-v2/auth-request unexpected NullPointerException while trying to get  auth token for the account ");
            A0S2.append(AnonymousClass0JJ.A0B(this.A0B));
            Log.e(A0S2.toString());
            Log.e("gdrive-api-v2/auth-request", e6);
            this.A00 = null;
            throw new C41491v9(e6);
        }
    }

    public synchronized boolean A09() {
        return !this.A01;
    }

    public final boolean A0A(File file, long j, String str) {
        String A092 = AnonymousClass0JJ.A09(this.A08, this.A09, file, j);
        if (str.equals(A092)) {
            return true;
        }
        StringBuilder A0S = AnonymousClass008.A0S("gdrive-api-v2/save-file/check-md5 ");
        A0S.append(file.getAbsolutePath());
        A0S.append(" downloaded but its MD5(");
        A0S.append(A092);
        A0S.append(") does not match remote md5(");
        A0S.append(str);
        A0S.append(").");
        Log.e(A0S.toString());
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0410, code lost:
        if (r4 == null) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0426, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0447, code lost:
        if (r4.contains("ENOSPC") == false) goto L_0x0449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0459, code lost:
        com.whatsapp.util.Log.e("gdrive-api-v2/save-file name too long");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0463, code lost:
        throw new X.C41521vC(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0464, code lost:
        com.whatsapp.util.Log.e("gdrive-api-v2/save-file no space left on the device.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x046e, code lost:
        throw new X.C41571vH();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0484, code lost:
        throw new X.C41461v5(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x048f, code lost:
        com.whatsapp.util.Log.e("gdrive-api-v2/save-file permission denied");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0499, code lost:
        throw new X.C41461v5(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04a6, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x04a7, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("gdrive-api-v2/save-file unable to access ");
        r3.append(r24.getURL());
        com.whatsapp.util.Log.i(r3.toString(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013c, code lost:
        if (A0A(r10, r10.length(), r35.A02) == false) goto L_0x00fd;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x040e */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0441 A[Catch:{ all -> 0x04c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04a6 A[ExcHandler: UnknownHostException (r4v5 'e' java.net.UnknownHostException A[CUSTOM_DECLARE]), Splitter:B:56:0x01c4] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B(java.io.File r34, X.AnonymousClass1RH r35, X.AbstractC27521Qi r36, X.AbstractC03860Ib r37) {
        /*
        // Method dump skipped, instructions count: 1256
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RF.A0B(java.io.File, X.1RH, X.1Qi, X.0Ib):boolean");
    }
}
