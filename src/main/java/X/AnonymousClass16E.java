package X;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: X.16E  reason: invalid class name */
public final class AnonymousClass16E extends Thread {
    public final /* synthetic */ Map A00;

    public AnonymousClass16E(Map map) {
        this.A00 = map;
    }

    public final void run() {
        Throwable e;
        String str;
        StringBuilder sb;
        String str2;
        Map map = this.A00;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str3 : map.keySet()) {
            buildUpon.appendQueryParameter(str3, (String) map.get(str3));
        }
        String obj = buildUpon.build().toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(obj).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 65);
                    sb2.append("Received non-success response code ");
                    sb2.append(responseCode);
                    sb2.append(" from pinging URL: ");
                    sb2.append(obj);
                    Log.w("HttpUrlPinger", sb2.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            str = e.getMessage();
            sb = new StringBuilder(AnonymousClass008.A00(str, AnonymousClass008.A00(obj, 32)));
            str2 = "Error while parsing ping URL: ";
            Log.w("HttpUrlPinger", AnonymousClass008.A0Q(sb, str2, obj, ". ", str), e);
        } catch (IOException | RuntimeException e3) {
            e = e3;
            str = e.getMessage();
            sb = new StringBuilder(AnonymousClass008.A00(str, AnonymousClass008.A00(obj, 27)));
            str2 = "Error while pinging URL: ";
            Log.w("HttpUrlPinger", AnonymousClass008.A0Q(sb, str2, obj, ". ", str), e);
        }
    }
}
