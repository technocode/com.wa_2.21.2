package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.Semaphore;

/* renamed from: X.0v5  reason: invalid class name and case insensitive filesystem */
public class C19470v5 {
    public static long A00;
    public static BroadcastReceiver A01;
    public static Context A02;
    public static AbstractC19260uj A03;
    public static String A04;
    public static String A05;
    public static String A06;
    public static final C19450v3 A07 = new C19450v3("https://www.facebook.com/maps/tile/?", "https://www.facebook.com/maps/static/?", null, Integer.MAX_VALUE, null, null);
    public static final C19450v3 A08 = new C19450v3("https://maps.instagram.com/maps/tile/?", "https://maps.instagram.com/maps/static/?", null, Integer.MAX_VALUE, null, null);
    public static final C19450v3 A09 = new C19450v3("https://expresswifi.com/maps/tile/?", "https://expresswifi.com/maps/static/?", null, Integer.MAX_VALUE, null, null);
    public static final List A0A = new LinkedList();
    public static final Semaphore A0B = new Semaphore(1);
    public static volatile C19450v3 A0C = A07;
    public static volatile String A0D;
    public static volatile String A0E = "https://graph.facebook.com/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";

    static {
        A01();
    }

    public static void A00() {
        if (A0D != null && A02 != null) {
            Semaphore semaphore = A0B;
            if (semaphore.tryAcquire()) {
                long j = A00;
                if (j == 0 || SystemClock.uptimeMillis() - j >= 3600000) {
                    C19440v1.A02(new C32191eU(), "MapConfigUpdateDispatchable");
                } else {
                    semaphore.release();
                }
            }
        }
    }

    public static void A01() {
        String str;
        String str2;
        String language = Locale.getDefault().getLanguage();
        if (language.length() == 2) {
            String country = Locale.getDefault().getCountry();
            StringBuilder A0S = AnonymousClass008.A0S(language);
            if (country.length() == 2) {
                str2 = AnonymousClass008.A0K("_", country);
            } else {
                str2 = "";
            }
            A0S.append(str2);
            str = A0S.toString();
            A04 = str;
        } else {
            str = "en";
            A04 = str;
        }
        A05 = str.toLowerCase(Locale.US);
        try {
            A06 = Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused) {
            A06 = "eng";
        }
    }
}
