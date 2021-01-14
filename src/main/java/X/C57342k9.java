package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2k9  reason: invalid class name and case insensitive filesystem */
public class C57342k9 implements AnonymousClass0J2 {
    public final /* synthetic */ C000300f A00;
    public final /* synthetic */ AnonymousClass2U7 A01;
    public final /* synthetic */ AnonymousClass0J5 A02;
    public final /* synthetic */ AnonymousClass3ZL A03;

    @Override // X.AnonymousClass0J2
    public void AEq(long j) {
    }

    public C57342k9(AnonymousClass2U7 r1, AnonymousClass3ZL r2, AnonymousClass0J5 r3, C000300f r4) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A00 = r4;
    }

    @Override // X.AnonymousClass0J2
    public void AFf(Map map, String str) {
        AnonymousClass008.A17("mediaupload/finalizeupload/error = ", str);
    }

    @Override // X.AnonymousClass0J2
    public void AJT(Map map, String str) {
        String str2 = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            str2 = jSONObject.optString("url");
            this.A01.A02 = jSONObject.optString("direct_path");
        } catch (JSONException e) {
            Log.e("mediaupload/jsonexception", e);
        }
        if (TextUtils.isEmpty(str2)) {
            AnonymousClass3ZL r2 = this.A03;
            str2 = new AnonymousClass28H(((AbstractC450522r) r2).A02, ((AbstractC450522r) r2).A01, ((AbstractC450522r) r2).A00, null, null).A4Z(this.A02, this.A00);
        }
        this.A01.A03 = str2;
    }
}
