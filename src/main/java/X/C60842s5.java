package X;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2s5  reason: invalid class name and case insensitive filesystem */
public class C60842s5 {
    public static volatile C60842s5 A02;
    public final AnonymousClass00G A00;
    public final AnonymousClass01X A01;

    public C60842s5(AnonymousClass00G r1, AnonymousClass01X r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static C60842s5 A00() {
        if (A02 == null) {
            synchronized (C60842s5.class) {
                if (A02 == null) {
                    A02 = new C60842s5(AnonymousClass00G.A01, AnonymousClass01X.A00());
                }
            }
        }
        return A02;
    }

    public static JSONArray A01(List list) {
        String str;
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C74713bN r3 = (C74713bN) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bank_code", r3.A02);
                jSONObject.put("bank_name", r3.A05);
                jSONObject.put("short_name", r3.A03);
                if (r3.A04) {
                    str = "1";
                } else {
                    str = "0";
                }
                jSONObject.put("accept_savings", str);
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("PAY: BrazilPayBloksActivity payoutBanksToJsonArrayException: ");
            sb.append(e);
            Log.e(sb.toString(), e);
            return null;
        }
    }

    public static boolean A02(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C61672tY) it.next()).A0A) {
                return false;
            }
        }
        return true;
    }

    public JSONArray A03(List list) {
        Object obj;
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C61672tY r7 = (C61672tY) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("card_verify_identifier", r7.A02);
                jSONObject.put("card_verify_type", r7.A09);
                String str = r7.A09;
                if (str != null) {
                    char c = 65535;
                    int hashCode = str.hashCode();
                    if (hashCode != -1302107194) {
                        if (hashCode != -119226117) {
                            if (hashCode == 110379 && str.equals("otp")) {
                                c = 0;
                            }
                        } else if (str.equals("app-to-app")) {
                            c = 2;
                        }
                    } else if (str.equals("customer-service")) {
                        c = 1;
                    }
                    String str2 = "";
                    if (c == 0) {
                        AnonymousClass01X r3 = this.A01;
                        String str3 = r7.A04;
                        char c2 = 65535;
                        switch (str3.hashCode()) {
                            case 82233:
                                if (str3.equals("SMS")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 2467610:
                                if (str3.equals("PUSH")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 66081660:
                                if (str3.equals("EMAIL")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 81425707:
                                if (str3.equals("VACAT")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        String str4 = str2;
                        if (c2 == 0) {
                            str4 = r3.A06(R.string.brazil_verify_otp_sms_title);
                            str2 = r3.A0D(R.string.brazil_verify_otp_sms_description, r7.A03);
                        } else if (c2 == 1) {
                            str4 = r3.A06(R.string.brazil_verify_otp_email_title);
                            str2 = r3.A0D(R.string.brazil_verify_otp_email_description, r7.A03);
                        } else if (c2 == 2) {
                            str4 = r3.A06(R.string.brazil_verify_otp_sms_title);
                        } else if (c2 == 3) {
                            str4 = r3.A06(R.string.brazil_verify_otp_app_notification_title);
                            str2 = r3.A06(R.string.brazil_verify_otp_app_notification_description);
                        }
                        AnonymousClass02R r0 = new AnonymousClass02R(str4, str2);
                        str2 = (String) r0.A00;
                        obj = r0.A01;
                        jSONObject.put("card_verify_otp_type", r7.A04);
                        if (!TextUtils.isEmpty(r7.A03)) {
                            jSONObject.put("card_verify_otp_receiver_info", r7.A03);
                        }
                        jSONObject.put("card_verify_otp_resend_interval_sec", String.valueOf(r7.A01));
                        jSONObject.put("otp_length", String.valueOf(r7.A00));
                        int i = r7.A00;
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < i; i2++) {
                            sb.append("#  ");
                        }
                        jSONObject.put("otp_mask", sb.toString().trim());
                        jSONObject.put("card_verify_method_disabled_state", r7.A0A);
                    } else if (c == 1) {
                        AnonymousClass01X r32 = this.A01;
                        str2 = r32.A06(R.string.brazil_verify_customer_support_title);
                        obj = r32.A0D(R.string.brazil_verify_customer_support_description, C28051Sr.A12(r7.A08));
                        jSONObject.put("support_phone_number", r7.A08);
                    } else if (c != 2) {
                        obj = str2;
                    } else {
                        AnonymousClass02R A0Z = C28051Sr.A0Z(r7.A06);
                        AnonymousClass01X r33 = this.A01;
                        str2 = r33.A06(R.string.brazil_verify_app_to_app_title);
                        if (A0Z != null) {
                            String str5 = r7.A07;
                            Intent intent = new Intent();
                            intent.putExtra("android.intent.extra.TEXT", str5);
                            intent.setPackage((String) A0Z.A00);
                            intent.setAction((String) A0Z.A01);
                            if (intent.resolveActivity(this.A00.A00.getPackageManager()) != null) {
                                obj = r7.A05;
                                jSONObject.put("app_to_app_request_payload", r7.A07);
                                jSONObject.put("app_to_app_partner_app_package", r7.A06);
                                jSONObject.put("app_to_app_partner_app_name", r7.A05);
                            }
                        }
                        jSONObject.put("card_verify_method_disabled_state", true);
                        obj = r33.A0D(R.string.brazil_verify_app_to_app_not_installed, r7.A05);
                        jSONObject.put("app_to_app_request_payload", r7.A07);
                        jSONObject.put("app_to_app_partner_app_package", r7.A06);
                        jSONObject.put("app_to_app_partner_app_name", r7.A05);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("card_verify_method_title", str2);
                        jSONObject.put("card_verify_method_description", obj);
                    }
                    jSONArray.put(jSONObject);
                } else {
                    throw null;
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder("PAY: BrazilPayBloksActivity cardVerifyMethodsToJsonArray: ");
            sb2.append(e);
            Log.e(sb2.toString());
            return null;
        }
    }
}
