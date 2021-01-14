package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2k7  reason: invalid class name and case insensitive filesystem */
public class C57322k7 implements AnonymousClass0J2 {
    public final /* synthetic */ C50192Tt A00;
    public final /* synthetic */ C50202Tu A01;

    public C57322k7(C50202Tu r1, C50192Tt r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0J2
    public void AEq(long j) {
        this.A01.A04.A06(j);
    }

    @Override // X.AnonymousClass0J2
    public void AFf(Map map, String str) {
        AnonymousClass008.A17("mediaupload/error = ", str);
    }

    @Override // X.AnonymousClass0J2
    public void AJT(Map map, String str) {
        C50202Tu r3 = this.A01;
        r3.A00 = new C64242xr();
        if (!this.A00.A06) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                r3.A00.A02 = jSONObject.optString("url");
                r3.A00.A01 = jSONObject.optString("handle");
                r3.A00.A00 = jSONObject.optString("direct_path");
            } catch (JSONException e) {
                Log.e("mediaupload/jsonexception", e);
            }
        }
        r3.A01 = true;
    }
}
