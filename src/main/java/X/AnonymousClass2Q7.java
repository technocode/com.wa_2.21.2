package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Q7  reason: invalid class name */
public abstract class AnonymousClass2Q7 {
    public C10370eW A00;
    public boolean A01;
    public final AnonymousClass04j A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass01X A04;
    public final C53432dG A05;
    public final C53442dH A06;
    public final C48692Ni A07;
    public final AnonymousClass00Y A08;
    public final AbstractC03920Ih A09;
    public final AnonymousClass00T A0A;

    public AnonymousClass2Q7(AnonymousClass00S r1, AnonymousClass00T r2, AnonymousClass00Y r3, AnonymousClass01X r4, AbstractC03920Ih r5, AnonymousClass04j r6, C53442dH r7, C53432dG r8, C48692Ni r9) {
        this.A03 = r1;
        this.A0A = r2;
        this.A08 = r3;
        this.A04 = r4;
        this.A09 = r5;
        this.A02 = r6;
        this.A06 = r7;
        this.A05 = r8;
        this.A07 = r9;
    }

    public AnonymousClass2Q5 A00() {
        String string = this.A06.A00.A00.getString("emoji_dictionary_info", null);
        if (string == null) {
            return new AnonymousClass2Q5();
        }
        try {
            AnonymousClass2Q5 r6 = new AnonymousClass2Q5();
            JSONObject jSONObject = new JSONObject(string);
            r6.A04 = jSONObject.optString("request_etag", null);
            r6.A00 = jSONObject.optLong("cache_fetch_time", 0);
            r6.A03 = jSONObject.optString("language", null);
            r6.A01 = jSONObject.optLong("last_fetch_attempt_time", 0);
            r6.A05 = jSONObject.optString("language_attempted_to_fetch", null);
            return r6;
        } catch (JSONException e) {
            Log.d("dictionaryloader/load/fail", e);
            return new AnonymousClass2Q5();
        }
    }

    public boolean A01(AnonymousClass2Q5 r5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("request_etag", r5.A04);
            jSONObject.put("language", r5.A03);
            jSONObject.put("cache_fetch_time", r5.A00);
            jSONObject.put("last_fetch_attempt_time", r5.A01);
            jSONObject.put("language_attempted_to_fetch", r5.A05);
            this.A06.A00.A00.edit().putString("emoji_dictionary_info", jSONObject.toString()).apply();
            return true;
        } catch (JSONException e) {
            Log.d("dictionaryloader/save/fail", e);
            return false;
        }
    }
}
