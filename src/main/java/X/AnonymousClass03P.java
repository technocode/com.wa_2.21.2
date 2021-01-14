package X;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.KeyguardManager;
import android.app.usage.UsageStatsManager;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.Vibrator;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.03P  reason: invalid class name */
public class AnonymousClass03P {
    public static volatile AnonymousClass03P A0I;
    public ActivityManager A00;
    public KeyguardManager A01;
    public AnonymousClass03Q A02;
    public UsageStatsManager A03;
    public ClipboardManager A04;
    public ContentResolver A05;
    public SensorManager A06;
    public LocationManager A07;
    public ConnectivityManager A08;
    public WifiManager A09;
    public PowerManager A0A;
    public Vibrator A0B;
    public TelecomManager A0C;
    public SubscriptionManager A0D;
    public TelephonyManager A0E;
    public AccessibilityManager A0F;
    public InputMethodManager A0G;
    public final AnonymousClass00G A0H;

    public AnonymousClass03P(AnonymousClass00G r1) {
        this.A0H = r1;
    }

    public static AnonymousClass03P A00() {
        if (A0I == null) {
            synchronized (AnonymousClass03P.class) {
                if (A0I == null) {
                    A0I = new AnonymousClass03P(AnonymousClass00G.A01);
                }
            }
        }
        return A0I;
    }

    public ActivityManager A01() {
        ActivityManager activityManager = this.A00;
        if (activityManager != null) {
            return activityManager;
        }
        ActivityManager activityManager2 = (ActivityManager) this.A0H.A00.getSystemService("activity");
        this.A00 = activityManager2;
        return activityManager2;
    }

    public AlarmManager A02() {
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || i >= 26) {
            return (AlarmManager) this.A0H.A00.getSystemService("alarm");
        }
        AnonymousClass03Q r1 = this.A02;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass03Q r12 = new AnonymousClass03Q((AlarmManager) this.A0H.A00.getSystemService("alarm"));
        this.A02 = r12;
        return r12;
    }

    public KeyguardManager A03() {
        KeyguardManager keyguardManager = this.A01;
        if (keyguardManager != null) {
            return keyguardManager;
        }
        KeyguardManager keyguardManager2 = (KeyguardManager) this.A0H.A00.getSystemService("keyguard");
        this.A01 = keyguardManager2;
        return keyguardManager2;
    }

    public UsageStatsManager A04() {
        UsageStatsManager usageStatsManager = this.A03;
        if (usageStatsManager != null) {
            return usageStatsManager;
        }
        UsageStatsManager usageStatsManager2 = (UsageStatsManager) this.A0H.A00.getSystemService("usagestats");
        this.A03 = usageStatsManager2;
        return usageStatsManager2;
    }

    public ClipboardManager A05() {
        ClipboardManager clipboardManager = this.A04;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        ClipboardManager clipboardManager2 = (ClipboardManager) this.A0H.A00.getSystemService("clipboard");
        this.A04 = clipboardManager2;
        return clipboardManager2;
    }

    public ContentResolver A06() {
        ContentResolver contentResolver = this.A05;
        if (contentResolver != null) {
            return contentResolver;
        }
        ContentResolver contentResolver2 = this.A0H.A00.getContentResolver();
        this.A05 = contentResolver2;
        return contentResolver2;
    }

    public SensorManager A07() {
        SensorManager sensorManager = this.A06;
        if (sensorManager != null) {
            return sensorManager;
        }
        SensorManager sensorManager2 = (SensorManager) this.A0H.A00.getSystemService("sensor");
        this.A06 = sensorManager2;
        return sensorManager2;
    }

    public LocationManager A08() {
        LocationManager locationManager = this.A07;
        if (locationManager != null) {
            return locationManager;
        }
        LocationManager locationManager2 = (LocationManager) this.A0H.A00.getSystemService("location");
        this.A07 = locationManager2;
        return locationManager2;
    }

    public AudioManager A09() {
        return (AudioManager) this.A0H.A00.getSystemService("audio");
    }

    public ConnectivityManager A0A() {
        ConnectivityManager connectivityManager = this.A08;
        if (connectivityManager != null) {
            return connectivityManager;
        }
        ConnectivityManager connectivityManager2 = (ConnectivityManager) this.A0H.A00.getSystemService("connectivity");
        this.A08 = connectivityManager2;
        return connectivityManager2;
    }

    public WifiManager A0B() {
        WifiManager wifiManager = this.A09;
        if (wifiManager != null) {
            return wifiManager;
        }
        WifiManager wifiManager2 = (WifiManager) this.A0H.A00.getSystemService("wifi");
        this.A09 = wifiManager2;
        return wifiManager2;
    }

    public PowerManager A0C() {
        PowerManager powerManager = this.A0A;
        if (powerManager != null) {
            return powerManager;
        }
        PowerManager powerManager2 = (PowerManager) this.A0H.A00.getSystemService("power");
        this.A0A = powerManager2;
        return powerManager2;
    }

    public TelecomManager A0D() {
        TelecomManager telecomManager = this.A0C;
        if (telecomManager != null) {
            return telecomManager;
        }
        TelecomManager telecomManager2 = (TelecomManager) this.A0H.A00.getSystemService("telecom");
        this.A0C = telecomManager2;
        return telecomManager2;
    }

    public SubscriptionManager A0E() {
        SubscriptionManager subscriptionManager = this.A0D;
        if (subscriptionManager != null) {
            return subscriptionManager;
        }
        SubscriptionManager subscriptionManager2 = (SubscriptionManager) this.A0H.A00.getSystemService("telephony_subscription_service");
        this.A0D = subscriptionManager2;
        return subscriptionManager2;
    }

    public TelephonyManager A0F() {
        TelephonyManager telephonyManager = this.A0E;
        if (telephonyManager != null) {
            return telephonyManager;
        }
        TelephonyManager telephonyManager2 = (TelephonyManager) this.A0H.A00.getSystemService("phone");
        this.A0E = telephonyManager2;
        return telephonyManager2;
    }

    public AccessibilityManager A0G() {
        AccessibilityManager accessibilityManager = this.A0F;
        if (accessibilityManager != null) {
            return accessibilityManager;
        }
        AccessibilityManager accessibilityManager2 = (AccessibilityManager) this.A0H.A00.getSystemService("accessibility");
        this.A0F = accessibilityManager2;
        return accessibilityManager2;
    }

    public InputMethodManager A0H() {
        InputMethodManager inputMethodManager = this.A0G;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager inputMethodManager2 = (InputMethodManager) this.A0H.A00.getSystemService("input_method");
        this.A0G = inputMethodManager2;
        return inputMethodManager2;
    }
}
