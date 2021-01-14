package X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.26V  reason: invalid class name */
public final class AnonymousClass26V extends AbstractC35671kk {
    public static final byte[] A02 = "\n".getBytes();
    public final AnonymousClass1AI A00;
    public final String A01;

    public AnonymousClass26V(C242819u r9) {
        super(r9);
        String str;
        String str2 = C242719t.A00;
        String str3 = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        if (locale != null) {
            String language = locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                StringBuilder sb = new StringBuilder();
                sb.append(language.toLowerCase(locale));
                if (!TextUtils.isEmpty(locale.getCountry())) {
                    sb.append("-");
                    sb.append(locale.getCountry().toLowerCase(locale));
                }
                str = sb.toString();
                this.A01 = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", str2, str3, str, Build.MODEL, Build.ID);
                this.A00 = new AnonymousClass1AI(r9.A03);
            }
        }
        str = null;
        this.A01 = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", str2, str3, str, Build.MODEL, Build.ID);
        this.A00 = new AnonymousClass1AI(r9.A03);
    }

    public static void A02(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e A[SYNTHETIC, Splitter:B:25:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0D(java.net.URL r12, byte[] r13) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26V.A0D(java.net.URL, byte[]):int");
    }

    public final String A0E(AnonymousClass1A9 r11, boolean z) {
        long j;
        String str;
        C001801b.A1Q(r11);
        StringBuilder sb = new StringBuilder();
        try {
            Map map = r11.A03;
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                if (!"ht".equals(str2) && !"qt".equals(str2) && !"AppUID".equals(str2) && !"z".equals(str2) && !"_gmsv".equals(str2)) {
                    A02(sb, str2, (String) entry.getValue());
                }
            }
            long j2 = r11.A02;
            A02(sb, "ht", String.valueOf(j2));
            if (((C242619s) this).A00.A03 != null) {
                A02(sb, "qt", String.valueOf(System.currentTimeMillis() - j2));
                if (z) {
                    C001801b.A1T("_s");
                    C001801b.A1a(true, "Short param name required");
                    String str3 = (String) map.get("_s");
                    if (str3 == null) {
                        str3 = "0";
                    }
                    try {
                        j = Long.parseLong(str3);
                    } catch (NumberFormatException unused) {
                        j = 0;
                    }
                    if (j != 0) {
                        str = String.valueOf(j);
                    } else {
                        str = String.valueOf(r11.A01);
                    }
                    A02(sb, "z", str);
                }
                return sb.toString();
            }
            throw null;
        } catch (UnsupportedEncodingException e) {
            A09("Failed to encode name or value", e);
            return null;
        }
    }

    public final HttpURLConnection A0F(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(((Number) AnonymousClass1A5.A02.A00).intValue());
            httpURLConnection.setReadTimeout(((Number) AnonymousClass1A5.A03.A00).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.A01);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    public final void A0G(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            try {
                inputStream.close();
            } catch (IOException e) {
                A09("Error closing http connection input stream", e);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                    throw th;
                } catch (IOException e2) {
                    A09("Error closing http connection input stream", e2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public final boolean A0H() {
        AnonymousClass16M.A00();
        A0C();
        NetworkInfo networkInfo = null;
        try {
            networkInfo = ((ConnectivityManager) ((C242619s) this).A00.A00.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        A03("No network connectivity");
        return false;
    }
}
