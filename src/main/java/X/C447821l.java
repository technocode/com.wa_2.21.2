package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.21l  reason: invalid class name and case insensitive filesystem */
public class C447821l extends AbstractC28671Vh {
    public final C28651Vf A00;
    public final C447321g A01;
    public final C447421h A02;
    public final C447521i A03;
    public final C447621j A04;
    public final C447721k A05;
    public final C28841Vy A06;
    public final String A07 = "com.facebook.stella";

    public C447821l(C28651Vf r2, C447421h r3, C28841Vy r4, C447721k r5, C447621j r6, C447521i r7, C447321g r8) {
        this.A00 = r2;
        this.A02 = r3;
        this.A06 = r4;
        this.A05 = r5;
        this.A04 = r6;
        this.A03 = r7;
        this.A01 = r8;
    }

    public final void A01(C28791Vt r5) {
        if (r5 != null) {
            try {
                C28651Vf r3 = this.A00;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", r5.A00);
                jSONObject.putOpt("payload", r5.A01);
                r3.A00(jSONObject.toString(), this.A07, true);
            } catch (JSONException unused) {
                Log.e("StellaEventHandler/failed to create event");
            }
        }
    }
}
