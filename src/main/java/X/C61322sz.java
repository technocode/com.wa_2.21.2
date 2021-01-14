package X;

import android.content.Context;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2sz  reason: invalid class name and case insensitive filesystem */
public class C61322sz {
    public String A00;
    public final Context A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass04j A03;
    public final AnonymousClass0GP A04;
    public final C03340Fu A05;
    public final C61762th A06;
    public final C63842x6 A07;

    public C61322sz(Context context, AnonymousClass02M r8, C63842x6 r9, AnonymousClass04j r10, C03340Fu r11, AnonymousClass0GP r12, C61762th r13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String str11 = str3;
        this.A01 = context;
        this.A02 = r8;
        this.A07 = r9;
        this.A03 = r10;
        this.A05 = r11;
        this.A04 = r12;
        this.A06 = r13;
        if (str11.length() == 12) {
            StringBuilder sb = new StringBuilder();
            sb.append(str11.substring(0, 4));
            sb.append("9");
            sb.append(str11.substring(4));
            str11 = sb.toString();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fullName", str);
            jSONObject.put("personalID", str2);
            jSONObject.put("phone", str11);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("address", str4);
            String str12 = "";
            jSONObject2.put("addressNumber", str5 != null ? str5 : str12);
            jSONObject2.put("extraLine", str6 != null ? str6 : str12);
            jSONObject2.put("neighborhood", str7 != null ? str7 : str12);
            jSONObject2.put("city", str8);
            jSONObject2.put("state", str9);
            jSONObject2.put("addressCode", str10);
            jSONObject2.put("country", "BR");
            jSONObject.put("address", jSONObject2);
            this.A00 = jSONObject.toString();
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder("PAY: BrazilSendKYCAction Exception: ");
            sb2.append(e);
            Log.e(sb2.toString());
        }
    }

    public final void A00(C68653Ea r19, AbstractC61522tJ r20) {
        C61532tK r10 = new C61532tK(this.A01, this.A02, this.A07, this.A03, this.A05, this.A04, this.A06);
        try {
            byte[] A44 = r19.A44(this.A00.getBytes("UTF-8"), C007603r.A0C(16));
            C018809u r2 = r10.A06;
            StringBuilder sb = new StringBuilder();
            sb.append("sendKyc Text Blob : ");
            sb.append(Base64.encodeToString(A44, 2));
            r2.A07(null, sb.toString(), null);
            AnonymousClass0M5[] r5 = {new AnonymousClass0M5("text", new AnonymousClass0OS[]{new AnonymousClass0OS("key-type", r19.A03, null, (byte) 0)}, null, A44)};
            ArrayList arrayList = new ArrayList();
            arrayList.add(new AnonymousClass0OS("action", "send-kyc-data", null, (byte) 0));
            String str = r19.A05;
            arrayList.add(new AnonymousClass0OS("provider", str, null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("key-version", r19.A04, null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("device-id", r10.A07.A02(), null, (byte) 0));
            r10.A04.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), r5, null), new C73553Xu(r10, r10.A00, r10.A01, r10.A02, r10.A03, "send-kyc-data", r20, str), 0);
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }
}
