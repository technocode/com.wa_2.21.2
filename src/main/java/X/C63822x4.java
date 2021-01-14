package X;

import android.app.Application;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.2x4  reason: invalid class name and case insensitive filesystem */
public class C63822x4 {
    public static volatile C63822x4 A06;
    public final AnonymousClass01I A00;
    public final C000300f A01;
    public final AnonymousClass03P A02;
    public final AnonymousClass00G A03;
    public final C68393Da A04;
    public final C018809u A05 = C018809u.A00("IndiaUpiSimSwapDetectionUtils", "payment", "IN");

    public C63822x4(AnonymousClass00G r4, AnonymousClass01I r5, C000300f r6, AnonymousClass03P r7, C68393Da r8) {
        this.A03 = r4;
        this.A00 = r5;
        this.A01 = r6;
        this.A02 = r7;
        this.A04 = r8;
    }

    public static C63822x4 A00() {
        if (A06 == null) {
            synchronized (C63822x4.class) {
                if (A06 == null) {
                    A06 = new C63822x4(AnonymousClass00G.A01, AnonymousClass01I.A00(), C000300f.A00(), AnonymousClass03P.A00(), C68393Da.A00());
                }
            }
        }
        return A06;
    }

    public static final String A01(SubscriptionInfo subscriptionInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return subscriptionInfo.getIccId();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(subscriptionInfo.getSubscriptionId());
        return sb.toString();
    }

    public static boolean A02(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String A13 = C001801b.A13(str);
        String A132 = C001801b.A13(str2);
        if (A13.startsWith("91")) {
            return TextUtils.equals(A13, A132);
        }
        return TextUtils.equals(A13, A132.replaceFirst("91", ""));
    }

    public String A03() {
        try {
            Application application = this.A03.A00;
            if (C004302a.A01(application, "android.permission.READ_PHONE_STATE") != 0) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && C004302a.A01(application, "android.permission.READ_PHONE_NUMBERS") != 0) {
                return null;
            }
            AnonymousClass01I r0 = this.A00;
            r0.A04();
            String A002 = C12420i4.A00(r0.A01);
            if (i >= 22) {
                List<SubscriptionInfo> activeSubscriptionInfoList = this.A02.A0E().getActiveSubscriptionInfoList();
                if (activeSubscriptionInfoList == null) {
                    return null;
                }
                for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                    String A012 = A01(subscriptionInfo);
                    if (A02(subscriptionInfo.getNumber(), A002)) {
                        this.A05.A03("iccid matched number");
                        return A012;
                    }
                }
                if (activeSubscriptionInfoList.size() > 0) {
                    this.A05.A03("no matching phone number found, storing the first iccid");
                    return A01(activeSubscriptionInfoList.get(0));
                }
            } else if (i < 22) {
                TelephonyManager A0F = this.A02.A0F();
                if (A02(A0F.getLine1Number(), A002)) {
                    this.A05.A03("store first iccid");
                    return A0F.getSimSerialNumber();
                } else if (A02(A04("getLine1Number"), A002)) {
                    this.A05.A03("store second iccid");
                    return A04("getSimSerialNumber");
                } else if (A0F.getSimSerialNumber() != null) {
                    return A0F.getSimSerialNumber();
                }
            }
            return null;
        } catch (Exception e) {
            this.A05.A08("Unable to get device bind ICCID", e);
        }
    }

    public final String A04(String str) {
        TelephonyManager A0F = this.A02.A0F();
        try {
            Object invoke = Class.forName(A0F.getClass().getName()).getMethod(str, Integer.TYPE).invoke(A0F, 1);
            if (invoke != null) {
                return invoke.toString();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
