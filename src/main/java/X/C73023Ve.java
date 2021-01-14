package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Ve  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C73023Ve implements AbstractC67773Ae {
    public final /* synthetic */ C67793Ag A00;

    public /* synthetic */ C73023Ve(C67793Ag r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC67773Ae
    public final Intent ALv(Context context, Uri uri) {
        JSONObject jSONObject;
        C67793Ag r3 = this.A00;
        String A06 = ((C002701k) r3.A01.get()).A06(265);
        if (TextUtils.isEmpty(A06)) {
            return null;
        }
        C73163Vs r1 = new C73163Vs();
        r3.A02.get();
        if (!C26671Lx.A00(uri.toString(), A06, r1) || (jSONObject = r1.A00) == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("server_params", jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("params", jSONObject2);
            return new AnonymousClass3AR(context, "com.bloks.www.minishops.storefront.wa", jSONObject3.toString(), false);
        } catch (JSONException e) {
            Log.e("ShopsLinks.handleStoreFrontLink: Failed to assemble JSON", e);
            return null;
        }
    }
}
