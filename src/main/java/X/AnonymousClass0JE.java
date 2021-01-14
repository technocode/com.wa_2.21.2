package X;

import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import android.widget.EditText;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.0JE  reason: invalid class name */
public class AnonymousClass0JE {
    public static String A00 = "";

    public static int A00(EditText editText) {
        if (!editText.isFocused()) {
            return -1;
        }
        String obj = editText.getText().toString();
        int i = 0;
        int i2 = 0;
        while (i < editText.getSelectionEnd() && i <= obj.length()) {
            if (obj.charAt(i) <= '9' && obj.charAt(i) >= '0') {
                i2++;
            }
            i++;
        }
        return i2;
    }

    public static int A01(String str, String str2) {
        int length;
        int length2;
        if (str == null || str2 == null || (length = str.length()) < 6 || (length2 = str2.length()) < 6) {
            return -1;
        }
        int i = length - 6;
        int i2 = length2 - 6;
        int i3 = 0;
        int i4 = 0;
        do {
            if (str.charAt(i + i3) != str2.charAt(i2 + i3)) {
                i4++;
            }
            i3++;
        } while (i3 < 6);
        return i4;
    }

    public static long A02(String str, long j) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e) {
                Log.w(e);
            }
        }
        return j;
    }

    public static Dialog A03(ActivityC004702f r3, AnonymousClass01X r4, String str, String str2) {
        Log.w("registrationutils/dialog/underage-ban cancelable=");
        AnonymousClass0MB r2 = new AnonymousClass0MB(r3);
        String A06 = r4.A06(R.string.underage_account_ban_title);
        AnonymousClass0MC r1 = r2.A01;
        r1.A0I = A06;
        r1.A0E = r4.A06(R.string.underage_account_ban_description);
        r1.A0J = false;
        r2.A07(r4.A06(R.string.cancel), new DialogInterface$OnClickListenerC65242zX(r3));
        r2.A06(r4.A06(R.string.register_contact_support), new DialogInterface$OnClickListenerC65212zU(r3, str, str2));
        return r2.A00();
    }

    public static Dialog A04(ActivityC004702f r4, AnonymousClass01X r5, String str, String str2, Runnable runnable) {
        boolean z = false;
        if (runnable != null) {
            z = true;
        }
        StringBuilder sb = new StringBuilder("registrationutils/dialog/ban cancelable=");
        sb.append(z);
        Log.w(sb.toString());
        String A0F = r5.A0F(A0C(str, str2));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r5.A06(R.string.register_user_is_banned_top));
        sb2.append("\n");
        sb2.append(A0F);
        sb2.append("\n");
        String A0E = AnonymousClass008.A0E(r5, R.string.register_user_is_banned_bottom, sb2);
        AnonymousClass0MB r2 = new AnonymousClass0MB(r4);
        AnonymousClass0MC r0 = r2.A01;
        r0.A0E = A0E;
        r0.A0J = z;
        r2.A07(r5.A06(R.string.cancel), new DialogInterface$OnClickListenerC65192zS(r4, runnable));
        r2.A06(r5.A06(R.string.register_user_support_button), new DialogInterface$OnClickListenerC65202zT(r4, runnable, str, str2));
        return r2.A00();
    }

    public static Dialog A05(ActivityC004702f r5, AnonymousClass00T r6, AnonymousClass03P r7, AnonymousClass01X r8, AnonymousClass04j r9, AnonymousClass03S r10, AnonymousClass0KP r11) {
        Log.i("registrationutils/dialog/cant-connect");
        AnonymousClass0MB r3 = new AnonymousClass0MB(r5);
        String A06 = r8.A06(R.string.register_try_again_later);
        AnonymousClass0MC r2 = r3.A01;
        r2.A0E = A06;
        r3.A07(r8.A06(R.string.check_system_status), new DialogInterface$OnClickListenerC65252zY(r5, r6, r7, r8, r9, r10, r11));
        r3.A05(r8.A06(R.string.cancel), new DialogInterface$OnClickListenerC65232zW(r5));
        r2.A02 = DialogInterface$OnCancelListenerC65222zV.A00;
        return r3.A00();
    }

    public static SpannableStringBuilder A06(String str, String str2, Runnable runnable) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, runnable);
        return A07(str, hashMap, 0, null);
    }

    public static SpannableStringBuilder A07(String str, Map map, int i, TextAppearanceSpan textAppearanceSpan) {
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if (map.containsKey(uRLSpan.getURL())) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new AnonymousClass3ZH(map, uRLSpan, i), spanStart, spanEnd, spanFlags);
                    if (textAppearanceSpan != null) {
                        spannableStringBuilder.setSpan(textAppearanceSpan, spanStart, spanEnd, spanFlags);
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    public static AnonymousClass1LS A08(C12440i6 r5, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String replaceAll = str.replaceAll("\\D", "");
        if (!TextUtils.isEmpty(str3) && !str3.equals("ZZ")) {
            try {
                C12490iB A0E = r5.A0E(replaceAll, str3.toUpperCase(Locale.US));
                return new AnonymousClass1LS(String.valueOf(A0E.countryCode_), String.valueOf(A0E.nationalNumber_), str2);
            } catch (AnonymousClass1F5 e) {
                Log.w("parsePhoneNumber/exception", e);
            }
        }
        String A12 = C001801b.A12(replaceAll);
        if (A12 != null) {
            return new AnonymousClass1LS(A12, replaceAll.substring(A12.length()), str2);
        }
        return null;
    }

    public static String A09(AnonymousClass0CO r3, String str, String str2) {
        String str3;
        String replaceAll = str2.replaceAll("\\D", "");
        try {
            str3 = r3.A02(Integer.parseInt(str), replaceAll);
        } catch (IOException e) {
            Log.e("verify/number/trim/error", e);
            str3 = null;
        }
        return str3 != null ? A0C(str, replaceAll.substring(str.length())) : replaceAll;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r5.equals(r4) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0A(X.AnonymousClass0CO r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0JE.A0A(X.0CO, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String A0B(AnonymousClass00G r3, AnonymousClass03P r4, AnonymousClass03S r5) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        if (!r5.A08()) {
            Log.i("verifynumber/getphonennumber/permission denied");
            return null;
        }
        if (Build.VERSION.SDK_INT >= 22 && (activeSubscriptionInfoList = SubscriptionManager.from(r3.A00).getActiveSubscriptionInfoList()) != null) {
            for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                String number = subscriptionInfo.getNumber();
                if (number != null) {
                    return number;
                }
            }
        }
        try {
            TelephonyManager A0F = r4.A0F();
            if (A0F != null) {
                return A0F.getLine1Number();
            }
            return null;
        } catch (Exception e) {
            Log.w("verifynumber/getphonennumber/error ", e);
            return null;
        }
    }

    public static String A0C(String str, String str2) {
        if (str == null || str2 == null) {
            Log.e("verifynumber/prettyprint/cc-or-phnum-is-null");
            return null;
        }
        String A0M = AnonymousClass008.A0M("+", str, " ", str2);
        C12440i6 A002 = C12440i6.A00();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("+");
            sb.append(str);
            sb.append(str2);
            return A002.A0G(A002.A0E(sb.toString(), "ZZ"), EnumC12560iI.INTERNATIONAL);
        } catch (Exception e) {
            Log.e("verifynumber/formatter-exception", e);
            return A0M;
        } catch (ExceptionInInitializerError e2) {
            Log.e("verifynumber/formatter-init-exception", e2);
            return A0M;
        }
    }

    public static List A0D(AnonymousClass03P r5, AnonymousClass03S r6, C12440i6 r7) {
        AnonymousClass1LS A08;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        ArrayList arrayList = new ArrayList();
        if (!r6.A08()) {
            Log.i("verifynumber/getphonennumbers/permission denied");
            return arrayList;
        } else if (Build.VERSION.SDK_INT >= 22) {
            SubscriptionManager A0E = r5.A0E();
            if (!(A0E == null || (activeSubscriptionInfoList = A0E.getActiveSubscriptionInfoList()) == null)) {
                for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                    AnonymousClass1LS A082 = A08(r7, subscriptionInfo.getNumber(), subscriptionInfo.getCarrierName().toString(), subscriptionInfo.getCountryIso());
                    if (A082 != null) {
                        arrayList.add(A082);
                    }
                }
            }
            return arrayList;
        } else {
            try {
                TelephonyManager A0F = r5.A0F();
                if (!(A0F == null || (A08 = A08(r7, A0F.getLine1Number(), A0F.getNetworkOperatorName(), A0F.getSimCountryIso())) == null)) {
                    arrayList.add(A08);
                }
                return arrayList;
            } catch (Exception e) {
                Log.w("verifynumber/getphonennumbers/error ", e);
                return arrayList;
            }
        }
    }

    public static void A0E(Context context, AnonymousClass01X r11, AnonymousClass03C r12, int i) {
        Log.i("registrationutils/notify/unverified");
        long currentTimeMillis = System.currentTimeMillis();
        String A0D = r11.A0D(R.string.sms_notification_headline_unverified_app_name, r11.A06(R.string.localized_app_name));
        String A06 = r11.A06(R.string.sms_notification_title_unverified);
        String A062 = r11.A06(R.string.sms_notification_message_unverified);
        Intent intent = new Intent(context, context.getClass());
        if (i != -1) {
            intent.putExtra("com.whatsapp.verifynumber.dialog", i);
        }
        intent.addFlags(536870912);
        StringBuilder sb = new StringBuilder("registrationutils/notify/notifyNotVerified ");
        sb.append(intent);
        Log.d(sb.toString());
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
        AnonymousClass03E A002 = AnonymousClass0BS.A00(context);
        A002.A0J = "critical_app_alerts@1";
        A002.A0B(A0D);
        A002.A07.when = currentTimeMillis;
        A002.A04(3);
        A002.A06(16, true);
        A002.A0A(A06);
        A002.A09(A062);
        A002.A09 = activity;
        A002.A07.icon = R.drawable.notifybar;
        r12.A03(null, 1, A002.A01());
    }

    public static void A0F(Context context, AnonymousClass0HM r10, AnonymousClass03C r11, boolean z) {
        Intent intent;
        Log.i("registrationutils/notify/verified");
        long currentTimeMillis = System.currentTimeMillis();
        String string = context.getString(R.string.sms_notification_headline_verified_app_name, context.getString(R.string.localized_app_name));
        String string2 = context.getString(R.string.sms_notification_title_verified);
        String string3 = context.getString(R.string.sms_notification_message_verified);
        if (z) {
            intent = new Intent(context, Main.class);
        } else {
            intent = new Intent(context, RegisterName.class);
            r10.A0C(2);
        }
        PendingIntent activity = PendingIntent.getActivity(context, 1, intent, 0);
        AnonymousClass03E A002 = AnonymousClass0BS.A00(context);
        A002.A0J = "other_notifications@1";
        A002.A0B(string);
        A002.A07.when = currentTimeMillis;
        A002.A04(3);
        A002.A06(16, true);
        A002.A0A(string2);
        A002.A09(string3);
        A002.A09 = activity;
        A002.A07.icon = R.drawable.notifybar;
        r11.A03(null, 1, A002.A01());
    }

    public static void A0G(EditText editText, int i) {
        int length = editText.getText().length();
        if (i > -1 && i <= length) {
            editText.requestFocus();
            String obj = editText.getText().toString();
            int i2 = 0;
            for (int i3 = 0; i3 < obj.length() && i > 0; i3++) {
                if (obj.charAt(i3) <= '9' && obj.charAt(i3) >= '0') {
                    i--;
                }
                i2++;
            }
            editText.setSelection(i2);
        } else if (i > length) {
            editText.requestFocus();
            editText.setSelection(length);
        } else {
            editText.setSelection(length);
        }
    }

    public static void A0H(AnonymousClass00D r1, String str) {
        A00 = str;
        AnonymousClass008.A0m(r1, "registration_failure_reason", str);
    }

    public static boolean A0I(AnonymousClass0CO r3, String str, String str2, String str3, boolean z) {
        int length;
        if (TextUtils.isEmpty(str) || str.length() < (length = str2.length())) {
            return false;
        }
        boolean A0J = A0J(str3, str);
        if (z) {
            if (!A0J || AnonymousClass0HU.A05(r3, str2, str.substring(length)) != 1) {
                return false;
            }
            return true;
        } else if (!A0J || AnonymousClass0HU.A05(r3, str2, str) != 1) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean A0J(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int abs = Math.abs(length - length2);
        if (abs == 1) {
            String str3 = str2;
            if (length < length2) {
                str3 = str;
            }
            if (str3.equals(str)) {
                str = str2;
            }
            for (int i = 0; i < str3.length(); i++) {
                if (str3.charAt(i) != str.charAt(i)) {
                    return str.substring(i + 1).equals(str3.substring(i));
                }
            }
            return true;
        }
        if (abs == 0) {
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != str2.charAt(i2)) {
                    if (i2 == length - 1) {
                        return true;
                    } else {
                        int i3 = i2 + 1;
                        return str.substring(i3).equals(str2.substring(i3));
                    }
                }
            }
        }
        return false;
    }
}
