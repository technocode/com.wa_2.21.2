package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1Os  reason: invalid class name and case insensitive filesystem */
public class C27241Os {
    public static final Pattern A0H = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)", 34);
    public static final Pattern A0I = Pattern.compile("<head[^>]*>(.*)</head>", 34);
    public static final Pattern A0J = Pattern.compile("\\s*([^=]+)\\s*=\\s*(?:\"([^\"]+)\"|\\'([^\\']+)\\')", 34);
    public static final Pattern A0K = Pattern.compile("<link([^>]+?)/?>", 34);
    public static final Pattern A0L = Pattern.compile("<meta([^>]+?)/?>", 34);
    public static final Pattern A0M = Pattern.compile("<title[^>]*>(.*)</title>", 34);
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public C27231Or A07;
    public C670236x A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public byte[] A0E;
    public final C002701k A0F;
    public final String A0G;

    public C27241Os(C002701k r1, String str) {
        this.A0F = r1;
        this.A0G = str;
    }

    public static String A00(HashMap hashMap, String... strArr) {
        for (String str : strArr) {
            String str2 = (String) hashMap.get(str);
            if (str2 != null) {
                return str2.trim();
            }
        }
        return null;
    }

    public static HttpURLConnection A01(URL url, String str) {
        URLConnection openConnection = url.openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            StringBuilder sb = new StringBuilder("webpageinfo/not http ");
            sb.append(url);
            Log.d(sb.toString());
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
        httpURLConnection.setReadTimeout(SearchActionVerificationClientService.NOTIFICATION_ID);
        if (str != null) {
            httpURLConnection.setRequestProperty("Accept-Language", str);
        }
        StringBuilder A0S = AnonymousClass008.A0S("WhatsApp/");
        A0S.append("2.21.2.4".replace(' ', '_'));
        A0S.append(" A");
        httpURLConnection.setRequestProperty("User-Agent", A0S.toString());
        return httpURLConnection;
    }

    public static HashMap A02(String str) {
        HashMap hashMap = new HashMap();
        Matcher matcher = A0J.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group2 == null) {
                group2 = matcher.group(3);
            }
            hashMap.put(group, group2);
        }
        return hashMap;
    }

    public static void A03(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                C006803i.A0Z(httpURLConnection.getInputStream());
            } catch (IOException unused) {
            }
            httpURLConnection.disconnect();
        }
    }

    public static byte[] A04(Bitmap bitmap) {
        int min = Math.min(140, Math.min(bitmap.getWidth(), bitmap.getHeight()));
        int min2 = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawColor(-1);
        canvas.drawBitmap(bitmap, new Rect((bitmap.getWidth() - min2) >> 1, (bitmap.getHeight() - min2) >> 1, (bitmap.getWidth() + min2) >> 1, (bitmap.getHeight() + min2) >> 1), new Rect(0, 0, min, min), paint);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final C27231Or A05(String str, String str2, int i) {
        Throwable th;
        IOException e;
        if (!"image/gif".equals(str2) || i == -1) {
            return null;
        }
        if (str.endsWith("giphy.gif")) {
            try {
                if (new URI(str).getHost().contains("giphy.com")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.substring(0, str.length() - 9));
                    sb.append("200.mp4");
                    str = sb.toString();
                    HttpURLConnection httpURLConnection = null;
                    try {
                        httpURLConnection = A01(new URL(str), null);
                        if (httpURLConnection != null) {
                            try {
                                String headerField = httpURLConnection.getHeaderField("Content-Type");
                                if (headerField.equals("video/mp4")) {
                                    C27231Or r0 = new C27231Or(str, httpURLConnection.getContentLength(), headerField);
                                    A03(httpURLConnection);
                                    return r0;
                                }
                            } catch (IOException e2) {
                                e = e2;
                                try {
                                    Log.e("IOException", e);
                                    A03(httpURLConnection);
                                    return new C27231Or(str, i, str2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    A03(httpURLConnection);
                                    throw th;
                                }
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        Log.e("IOException", e);
                        A03(httpURLConnection);
                        return new C27231Or(str, i, str2);
                    } catch (Throwable th3) {
                        th = th3;
                        A03(httpURLConnection);
                        throw th;
                    }
                    A03(httpURLConnection);
                }
            } catch (URISyntaxException e4) {
                Log.w("Unable to create uri", e4);
            }
        }
        return new C27231Or(str, i, str2);
    }

    public final C27231Or A06(Map map, String... strArr) {
        C27231Or A052;
        int length = strArr.length;
        int i = 0;
        while (true) {
            HttpURLConnection httpURLConnection = null;
            if (i >= length) {
                return null;
            }
            String str = (String) map.get(strArr[i]);
            if (str != null && Patterns.WEB_URL.matcher(str).matches()) {
                try {
                    httpURLConnection = A01(new URL(str), null);
                    if (!(httpURLConnection == null || (A052 = A05(str, httpURLConnection.getHeaderField("Content-Type"), httpURLConnection.getContentLength())) == null)) {
                        A03(httpURLConnection);
                        return A052;
                    }
                } catch (IOException e) {
                    Log.e(e);
                } catch (Throwable th) {
                    A03(null);
                    throw th;
                }
                A03(httpURLConnection);
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0239, code lost:
        if ("video/mp4".equalsIgnoreCase((java.lang.String) r30.get("og:video:type")) == false) goto L_0x023b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A07(java.net.URL r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36) {
        /*
        // Method dump skipped, instructions count: 1206
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27241Os.A07(java.net.URL, java.lang.String, java.lang.String, java.lang.String, int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ff, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0102, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0103, code lost:
        if (r3 != null) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0108, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08() {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27241Os.A08():void");
    }

    public void A09() {
        this.A0C = null;
        this.A0A = null;
        this.A09 = null;
        this.A0B = null;
        this.A0D = false;
        this.A02 = 0;
    }

    public boolean A0A() {
        boolean z;
        if (this instanceof C52162ag) {
            return true;
        }
        boolean z2 = !TextUtils.isEmpty(this.A0C);
        boolean z3 = !TextUtils.isEmpty(this.A0A);
        C27231Or r0 = this.A07;
        if (r0 != null) {
            String str = r0.A01;
            if ("image/gif".equals(str) || "video/mp4".equals(str)) {
                z = true;
                if (!z2 || z3 || z) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        return !z2 ? true : true;
    }
}
