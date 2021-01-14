package X;

import org.json.JSONObject;

/* renamed from: X.1y0  reason: invalid class name and case insensitive filesystem */
public class C43231y0 {
    public final int A00;
    public final int A01;
    public final String A02;

    public C43231y0(JSONObject jSONObject) {
        this.A01 = jSONObject.getInt("offset");
        this.A00 = jSONObject.getInt("length");
        this.A02 = jSONObject.getString("url");
    }
}
