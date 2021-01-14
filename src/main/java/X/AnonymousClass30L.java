package X;

import android.app.ProgressDialog;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.30L  reason: invalid class name */
public class AnonymousClass30L {
    public C10560ep A00;
    public final AnonymousClass01X A01;
    public final AnonymousClass0M9 A02;
    public final AnonymousClass2OC A03;
    public final C02660Cy A04;
    public final AnonymousClass00T A05;

    public AnonymousClass30L(AnonymousClass00T r1, AnonymousClass0M9 r2, AnonymousClass01X r3, AnonymousClass2OC r4, C02660Cy r5) {
        this.A05 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public void A00() {
        ProgressDialog progressDialog;
        C10560ep r1 = this.A00;
        if (r1 != null && (progressDialog = r1.A00) != null && progressDialog.isShowing()) {
            r1.A00.cancel();
        }
    }

    public void A01(ActivityC004702f r10, AnonymousClass0HP r11, String str) {
        String str2;
        String obj;
        C10560ep r0 = this.A00;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        Uri.Builder appendPath = AnonymousClass0M9.A00().appendPath("verification.php");
        AnonymousClass01X r02 = this.A01;
        String A032 = r02.A03();
        String A042 = r02.A04();
        AnonymousClass03P r3 = r11.A08;
        TelephonyManager A0F = r3.A0F();
        if (A0F != null) {
            str2 = AnonymousClass0J6.A01(A0F.getNetworkOperator(), "000-000");
        } else {
            str2 = "none";
        }
        HashMap hashMap = new HashMap();
        if (r11.A00 != null) {
            hashMap.put("platform", "android");
            hashMap.put("network", str2);
            hashMap.put("lc", A032);
            hashMap.put("lg", A042);
            hashMap.put("context", r11.A00);
            StringBuilder sb = new StringBuilder();
            if (C007603r.A0A(r3)) {
                sb.append("rted ");
            }
            try {
                Class.forName("org.acra.ACRA");
                sb.append("nw-wap ");
            } catch (ClassNotFoundException unused) {
            }
            if (sb.length() == 0) {
                obj = null;
            } else {
                obj = sb.toString();
            }
            hashMap.put("diagnostic", obj);
            String str3 = "true";
            String str4 = "false";
            if (r11.A01) {
                str4 = str3;
            }
            hashMap.put("fail_too_many", str4);
            String str5 = "false";
            if (r11.A02) {
                str5 = str3;
            }
            hashMap.put("no_route_sms", str5);
            String str6 = "false";
            if (r11.A03) {
                str6 = str3;
            }
            hashMap.put("no_route_voice", str6);
            String str7 = "false";
            if (r11.A05) {
                str7 = str3;
            }
            hashMap.put("valid_number", str7);
            if (!r11.A04) {
                str3 = "false";
            }
            hashMap.put("no_number", str3);
            hashMap.put("debug-context", r11.A01(r11.A00));
        }
        for (String str8 : hashMap.keySet()) {
            String str9 = (String) hashMap.get(str8);
            if (TextUtils.isEmpty(str9)) {
                str9 = "";
            }
            appendPath.appendQueryParameter(str8, str9);
        }
        C10560ep r32 = new C10560ep(r10, this.A03, this.A04, appendPath.toString(), r11.A01(str));
        this.A00 = r32;
        this.A05.ANC(r32, new String[0]);
    }
}
