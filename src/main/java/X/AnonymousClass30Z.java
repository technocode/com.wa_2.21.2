package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.30Z  reason: invalid class name */
public class AnonymousClass30Z {
    public int A00;

    public AnonymousClass30Z(int i) {
        this.A00 = i;
    }

    public JSONObject A00() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("attempts", this.A00);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
