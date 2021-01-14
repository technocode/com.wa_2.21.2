package X;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: X.0Dj  reason: invalid class name and case insensitive filesystem */
public class C02770Dj {
    public static final String[] A07 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public static volatile C02770Dj A08;
    public long A00 = -1;
    public boolean A01;
    public final C02780Dk A02;
    public final AnonymousClass01I A03;
    public final AnonymousClass03P A04;
    public final AnonymousClass00S A05;
    public final AnonymousClass00D A06;

    public C02770Dj(AnonymousClass00S r3, AnonymousClass01I r4, C02780Dk r5, AnonymousClass03P r6, AnonymousClass00D r7) {
        this.A05 = r3;
        this.A03 = r4;
        this.A02 = r5;
        this.A04 = r6;
        this.A06 = r7;
    }

    public static C02770Dj A00() {
        if (A08 == null) {
            synchronized (C02770Dj.class) {
                if (A08 == null) {
                    A08 = new C02770Dj(AnonymousClass00S.A00(), AnonymousClass01I.A00(), C02780Dk.A02(), AnonymousClass03P.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A08;
    }

    public static void A01(Context context) {
        String str = AnonymousClass04k.A06;
        C19470v5.A03 = null;
        C19470v5.A0D = str;
        Context applicationContext = context.getApplicationContext();
        C19470v5.A02 = applicationContext;
        String packageName = applicationContext.getPackageName();
        if ("com.instagram.android".equals(packageName) || "com.instagram.android.preload".equals(packageName)) {
            C19470v5.A0E = "https://graph.instagram.com/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";
            C19470v5.A0C = C19470v5.A08;
        } else if ("com.whatsapp".equals(packageName) || "com.whatsapp.w4b".equals(packageName)) {
            C19470v5.A0E = "https://graph.whatsapp.net/v2.2/maps_configs?fields=base_url,static_base_url,osm_config,url_override_config&pretty=0&access_token=";
        } else if ("com.expresswifi.customer".equals(packageName)) {
            C19470v5.A0C = C19470v5.A09;
        }
        if (C19470v5.A01 == null) {
            AnonymousClass0v2 r3 = new AnonymousClass0v2();
            C19470v5.A01 = r3;
            C19470v5.A02.registerReceiver(r3, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        }
        Context applicationContext2 = context.getApplicationContext();
        C19590vH.A02 = applicationContext2;
        C19590vH.A00 = applicationContext2.getResources().getDisplayMetrics().density;
    }

    public static void A02(C76293eJ r4, C02900Dx r5, Integer num) {
        double d = r5.A00;
        r4.A02();
        C02890Dw r3 = (C02890Dw) r4.A00;
        r3.A04 |= 1;
        r3.A00 = d;
        double d2 = r5.A01;
        r4.A02();
        C02890Dw r32 = (C02890Dw) r4.A00;
        r32.A04 |= 2;
        r32.A01 = d2;
        int i = r5.A03;
        if (i != -1) {
            r4.A02();
            C02890Dw r1 = (C02890Dw) r4.A00;
            r1.A04 |= 4;
            r1.A03 = i;
        }
        float f = r5.A02;
        if (f != -1.0f) {
            r4.A02();
            C02890Dw r12 = (C02890Dw) r4.A00;
            r12.A04 |= 8;
            r12.A02 = f;
        }
        int i2 = r5.A04;
        if (i2 != -1) {
            r4.A02();
            C02890Dw r13 = (C02890Dw) r4.A00;
            r13.A04 |= 16;
            r13.A05 = i2;
        }
        if (num != null) {
            int intValue = num.intValue();
            r4.A02();
            C02890Dw r14 = (C02890Dw) r4.A00;
            r14.A04 |= 128;
            r14.A06 = intValue;
        }
    }

    public static boolean A03(Location location, Location location2) {
        if (location2 == null || location2.getTime() + 120000 < location.getTime() || location2.getAccuracy() > location.getAccuracy()) {
            return true;
        }
        if (!TextUtils.equals(location2.getProvider(), location.getProvider()) || location2.distanceTo(location) <= Math.max(10.0f, location.getAccuracy())) {
            return false;
        }
        return true;
    }

    public C02840Dr A04(C02900Dx r3, Integer num) {
        C04970Mo A082 = C02840Dr.A08();
        C02890Dw r0 = ((C02840Dr) A082.A00).A0M;
        if (r0 == null) {
            r0 = C02890Dw.A0B;
        }
        C76293eJ r02 = (C76293eJ) r0.AQb();
        A02(r02, r3, num);
        A082.A07(r02);
        return (C02840Dr) A082.A01();
    }

    public C02900Dx A05(Location location) {
        AnonymousClass01I r0 = this.A03;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid != null) {
            C02900Dx r6 = new C02900Dx(userJid);
            r6.A00 = ((double) Math.round(location.getLatitude() * 1000000.0d)) / 1000000.0d;
            r6.A01 = ((double) Math.round(location.getLongitude() * 1000000.0d)) / 1000000.0d;
            if (location.hasAccuracy()) {
                r6.A03 = (int) location.getAccuracy();
            }
            if (location.hasSpeed()) {
                r6.A02 = ((float) ((int) (location.getSpeed() * 100.0f))) / 100.0f;
            }
            if (location.hasBearing()) {
                r6.A04 = (int) location.getBearing();
            }
            long time = location.getTime();
            r6.A05 = time;
            AnonymousClass00S r3 = this.A05;
            if (time > r3.A05()) {
                r6.A05 = r3.A05();
            }
            return r6;
        }
        throw null;
    }

    public void A06(Activity activity, AnonymousClass02N r5) {
        Class cls;
        if (A09(activity)) {
            cls = LocationPicker2.class;
        } else {
            cls = LocationPicker.class;
        }
        Intent intent = new Intent(activity, cls);
        intent.putExtra("jid", r5.getRawString());
        intent.putExtra("live_location_mode", true);
        activity.startActivityForResult(intent, 100);
    }

    public void A07(Context context, double d, double d2, String str) {
        String str2;
        String str3 = str;
        if (str != null) {
            try {
                str3 = URLEncoder.encode(str3, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                Log.e("app/failed-url-encode");
            }
        }
        try {
            StringBuilder sb = new StringBuilder("geo:");
            sb.append(d);
            sb.append(",");
            sb.append(d2);
            sb.append("?q=");
            sb.append(d);
            sb.append(",");
            sb.append(d2);
            String obj = sb.toString();
            if (str3 != null) {
                obj = AnonymousClass008.A0M(obj, "(", str3, ")");
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(obj)));
        } catch (ActivityNotFoundException e) {
            Log.w("open-map/start-activity ", e);
            C02780Dk r9 = this.A02;
            if (DecimalFormatSymbols.getInstance(Locale.getDefault()).getDecimalSeparator() == ',') {
                long j = this.A00;
                if (j < 0) {
                    j = C002001d.A0L(context, "com.google.android.apps.maps");
                    this.A00 = j;
                    if (j == -1) {
                        this.A00 = 0;
                    }
                }
                if (j >= 700000000 && j < 702000000) {
                    StringBuilder sb2 = new StringBuilder("https://maps.google.com/maps?q=loc:(");
                    sb2.append(d);
                    sb2.append(",");
                    sb2.append(d2);
                    sb2.append("&z=16");
                    str2 = sb2.toString();
                    r9.A05(context, new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                }
            }
            StringBuilder sb3 = new StringBuilder("https://maps.google.com/maps?q=loc:");
            sb3.append(d);
            sb3.append(",");
            sb3.append(d2);
            str2 = sb3.toString();
            if (str3 != null) {
                str2 = AnonymousClass008.A0M(str2, " (", str3, ")");
            }
            r9.A05(context, new Intent("android.intent.action.VIEW", Uri.parse(str2)));
        }
    }

    public void A08(Context context, AnonymousClass02N r5, UserJid userJid) {
        Class cls;
        if (A09(context)) {
            cls = GroupChatLiveLocationsActivity2.class;
        } else {
            cls = GroupChatLiveLocationsActivity.class;
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra("jid", r5.getRawString());
        intent.putExtra("target", AnonymousClass1VY.A0D(userJid));
        context.startActivity(intent);
    }

    public boolean A09(Context context) {
        if (!C002001d.A3F(context) || AnonymousClass1B7.A00(context) != 0) {
            return false;
        }
        ActivityManager A012 = this.A04.A01();
        if (A012 == null) {
            Log.w("app/has-google-maps-v2 am=false");
            return false;
        } else if (A012.getDeviceConfigurationInfo().reqGlEsVersion >= 131072) {
            return true;
        } else {
            return false;
        }
    }
}
