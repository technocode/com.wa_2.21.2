package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: X.3FQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FQ {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public /* synthetic */ AnonymousClass3FQ(BrazilPayBloksActivity brazilPayBloksActivity, C28021Sn r2) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r2;
    }

    public final void A00(C43761yu r12, boolean z, ArrayList arrayList, C61072sS r15) {
        String str;
        String str2;
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        C28021Sn r2 = this.A00;
        if (r15 == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("credential_id", r12.A07);
            hashMap.put("readable_name", C28051Sr.A0u(((AnonymousClass2DC) brazilPayBloksActivity).A04, r12));
            C74723bO r10 = (C74723bO) r12.A06;
            if (r10 != null && ((str2 = r10.A0N) == null || !(!"DISABLED".equals(str2)))) {
                hashMap.put("p2p_ineligible", "1");
            }
            int i = r12.A01;
            if (i != 1) {
                str = i != 2 ? i != 3 ? i != 4 ? "unknown" : "discover" : "amex" : "mastercard";
            } else {
                str = "visa";
            }
            hashMap.put("network_name", str);
            if (r10 != null && !TextUtils.isEmpty(r10.A0E)) {
                hashMap.put("card_image_url", r10.A0E);
            }
            if (z) {
                hashMap.put("verified_state", "1");
                if (r2.A00) {
                    AnonymousClass008.A0f(r2, "on_success", hashMap, r2.A03);
                }
            } else if (arrayList == null || arrayList.isEmpty()) {
                if (r10 == null || !r10.A07) {
                    AnonymousClass1PT.A04(null, -233, r2);
                    return;
                }
                hashMap.put("verified_state", "0");
                hashMap.put("card_need_device_binding", "1");
                if (r2.A00) {
                    AnonymousClass008.A0f(r2, "on_success", hashMap, r2.A03);
                }
            } else if (C60842s5.A02(arrayList)) {
                AnonymousClass1PT.A04(null, -233, r2);
            } else {
                JSONArray A03 = brazilPayBloksActivity.A0A.A03(arrayList);
                if (A03 != null) {
                    hashMap.put("verify_methods", A03.toString());
                }
                hashMap.put("verified_state", "0");
                if (r2.A00) {
                    AnonymousClass008.A0f(r2, "on_success", hashMap, r2.A03);
                }
            }
        } else {
            AnonymousClass1PT.A04(null, r15.code, r2);
        }
    }
}
