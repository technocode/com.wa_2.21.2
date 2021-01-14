package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2k6  reason: invalid class name and case insensitive filesystem */
public class C57312k6 implements AnonymousClass0J2 {
    public AnonymousClass2U3 A00;
    public final AnonymousClass0CW A01;
    public final AnonymousClass0CK A02;
    public final AnonymousClass2U1 A03;
    public final String A04;

    @Override // X.AnonymousClass0J2
    public void AEq(long j) {
    }

    public C57312k6(AnonymousClass0CK r1, AnonymousClass0CW r2, String str, AnonymousClass2U1 r4) {
        this.A02 = r1;
        this.A01 = r2;
        this.A04 = str;
        this.A03 = r4;
    }

    @Override // X.AnonymousClass0J2
    public void AFf(Map map, String str) {
        AnonymousClass008.A17("httpresumecheck/error = ", str);
    }

    @Override // X.AnonymousClass0J2
    public void AJT(Map map, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("resume")) {
                return;
            }
            if ("complete".equals(jSONObject.optString("resume"))) {
                this.A00.A06 = jSONObject.optString("url");
                this.A00.A04 = jSONObject.optString("direct_path");
                this.A00.A03 = AnonymousClass1WF.COMPLETE;
                return;
            }
            this.A00.A02 = jSONObject.optInt("resume");
            this.A00.A03 = AnonymousClass1WF.RESUME;
        } catch (JSONException e) {
            Log.w("mediaupload/MMS upload resume form post failed to parse JSON response; ", e);
            this.A00.A03 = AnonymousClass1WF.FAILURE;
        }
    }
}
