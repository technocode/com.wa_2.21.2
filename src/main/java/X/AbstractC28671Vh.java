package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Vh  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC28671Vh {
    public void A00() {
        if (this instanceof C447821l) {
            C447821l r5 = (C447821l) this;
            C28791Vt r4 = new C28791Vt(r5.A01.A00(), null);
            try {
                C28651Vf r3 = r5.A00;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", r4.A00);
                jSONObject.putOpt("payload", r4.A01);
                r3.A00(jSONObject.toString(), r5.A07, false);
            } catch (JSONException unused) {
                Log.e("StellaEventHandler/failed to create event");
            }
        }
    }
}
