package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.27v  reason: invalid class name */
public abstract class AnonymousClass27v extends AbstractC43781yw {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public byte[] A09;

    public JSONObject A07() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.A01;
            if (str != null) {
                jSONObject.put("bankImageURL", str);
            }
            String str2 = this.A02;
            if (str2 != null) {
                jSONObject.put("bankPhoneNumber", str2);
                return jSONObject;
            }
        } catch (JSONException e) {
            Log.w("PAY: PaymentMethodBankAccountCountryData toJSONObject threw: ", e);
        }
        return jSONObject;
    }
}
